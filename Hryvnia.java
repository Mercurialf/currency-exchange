public class Hryvnia {
    static final Double hryvniaToDollar = 0.034;
    static final Double hryvniaToEuro = 0.032;
    static final Double hryvniaToRuble = 2.19;
    static final Double hryvniaToZloty = 0.15;
    static final Double hryvniaToYen = 4.34;

    public static double dollarExchangeRate(double inputValue) {
        return inputValue * hryvniaToDollar;
    }
    public static double euroExchangeRate(double inputValue) {
        return inputValue * hryvniaToEuro;
    }
    public static double rubleExchangeRate(double inputValue) {
        return inputValue * hryvniaToRuble;
    }
    public static double zlotyExchangeRate(double inputValue) {
        return inputValue * hryvniaToZloty;
    }
    public static double yenExchangeRate(double inputValue) {
        return inputValue * hryvniaToYen;
    }
}
