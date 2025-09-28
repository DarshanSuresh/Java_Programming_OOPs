/**
 * Base class for demonstrating polymorphism
 */
public abstract class Shape {
    protected String color;
    protected boolean filled;
    
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    // Abstract methods - must be implemented by subclasses
    public abstract double getArea();
    public abstract double getPerimeter();
    
    // Concrete methods
    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Filled: " + filled);
        System.out.println("Area: " + String.format("%.2f", getArea()));
        System.out.println("Perimeter: " + String.format("%.2f", getPerimeter()));
    }
    
    // Method overloading example
    public void paint() {
        System.out.println("Painting the shape with " + color);
    }
    
    public void paint(String newColor) {
        this.color = newColor;
        System.out.println("Painting the shape with new color: " + newColor);
    }
    
    public void paint(String newColor, boolean fill) {
        this.color = newColor;
        this.filled = fill;
        System.out.println("Painting the shape with " + newColor + 
                         ", filled: " + fill);
    }
    
    // Getters and Setters
    public String getColor() { return color; }
    public boolean isFilled() { return filled; }
    public void setColor(String color) { this.color = color; }
    public void setFilled(boolean filled) { this.filled = filled; }
}