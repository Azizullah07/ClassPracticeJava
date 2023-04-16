public class Class21StudentPractice {
//    Write program as a Student class	that has instance variables name and address.
//    Create a constructor that will initialize those variables.
//    Print name & address of given	student by the displayInfo method.

  String name;
  String address;
  Class21StudentPractice(String name,String address){
     this.name=name;
     this.address=address;
  }
  void displayInfo(){
   System.out.println("name "+name+ " Address "+address);
  }



}
