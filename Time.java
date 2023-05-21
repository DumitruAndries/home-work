package Lesson5.homework11052023.task4;

import java.util.Random;

public class Time {

    public static void main(String[] args) {

       Random random = new Random() ;
        int n = random.nextInt(28801);

        System.out.println("Осталось секунд: " + n);
        System.out.println(convertSecondsToHours(n));
    }

    public static String convertSecondsToHours(int seconds) {
        int hours = seconds / 3600;

        if (hours > 0) {
            return "Осталось " + hours + " час";
        } else {
            return "Осталось менее часа";
        }

    }
}
