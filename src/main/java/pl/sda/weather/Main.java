package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.weather.model.Weather;
import pl.sda.weather.tools.SetLocation;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Juliusz Mueller
 */
public class Main {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        SetLocation setLocation = new SetLocation();


        try {
            Weather weather = mapper.readValue(setLocation.getUserImputLoction(), Weather.class);
            System.out.println("Pogada: "+ weather.getCurrent().getTemp_c()+ " C");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
