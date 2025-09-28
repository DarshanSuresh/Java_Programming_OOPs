/**
 * Student class demonstrating basic class and object concepts
 * @author MCA/Computer Science Reference
 */
public class Student {
    // instance variables (attributes)
    private String name;
    private int age;
    private String studentId;
    private double gpa;
    
    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.studentId = "000000";
        this.gpa = 0.0;
    }
    
    // Parameterized constructor
    public Student(String name, int age, String studentId, double gpa) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.gpa = gpa;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }
    
    // Instance methods
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("GPA: " + gpa);
        System.out.println();
    }
    
    public boolean isHonorsStudent() {
        return gpa >= 3.5;
    }
    
    // toString method
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + 
               ", studentId='" + studentId + "', gpa=" + gpa + "}";
    }
    
    // Main method to demonstrate usage
    public static void main(String[] args) {
        System.out.println("=== Classes and Objects Demo ===\n");
        
        // Creating objects using default constructor
        Student student1 = new Student();
        System.out.println("Default Student:");
        student1.displayInfo();
        
        // Creating objects using parameterized constructor
        Student student2 = new Student("Alice Johnson", 20, "CS2024001", 3.8);
        System.out.println("Parameterized Student:");
        student2.displayInfo();
        
        // Using setter methods
        student1.setName("Bob Smith");
        student1.setAge(19);
        student1.setStudentId("CS2024002");
        student1.setGpa(3.2);
        
        System.out.println("Updated Student:");
        student1.displayInfo();
        
        // Using methods
        System.out.println(student2.getName() + " is honors student: " + student2.isHonorsStudent());
        System.out.println(student1.getName() + " is honors student: " + student1.isHonorsStudent());
        
        // Using toString method
        System.out.println("\nUsing toString():");
        System.out.println(student1);
        System.out.println(student2);
    }
}