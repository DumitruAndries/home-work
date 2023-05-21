package Lesson4.homework08052023.task4;

public class Pizza {

    public static void main(String[] args) {

        int dim24 = 24;
        int dim28 = 28;
        int calcm = 40;


        double calorie24 = dim24 * calcm;
        double calorie28 = dim28 * calcm;
        double result = calorie28 - calorie24;

        System.out.println("При покупке пиццы диаметром 28 см вместо пиццы диаметром 24 см вы получите дополнительно "
                + result + " калорий.");

    }
}
