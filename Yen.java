public class Yen {
    static final Double yenToDollar = 0.0078;
    static final Double yenToEuro = 0.0074;
    static final Double yenToHryvnia = 0.23;
    static final Double yenToRuble = 0.49;
    static final Double yenToZloty = 0.034;

    public static double dollarExchangeRate(double inputValue) {
        return inputValue * yenToDollar;
    }
    public static double euroExchangeRate(double inputValue) {
        return inputValue * yenToEuro;
    }
    public static double hryvniaExchangeRate(double inputValue) {
        return inputValue * yenToHryvnia;
    }
    public static double rubleExchangeRate(double inputValue) {
        return inputValue * yenToRuble;
    }
    public static double zlotyExchangeRate(double inputValue) {
        return inputValue * yenToZloty;
    }
}
