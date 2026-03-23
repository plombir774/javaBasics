package org.example;

public class Month {

    void dayOfMonth(int x){
        switch(x){
            case 1,3,5,7,8,10,12 -> System.out.println(31);
            case 4,6,9,11 -> System.out.println(30);
            case 2 -> System.out.println(28);
            default -> System.out.println("Такого месяца не существует");
        }
    }
}