package Currencies;

public class Ruble {
    static final Double rubleToDollar = 0.016;
    static final Double rubleToEuro = 0.015;
    static final Double rubleToHryvnia = 0.48;
    static final Double rubleToZloty = 0.071;
    static final Double rubleToYen = 2.05;

    public static double dollarExchangeRate(double inputValue) {
        return inputValue * rubleToDollar;
    }
    public static double euroExchangeRate(double inputValue) {
        return inputValue * rubleToEuro;
    }
    public static double hryvniaExchangeRate(double inputValue) {
        return inputValue * rubleToHryvnia;
    }
    public static double zlotyExchangeRate(double inputValue) {
        return inputValue * rubleToZloty;
    }
    public static double yenExchangeRate(double inputValue) {
        return inputValue * rubleToYen;
    }
}
