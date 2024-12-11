/*
PRACTICAL - 6
Implement a program to handle Arithmetic exception, Array Index Out Of Bounds.
The user enters two numbers Num1 and Num2.
The division of Num1 and Num2 is displayed. If Num1 and Num2 were not integers,
the program would throw a Number Format Exception. 
If Num2 were zero, the program would throw an 
Arithmetic Exception. Display the exception.
*/
import java.util.Scanner;
public class ExceptionHandlingDemo {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your choice: ");
System.out.print("\n 1.Arithmatic Opertation");
System.out.print("\n 2.Array index out bound of exception");
int choice = scanner.nextInt();
scanner.nextLine();
switch (choice)
{
case 1:
try {
System.out.print("Enter Num1: ");
int num1 = Integer.parseInt(scanner.nextLine());
System.out.print("Enter Num2: ");
int num2 = Integer.parseInt(scanner.nextLine());
int result = num1 / num2;
System.out.println("Result: " + result);
}
catch (NumberFormatException e) {
System.out.println("Number Format Exception: " + e.getMessage());
} catch (ArithmeticException e) {
System.out.println("Arithmetic Exception: " + e.getMessage());
}
break;
case 2:

try {
// Array operation to cause ArrayIndexOutOfBoundsException
int[] array = {10, 20, 30};
System.out.print("Enter index to access (0-2): ");
int index = Integer.parseInt(scanner.nextLine());
System.out.println("Array element at index " + index + ": " + array[index]);
}
catch (ArrayIndexOutOfBoundsExceptionclearc e) {
System.out.println("Array Index Out Of Bounds Exception: " + e.getMessage());
}

break;
default:
System.out.println("Invalid choice! Please enter 1 or 2.");
break;
}
scanner.close();
}
}