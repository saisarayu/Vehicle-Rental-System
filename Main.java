public class Main {
    public static void main(String[] args) {
        RentalSystem system = new RentalSystem();

        // Add Vehicles
        system.addVehicle(new Car("C1", "Toyota", "Innova", 2000, 7));
        system.addVehicle(new Car("C2", "Hyundai", "i20", 1500, 5));
        system.addVehicle(new Bike("B1", "Honda", "CBR", 1000, 250));
        system.addVehicle(new Bike("B2", "Yamaha", "R15", 1200, 150));

        // Add Customer
        Customer c1 = new Customer("CU1", "Sarayu");

        // Display Vehicles
        system.displayAvailableVehicles();

        // Rent a Vehicle
        Rental rental = system.rentVehicle("C1", c1, 3);
        if (rental != null) {
            rental.showRentalInfo();
        }

        // Return Vehicle
        if (rental != null) {
            rental.returnVehicle();
        }

        // Show available again
        system.displayAvailableVehicles();
    }
}
