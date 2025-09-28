/**
 * Dog class extending Animal - demonstrates single inheritance
 */
public class Dog extends Animal {
    private String breed;
    private boolean isTrained;
    
    // Constructor
    public Dog(String name, int age, String breed, boolean isTrained) {
        super(name, age, "Canine"); // calling parent constructor
        this.breed = breed;
        this.isTrained = isTrained;
    }
    
    // Override parent method
    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
    
    // Dog-specific methods
    public void wagTail() {
        System.out.println(name + " is wagging its tail happily!");
    }
    
    public void fetch() {
        if (isTrained) {
            System.out.println(name + " fetches the ball!");
        } else {
            System.out.println(name + " doesn't know how to fetch yet.");
        }
    }
    
    public void guard() {
        System.out.println(name + " is guarding the house!");
    }
    
    // Override displayInfo to include Dog-specific info
    @Override
    public void displayInfo() {
        super.displayInfo(); // call parent method
        System.out.println("Breed: " + breed);
        System.out.println("Trained: " + (isTrained ? "Yes" : "No"));
    }
    
    // Getters
    public String getBreed() { return breed; }
    public boolean isTrained() { return isTrained; }
    
    // Setter
    public void setTrained(boolean trained) { this.isTrained = trained; }
}