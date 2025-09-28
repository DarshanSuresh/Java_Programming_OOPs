/**
 * Rectangle class demonstrating method overriding
 */
public class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    
    // Override abstract methods from Shape
    @Override
    public double getArea() {
        return width * height;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
    
    // Override displayInfo to add rectangle-specific information
    @Override
    public void displayInfo() {
        System.out.println("=== Rectangle Information ===");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        super.displayInfo(); // call parent method
    }
    
    // Rectangle-specific methods
    public boolean isSquare() {
        return width == height;
    }
    
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public void setWidth(double width) { this.width = width; }
    public void setHeight(double height) { this.height = height; }
    
    @Override
    public String toString() {
        return "Rectangle{width=" + width + ", height=" + height + 
               ", color='" + color + "', filled=" + filled + "}";
    }
}