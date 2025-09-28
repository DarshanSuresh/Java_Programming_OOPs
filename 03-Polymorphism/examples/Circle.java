/**
 * Circle class demonstrating method overriding
 */
public class Circle extends Shape {
    private double radius;
    
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    
    // Override abstract methods from Shape
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    // Override displayInfo to add circle-specific information
    @Override
    public void displayInfo() {
        System.out.println("=== Circle Information ===");
        System.out.println("Radius: " + radius);
        super.displayInfo(); // call parent method
    }
    
    // Circle-specific methods
    public double getDiameter() {
        return 2 * radius;
    }
    
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
    
    @Override
    public String toString() {
        return "Circle{radius=" + radius + ", color='" + color + 
               "', filled=" + filled + "}";
    }
}