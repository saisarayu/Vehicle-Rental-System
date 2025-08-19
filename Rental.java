public class Rental {
    private Customer customer;
    private Vehicle vehicle;
    private int days;

    public Rental(Customer customer, Vehicle vehicle, int days) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
        vehicle.rent();
    }

    public double calculateTotal() {
        return vehicle.getPricePerDay() * days;
    }

    public void showRentalInfo() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Vehicle: " + vehicle.getBrand() + " " + vehicle.getModel());
        System.out.println("Days: " + days);
        System.out.println("Total: " + calculateTotal());
    }

    public void returnVehicle() {
        vehicle.returnVehicle();
        System.out.println("Vehicle returned successfully.");
    }
}
