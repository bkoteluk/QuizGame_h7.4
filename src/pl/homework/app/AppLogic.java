package pl.homework.app;

public class AppLogic {

    public boolean study(int number, AppConfig appConfig) {
        boolean result = false;
        if (number < appConfig.getStartRange() ) {
            System.out.println("Liczba jest za mała");
        } else if (number >= appConfig.getStartRange() && number <= appConfig.getEndRange()) {
            if (number%appConfig.getDivisor() == 0) {
                System.out.println("Twoja liczba jest ok");
                result = true;
            } else {
                System.out.println("Liczba nie jest podzielna przez " + appConfig.getDivisor());
            }
        } else {
            System.out.println("Liczba jest za duża");
        }
        return result;
    }
}
