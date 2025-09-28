/**
 * Abstract class demonstrating abstraction concepts
 */
public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected double price;
    
    public Vehicle(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    
    // Abstract methods - must be implemented by subclasses
    public abstract void start();
    public abstract void stop();
    public abstract double getFuelEfficiency();
    public abstract int getMaxSpeed();
    
    // Concrete methods
    public void displayBasicInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
    
    public void honk() {
        System.out.println("Beep! Beep!");
    }
    
    public int calculateAge() {
        return 2024 - year;
    }
    
    public double calculateMonthlyPayment(int months) {
        // Simple calculation without interest
        return price / months;
    }
    
    // Template method pattern
    public final void startJourney() {
        System.out.println("=== Starting Journey ===");
        performSafetyCheck();
        start();
        System.out.println("Journey started!");
    }
    
    public final void endJourney() {
        System.out.println("=== Ending Journey ===");
        stop();
        performMaintenanceCheck();
        System.out.println("Journey ended!");
    }
    
    // Protected methods for subclasses
    protected void performSafetyCheck() {
        System.out.println("Performing basic safety check...");
    }
    
    protected void performMaintenanceCheck() {
        System.out.println("Performing basic maintenance check...");
    }
    
    // Getters
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
}