package pl.sda.weather.tools;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author Juliusz Mueller
 */
public class SetLocation {

    public URL getUserImputLoction() {

        Scanner scanner = new Scanner(System.in);

        String locatin = scanner.nextLine();
        System.out.println("Bydgoszcz");
        scanner.close();

        String link = "https://api.apixu.com/v1/current.json?key=cfc66240774846629a3121846191003&q=";
        String ConcatLink = link.concat(locatin);
        URL url = null;
        
        try {
            url = new URL(ConcatLink);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        System.out.println(url);
        return  url;
    }


}
