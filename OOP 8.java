/*********************************************************************************
**************************
 PRACTICAL - 8
Implement a program for maintaining a student records database 
using File Handling. Student has Student_id,name,Roll_no, Class,
marks and address. Display the data for five students. 
i) Create Database ii)Display Database 
iii) Clear Records iv)Modify record 
v)Search Record
**********************************************************************************
*************************/
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Student {
int studentId;
String name;
int rollNo;
String studentClass;
double marks;
String address;
Student(int studentId, String name, int rollNo, String studentClass, double marks, String address) {
this.studentId = studentId;
this.name = name;
this.rollNo = rollNo;
this.studentClass = studentClass;
this.marks = marks;
this.address = address;
}
}
public class StudentDatabase {
private static final String DATABASE_FILE = "student_records.txt";
private static final int MAX_STUDENTS = 1;
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
List<Student> students = new ArrayList<>();
while (true) {
System.out.println("Student Database Menu:");
System.out.println("1. Create Database");
System.out.println("2. Display Database");
System.out.println("3. Clear Records");
System.out.println("4. Modify Record");
System.out.println("5. Search Record");
System.out.println("6. Exit");
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
scanner.nextLine(); // Consume the newline character
switch (choice) {
case 1:
createDatabase(students);
break;
case 2:
displayDatabase(students);
break;
case 3:
clearRecords(students);
break;
case 4:
modifyRecord(students);
break;
case 5:
searchRecord(students);
break;
case 6:
saveDatabaseToFile(students);
scanner.close();
System.exit(0);
break;
default:
System.out.println("Invalid choice!");
break;
}
}
}
private static void createDatabase(List<Student> students) {
students.clear();
Scanner scanner = new Scanner(System.in);
for (int i = 0; i < MAX_STUDENTS; i++) {
System.out.println("Enter details for Student " + (i + 1) + ":");
System.out.print("Student ID: ");
int studentId = scanner.nextInt();
scanner.nextLine();
System.out.print("Name: ");
String name = scanner.nextLine();
System.out.print("Roll No: ");
int rollNo = scanner.nextInt();
scanner.nextLine();
System.out.print("Class: ");
String studentClass = scanner.nextLine();
System.out.print("Marks: ");
double marks = scanner.nextDouble();
scanner.nextLine();
System.out.print("Address: ");
String address = scanner.nextLine();
students.add(new Student(studentId, name, rollNo, studentClass, marks, address));
}
System.out.println("Database created successfully.");
}
private static void displayDatabase(List<Student> students) {
if (students.isEmpty()) {
System.out.println("Database is empty.");
} else {
for (Student student : students) {
System.out.println("Student ID: " + student.studentId);
System.out.println("Name: " + student.name);
System.out.println("Roll No: " + student.rollNo);
System.out.println("Class: " + student.studentClass);
System.out.println("Marks: " + student.marks);
System.out.println("Address: " + student.address);
System.out.println("------------");
}
}
}
private static void clearRecords(List<Student> students) {
students.clear();
System.out.println("All records cleared.");
}
private static void modifyRecord(List<Student> students) {
if (students.isEmpty()) {
System.out.println("Database is empty. Cannot modify a record.");
return;
}
Scanner scanner = new Scanner(System.in);
System.out.print("Enter Student ID to modify: ");
int studentIdToModify = scanner.nextInt();
scanner.nextLine(); // Consume the newline character
boolean found = false;
for (Student student : students) {
if (student.studentId == studentIdToModify) {
System.out.println("Enter new details for Student " + studentIdToModify + ":");
System.out.print("Name: ");
String name = scanner.nextLine();
System.out.print("Roll No: ");
int rollNo = scanner.nextInt();
scanner.nextLine();
System.out.print("Class: ");
String studentClass = scanner.nextLine();
System.out.print("Marks: ");
double marks = scanner.nextDouble();
scanner.nextLine();
System.out.print("Address: ");
String address = scanner.nextLine();
student.name = name;
student.rollNo = rollNo;
student.studentClass = studentClass;
student.marks = marks;
student.address = address;
found = true;
break;
}
}
if (found) {
System.out.println("Record modified successfully.");
} else {
System.out.println("Student with ID " + studentIdToModify + " not found.");
}
}
private static void searchRecord(List<Student> students) {
if (students.isEmpty()) {
System.out.println("Database is empty. Cannot search for a record.");
return;
}
Scanner scanner = new Scanner(System.in);
System.out.print("Enter Student ID to search: ");
int studentIdToSearch = scanner.nextInt();
scanner.nextLine(); // Consume the newline character
boolean found = false;
for (Student student : students) {
if (student.studentId == studentIdToSearch) {
System.out.println("Student Found:");
System.out.println("Student ID: " + student.studentId);
System.out.println("Name: " + student.name);
System.out.println("Roll No: " + student.rollNo);
System.out.println("Class: " + student.studentClass);
System.out.println("Marks: " + student.marks);
System.out.println("Address: " + student.address);
found = true;
break;
}
}
if (!found) {
System.out.println("Student with ID " + studentIdToSearch + " not found.");
}
}
private static void saveDatabaseToFile(List<Student> students) {
try (PrintWriter writer = new PrintWriter(new FileWriter(DATABASE_FILE))) {
for (Student student : students) {
writer.println(student.studentId);
writer.println(student.name);
writer.println(student.rollNo);
writer.println(student.studentClass);
writer.println(student.marks);
writer.println(student.address);
}
} catch (IOException e) {
System.out.println("Error saving database to file.");
}
}
}