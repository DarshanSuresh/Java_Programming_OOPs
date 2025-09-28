/**
 * Demonstration of abstraction concepts
 */
public class AbstractionDemo {
    
    public static void testVehicle(Vehicle vehicle) {
        System.out.println("\n=== Testing " + vehicle.getClass().getSimpleName() + " ===");
        
        if (vehicle instanceof Car) {
            ((Car) vehicle).displayFullInfo();
        } else if (vehicle instanceof Motorcycle) {
            ((Motorcycle) vehicle).displayFullInfo();
        }
        
        System.out.println("\nAge: " + vehicle.calculateAge() + " years");
        System.out.println("Monthly payment (60 months): $" + 
                         String.format("%.2f", vehicle.calculateMonthlyPayment(60)));
        
        vehicle.startJourney();
        vehicle.honk();
        
        // Demonstrate polymorphic behavior
        System.out.println("Fuel efficiency: " + vehicle.getFuelEfficiency() + " MPG");
        System.out.println("Max speed: " + vehicle.getMaxSpeed() + " km/h");
        
        vehicle.endJourney();
    }
    
    public static void main(String[] args) {
        System.out.println("=== Abstraction Demo ===");
        
        // Cannot instantiate abstract class
        // Vehicle vehicle = new Vehicle(); // This would cause compilation error
        
        // Create concrete implementations
        Car car = new Car("Toyota", "Camry", 2022, 28000.0, 4, "Gasoline", true);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 
                                             2021, 15000.0, 750, false, "Cruiser");
        
        // Test both vehicles using polymorphism
        testVehicle(car);
        testVehicle(motorcycle);
        
        // Demonstrate car-specific methods
        System.out.println("\n=== Car-specific methods ===");
        car.openTrunk();
        car.lockDoors();
        
        // Demonstrate motorcycle-specific methods
        System.out.println("\n=== Motorcycle-specific methods ===");
        motorcycle.lean();
        motorcycle.wheelie();
        
        // Create a sport motorcycle to show different behavior
        Motorcycle sportBike = new Motorcycle("Yamaha", "R1", 2023, 17000.0, 
                                             1000, false, "Sport");
        System.out.println("\n=== Sport Motorcycle Demo ===");
        sportBike.displayFullInfo();
        sportBike.wheelie(); // This one can do wheelies!
        
        // Demonstrate array of abstract type
        System.out.println("\n=== Array of Vehicles (Abstraction) ===");
        Vehicle[] vehicles = {car, motorcycle, sportBike};
        
        double totalValue = 0;
        for (Vehicle v : vehicles) {
            System.out.println(v.getBrand() + " " + v.getModel() + 
                             " - Max Speed: " + v.getMaxSpeed() + " km/h");
            totalValue += v.getPrice();
        }
        System.out.println("Total fleet value: $" + String.format("%.2f", totalValue));
    }
}