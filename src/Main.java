import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        try {
            Document doc = Jsoup.connect("https://www.tokopedia.com/ram-indonesia/google-pixel-32gb-quite-black-used-1").get();

            String title = doc.select(".product-title.green a").text();
            String harga = doc.select("#product_price_int").attr("value");
            String deskripsi = doc.select("[itemprop='description']").text();

            System.out.println(title);
            System.out.println(harga);
            System.out.println(deskripsi);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
