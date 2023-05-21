package Lesson4.homework08052023.task2;

public class ArithmeticOperations {

    public static void main(String[] args) {

        int a = 15;
        int b = 8;

        int sum = sum(a, b);
        int dif = dif(a, b);
        int mult = mult(a, b);
        double div = div(a, b);

        System.out.println("Сложения: " + sum);
        System.out.println("Вычитания: " + dif);
        System.out.println("Умножения: " + mult);
        System.out.println("Деления: " + div);

    }
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int dif(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static double div(int a, int b) {
        return a / b;
    }

}
