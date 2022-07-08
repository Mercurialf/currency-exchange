package Currencies;

import Utilities.Parser;

public class Ruble {

    static String[] rubleToOther = {"https://www.google.com/search?q=ruble+to+dollar",
            "https://www.google.com/search?q=ruble+to+euro",
            "https://www.google.com/search?q=ruble+to+hryvnia",
            "https://www.google.com/search?q=ruble+to+zloty",
            "https://www.google.com/search?q=ruble+to+yen"};

    public static double dollarExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(rubleToOther[0]);
    }

    public static double euroExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(rubleToOther[1]);
    }

    public static double hryvniaExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(rubleToOther[2]);
    }

    public static double zlotyExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(rubleToOther[3]);
    }

    public static double yenExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(rubleToOther[4]);
    }
}
