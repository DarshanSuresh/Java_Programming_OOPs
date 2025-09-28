/**
 * Demonstration of inheritance concepts
 */
public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Inheritance Demo ===\n");
        
        // Create Animal object
        Animal genericAnimal = new Animal("Generic Animal", 5, "Unknown");
        System.out.println("1. Generic Animal:");
        genericAnimal.displayInfo();
        genericAnimal.makeSound();
        genericAnimal.eat();
        genericAnimal.sleep();
        System.out.println();
        
        // Create Dog object
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever", true);
        System.out.println("2. Dog (inherits from Animal):");
        myDog.displayInfo();
        myDog.makeSound(); // overridden method
        myDog.eat(); // inherited method
        myDog.wagTail(); // dog-specific method
        myDog.fetch(); // dog-specific method
        myDog.guard(); // dog-specific method
        System.out.println();
        
        // Demonstrate polymorphism through inheritance
        System.out.println("3. Polymorphism with inheritance:");
        Animal animalRef = new Dog("Max", 2, "Labrador", false);
        animalRef.displayInfo(); // calls Dog's overridden method
        animalRef.makeSound(); // calls Dog's overridden method
        // animalRef.wagTail(); // This won't work - method not in Animal class
        
        // Demonstrate instanceof
        System.out.println("\n4. instanceof checks:");
        System.out.println("myDog instanceof Dog: " + (myDog instanceof Dog));
        System.out.println("myDog instanceof Animal: " + (myDog instanceof Animal));
        System.out.println("genericAnimal instanceof Dog: " + (genericAnimal instanceof Dog));
        
        // Type casting
        if (animalRef instanceof Dog) {
            Dog castedDog = (Dog) animalRef;
            castedDog.wagTail(); // Now we can call Dog-specific methods
            castedDog.fetch();
        }
    }
}