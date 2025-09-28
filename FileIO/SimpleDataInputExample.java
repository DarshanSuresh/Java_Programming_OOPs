import java.io.*;

/**
 * Simple DataInputStream Example
 * 
 * This program demonstrates basic usage of DataInputStream for reading
 * primitive data types from a binary file.
 * 
 * Key Learning Points:
 * 1. DataInputStream reads binary data in a platform-independent way
 * 2. Data must be read in the same order it was written
 * 3. DataInputStream works with DataOutputStream for complete I/O operations
 * 4. Proper exception handling is essential for file operations
 * 
 * @author Java Programming OOPs Repository
 */
public class SimpleDataInputExample {
    
    public static void main(String[] args) {
        SimpleDataInputExample example = new SimpleDataInputExample();
        
        System.out.println("Simple DataInputStream Demo\n");
        
        // Step 1: Write sample data
        example.writeSampleData();
        
        // Step 2: Read the data back
        example.readSampleData();
        
        System.out.println("\nDemo completed successfully!");
    }
    
    /**
     * Writes sample data to a binary file using DataOutputStream
     */
    private void writeSampleData() {
        String filename = "sample.dat";
        
        System.out.println("Writing data to " + filename + "...");
        
        try (DataOutputStream output = new DataOutputStream(
                new FileOutputStream(filename))) {
            
            // Write different types of data
            output.writeInt(100);
            output.writeDouble(99.99);
            output.writeBoolean(true);
            output.writeUTF("Java Programming");
            
            System.out.println("Data written successfully!");
            
        } catch (IOException e) {
            System.out.println("Error writing data: " + e.getMessage());
        }
    }
    
    /**
     * Reads data from the binary file using DataInputStream
     */
    private void readSampleData() {
        String filename = "sample.dat";
        
        System.out.println("\nReading data from " + filename + "...");
        
        try (DataInputStream input = new DataInputStream(
                new FileInputStream(filename))) {
            
            // Read data in the same order it was written
            int number = input.readInt();
            double price = input.readDouble();
            boolean flag = input.readBoolean();
            String text = input.readUTF();
            
            // Display the results
            System.out.println("Integer: " + number);
            System.out.println("Double: " + price);
            System.out.println("Boolean: " + flag);
            System.out.println("String: " + text);
            
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
}