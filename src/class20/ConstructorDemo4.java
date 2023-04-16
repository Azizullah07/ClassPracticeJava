package class20;

public class ConstructorDemo4 {
    String name;
    double bonus;
    double salary;
    double bonusPercentage;

    int numberOfWorkDay;
    ConstructorDemo4(String name,double salary,double bonusPercentage,int numberOfWorkDay){
        this.name=name;
        this.bonus=1000;
        this.salary=salary;
        this.numberOfWorkDay=numberOfWorkDay;
        this.bonusPercentage=bonusPercentage;


    }
    void printBonus(){
        if (numberOfWorkDay>300){
            bonus=1500;

        }else {
            bonus=500;
        }
    }

}
