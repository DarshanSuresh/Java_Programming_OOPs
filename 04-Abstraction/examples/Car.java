/**
 * Car class extending abstract Vehicle class
 */
public class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;
    private boolean isAutomatic;
    
    public Car(String brand, String model, int year, double price, 
               int numberOfDoors, String fuelType, boolean isAutomatic) {
        super(brand, model, year, price);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
        this.isAutomatic = isAutomatic;
    }
    
    // Implement abstract methods from Vehicle
    @Override
    public void start() {
        System.out.println("Car engine started. Ready to drive!");
    }
    
    @Override
    public void stop() {
        System.out.println("Car engine stopped. Parked safely.");
    }
    
    @Override
    public double getFuelEfficiency() {
        // Simulate different efficiency based on fuel type
        switch(fuelType.toLowerCase()) {
            case "electric": return 120.0; // MPGe
            case "hybrid": return 45.0;
            case "diesel": return 35.0;
            case "gasoline": return 28.0;
            default: return 25.0;
        }
    }
    
    @Override
    public int getMaxSpeed() {
        // Simulate max speed based on car type
        return 180; // km/h
    }
    
    // Override protected methods to add car-specific behavior
    @Override
    protected void performSafetyCheck() {
        super.performSafetyCheck();
        System.out.println("Checking seat belts, mirrors, and lights...");
        System.out.println("Checking tire pressure...");
    }
    
    @Override
    protected void performMaintenanceCheck() {
        super.performMaintenanceCheck();
        System.out.println("Checking oil level and brake fluid...");
    }
    
    // Car-specific methods
    public void openTrunk() {
        System.out.println("Trunk opened.");
    }
    
    public void lockDoors() {
        System.out.println("All " + numberOfDoors + " doors locked.");
    }
    
    public void displayFullInfo() {
        System.out.println("=== Car Information ===");
        displayBasicInfo();
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Transmission: " + (isAutomatic ? "Automatic" : "Manual"));
        System.out.println("Fuel efficiency: " + getFuelEfficiency() + " MPG");
        System.out.println("Max speed: " + getMaxSpeed() + " km/h");
    }
    
    // Getters
    public int getNumberOfDoors() { return numberOfDoors; }
    public String getFuelType() { return fuelType; }
    public boolean isAutomatic() { return isAutomatic; }
}