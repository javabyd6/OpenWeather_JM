package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.weather.model.Weather;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Juliusz Mueller
 */
public class Main {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        try {
            URL url = new URL("https://api.apixu.com/v1/current.json?key=cfc66240774846629a3121846191003&q=Paris");
            try {
                Weather weather = mapper.readValue(url, Weather.class);
                System.out.println("Pogada; "+ weather.getCurrent().getTemp_c());
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }



//https://api.apixu.com/v1/current.json?key=cfc66240774846629a3121846191003&q=Paris
    }
}
