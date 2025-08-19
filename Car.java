public class Car extends Vehicle {
    private int seats;

    public Car(String vehicleId, String brand, String model, double pricePerDay, int seats) {
        super(vehicleId, brand, model, pricePerDay);
        this.seats = seats;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seats);
    }
}
