package pl.lublin.wsei.java.cwiczenia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika {
    public String tytul;
    public String adresStrony;
    public String adresGrafiki;
    public String adresMiniaturki;
    public Integer szerokosc;
    public Integer wysokosc;

    private String tekst;

    public Infografika(String tekst) {
        this.tekst = tekst;
    }

    public void print() {
        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]<\\/title>");
        Matcher m = pat.matcher(tekst);
        if (m.find())
            tytul = m.group(1);
        else
            tytul = "";

        System.out.println(tytul);

        pat = Pattern.compile("<link>(.*)</link>");
        m = pat.matcher(tekst);
        if(m.find())
            adresStrony = m.group(1);
        else
            adresStrony = "";

        System.out.println(adresStrony);

        pat = Pattern.compile("<media:content url=\"(.*)\\\" type=\"image");
        m = pat.matcher(tekst);
        if(m.find())
            adresGrafiki = m.group(1);
        else
            adresGrafiki = "";

        System.out.println(adresGrafiki);

        pat = Pattern.compile("<media:thumbnail url=\"(.*).(.png)\"");
        m = pat.matcher(tekst);
        if(m.find())
            adresMiniaturki = m.group(1);
        else
            adresMiniaturki = "";

        System.out.println(adresMiniaturki);

        pat = Pattern.compile("width=\"(.*)\" height");
        m = pat.matcher(tekst);

        if (m.find())
            szerokosc = Integer.parseInt(m.group(1));
        else
            szerokosc = 0;

        System.out.println(szerokosc);

        pat = Pattern.compile("height=\"(\\d*)\">");
        m = pat.matcher(tekst);

        if (m.find())
            wysokosc = Integer.parseInt(m.group(1));
        else
            wysokosc = 0;

        System.out.println(wysokosc);

    }
}
