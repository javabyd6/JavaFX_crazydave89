package pl.sda.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {
    @FXML
    private Button search;
    @FXML
    private TextField city;
    @FXML
    private Label TemperatureIn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        city.setText("Test123");
        TemperatureIn.setText("");
    }
    public void setCity(){
        System.out.println("klik klik");
    }
}
