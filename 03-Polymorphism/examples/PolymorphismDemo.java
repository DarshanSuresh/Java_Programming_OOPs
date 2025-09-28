/**
 * Demonstration of polymorphism concepts
 */
public class PolymorphismDemo {
    
    // Method to demonstrate runtime polymorphism
    public static void printShapeInfo(Shape shape) {
        System.out.println("Shape type: " + shape.getClass().getSimpleName());
        shape.displayInfo();
        System.out.println();
    }
    
    // Method overloading demonstration
    public static void calculateArea(Circle circle) {
        System.out.println("Calculating area for Circle: " + circle.getArea());
    }
    
    public static void calculateArea(Rectangle rectangle) {
        System.out.println("Calculating area for Rectangle: " + rectangle.getArea());
    }
    
    public static void calculateArea(Shape shape) {
        System.out.println("Calculating area for Shape: " + shape.getArea());
    }
    
    public static void main(String[] args) {
        System.out.println("=== Polymorphism Demo ===\n");
        
        // Create different shape objects
        Circle circle = new Circle(5.0, "Red", true);
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue", false);
        
        System.out.println("1. Method Overriding (Runtime Polymorphism):");
        printShapeInfo(circle);
        printShapeInfo(rectangle);
        
        // Polymorphic array
        System.out.println("2. Polymorphic Array:");
        Shape[] shapes = {
            new Circle(3.0, "Green", true),
            new Rectangle(2.0, 8.0, "Yellow", true),
            new Circle(7.0, "Purple", false)
        };
        
        double totalArea = 0;
        for (Shape shape : shapes) {
            System.out.println("Processing " + shape.getClass().getSimpleName());
            totalArea += shape.getArea();
            shape.displayInfo();
            System.out.println();
        }
        System.out.println("Total area of all shapes: " + String.format("%.2f", totalArea));
        
        // Method overloading demonstration
        System.out.println("\n3. Method Overloading (Compile-time Polymorphism):");
        calculateArea(circle);
        calculateArea(rectangle);
        calculateArea((Shape) circle); // explicit casting
        
        // Demonstrate method overloading in Shape class
        System.out.println("\n4. Method Overloading in Shape class:");
        circle.paint(); // no parameters
        circle.paint("Orange"); // one parameter
        circle.paint("Pink", true); // two parameters
        
        // Demonstrate instanceof and type casting
        System.out.println("\n5. Type checking and casting:");
        Shape genericShape = new Rectangle(5.0, 3.0, "Black", true);
        
        if (genericShape instanceof Rectangle) {
            Rectangle rect = (Rectangle) genericShape;
            System.out.println("It's a rectangle! Is it a square? " + rect.isSquare());
        }
        
        if (genericShape instanceof Circle) {
            Circle circ = (Circle) genericShape;
            System.out.println("It's a circle! Diameter: " + circ.getDiameter());
        } else {
            System.out.println("It's not a circle.");
        }
    }
}