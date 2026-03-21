package org.example;

public class StudentTest {

  static  void stud(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course) {
            System.out.println("Students are equal");
        } else {
            System.out.println("Students are not equal");
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Nikita", 3);
        Student st2 = new Student("Vika", 4);


        StudentTest.stud(st1, st2);
    }
}


