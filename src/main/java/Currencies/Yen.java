package Currencies;
import Utilities.Parser;

public class Yen {
    static String standardXpath = "//*[@id=\"knowledge-currency__updatable-data-column\"]/div[1]/div[2]/span[1]";
    static String[] yenToOther = {"https://www.google.com/search?q=yen+to+dollar",
            "https://www.google.com/search?q=yen+to+euro",
            "https://www.google.com/search?q=yen+to+hryvnia",
            "https://www.google.com/search?q=yen+to+ruble",
            "https://www.google.com/search?q=yen+to+zloty"};

    public static double dollarExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(yenToOther[0]);
    }

    public static double euroExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(yenToOther[1]);
    }

    public static double hryvniaExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(yenToOther[2]);
    }

    public static double rubleExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(yenToOther[3]);
    }

    public static double zlotyExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(yenToOther[4]);
    }
}
