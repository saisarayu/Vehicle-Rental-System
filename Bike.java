public class Bike extends Vehicle {
    private int engineCC;

    public Bike(String vehicleId, String brand, String model, double pricePerDay, int engineCC) {
        super(vehicleId, brand, model, pricePerDay);
        this.engineCC = engineCC;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine: " + engineCC + "cc");
    }
}
