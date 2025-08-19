public class Vehicle {
    private String vehicleId;
    private String brand;
    private String model;
    private double pricePerDay;
    private boolean isRented;

    public Vehicle(String vehicleId, String brand, String model, double pricePerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.isRented = false;
    }

    public String getVehicleId() { return vehicleId; }
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public double getPricePerDay() { return pricePerDay; }
    public boolean isRented() { return isRented; }

    public void rent() { isRented = true; }
    public void returnVehicle() { isRented = false; }

    public void displayInfo() {
        System.out.println("ID: " + vehicleId + ", " + brand + " " + model + 
                           ", Price/Day: " + pricePerDay + 
                           ", Rented: " + (isRented ? "Yes" : "No"));
    }
}
