import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Comprehensive demonstration of exception handling concepts
 */
public class ExceptionHandlingDemo {
    
    // Method demonstrating basic try-catch
    public static void demonstrateBasicTryCatch() {
        System.out.println("=== Basic Try-Catch Demo ===");
        
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("Accessing element at index 2: " + numbers[2]);
            System.out.println("Accessing element at index 10: " + numbers[10]); // This will throw exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        
        System.out.println("Program continues after exception handling...\n");
    }
    
    // Method demonstrating multiple catch blocks
    public static void demonstrateMultipleCatch() {
        System.out.println("=== Multiple Catch Blocks Demo ===");
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            System.out.print("Enter another number to divide by: ");
            int divisor = scanner.nextInt();
            
            int result = number / divisor;
            System.out.println("Result: " + result);
            
            // Access array element
            int[] arr = new int[3];
            arr[number] = result; // May throw ArrayIndexOutOfBoundsException
            
        } catch (InputMismatchException e) {
            System.out.println("Caught InputMismatchException: Please enter valid integers");
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught general Exception: " + e.getMessage());
        }
        
        System.out.println("Multiple catch demo completed.\n");
    }
    
    // Method demonstrating try-catch-finally
    public static void demonstrateTryCatchFinally() {
        System.out.println("=== Try-Catch-Finally Demo ===");
        
        try {
            System.out.println("In try block");
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println("This line won't execute");
        } catch (ArithmeticException e) {
            System.out.println("In catch block: " + e.getMessage());
        } finally {
            System.out.println("In finally block - this always executes");
        }
        
        System.out.println("After try-catch-finally block\n");
    }
    
    // Method demonstrating throwing exceptions
    public static void demonstrateThrowingExceptions() {
        System.out.println("=== Throwing Exceptions Demo ===");
        
        try {
            validateAge(15); // This will throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught thrown exception: " + e.getMessage());
        }
        
        try {
            validateAge(25); // This will work fine
        } catch (IllegalArgumentException e) {
            System.out.println("This won't execute");
        }
        
        System.out.println();
    }
    
    // Helper method that throws exception
    public static void validateAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older. Provided: " + age);
        }
        System.out.println("Age " + age + " is valid");
    }
    
    // Method demonstrating checked exceptions
    public static void demonstrateCheckedException() {
        System.out.println("=== Checked Exception Demo ===");
        
        try {
            // Simulate reading a file
            readFile("nonexistent.txt");
        } catch (CustomFileException e) {
            System.out.println("Caught custom checked exception: " + e.getMessage());
        }
        
        System.out.println();
    }
    
    // Method that throws checked exception
    public static void readFile(String filename) throws CustomFileException {
        // Simulate file not found
        if (!filename.equals("existing.txt")) {
            throw new CustomFileException("File not found: " + filename);
        }
        System.out.println("File read successfully: " + filename);
    }
    
    // Method demonstrating nested try-catch
    public static void demonstrateNestedTryCatch() {
        System.out.println("=== Nested Try-Catch Demo ===");
        
        try {
            System.out.println("Outer try block");
            
            try {
                System.out.println("Inner try block");
                int[] arr = {1, 2, 3};
                System.out.println("Element: " + arr[5]); // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: " + e.getMessage());
                // Throwing a new exception from catch block
                throw new RuntimeException("Exception re-thrown from inner catch");
            }
            
        } catch (RuntimeException e) {
            System.out.println("Outer catch: " + e.getMessage());
        }
        
        System.out.println("After nested try-catch\n");
    }
    
    // Method demonstrating exception chaining
    public static void demonstrateExceptionChaining() {
        System.out.println("=== Exception Chaining Demo ===");
        
        try {
            processData();
        } catch (CustomProcessingException e) {
            System.out.println("Caught chained exception: " + e.getMessage());
            System.out.println("Root cause: " + e.getCause().getMessage());
        }
        
        System.out.println();
    }
    
    public static void processData() throws CustomProcessingException {
        try {
            // Simulate some processing that fails
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Chain the original exception
            throw new CustomProcessingException("Data processing failed", e);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Exception Handling Comprehensive Demo ===\n");
        
        // Demonstrate various exception handling concepts
        demonstrateBasicTryCatch();
        demonstrateTryCatchFinally();
        demonstrateThrowingExceptions();
        demonstrateCheckedException();
        demonstrateNestedTryCatch();
        demonstrateExceptionChaining();
        
        // Uncomment to run interactive demo
        // demonstrateMultipleCatch();
        
        System.out.println("=== Summary of Exception Handling Concepts ===");
        System.out.println("✓ Try-catch blocks for handling exceptions");
        System.out.println("✓ Multiple catch blocks for different exception types");
        System.out.println("✓ Finally blocks for cleanup code");
        System.out.println("✓ Throwing custom exceptions");
        System.out.println("✓ Checked vs unchecked exceptions");
        System.out.println("✓ Exception chaining and nested handling");
        System.out.println("✓ Best practices for exception handling");
    }
}

// Custom checked exception
class CustomFileException extends Exception {
    public CustomFileException(String message) {
        super(message);
    }
}

// Custom unchecked exception
class CustomProcessingException extends RuntimeException {
    public CustomProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}