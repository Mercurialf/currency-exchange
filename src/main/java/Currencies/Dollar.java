package Currencies;
import Utilities.Parser;

public class Dollar {
    static String standardXpath = "//*[@id=\"knowledge-currency__updatable-data-column\"]/div[1]/div[2]/span[1]";
    static String[] dollarToOther = {"https://www.google.com.ua/search?q=dollar+to+euro",
            "https://www.google.com.ua/search?q=dollar+to+hryvnia",
            "https://www.google.com.ua/search?q=dollar+To+Ruble",
            "https://www.google.com.ua/search?q=dollar+To+Zloty",
            "https://www.google.com.ua/search?q=dollar+To+Yen"};

    public static double euroExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(dollarToOther[0], standardXpath);
    }

    public static double hryvniaExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(dollarToOther[1], standardXpath);
    }

    public static double rubleExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(dollarToOther[2], standardXpath);
    }

    public static double zlotyExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(dollarToOther[3], standardXpath);
    }

    public static double yenExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(dollarToOther[4], standardXpath);
    }
}
