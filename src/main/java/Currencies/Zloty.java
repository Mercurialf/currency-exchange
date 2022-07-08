package Currencies;

import Utilities.Parser;

public class Zloty {

    static String[] zlotyToOther = {"https://www.google.com/search?q=zloty+to+dollar",
            "https://www.google.com/search?q=zloty+to+euro",
            "https://www.google.com/search?q=zloty+to+hryvnia",
            "https://www.google.com/search?q=zloty+to+ruble",
            "https://www.google.com/search?q=zloty+to+yen"};

    public static double dollarExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(zlotyToOther[0]);
    }

    public static double euroExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(zlotyToOther[1]);
    }

    public static double hryvniaExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(zlotyToOther[2]);
    }

    public static double rubleExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(zlotyToOther[3]);
    }

    public static double yenExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(zlotyToOther[4]);
    }
}
