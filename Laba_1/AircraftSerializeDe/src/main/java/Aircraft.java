import java.io.*;
/**
 * Represents an aircraft.
 */
abstract class Aircraft implements Serializable {
    private String model;
    private int speed;

    /**
     * Constructor for an aircraft.
     *
     * @param model The model of the aircraft.
     * @param speed The speed of the aircraft.
     */
    public Aircraft(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    /**
     * Get the model of the aircraft.
     *
     * @return The model of the aircraft.
     */
    public String getModel() {
        return model;
    }

    /**
     * Get the speed of the aircraft.
     *
     * @return The speed of the aircraft.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Get the capacity of the aircraft.
     *
     * @return The capacity of the aircraft.
     */
    public abstract int getCapacity();

    /**
     * Get the carrying capacity of the aircraft.
     *
     * @return The carrying capacity of the aircraft.
     */
    public abstract int getCarryingCapacity();
}

/**
 * Represents a passenger aircraft.
 */
class PassengerAircraft extends Aircraft {
    private int passengerCapacity;

    /**
     * Constructor for a passenger aircraft.
     *
     * @param model The model of the passenger aircraft.
     * @param speed The speed of the passenger aircraft.
     * @param passengerCapacity The passenger capacity of the aircraft.
     */
    public PassengerAircraft(String model, int speed, int passengerCapacity) {
        super(model, speed);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public int getCapacity() {
        return passengerCapacity;
    }

    @Override
    public int getCarryingCapacity() {
        // Passenger aircraft carrying capacity is based on passengers and baggage
        return passengerCapacity * 75; // Assuming an average of 75kg per passenger and baggage
    }
}

/**
 * Represents a cargo aircraft.
 */
class CargoAircraft extends Aircraft {
    private int cargoCapacity;

    /**
     * Constructor for a cargo aircraft.
     *
     * @param model The model of the cargo aircraft.
     * @param speed The speed of the cargo aircraft.
     * @param cargoCapacity The cargo capacity of the aircraft.
     */
    public CargoAircraft(String model, int speed, int cargoCapacity) {
        super(model, speed);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public int getCapacity() {
        return cargoCapacity;
    }

    @Override
    public int getCarryingCapacity() {
        return cargoCapacity;
    }
}