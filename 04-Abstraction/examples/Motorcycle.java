/**
 * Motorcycle class extending abstract Vehicle class
 */
public class Motorcycle extends Vehicle {
    private int engineCapacity; // in CC
    private boolean hasSidecar;
    private String motorcycleType;
    
    public Motorcycle(String brand, String model, int year, double price,
                     int engineCapacity, boolean hasSidecar, String motorcycleType) {
        super(brand, model, year, price);
        this.engineCapacity = engineCapacity;
        this.hasSidecar = hasSidecar;
        this.motorcycleType = motorcycleType;
    }
    
    // Implement abstract methods from Vehicle
    @Override
    public void start() {
        System.out.println("Motorcycle engine roared to life! Vroom!");
    }
    
    @Override
    public void stop() {
        System.out.println("Motorcycle engine stopped. Kickstand down.");
    }
    
    @Override
    public double getFuelEfficiency() {
        // Generally motorcycles are more fuel efficient
        if (engineCapacity <= 150) return 60.0;
        else if (engineCapacity <= 300) return 45.0;
        else if (engineCapacity <= 600) return 35.0;
        else return 25.0;
    }
    
    @Override
    public int getMaxSpeed() {
        // Speed varies by engine size and type
        switch(motorcycleType.toLowerCase()) {
            case "sport": return 300;
            case "cruiser": return 180;
            case "touring": return 220;
            case "dirt": return 120;
            default: return 150;
        }
    }
    
    // Override protected methods for motorcycle-specific checks
    @Override
    protected void performSafetyCheck() {
        super.performSafetyCheck();
        System.out.println("Checking helmet and protective gear...");
        System.out.println("Checking chain tension and brakes...");
    }
    
    @Override
    protected void performMaintenanceCheck() {
        super.performMaintenanceCheck();
        System.out.println("Checking chain lubrication and tire wear...");
    }
    
    // Motorcycle-specific methods
    public void wheelie() {
        if (motorcycleType.equalsIgnoreCase("sport")) {
            System.out.println("Performing wheelie! (Be careful!)");
        } else {
            System.out.println("This motorcycle is not suitable for wheelies.");
        }
    }
    
    public void lean() {
        System.out.println("Leaning into the turn...");
    }
    
    public void displayFullInfo() {
        System.out.println("=== Motorcycle Information ===");
        displayBasicInfo();
        System.out.println("Engine capacity: " + engineCapacity + " CC");
        System.out.println("Has sidecar: " + (hasSidecar ? "Yes" : "No"));
        System.out.println("Type: " + motorcycleType);
        System.out.println("Fuel efficiency: " + getFuelEfficiency() + " MPG");
        System.out.println("Max speed: " + getMaxSpeed() + " km/h");
    }
    
    // Getters
    public int getEngineCapacity() { return engineCapacity; }
    public boolean hasSidecar() { return hasSidecar; }
    public String getMotorcycleType() { return motorcycleType; }
}