/**
 * Another interface to demonstrate multiple interface implementation
 */
public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
    
    // Constants
    int DEFAULT_SPEED = 5;
    String[] DIRECTIONS = {"UP", "DOWN", "LEFT", "RIGHT"};
    
    // Default method
    default void moveToPosition(int x, int y) {
        System.out.println("Moving to position (" + x + ", " + y + ")");
    }
    
    // Static method
    static boolean isValidDirection(String direction) {
        for (String dir : DIRECTIONS) {
            if (dir.equalsIgnoreCase(direction)) {
                return true;
            }
        }
        return false;
    }
    
    default void setSpeed(int speed) {
        System.out.println("Setting movement speed to: " + speed);
    }
}