package classPractice;

import ReviewClass6.Employee;

public class Example {
    /*create a class students
Create three   variables studentName , studentID  and numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students*/
  String studentName;

  int studentID;

   static int numberOfStudents;

    public static void main(String[] args) {
        Example jan=new Example();
        jan.studentName="Asad";
        jan.studentID=3878;
        jan.numberOfStudents++;


        Example jan1=new Example();
        jan1.studentName="muhib";
        jan1.studentID=7392;
        jan1.numberOfStudents++;

        Example jan2=new Example();
        jan2.studentName="Rahim";
        jan2.studentID=738649;
        jan2.numberOfStudents++;

    }




}
