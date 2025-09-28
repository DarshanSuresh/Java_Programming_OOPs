/**
 * Demonstration of interface concepts
 */
public class InterfaceDemo {
    
    // Method that accepts Drawable interface
    public static void renderObject(Drawable drawable) {
        System.out.println("Rendering drawable object...");
        drawable.draw();
        drawable.setColor("Red");
        drawable.resize(1.5);
    }
    
    // Method that accepts Movable interface
    public static void moveObject(Movable movable) {
        System.out.println("Moving object...");
        movable.moveRight();
        movable.moveUp();
        movable.setSpeed(10);
    }
    
    public static void main(String[] args) {
        System.out.println("=== Interface Demo ===\n");
        
        // Create GameCharacter that implements both interfaces
        GameCharacter hero = new GameCharacter("Hero", 0, 0, "Blue", 100);
        GameCharacter enemy = new GameCharacter("Enemy", 10, 10, "Red", 80);
        
        System.out.println("1. Initial Status:");
        hero.displayStatus();
        enemy.displayStatus();
        
        // Use as Drawable interface
        System.out.println("\n2. Using Drawable interface:");
        renderObject(hero);
        renderObject(enemy);
        
        // Use as Movable interface
        System.out.println("\n3. Using Movable interface:");
        moveObject(hero);
        moveObject(enemy);
        
        // Direct method calls
        System.out.println("\n4. Direct method calls:");
        hero.draw();
        hero.moveToPosition(5, 5);
        hero.attack();
        hero.takeDamage(20);
        
        // Demonstrate static methods from interfaces
        System.out.println("\n5. Static methods from interfaces:");
        Drawable.printDrawingInstructions();
        System.out.println("Is 'UP' a valid direction? " + Movable.isValidDirection("UP"));
        System.out.println("Is 'DIAGONAL' a valid direction? " + Movable.isValidDirection("DIAGONAL"));
        
        // Demonstrate constants from interfaces
        System.out.println("\n6. Interface constants:");
        System.out.println("Default color: " + Drawable.DEFAULT_COLOR);
        System.out.println("Max size: " + Drawable.MAX_SIZE);
        System.out.println("Default speed: " + Movable.DEFAULT_SPEED);
        
        // Polymorphism with interfaces
        System.out.println("\n7. Polymorphism with interfaces:");
        Drawable[] drawables = {hero, enemy};
        Movable[] movables = {hero, enemy};
        
        System.out.println("Drawing all objects:");
        for (Drawable d : drawables) {
            d.draw();
        }
        
        System.out.println("\nMoving all objects:");
        for (Movable m : movables) {
            m.moveLeft();
        }
        
        // Interface instanceof checks
        System.out.println("\n8. instanceof checks:");
        System.out.println("hero instanceof Drawable: " + (hero instanceof Drawable));
        System.out.println("hero instanceof Movable: " + (hero instanceof Movable));
        System.out.println("hero instanceof GameCharacter: " + (hero instanceof GameCharacter));
        
        // Final status
        System.out.println("\n9. Final Status:");
        hero.displayStatus();
        enemy.displayStatus();
    }
}