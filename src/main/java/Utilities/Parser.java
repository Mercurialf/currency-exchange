package Currencies;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class Parser {
    static Document doc;
    static String value;
    static double result;

    public static double getActualCurrency(String inputUrl, String inputXpath) {
        try {
            doc = Jsoup.connect(inputUrl).get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        value = doc.selectXpath(inputXpath).html();
        value = value.replace(",", ".");
        result = Double.parseDouble(value);

        return result;
    }
}
