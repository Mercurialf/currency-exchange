package Currencies;

import Utilities.Parser;

public class Euro {

    static String[] euroToOther = {"https://www.google.com.ua/search?q=euro+to+dollar",
            "https://www.google.com.ua/search?q=euro+to+hryvnia",
            "https://www.google.com.ua/search?q=euro+to+ruble",
            "https://www.google.com.ua/search?q=euro+to+zloty",
            "https://www.google.com.ua/search?q=euro+to+yen"};

    public static double dollarExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(euroToOther[0]);
    }

    public static double hryvniaExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(euroToOther[1]);
    }

    public static double rubleExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(euroToOther[2]);
    }

    public static double zlotyExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(euroToOther[3]);
    }

    public static double yenExchangeRate(double inputValue) {
        return inputValue * Parser.getActualCurrency(euroToOther[4]);
    }
}
