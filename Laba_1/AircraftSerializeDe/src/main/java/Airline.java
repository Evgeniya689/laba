import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Represents an airline managing a fleet of aircraft.
 */
public class Airline implements Serializable {
    private List<Aircraft> fleet;

    /**
     * Constructor for an airline.
     */
    public Airline() {
        fleet = new ArrayList<>();
    }

    /**
     * Add an aircraft to the airline's fleet.
     *
     * @param aircraft The aircraft to add to the fleet.
     */
    public void addAircraft(Aircraft aircraft) {
        fleet.add(aircraft);
    }

    /**
     * Get the fleet of the airline.
     *
     * @return The list of aircraft in the fleet.
     */
    public List<Aircraft> getFleet() {
        return fleet;
    }

    /**
     * Calculate and return the total capacity of the airline's fleet.
     *
     * @return The total capacity of the fleet.
     */
    public int getTotalCapacity() {
        int totalCapacity = 0;
        for (Aircraft aircraft : fleet) {
            totalCapacity += aircraft.getCapacity();
        }
        return totalCapacity;
    }

    /**
     * Calculate and return the total carrying capacity of the airline's fleet.
     *
     * @return The total carrying capacity of the fleet.
     */
    public int getTotalCarryingCapacity() {
        int totalCarryingCapacity = 0;
        for (Aircraft aircraft : fleet) {
            totalCarryingCapacity += aircraft.getCarryingCapacity();
        }
        return totalCarryingCapacity;
    }

    /**
     * Serialize the Airline object to a file.
     *
     * @param filePath The path to the file where the object will be serialized.
     */
    public void serializeToFile(String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(this);
            System.out.println("Сериализованы в: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Deserialize an Airline object from a file.
     *
     * @param filePath The path to the file from which the object will be deserialized.
     * @return The deserialized Airline object, or null if an error occurs.
     */
    public static Airline deserializeFromFile(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (Airline) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}