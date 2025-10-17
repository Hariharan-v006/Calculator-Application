🧮 Java Swing Calculator

A simple calculator application built using Java Swing that performs basic arithmetic operations — addition, subtraction, multiplication, and division.

🚀 Features

✅ Basic operations: +, -, *, /, and =

✅ Clear (C) button to reset calculations

✅ Simple and clean Swing-based GUI

✅ Error handling for invalid or divide-by-zero cases

✅ Compact and beginner-friendly code

🖥️ Preview

A small window-based calculator with buttons for digits (0–9), basic arithmetic operators, and a display field for showing results.

 ---------------------
|         123 + 45    |
|---------------------|
| 7 | 8 | 9 |  /     |
| 4 | 5 | 6 |  *     |
| 1 | 2 | 3 |  -     |
| 0 | C | = |  +     |
 ---------------------

🧰 Requirements

Java JDK 8 or higher

Any Java-compatible IDE or terminal

🏗️ How to Run
Option 1: Run in an IDE (e.g., IntelliJ, Eclipse, VS Code)

Create a new Java project.

Add the file Calculator.java to your project.

Run the file using the IDE’s Run or Play button.

Option 2: Run from Command Line

Save the code as Calculator.java

Open a terminal or command prompt in that directory.

Compile and run the program:

javac Calculator.java
java Calculator

🧩 Code Overview
Key Components:

JFrame: Main window container

JTextField: Display area for numbers and results

JButton: Buttons for digits and operations

ActionListener: Handles button click events

Logic:

When a number is clicked → appended to the display

When an operator is clicked → stores the first number and waits for the second

When = is clicked → performs the operation and displays the result

When C is clicked → clears all inputs

🧑‍💻 Example Usage
Input	Operation	Result
5 + 3 =	Addition	8.0
9 / 0 =	Division by zero	NaN
7 * 4 =	Multiplication	28.0
📄 License

This project is released under the MIT License — feel free to use, modify, and distribute it for personal or educational purposes.
