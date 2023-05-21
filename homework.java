package Lesson4.homework08052023.task1;

import java.util.Scanner;

public class homework {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое слово");
        String firstWord = scanner.nextLine();

        System.out.println("Введите второе слово");
        String secondWord = scanner.nextLine();

        int word = firstWord.length() / 2;
        String result = firstWord.substring(0, word) + secondWord.substring(word);

        System.out.println("Результат: " + result);
    }
}
