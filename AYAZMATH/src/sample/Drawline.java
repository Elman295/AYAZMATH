package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Drawline {

    @FXML
    private TextField x1txt;

    @FXML
    private TextField y1txt;

    @FXML
    private TextField x2txt;

    @FXML
    private TextField y2txt;

    @FXML
    private Button Drawbtn;

    @FXML
    void Drawaction(ActionEvent event) {
        String x1=x1txt.getText();
        String x2=x2txt.getText();
        String y1=y1txt.getText();
        String y2=y2txt.getText();
        double x1d=Double.parseDouble(x1);
        double x2d=Double.parseDouble(x2);
        double y1d=Double.parseDouble(y1);
        double y2d=Double.parseDouble(y2);
        StdDraw.line(x1d,y1d,x2d,y2d);




    }

}