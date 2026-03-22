package org.example;

public class Season {

    public static void printSeason(int month) {

        String season = switch (month) {
            case 12, 1, 2 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> "Некорректный месяц";
        };

        System.out.println(season);
    }

    public static void main(String[] args) {
        printSeason(4);
    }
}