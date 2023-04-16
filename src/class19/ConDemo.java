package class19;

public class ConDemo {
    double bonus;
    double salary;
    String name;
    ConDemo(String name){
        bonus=5000;
        salary=50000;
        this.name=name;

    }

    public static void main(String[] args) {
        ConDemo obj1 =new ConDemo("Farhad");
        System.out.println("This is bonus "+obj1.bonus);
        System.out.println("This is Salary "+obj1.salary);
        System.out.println(obj1.name);

    }


}
