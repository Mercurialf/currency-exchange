package Currencies;

public class Euro {
    static final Double euroToDollar = 1.05;
    static final Double euroToHryvnia = 30.98;
    static final Double euroToRuble = 68.29;
    static final Double euroToZloty = 4.64;
    static final Double euroToYen = 134.50;

    public static double dollarExchangeRate(double inputValue) {
        return inputValue * euroToDollar;
    }
    public static double hryvniaExchangeRate(double inputValue) {
        return inputValue * euroToHryvnia;
    }
    public static double rubleExchangeRate(double inputValue) {
        return inputValue * euroToRuble;
    }
    public static double zlotyExchangeRate(double inputValue) {
        return inputValue * euroToZloty;
    }
    public static double yenExchangeRate(double inputValue) {
        return inputValue * euroToYen;
    }
}
