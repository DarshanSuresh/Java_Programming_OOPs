# Java Programming Lab - Object-Oriented Programming (OOPs)

This repository contains comprehensive Object-Oriented Programming (OOPs) programs implemented in Java, created as part of MCA/Computer Science references. It includes structured examples, detailed solutions, and practice exercises to strengthen Java OOP concepts.

## 📚 Repository Structure

```
Java_Programming_OOPs/
├── README.md
├── .gitignore
├── 01-Classes-and-Objects/
│   ├── examples/
│   │   └── Student.java           # Basic class and object demonstration
│   └── exercises/
│       └── Car.java               # Practice exercise for classes
├── 02-Inheritance/
│   ├── examples/
│   │   ├── Animal.java            # Base class for inheritance
│   │   ├── Dog.java               # Derived class example
│   │   └── InheritanceDemo.java   # Complete inheritance demonstration
│   └── exercises/
│       └── VehicleHierarchy.java  # Inheritance practice exercise
├── 03-Polymorphism/
│   ├── examples/
│   │   ├── Shape.java             # Abstract base class
│   │   ├── Circle.java            # Concrete implementation
│   │   ├── Rectangle.java         # Another concrete implementation
│   │   └── PolymorphismDemo.java  # Runtime and compile-time polymorphism
│   └── exercises/
├── 04-Abstraction/
│   ├── examples/
│   │   ├── Vehicle.java           # Abstract class demonstration
│   │   ├── Car.java               # Concrete implementation
│   │   ├── Motorcycle.java       # Another concrete implementation
│   │   └── AbstractionDemo.java   # Complete abstraction concepts
│   └── exercises/
├── 05-Interfaces/
│   ├── examples/
│   │   ├── Drawable.java          # Interface with default methods
│   │   ├── Movable.java           # Another interface example
│   │   ├── GameCharacter.java     # Multiple interface implementation
│   │   └── InterfaceDemo.java     # Complete interface demonstration
│   └── exercises/
│       └── MediaPlayer.java       # Interface practice exercise
├── 06-Encapsulation/
│   ├── examples/
│   │   ├── BankAccount.java       # Encapsulation with data hiding
│   │   └── EncapsulationDemo.java # Complete encapsulation concepts
│   └── exercises/
├── 07-Exception-Handling/
│   ├── examples/
│   │   └── ExceptionHandlingDemo.java # Comprehensive exception handling
│   └── exercises/
├── 08-File-IO/
│   ├── examples/
│   │   └── FileIODemo.java        # Complete file I/O operations
│   └── exercises/
└── 09-Collections-Framework/
    ├── examples/
    │   └── CollectionsDemo.java   # Complete collections demonstration
    └── exercises/
```

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Text editor or IDE (recommended: IntelliJ IDEA, Eclipse, or VS Code)
- Command line interface (Terminal/Command Prompt)

### How to Run Programs

#### Method 1: Using Command Line

1. **Navigate to the program directory:**
   ```bash
   cd Java_Programming_OOPs/01-Classes-and-Objects/examples/
   ```

2. **Compile the Java file:**
   ```bash
   javac Student.java
   ```

3. **Run the compiled program:**
   ```bash
   java Student
   ```

#### Method 2: For programs with multiple files

1. **Compile all related files:**
   ```bash
   javac *.java
   ```

2. **Run the main class:**
   ```bash
   java InheritanceDemo
   ```

#### Method 3: Using an IDE
1. Import the project into your IDE
2. Navigate to the desired example
3. Right-click on the file and select "Run"

## 📖 Core OOP Concepts Covered

### 1. Classes and Objects
- **Location:** `01-Classes-and-Objects/`
- **Concepts:** Class definition, object creation, constructors, instance variables, methods
- **Example:** Student management system with getters, setters, and validation
- **Key Learning:** Understand the blueprint concept of classes and object instantiation

### 2. Inheritance
- **Location:** `02-Inheritance/`
- **Concepts:** Single inheritance, method overriding, super keyword, instanceof operator
- **Example:** Animal hierarchy with Dog class extending Animal
- **Key Learning:** Code reusability and establishing "is-a" relationships

### 3. Polymorphism
- **Location:** `03-Polymorphism/`
- **Concepts:** Method overriding, method overloading, runtime polymorphism, compile-time polymorphism
- **Example:** Shape hierarchy with Circle and Rectangle implementations
- **Key Learning:** One interface, multiple implementations

### 4. Abstraction
- **Location:** `04-Abstraction/`
- **Concepts:** Abstract classes, abstract methods, template method pattern
- **Example:** Vehicle hierarchy with abstract Vehicle class
- **Key Learning:** Hiding implementation details while providing essential features

### 5. Interfaces
- **Location:** `05-Interfaces/`
- **Concepts:** Interface definition, multiple inheritance, default methods, static methods
- **Example:** Drawable and Movable interfaces with GameCharacter implementation
- **Key Learning:** Contract-based programming and multiple inheritance support

### 6. Encapsulation
- **Location:** `06-Encapsulation/`
- **Concepts:** Data hiding, access modifiers, getter/setter methods, validation
- **Example:** BankAccount class with secure data access
- **Key Learning:** Data protection and controlled access to class members

### 7. Exception Handling
- **Location:** `07-Exception-Handling/`
- **Concepts:** try-catch-finally, checked/unchecked exceptions, custom exceptions, exception chaining
- **Example:** Comprehensive exception handling scenarios
- **Key Learning:** Robust error handling and program stability

### 8. File I/O Operations
- **Location:** `08-File-IO/`
- **Concepts:** File reading/writing, binary operations, object serialization, NIO operations
- **Example:** Complete file operations with different approaches
- **Key Learning:** Data persistence and file manipulation

### 9. Collections Framework
- **Location:** `09-Collections-Framework/`
- **Concepts:** List, Set, Map, Queue interfaces, iterators, utility methods
- **Example:** Comprehensive collections usage with custom objects
- **Key Learning:** Data structure usage and collection manipulation

## 🔧 Compilation Tips

### For Single File Programs:
```bash
javac ClassName.java
java ClassName
```

### For Programs with Dependencies:
```bash
javac -cp . *.java
java -cp . MainClassName
```

### For Programs with Packages:
```bash
javac -d . PackageName/*.java
java PackageName.MainClassName
```

## 💡 Learning Path

### Beginner Level:
1. Start with **Classes and Objects** examples
2. Practice the provided exercises
3. Move to **Encapsulation** concepts
4. Complete the Car class exercise

### Intermediate Level:
1. Study **Inheritance** examples
2. Understand **Polymorphism** concepts
3. Practice with **Abstraction** examples
4. Complete vehicle hierarchy exercises

### Advanced Level:
1. Master **Interfaces** and multiple inheritance
2. Study **Exception Handling** patterns
3. Practice **File I/O** operations
4. Explore **Collections Framework** thoroughly

## 🧪 Practice Exercises

Each concept folder contains:
- **examples/**: Complete, runnable programs demonstrating concepts
- **exercises/**: Template files with TODO comments for practice

### Exercise Guidelines:
1. Read the TODO comments carefully
2. Implement missing methods and classes
3. Test your implementation with provided main methods
4. Compare with example implementations

## 🏗️ Project Structure Best Practices

```java
// Example file header comment
/**
 * Class description and purpose
 * @author MCA/Computer Science Reference
 * @version 1.0
 */
public class ExampleClass {
    // Class implementation
}
```

## 📋 Common Compilation Issues and Solutions

### Issue 1: ClassNotFoundException
**Solution:** Ensure you're in the correct directory and the class file exists
```bash
javac ClassName.java  # Make sure this completes without errors
java ClassName        # Then run the class
```

### Issue 2: Package-related errors
**Solution:** Use proper package compilation
```bash
javac -d . packagename/*.java
java packagename.ClassName
```

### Issue 3: Classpath issues
**Solution:** Set classpath explicitly
```bash
java -cp . ClassName
```

## 🎯 Learning Objectives

By completing this lab, students will:
- ✅ Understand fundamental OOP principles
- ✅ Master Java syntax and best practices
- ✅ Implement inheritance hierarchies effectively
- ✅ Use polymorphism for flexible design
- ✅ Create robust applications with exception handling
- ✅ Perform file operations and data persistence
- ✅ Utilize Java Collections Framework efficiently
- ✅ Design maintainable and scalable code

## 🤝 Contributing

This repository is designed for educational purposes. Students and educators are welcome to:
- Report issues or bugs in examples
- Suggest improvements to exercises
- Add new practice problems
- Enhance documentation

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📞 Support

For questions about the examples or exercises:
1. Review the code comments and documentation
2. Check the example implementations
3. Refer to Java official documentation
4. Practice with the provided exercises

---

**Happy Learning! 🎓**

*This repository serves as a comprehensive reference for Java Object-Oriented Programming concepts suitable for MCA and Computer Science students.*
