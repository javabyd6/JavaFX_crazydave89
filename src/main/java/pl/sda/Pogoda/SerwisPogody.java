package pl.sda.Pogoda;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class SerwisPogody {
    final String finalUrl= "http://api.apixu.com/v1/current.json?key=6219ff788aa942b2aef115716191003&q=";


    public SerwisPogody() {


    }

    public Pogoda getCityPogoda(String CityName) {
        Pogoda pogoda = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            URL url = new URL(finalUrl + CityName);
            pogoda = mapper.readValue(url, Pogoda.class);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return pogoda;
    }
}
