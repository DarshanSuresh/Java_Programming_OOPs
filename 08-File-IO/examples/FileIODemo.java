import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;

/**
 * Comprehensive demonstration of File I/O operations in Java
 */
public class FileIODemo {
    private static final String DEMO_DIR = "demo_files";
    private static final String TEXT_FILE = DEMO_DIR + "/sample.txt";
    private static final String BINARY_FILE = DEMO_DIR + "/sample.dat";
    private static final String OBJECT_FILE = DEMO_DIR + "/student.ser";
    
    // Setup demo directory
    public static void setupDemoDirectory() {
        try {
            Files.createDirectories(Paths.get(DEMO_DIR));
            System.out.println("Demo directory created/verified: " + DEMO_DIR);
        } catch (IOException e) {
            System.out.println("Error creating demo directory: " + e.getMessage());
        }
    }
    
    // Demonstrate basic file writing
    public static void demonstrateFileWriting() {
        System.out.println("\n=== File Writing Demo ===");
        
        // Using FileWriter for text files
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            writer.write("Hello, File I/O!\n");
            writer.write("This is line 2.\n");
            writer.write("Java file operations are powerful.\n");
            writer.write("Current timestamp: " + System.currentTimeMillis() + "\n");
            System.out.println("Text file written successfully: " + TEXT_FILE);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        
        // Using BufferedWriter for better performance
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(TEXT_FILE, true))) {
            bufferedWriter.write("This line added with BufferedWriter\n");
            bufferedWriter.write("Appended to existing content\n");
            System.out.println("Content appended using BufferedWriter");
        } catch (IOException e) {
            System.out.println("Error with BufferedWriter: " + e.getMessage());
        }
    }
    
    // Demonstrate basic file reading
    public static void demonstrateFileReading() {
        System.out.println("\n=== File Reading Demo ===");
        
        // Using FileReader
        System.out.println("Reading with FileReader:");
        try (FileReader reader = new FileReader(TEXT_FILE)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        
        // Using BufferedReader for line-by-line reading
        System.out.println("\nReading with BufferedReader (line by line):");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            int lineNumber = 1;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("Error with BufferedReader: " + e.getMessage());
        }
    }
    
    // Demonstrate binary file operations
    public static void demonstrateBinaryFileOperations() {
        System.out.println("\n=== Binary File Operations Demo ===");
        
        // Writing binary data
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(BINARY_FILE))) {
            dos.writeInt(42);
            dos.writeDouble(3.14159);
            dos.writeBoolean(true);
            dos.writeUTF("Binary string data");
            dos.writeLong(System.currentTimeMillis());
            System.out.println("Binary data written to: " + BINARY_FILE);
        } catch (IOException e) {
            System.out.println("Error writing binary file: " + e.getMessage());
        }
        
        // Reading binary data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(BINARY_FILE))) {
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            boolean boolValue = dis.readBoolean();
            String stringValue = dis.readUTF();
            long longValue = dis.readLong();
            
            System.out.println("Binary data read:");
            System.out.println("Int: " + intValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("Boolean: " + boolValue);
            System.out.println("String: " + stringValue);
            System.out.println("Long: " + longValue);
        } catch (IOException e) {
            System.out.println("Error reading binary file: " + e.getMessage());
        }
    }
    
    // Demonstrate object serialization
    public static void demonstrateObjectSerialization() {
        System.out.println("\n=== Object Serialization Demo ===");
        
        // Create a student object
        Student student = new Student("Alice Johnson", 20, "CS2024001", 3.8);
        
        // Serialize object to file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(OBJECT_FILE))) {
            oos.writeObject(student);
            System.out.println("Student object serialized to: " + OBJECT_FILE);
        } catch (IOException e) {
            System.out.println("Error serializing object: " + e.getMessage());
        }
        
        // Deserialize object from file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(OBJECT_FILE))) {
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println("Student object deserialized:");
            deserializedStudent.displayInfo();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error deserializing object: " + e.getMessage());
        }
    }
    
    // Demonstrate NIO (New I/O) operations
    public static void demonstrateNIOOperations() {
        System.out.println("\n=== NIO (New I/O) Operations Demo ===");
        
        String nioFile = DEMO_DIR + "/nio_demo.txt";
        
        // Writing with NIO
        try {
            String content = "This is written using Java NIO\n" +
                           "NIO provides better performance\n" +
                           "For modern file operations\n";
            Files.write(Paths.get(nioFile), content.getBytes());
            System.out.println("Content written using NIO: " + nioFile);
        } catch (IOException e) {
            System.out.println("Error writing with NIO: " + e.getMessage());
        }
        
        // Reading with NIO
        try {
            List<String> lines = Files.readAllLines(Paths.get(nioFile));
            System.out.println("Content read using NIO:");
            for (int i = 0; i < lines.size(); i++) {
                System.out.println((i + 1) + ": " + lines.get(i));
            }
        } catch (IOException e) {
            System.out.println("Error reading with NIO: " + e.getMessage());
        }
        
        // File operations with NIO
        try {
            Path path = Paths.get(nioFile);
            System.out.println("File exists: " + Files.exists(path));
            System.out.println("File size: " + Files.size(path) + " bytes");
            System.out.println("Is regular file: " + Files.isRegularFile(path));
            System.out.println("Is readable: " + Files.isReadable(path));
            System.out.println("Is writable: " + Files.isWritable(path));
        } catch (IOException e) {
            System.out.println("Error getting file info: " + e.getMessage());
        }
    }
    
    // Demonstrate file operations
    public static void demonstrateFileOperations() {
        System.out.println("\n=== File Operations Demo ===");
        
        File file = new File(TEXT_FILE);
        System.out.println("File operations for: " + TEXT_FILE);
        System.out.println("File exists: " + file.exists());
        System.out.println("File name: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("File size: " + file.length() + " bytes");
        System.out.println("Can read: " + file.canRead());
        System.out.println("Can write: " + file.canWrite());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Last modified: " + new java.util.Date(file.lastModified()));
        
        // List directory contents
        File directory = new File(DEMO_DIR);
        System.out.println("\nDirectory contents:");
        File[] files = directory.listFiles();
        if (files != null) {
            for (File f : files) {
                System.out.println("  " + f.getName() + " (" + 
                                 (f.isDirectory() ? "directory" : "file") + 
                                 ", " + f.length() + " bytes)");
            }
        }
    }
    
    // Cleanup demo files
    public static void cleanup() {
        System.out.println("\n=== Cleanup ===");
        try {
            Files.deleteIfExists(Paths.get(TEXT_FILE));
            Files.deleteIfExists(Paths.get(BINARY_FILE));
            Files.deleteIfExists(Paths.get(OBJECT_FILE));
            Files.deleteIfExists(Paths.get(DEMO_DIR + "/nio_demo.txt"));
            Files.deleteIfExists(Paths.get(DEMO_DIR));
            System.out.println("Demo files cleaned up");
        } catch (IOException e) {
            System.out.println("Error during cleanup: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== File I/O Comprehensive Demo ===");
        
        setupDemoDirectory();
        demonstrateFileWriting();
        demonstrateFileReading();
        demonstrateBinaryFileOperations();
        demonstrateObjectSerialization();
        demonstrateNIOOperations();
        demonstrateFileOperations();
        
        System.out.println("\n=== File I/O Concepts Covered ===");
        System.out.println("✓ Text file reading and writing");
        System.out.println("✓ Binary file operations");
        System.out.println("✓ Object serialization and deserialization");
        System.out.println("✓ NIO (New I/O) operations");
        System.out.println("✓ File and directory operations");
        System.out.println("✓ Buffered I/O for performance");
        System.out.println("✓ Exception handling in file operations");
        
        // Comment out cleanup if you want to examine the created files
        cleanup();
    }
}

// Serializable Student class for demonstration
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String name;
    private int age;
    private String studentId;
    private double gpa;
    
    public Student(String name, int age, String studentId, double gpa) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.gpa = gpa;
    }
    
    public void displayInfo() {
        System.out.println("Student: " + name + ", Age: " + age + 
                         ", ID: " + studentId + ", GPA: " + gpa);
    }
}