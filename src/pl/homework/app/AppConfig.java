package pl.homework.app;

public class AppConfig {
    private int startRange;
    private int endRange;
    private int divisor;

    public AppConfig() {
    }

    public AppConfig(int startRange, int endRange, int divisor) {
        this.startRange = startRange;
        this.endRange = endRange;
        this.divisor = divisor;
    }

    public int getStartRange() {
        return startRange;
    }

    public void setStartRange(int startRange) {
        this.startRange = startRange;
    }

    public int getEndRange() {
        return endRange;
    }

    public void setEndRange(int endRange) {
        this.endRange = endRange;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    @Override
    public String toString() {
        return "[" + startRange + ", " + endRange + "]";
    }
}
