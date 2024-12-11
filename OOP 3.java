/*************************************
Design and develop inheritance for a given case study, 
identify objects and relationships and 
implement inheritance wherever applicable. 
Employee class with Emp_name, Emp_id, Address, Mail_id, and Mobile_no as members.
Inherit the classes, Programmer, Assistant Professor,
Associate Professor and Professor from employee class.
Add Basic Pay (BP) as the member of all the inherited classes
with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF,
0.1% of BP for staff club fund. 
Generate pay slips for the employees with their gross and net salary.***/
import java.util.Scanner;
class Employee {
 String EmpName;
 int EmpID;
 String Address;
 String MailID;
 long MobileNo;
 Employee(String name, int id, String address, String mail, long mobile) {
 EmpName = name;
 EmpID = id;
 Address = address;
 MailID = mail;
 MobileNo = mobile;
 }
 double calculateDA(double BasicPay) {
 return 0.97 * BasicPay;
 }
 double calculateHRA(double BasicPay) {
 return 0.10 * BasicPay;
 }
 double calculatePF(double BasicPay) {
 return 0.12 * BasicPay;
 }
 double calculateStaffClubFund(double BasicPay) {
 return 0.001 * BasicPay;
 }
 double calculateGrossSalary(double BasicPay) {
 return BasicPay + calculateDA(BasicPay) + calculateHRA(BasicPay) + 
calculateStaffClubFund(BasicPay);
 }
 double calculateNetSalary(double BasicPay) {
 return calculateGrossSalary(BasicPay) - calculatePF(BasicPay);
 }
 void generatePaySlip(double BasicPay, String empType) {
System.out.println("--------------------------------------------------");
System.out.println(" Employee Pay Slip");
System.out.println("--------------------------------------------------");
System.out.println("Employee Type: " + empType);
System.out.println("Employee Name: " + EmpName);
System.out.println("Employee ID: " + EmpID);
System.out.println("--------------------------------------------------");
System.out.println("Earnings:");
System.out.println("Basic Pay: " + BasicPay);
System.out.println("Dearness Allowance (DA): " + calculateDA(BasicPay));
System.out.println("House Rent Allowance (HRA): " + calculateHRA(BasicPay));
System.out.println("--------------------------------------------------");
System.out.println("Deductions:");
System.out.println("Provident Fund (PF): " + calculatePF(BasicPay));
System.out.println("Staff Club Fund: " + calculateStaffClubFund(BasicPay));
System.out.println("--------------------------------------------------");
System.out.println("Gross Salary: " + calculateGrossSalary(BasicPay));
System.out.println("Net Salary: " + calculateNetSalary(BasicPay));
System.out.println("--------------------------------------------------");
}
}
class Programmer extends Employee {
 double BasicPay;
 Programmer(String name, int id, String address, String mail, long mobile, double basicPay) {
 super(name, id, address, mail, mobile);
 BasicPay = basicPay;
 }
}
class AssistantProfessor extends Employee {
 double BasicPay;
 AssistantProfessor(String name, int id, String address, String mail, long mobile, double basicPay) {
 super(name, id, address, mail, mobile);
 BasicPay = basicPay;
 }
}
class AssociateProfessor extends Employee {
 double BasicPay;
 AssociateProfessor(String name, int id, String address, String mail, long mobile, double basicPay) {
 super(name, id, address, mail, mobile);
 BasicPay = basicPay;
 }
}
class Professor extends Employee {
 double BasicPay;
 Professor(String name, int id, String address, String mail, long mobile, double basicPay) {
 super(name, id, address, mail, mobile);
 BasicPay = basicPay;
 }
}
public class Main3 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Select Employee Type:");
 System.out.println("1. Programmer");
 System.out.println("2. Assistant Professor");
 System.out.println("3. Associate Professor");
 System.out.println("4. Professor");
 System.out.print("Enter your choice: ");
 int choice = scanner.nextInt();
 scanner.nextLine(); // Consume the newline character
 double basicPay = 0.0;
 String empType = "";
 switch (choice) {
 case 1:
 empType = "Programmer";
 break;
 case 2:
 empType = "Assistant Professor";
 break;
 case 3:
 empType = "Associate Professor";
 break;
 case 4:
 empType = "Professor";
 break;
 default:
 System.out.println("Invalid choice!");
 System.exit(1);
 }
 System.out.print("Enter " + empType + " Name: ");
 String empName = scanner.nextLine();
 System.out.print("Enter " + empType + " ID: ");
 int empID = scanner.nextInt();
 scanner.nextLine(); // Consume the newline character
 System.out.print("Enter Address: ");
 String empAddress = scanner.nextLine();
 System.out.print("Enter Mail ID: ");
 String empMailID = scanner.nextLine();
 System.out.print("Enter Mobile No: ");
 long empMobileNo = scanner.nextLong();
 System.out.print("Enter Basic Pay: ");
 basicPay = scanner.nextDouble();
 Employee employee;
 switch (choice) {
 case 1:
 employee = new Programmer(empName, empID, empAddress, empMailID, 
empMobileNo, basicPay);
 break;
 case 2:
 employee = new AssistantProfessor(empName, empID, empAddress, empMailID, 
empMobileNo, basicPay);
 break;
 case 3:
 employee = new AssociateProfessor(empName, empID, empAddress, empMailID, 
empMobileNo, basicPay);
 break;
 case 4:
 employee = new Professor(empName, empID, empAddress, empMailID, 
empMobileNo, basicPay);
 break;
 default:
 System.out.println("Invalid choice!");
 return;
 }
 employee.generatePaySlip(basicPay, empType);
 
 scanner.close();
 }
}