package class20;

public class ConstructorDemo4Tester {
    public static void main(String[] args) {
        ConstructorDemo4 employee=new ConstructorDemo4("Muhibullah",100000,10,320);
    employee.printBonus();
    System.out.println(employee.name);
    System.out.println(employee.bonus);
    System.out.println(employee.salary);
    System.out.println(employee.numberOfWorkDay);
    System.out.println(employee.bonusPercentage);



    }
}
