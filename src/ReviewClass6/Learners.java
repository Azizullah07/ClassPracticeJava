package ReviewClass6;

public class Learners {
/*create a class students
Create three   variables studentName , studentID  and numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students*/

    String studentName;
    int studentID;

    static int numberOfStudents;

    public static void main(String[] args) {
        Learners st=new Learners();
        st.studentID=123;
        st.studentName="Muhibullah";
        st.numberOfStudents++;

        Learners st1=new Learners();
        st1.studentName="Arshad";
        st1.studentID=1234;
        st1.numberOfStudents++;

        Learners st2= new Learners();
        st2.studentName = "Aziz";
        st2.studentID=12345;
        st2.numberOfStudents++;
        System.out.println(st2.numberOfStudents);
    }
}

