package class19;

public class LocalVariables {



    public void addition(int num1,int num2){
        System.out.println(num1+num2);



    }
    public  void sub(){
        int num1=10;
        int num2=12;
        System.out.println(num1-num2);
    }

    String returnString(int num){
       return "thia is String";

    }

    public static void main(String[] args) {
        LocalVariables localVariables=new LocalVariables();
        localVariables.addition(10,15);
        localVariables.sub();
        localVariables.returnString(1);
    }
}
