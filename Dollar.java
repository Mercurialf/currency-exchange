public class Dollar {
    static final Double dollarToEuro = 0.95;
    static final Double dollarToHryvnia = 29.55;
    static final Double dollarToRuble = 64.38;
    static final Double dollarToZloty = 4.42;
    static final Double dollarToYen = 128.20;

    public static double euroExchangeRate(double inputValue) {
        return inputValue * dollarToEuro;
    }
    public static double hryvniaExchangeRate(double inputValue) {
        return inputValue * dollarToHryvnia;
    }
    public static double rubleExchangeRate(double inputValue) {
        return inputValue * dollarToRuble;
    }
    public static double zlotyExchangeRate(double inputValue) {
        return inputValue * dollarToZloty;
    }
    public static double yenExchangeRate(double inputValue) {
        return inputValue * dollarToYen;
    }
}
