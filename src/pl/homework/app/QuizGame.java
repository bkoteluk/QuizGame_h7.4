package pl.homework.app;

import pl.homework.ui.UserInterface;

public class QuizGame {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig(100, 200, 3);
        UserInterface ui = new UserInterface(appConfig);
        ui.letPlay();
    }
}
