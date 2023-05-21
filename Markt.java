package Lesson5.homework11052023.task2;

public class Markt {

    public static void main(String[] args) {

        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean canBuy = isEdekaOpen && isReweOpen;

        System.out.println("Я могу купить еду: " + canBuy);


    }
}
