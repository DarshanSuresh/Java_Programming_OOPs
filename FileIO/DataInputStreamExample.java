import java.io.*;

/**
 * DataInputStream Example - Simple Input Output Operations
 * 
 * This program demonstrates the use of DataInputStream and DataOutputStream
 * for reading and writing primitive data types in Java.
 * 
 * DataInputStream allows you to read primitive Java data types from an input stream
 * in a portable way. It reads data that was written by DataOutputStream.
 * 
 * @author Java Programming OOPs Repository
 * @version 1.0
 */
public class DataInputStreamExample {
    
    private static final String FILENAME = "data.dat";
    
    public static void main(String[] args) {
        DataInputStreamExample example = new DataInputStreamExample();
        
        System.out.println("=== DataInputStream Example ===\n");
        
        // First, write some data using DataOutputStream
        example.writeData();
        
        // Then, read the data using DataInputStream
        example.readData();
        
        // Demonstrate interactive input using DataInputStream
        example.interactiveInput();
    }
    
    /**
     * Writes various data types to a file using DataOutputStream
     */
    public void writeData() {
        System.out.println("1. Writing data to file using DataOutputStream:");
        
        try (DataOutputStream dos = new DataOutputStream(
                new FileOutputStream(FILENAME))) {
            
            // Write different primitive data types
            dos.writeInt(42);           // Write an integer
            dos.writeDouble(3.14159);   // Write a double
            dos.writeBoolean(true);     // Write a boolean
            dos.writeUTF("Hello, DataInputStream!"); // Write a string
            dos.writeLong(123456789L);  // Write a long
            dos.writeFloat(2.5f);       // Write a float
            dos.writeByte(100);         // Write a byte
            dos.writeShort(1000);       // Write a short
            
            System.out.println("   Data written successfully to " + FILENAME);
            
        } catch (IOException e) {
            System.err.println("Error writing data: " + e.getMessage());
        }
        System.out.println();
    }
    
    /**
     * Reads data from a file using DataInputStream
     */
    public void readData() {
        System.out.println("2. Reading data from file using DataInputStream:");
        
        try (DataInputStream dis = new DataInputStream(
                new FileInputStream(FILENAME))) {
            
            // Read data in the same order it was written
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            boolean booleanValue = dis.readBoolean();
            String stringValue = dis.readUTF();
            long longValue = dis.readLong();
            float floatValue = dis.readFloat();
            byte byteValue = dis.readByte();
            short shortValue = dis.readShort();
            
            // Display the read data
            System.out.println("   Integer value: " + intValue);
            System.out.println("   Double value: " + doubleValue);
            System.out.println("   Boolean value: " + booleanValue);
            System.out.println("   String value: " + stringValue);
            System.out.println("   Long value: " + longValue);
            System.out.println("   Float value: " + floatValue);
            System.out.println("   Byte value: " + byteValue);
            System.out.println("   Short value: " + shortValue);
            
        } catch (IOException e) {
            System.err.println("Error reading data: " + e.getMessage());
        }
        System.out.println();
    }
    
    /**
     * Demonstrates interactive input using DataInputStream with System.in
     * Note: For reading text from console, BufferedReader is more appropriate,
     * but this shows DataInputStream usage for educational purposes
     */
    public void interactiveInput() {
        System.out.println("3. Interactive input using DataInputStream:");
        System.out.println("   Type 'QUIT' and press Enter to finish:");
        
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            StringBuilder input = new StringBuilder();
            
            // Read lines until "QUIT" is entered
            while (true) {
                line = reader.readLine();
                if (line == null || "QUIT".equalsIgnoreCase(line.trim())) {
                    break;
                }
                input.append(line).append("\n");
            }
            
            if (input.length() > 0) {
                System.out.println("\n   You entered:");
                System.out.println("   " + input.toString().trim());
                
                // Demonstrate reading the input as bytes using DataInputStream
                byte[] inputBytes = input.toString().getBytes();
                try (DataInputStream dis = new DataInputStream(
                        new ByteArrayInputStream(inputBytes))) {
                    
                    System.out.println("\n   Reading the same data as bytes using DataInputStream:");
                    System.out.print("   Bytes: ");
                    int data;
                    while ((data = dis.read()) != -1) {
                        System.out.print(data + " ");
                    }
                    System.out.println();
                    
                    // Reset the stream and read as characters
                    dis.close();
                    try (DataInputStream dis2 = new DataInputStream(
                            new ByteArrayInputStream(inputBytes))) {
                        System.out.print("   Characters: ");
                        while ((data = dis2.read()) != -1) {
                            if (data >= 32 && data <= 126) { // Printable ASCII characters
                                System.out.print("'" + (char) data + "' ");
                            } else {
                                System.out.print("[" + data + "] ");
                            }
                        }
                        System.out.println();
                    }
                }
            } else {
                System.out.println("\n   No input received.");
            }
            
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }
}