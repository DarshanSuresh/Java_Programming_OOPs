/**
 * Exercise: Create a vehicle hierarchy using inheritance
 * TODO: Complete the implementation of the vehicle hierarchy
 */

// Base Vehicle class
abstract class Vehicle {
    // TODO: Add protected fields for brand, model, year, price
    
    // TODO: Add constructor
    
    // TODO: Add abstract methods: start(), stop(), getFuelEfficiency()
    
    // TODO: Add concrete methods: displayInfo(), calculateAge()
}

// TODO: Create Car class extending Vehicle
class Car extends Vehicle {
    // TODO: Add car-specific fields like numberOfDoors, fuelType
    
    // TODO: Implement constructor calling super()
    
    // TODO: Override abstract methods from Vehicle
    
    // TODO: Add car-specific methods
}

// TODO: Create Motorcycle class extending Vehicle
class Motorcycle extends Vehicle {
    // TODO: Add motorcycle-specific fields
    
    // TODO: Implement constructor and methods
}

// TODO: Create Truck class extending Vehicle
class Truck extends Vehicle {
    // TODO: Add truck-specific fields like loadCapacity, numberOfAxles
    
    // TODO: Implement all required methods
}

public class VehicleHierarchy {
    public static void main(String[] args) {
        System.out.println("=== Vehicle Hierarchy Exercise ===");
        
        // TODO: Create objects of different vehicle types
        // TODO: Demonstrate polymorphism using Vehicle reference
        // TODO: Test all methods and show inheritance in action
    }
}