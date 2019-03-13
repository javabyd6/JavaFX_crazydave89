package pl.sda.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import pl.sda.Pogoda.Condition;
import pl.sda.Pogoda.Pogoda;
import pl.sda.Pogoda.SerwisPogody;

//import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {
    @FXML
    private Button search;
    @FXML
    private TextField city;
    @FXML
    private Label TemperatureIn;
    @FXML
    private Label miasto;
    @FXML
    private Label temp;
    @FXML
    private Label czas;
    @FXML
    private ImageView imageView1;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        city.setText("");
        TemperatureIn.setText("W jakim miescie chcialbys sprawdzic pogode?");
    }
    public void setCity(){
        SerwisPogody serwisPogody= new SerwisPogody();
        Pogoda pogoda= serwisPogody.getCityPogoda(city.getText());
        miasto.setText(pogoda.getLocation().getName());
        temp.setText(String.valueOf(pogoda.getCurrent().getTemp_c())+" stopnie");
        czas.setText(pogoda.getLocation().getLocaltime());
        Image image= new Image("https:"+pogoda.getCurrent().getCondition().getIcon());
            imageView1.setImage(image);
        }
    }
