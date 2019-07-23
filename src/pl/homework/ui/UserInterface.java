package pl.homework.ui;

import pl.homework.app.AppConfig;
import pl.homework.app.AppLogic;

import java.util.Locale;
import java.util.Scanner;

public class UserInterface {
    AppConfig appConfig;
    Scanner scanner = new Scanner(System.in);


    public UserInterface(AppConfig appConfig) {
        this.appConfig = appConfig;
    }


    public int getNumber() {
        System.out.println("Podaj liczbę ");
        return scanner.nextInt();
    }

    public void endQiuz() {
        scanner.close();
    }


    public void letPlay() {
        AppLogic appLogic = new AppLogic();
        boolean endQuiz = false;
        do {
            endQuiz = appLogic.study(getNumber(), appConfig);
        } while (!endQuiz);
        endQiuz();
    }




}
