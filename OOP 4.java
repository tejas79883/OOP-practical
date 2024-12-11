/*Design a base class shape with two double 
type values and member functions to input the data 
nd compute_area() for calculating area of figure.
Derive two classes’ triangle and rectangle. Make compute_area() 
as abstract function and redefine this function
in the derived class to suit their requirements.
Write a program that accepts dimensions of triangle/rectangle
and display calculated area. 
Implement dynamic binding for given case stud*/
import java.util.Scanner;
abstract class Shape {
double dimension1;
double dimension2;
public void inputDimensions() {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter dimension 1: ");
dimension1 = scanner.nextDouble();
System.out.print("Enter dimension 2: ");
dimension2 = scanner.nextDouble();
}
public abstract double computeArea();
}
class Triangle extends Shape {
@Override
public double computeArea() {
return 0.5 * dimension1 * dimension2;
}
}
class Rectangle extends Shape {
@Override
public double computeArea() {
return dimension1 * dimension2;
}
}
public class Main4 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Choose a shape:");
System.out.println("1. Triangle");
System.out.println("2. Rectangle");
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
Shape shape;
if (choice == 1) {
shape = new Triangle();
} else if (choice == 2) {
shape = new Rectangle();
} else {
System.out.println("Invalid choice.");
return;
}
shape.inputDimensions();
double area = shape.computeArea();
System.out.println("Area of the shape: " + area);
}
}