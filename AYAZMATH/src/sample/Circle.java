package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Circle {

    @FXML
    private TextField xtxt;

    @FXML
    private TextField ytxt;

    @FXML
    private TextField rtxt;

    @FXML
    private Button drawbtn;

    @FXML
    void Drawactioncircle(ActionEvent event) {

        String xs=xtxt.getText();
        String ys=ytxt.getText();
        String rs=rtxt.getText();
        double x=Double.parseDouble(xs);
        double y=Double.parseDouble(ys);
        double r=Double.parseDouble(rs);
        StdDraw.circle(x,y,r);

    }

}