package ReviewClass6;

import jdk.nashorn.internal.objects.NativeString;

public class LocalVarDemo {
    public String reverseString(String str){
        String newStr="";
       for (int i=str.length()-1;i>=0;i--){

           newStr+=str.charAt(i);


       }
       if (newStr.equals(str)) {
           System.out.println("the String polindrom");
       }else {
           System.out.println("string are not mirror");
       }
        return newStr;
    }
}
 class LocalVarDemoTester{
    public static void main(String[]args){
        LocalVarDemo obj=new LocalVarDemo();
        System.out.println(obj.reverseString("Hello"));
    }


 }