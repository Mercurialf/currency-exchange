package Utilities;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class Parser {
    static Document doc;
    static String value;
    static double result;
    static final String standardXpath = "//*[@id=\"knowledge-currency__updatable-data-column\"]/div[1]/div[2]/span[1]";

    public static double getActualCurrency(String src) {
        try {
            doc = Jsoup.connect(src).get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        value = doc.selectXpath(standardXpath).html();
        value = value.replace(",", ".");
        result = Double.parseDouble(value);

        return result;
    }
}
