package Currencies;
import Utilities.Parser;

public class Hryvnia {
    static String standardXpath = "//*[@id=\"knowledge-currency__updatable-data-column\"]/div[1]/div[2]/span[1]";
    static String[] hryvniaToOther = {"https://www.google.com/search?q=hryvnia+To+Dollar",
            "https://www.google.com/search?q=hryvnia+To+euro",
            "https://www.google.com/search?q=hryvnia+To+ruble",
            "https://www.google.com/search?q=hryvnia+To+zloty",
            "https://www.google.com/search?q=hryvnia+To+yen"};

    public static double dollarExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(hryvniaToOther[0], standardXpath);
    }

    public static double euroExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(hryvniaToOther[1], standardXpath);
    }

    public static double rubleExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(hryvniaToOther[2], standardXpath);
    }

    public static double zlotyExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(hryvniaToOther[3], standardXpath);
    }

    public static double yenExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(hryvniaToOther[4], standardXpath);
    }
}
