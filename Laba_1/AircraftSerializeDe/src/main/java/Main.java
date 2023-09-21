/**
 * This is the main class for the airline management program.
 */
public class Main {
    /**
     * The main entry point of the program.
     *
     * @param args The command-line arguments. The first argument should be the output file path.
     */
    public static void main(String[] args) {
        // Check if the user provided the output file path as a command-line argument
        if (args.length < 1) {
            System.err.println("Usage: java Main <outputFilePath>");
            System.exit(1);
        }

        // The first command-line argument should be the output file path
        String outputFilePath = args[0];

        // Create an instance of the Airline class
        Airline airline = new Airline();

        // Create some aircraft
        Aircraft aircraft1 = new PassengerAircraft("Ту-134", 850, 80);
        Aircraft aircraft2 = new CargoAircraft("Ан-74", 600, 32000);

        // Add aircraft to the airline's fleet
        airline.addAircraft(aircraft1);
        airline.addAircraft(aircraft2);

        // Calculate total capacity and carrying capacity
        int totalCapacity = airline.getTotalCapacity();
        int totalCarryingCapacity = airline.getTotalCarryingCapacity();

        // Print the results
        System.out.println("Общая пассажировместимость: " + totalCapacity);
        System.out.println("Общая грузовместимость: " + totalCarryingCapacity);

        // Serialize the Airline object to the specified output file path
        airline.serializeToFile(outputFilePath);

        // Deserialize the Airline object from the file
        Airline deserializedAirline = Airline.deserializeFromFile(outputFilePath);

        if (deserializedAirline != null) {
            System.out.println("Десериализованные объекты:");
            for (Aircraft aircraft : deserializedAirline.getFleet()) {
                System.out.println("Модель: " + aircraft.getModel() + ", Скорость: " + aircraft.getSpeed());
            }
        }
    }
}
