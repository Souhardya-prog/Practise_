/*
Person Class:

Create a class Person to represent a general person.
The class should have the following private attributes:
name (String): The name of the person.
age (int): The age of the person.
        The class should provide the following methods:
A constructor to initialize the name and age attributes.
Getter and setter methods for the name and age attributes.
A method display() to print the details of the person (name and age).

Abstract Class Employee:

Create an abstract class Employee that extends the Person class to represent a general employee.
The class should have the following private attribute in addition to those inherited from Person:
employeeId (String): The unique identifier for the employee.
The class should provide the following methods:
A constructor to initialize the name, age, and employeeId attributes. The constructor should use the super keyword to call the constructor of the Person class.
Getter and setter methods for the employeeId attribute.
        An abstract method calculateSalary() to be implemented by subclasses.
An abstract method getEmployeeType() to be implemented by subclasses to return the type of employee (e.g., "Full-Time", "Part-Time").
An overridden method display() to print the details of the employee (name, age, employee ID, and employee type). This method should call the display() method of the Person class to avoid code duplication.

FullTimeEmployee Class:

Create a class FullTimeEmployee that extends the Employee class.
The class should have the following private attribute:
annualSalary (double): The annual salary of the full-time employee.
The class should provide the following methods:
A constructor to initialize the name, age, employeeId, and annualSalary attributes.
Getter and setter methods for the annualSalary attribute.
An implementation of the calculateSalary() method to return the annual salary.
An implementation of the getEmployeeType() method to return "Full-Time".
An overridden method display() to include the annual salary in the output.

PartTimeEmployee Class:

Create a class PartTimeEmployee that extends the Employee class.
The class should have the following private attributes:
hourlyRate (double): The hourly rate of the part-time employee.
hoursWorked (int): The number of hours worked by the part-time employee.
The class should provide the following methods:
A constructor to initialize the name, age, employeeId, hourlyRate, and hoursWorked attributes.
Getter and setter methods for the hourlyRate and hoursWorked attributes.
An implementation of the calculateSalary() method to return the total salary based on the hourly rate and hours worked.
An implementation of the getEmployeeType() method to return "Part-Time".
An overridden method display() to include the hourly rate and hours worked in the output.

Payable Interface:

Create an interface Payable with a method processPayment() that processes the payment for an employee.

Main Class:

Create a Main class with a main method to demonstrate the functionality of the system.
The main method should:
Create instances of FullTimeEmployee and PartTimeEmployee and display their details.
Use the calculateSalary() method to calculate and display the salary of each employee.
Demonstrate dynamic method dispatch by storing Employee references in an array and invoking their display() and calculateSalary() methods.
Implement the Payable interface in both FullTimeEmployee and PartTimeEmployee classes and call the processPayment() method for each type of employee.*/


abstract class GeneralEmployee extends Person{
    private String EmployeeId;
    GeneralEmployee(String name, int age, String EmployeeId){
        super(name, age);
        this.EmployeeId=EmployeeId;
    }
    public void setEmployeeId(String EmployeeId){
        this.EmployeeId = EmployeeId;
    }
    public String getEmployeeId() {
        return EmployeeId;
    }
    public void display(){
        super.display();
        System.out.println(EmployeeId);
    }
    abstract double calculateSalary();
    abstract String getEmployeeType();
}
class FullTimeEmployee extends GeneralEmployee implements payable{
    private double annualSalary;

    FullTimeEmployee(String name, int age, String EmployeeId, double annualSalary){
        super(name, age, EmployeeId);
        this.annualSalary = annualSalary;
    }
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    @Override
    double calculateSalary() {
        return annualSalary;
    }
    @Override
    String getEmployeeType(){
        return "Full time";
    }
    public void display(){
        super.display();
        System.out.println(annualSalary);
    }

    @Override
    public int processPayment() {
        return (int)annualSalary;
    }
}
class PartTimeEmployee extends GeneralEmployee implements payable{
    private double hourlyRate;
    private int hoursWorked;

    PartTimeEmployee(String name, int age, String EmployeeId, double hourlyRate, int hoursWorked){
        super(name, age, EmployeeId);
        this.hourlyRate= hourlyRate;
        this.hoursWorked= hoursWorked;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked*hourlyRate;
    }

    @Override
    String getEmployeeType() {
        return "Part Time";
    }
    @Override
    public void display(){
        super.display();
        System.out.println(hoursWorked);
        System.out.println(hourlyRate);
    }

    @Override
    public int processPayment() {
        return (int)hourlyRate*hoursWorked;
    }
}

interface payable{
    int processPayment();
}
public class AdvancedCompany_Management {
    public static void main(String[] args) {
        GeneralEmployee Phoebe= new FullTimeEmployee("Phoebe", 17, "PL139", 40000);//object of FullTimeEmployee so constructor of FullTimeEmployee class is executed.
        Phoebe.setAge(18);
        Phoebe.setEmployeeId("PL567");
        //Phoebe.setHoursWorked(341); throws error since setHoursWorked() is not a method of GeneralEmployee class which is the reference
        Phoebe.display();//name, age, id, salary all will be displayed since object is of Fulltimeemployee
        System.out.println("Salary: "+Phoebe.calculateSalary());//we can call calculateSalary since it is an abstract() of Generalemployee class overridden in FullTimeEmployee class.
        GeneralEmployee Nate = new PartTimeEmployee("Nate", 19, "NM4", 35.75, 300);
        Nate.display();
        System.out.println("Salary: "+Nate.calculateSalary());

        //Phoebe.processPayment();throws error due to same reason as above

        FullTimeEmployee FPhoebe = new FullTimeEmployee("Phoebe", 17, "PL139", 40000);
        System.out.println("Payment due to "+FPhoebe.getName()+": "+FPhoebe.processPayment());
        PartTimeEmployee PNate = new PartTimeEmployee("Nate", 19, "NM4", 35.75, 300);
        System.out.println("Payment due to "+PNate.getName()+": "+PNate.processPayment());
    }
}
