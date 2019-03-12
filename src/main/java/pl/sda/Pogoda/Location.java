package pl.sda.Pogoda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Location {

    private String name;
    private String region;
    private String country;
    private float lat;
    private float lon;
    private String tz_id;
    private long localtime_epoch;
    private String localtime;


}
