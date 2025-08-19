import java.util.*;

public class RentalSystem {
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<Rental> rentals = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public void displayAvailableVehicles() {
        System.out.println("\nAvailable Vehicles:");
        for (Vehicle v : vehicles) {
            if (!v.isRented()) {
                v.displayInfo();
                System.out.println("-------------------");
            }
        }
    }

    public Rental rentVehicle(String vehicleId, Customer customer, int days) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleId().equals(vehicleId) && !v.isRented()) {
                Rental rental = new Rental(customer, v, days);
                rentals.add(rental);
                return rental;
            }
        }
        System.out.println("Vehicle not available!");
        return null;
    }
}
