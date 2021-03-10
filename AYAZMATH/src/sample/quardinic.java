package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class quardinic {

    @FXML
    private TextField atxt;

    @FXML
    private TextField btxt;

    @FXML
    private TextField ctxt;

    @FXML
    private Text answer1;

    @FXML
    private Text answer2;

    @FXML
    private Text noanswer;

    @FXML
    private Button solve;

    @FXML
    void aaction(ActionEvent event) {

    }

    @FXML
    void baction(ActionEvent event) {

    }

    @FXML
    void caction(ActionEvent event) {

    }

    @FXML
    void solveaction(ActionEvent event) {
        String as=atxt.getText();
        String bs=btxt.getText();
        String cs=ctxt.getText();
        double a=Double.parseDouble(as);
        double b=Double.parseDouble(bs);
        double c=Double.parseDouble(cs);
        double delta=(Math.pow(b,2)-4*a*c);

        if (delta>0){
            double answer1d=(-b+Math.sqrt(delta))/(2*a);
            double answer2d=(-b-Math.sqrt(delta))/(2*a);
            String answer1s=String.valueOf(answer1d);
            String answer2s=String.valueOf(answer2d);
            answer1.setText(answer1s);
            answer2.setText(answer2s);

        }
        else if (delta==0){
            double ans=-b/(2*a);
            String anss=String.valueOf(ans);
            answer1.setText(anss);

        }
        else {

            noanswer.setText("delta<0");

        }


    }

}