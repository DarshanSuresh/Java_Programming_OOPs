# File I/O Examples

This directory contains Java programs demonstrating File Input/Output operations, specifically focusing on DataInputStream and DataOutputStream.

## Programs Included

### 1. SimpleDataInputExample.java
A basic example showing:
- Writing primitive data types to a binary file using DataOutputStream
- Reading the same data back using DataInputStream
- Proper exception handling for file operations

**Key Concepts:**
- DataInputStream reads binary data in platform-independent format
- Data must be read in the same order it was written
- Essential for handling primitive data types in binary format

### 2. DataInputStreamExample.java
A comprehensive example demonstrating:
- Writing multiple data types to a file
- Reading data back from the file
- Interactive input demonstration
- Byte-level data inspection
- Advanced DataInputStream operations

## How to Run

1. **Compile the programs:**
   ```bash
   javac SimpleDataInputExample.java
   javac DataInputStreamExample.java
   ```

2. **Run the simple example:**
   ```bash
   java SimpleDataInputExample
   ```

3. **Run the comprehensive example:**
   ```bash
   java DataInputStreamExample
   ```

## DataInputStream Key Methods

- `readInt()` - Reads a 32-bit integer
- `readDouble()` - Reads a 64-bit double
- `readBoolean()` - Reads a boolean value
- `readUTF()` - Reads a UTF-8 encoded string
- `readLong()` - Reads a 64-bit long
- `readFloat()` - Reads a 32-bit float
- `readByte()` - Reads a signed byte
- `readShort()` - Reads a 16-bit short

## Important Notes

1. **Order Matters**: Always read data in the same order it was written
2. **Exception Handling**: Always use try-catch blocks for I/O operations
3. **Resource Management**: Use try-with-resources for automatic resource cleanup
4. **Binary Format**: DataInputStream/DataOutputStream work with binary data, not text
5. **Platform Independence**: The binary format is consistent across different platforms

## Learning Objectives

After studying these examples, you should understand:
- How to use DataInputStream for reading binary data
- The relationship between DataInputStream and DataOutputStream
- Proper exception handling in file I/O operations
- The importance of data ordering in binary file operations
- How to work with different primitive data types in binary format