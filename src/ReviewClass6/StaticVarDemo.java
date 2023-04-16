package ReviewClass6;

public class StaticVarDemo {
    private static String[] creatwordArray(String str){
        String [] Array;
        Array=str.split(" ");
        for(String ar:Array){
            System.out.println(ar);
        }
        return Array;

    }
    public static void main(String[]args){
        String words="this is java review class 19";
        creatwordArray(words);
    }


        }



