package ReviewClass6;

public class Employee {
//creat class employee
//    Create three	variables	eID , salary and set the manager to “Ehsan”
//    Create two objects of the class Employee
//Set the value of eID, salary for each of the objects
//    Print out the eID , salary and	CEO for each of the objects

    int eID;
    int Salary;
    String manager="Ehsan";

    public static void main(String[] args) {
        Employee Aziz=new Employee();
        Aziz.eID=1;
        Aziz.Salary=10000;
    System.out.println("ID number "+Aziz.eID+ " Salary "+Aziz.Salary+ " manger "+Aziz.manager);

    Employee Khushal=new Employee();
    Khushal.eID=2;
    Khushal.Salary=10000;
    System.out.println("ID number "+Khushal.eID+ " Salary "+ Khushal.Salary+" manager "+Khushal.manager);

    }
}
