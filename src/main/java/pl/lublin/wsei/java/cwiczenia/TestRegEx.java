package pl.lublin.wsei.java.cwiczenia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegEx {

    public static void main(String[] args) {
        String exItem = "<item><title><![CDATA[ Infografika - Koniunktura gospodarcza w sierpniu 2022 r. ]]</title><pubDate><![CDATA[ Mon, 22 Aug 2022 12:30:00 +0200 ]]></pubDate>\n" +
                "<link>https://stat.gov.pl/infografiki-widzety/infografiki/infografika-koniunktura-gospodarcza-w-sierpniu-2022-r-,38,74.html</link><guid isPermaLink=\"false\">https://stat.gov.pl/infografiki-widzety/infografiki/infografika-koniunktura-gospodarcza-w-sierpniu-2022-r-,38,74.html</guid><media:content url=\"https://stat.gov.pl/files/gfx/portalinformacyjny/pl/defaultaktualnosci/5866/38/74/1/infografika_koniunktura_gospodarcza_08_2022_2.png\" type=\"image/png\" width=\"2362\" height=\"4548\"><media:description type=\"plain\"><![CDATA[ ]]></media:description>\n" +
                "<media:thumbnail url=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/38/74/1/infografika_koniunktura_gospodarcza_08_2022_2,k1uUwl-caFOE6tCTiHtf.png\"/></media:content>\n" +
                "<description><![CDATA[ <div><img src=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/38/74/1/infografika_koniunktura_gospodarcza_08_2022_2,k1uUwl-caFOE6tCTiHtf.png\" alt=\"\" width=\"280\" height=\"212\"/></div> ]]></description></item>";

        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]<\\/title>");
        Matcher m = pat.matcher(exItem);

        if (m.find())
            System.out.println("Znaleziono tytul: " + m.group(1));
        else
            System.out.println("Nie znaleziono tytulu ... ");
    }
}
