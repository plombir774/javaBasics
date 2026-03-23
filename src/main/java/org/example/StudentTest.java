package org.example;

public class StudentTest {

 public static void StudentCompare(Student st1, Student st2) {
     if (st1.name.equals(st2.name) && st1.course == st2.course) {
         System.out.println("Студенты одинаковые");
     } else {
         System.out.println("Студенты разные");
     }
 }
  public   static void StudentCompareDetails(Student st1 , Student st2){
        if(!st1.name.equals(st2.name)){
            System.out.println(" У студентов разные имена");
        }
        else{
            if(st1.course != st2.course){
                System.out.println("Студенты учатся на разных курсах");
            }
            else{ System.out.println("Студенты равны");
        }
    }
}

    public static void main(String[]args){
        Student st1  = new Student("Nikita",3);
        Student st2 = new Student("Vika", 4);
        StudentCompare(st1,st2);
       StudentCompareDetails(st1,st2);
    }
}
