package Currencies;

public class Zloty {
    static final Double zlotyToDollar = 0.23;
    static final Double zlotyToEuro = 0.21;
    static final Double zlotyToHryvnia = 6.73;
    static final Double zlotyToRuble = 14.14;
    static final Double zlotyToYen = 29.00;

    public static double dollarExchangeRate(double inputValue) {
        return inputValue * zlotyToDollar;
    }
    public static double euroExchangeRate(double inputValue) {
        return inputValue * zlotyToEuro;
    }
    public static double hryvniaExchangeRate(double inputValue) {
        return inputValue * zlotyToHryvnia;
    }
    public static double rubleExchangeRate(double inputValue) {
        return inputValue * zlotyToRuble;
    }
    public static double yenExchangeRate(double inputValue) {
        return inputValue * zlotyToYen;
    }
}
