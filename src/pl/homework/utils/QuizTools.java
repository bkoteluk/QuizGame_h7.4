package pl.homework.utils;

import java.util.Scanner;

public class QuizTools {

    Scanner scanner = new Scanner(System.in);

    private int getNumber() {
        System.out.println("Podaj liczbę ");
        return scanner.nextInt();
    }

    public void endQiuz() {
        scanner.close();
    }

    public boolean studyNumber() {
        int number = getNumber();
        boolean result = false;
        if (number < 100 ) {
            System.out.println("Liczba jest za mała");
        } else if (number <= 200) {
            if (number%3 == 0) {
                System.out.println("Twoja liczba jest ok");
                result = true;
            } else {
                System.out.println("Liczba nie jest podzielna przez 3");
            }
        } else {
            System.out.println("Liczba jest za duża");
        }
        return result;
    }

}
