package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date birthday = new Date(109, 0, 2);

        Date now = new Date();

        long differenceInMills = now.getTime() - birthday.getTime();

        long seconds = differenceInMills / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;

        System.out.println("С моего дня рождения прошло: ");
        System.out.println(days + "Дней " + (hours % 24) + "Часов " + (minutes % 60) + "минут " + (seconds % 60) + "секунд.");
    }
}