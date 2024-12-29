/*Person Class:

Create a class Person to represent a general person.
The class should have the following private attributes:
name (String): The name of the person.
age (int): The age of the person.
        The class should provide the following methods:
A constructor to initialize the name and age attributes.
Getter and setter methods for the name and age attributes.
A method display to print the details of the person (name and age).

Employee Class:

Create a class Employee that extends the Person class to represent an employee.
The class should have the following private attribute in addition to those inherited from Person:
employeeId (String): The unique identifier for the employee.
The class should provide the following methods:
A constructor to initialize the name, age, and employeeId attributes. The constructor should use the super keyword to call the constructor of the Person class.
Getter and setter methods for the employeeId attribute.
An overridden method display to print the details of the employee (name, age, and employee ID). This method should call the display method of the Person class to avoid code duplication.

Main Class:

Create a Main class with a main method to demonstrate the functionality of the Person and Employee classes.
The main method should:
Create an instance of Person and display its details.
Create an instance of Employee and display its details.
Modify the attributes of the Employee instance using setter methods and display the updated details.*/

class Person{
    private String name;
    private int age;
    //Initializing name and age using constructor
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    //Making setter methods for change ing age or name. Name can change when a person gets married
    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name){
        this.name = name;
    }
    //  getters for improved flexibility
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    //Why are we using getters and displaay()? this is because although display is good for quickly displaying
    // the output getters give us access to the attributes if we need them somewhere else in our program.
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Employee extends Person{
    private String Employeeid;//unique identification for employees
    //Initializing name and age using constructor
    Employee(String Employeeid, String name, int age){
        super(name, age);
        this.Employeeid=Employeeid;
    }
    //setEmployeeid for potential change in id.
    public void setEmployeeid(String Employeeid) {
        this.Employeeid=Employeeid;
    }
//  getter method for improved flexibility
    public String getEmployeeid(){
        return Employeeid;
    }

    @Override
    public void display() {
        super.display();//calling super class method to print name, age to avoid code duplication.
        System.out.println("ID: "+Employeeid);
    }
}
public class Company_Management {
    public static void main(String[] args) {
        Person person1 = new Person("Souhardya", 15);
        person1.display();
        Employee employee1 = new Employee("SB737", "John", 32);
        employee1.display();
        System.out.println("1 year later");
        employee1.setAge(33);
        employee1.display();
    }
}
