/**
 * Class implementing multiple interfaces
 */
public class GameCharacter implements Drawable, Movable {
    private String name;
    private int x, y; // position
    private String color;
    private int health;
    
    public GameCharacter(String name, int x, int y, String color, int health) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.color = color;
        this.health = health;
    }
    
    // Implement Drawable interface methods
    @Override
    public void draw() {
        System.out.println("Drawing " + name + " at position (" + x + ", " + y + 
                         ") with color " + color);
    }
    
    @Override
    public void erase() {
        System.out.println("Erasing " + name + " from the screen");
    }
    
    // Override default method from Drawable
    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println(name + "'s color changed to: " + color);
    }
    
    // Implement Movable interface methods
    @Override
    public void moveUp() {
        y++;
        System.out.println(name + " moved up to (" + x + ", " + y + ")");
    }
    
    @Override
    public void moveDown() {
        y--;
        System.out.println(name + " moved down to (" + x + ", " + y + ")");
    }
    
    @Override
    public void moveLeft() {
        x--;
        System.out.println(name + " moved left to (" + x + ", " + y + ")");
    }
    
    @Override
    public void moveRight() {
        x++;
        System.out.println(name + " moved right to (" + x + ", " + y + ")");
    }
    
    // Override default method from Movable
    @Override
    public void moveToPosition(int newX, int newY) {
        this.x = newX;
        this.y = newY;
        System.out.println(name + " teleported to position (" + x + ", " + y + ")");
    }
    
    // Class-specific methods
    public void attack() {
        System.out.println(name + " attacks!");
    }
    
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " took " + damage + " damage. Health: " + health);
    }
    
    public void displayStatus() {
        System.out.println("=== " + name + " Status ===");
        System.out.println("Position: (" + x + ", " + y + ")");
        System.out.println("Color: " + color);
        System.out.println("Health: " + health);
    }
    
    // Getters
    public String getName() { return name; }
    public int getX() { return x; }
    public int getY() { return y; }
    public String getColor() { return color; }
    public int getHealth() { return health; }
}