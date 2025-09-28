/**
 * Interface demonstrating abstraction through interfaces
 */
public interface Drawable {
    // All interface methods are public and abstract by default
    void draw();
    void erase();
    
    // Interface can have constants (public, static, final by default)
    String DEFAULT_COLOR = "Black";
    int MAX_SIZE = 1000;
    
    // Default method (Java 8+)
    default void setColor(String color) {
        System.out.println("Setting color to: " + color);
    }
    
    // Static method (Java 8+)
    static void printDrawingInstructions() {
        System.out.println("Drawing Instructions:");
        System.out.println("1. Call draw() to render the object");
        System.out.println("2. Call erase() to remove the object");
        System.out.println("3. Use setColor() to change appearance");
    }
    
    // Another default method
    default void resize(double scale) {
        System.out.println("Resizing by factor: " + scale);
    }
}