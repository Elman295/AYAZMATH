package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Button drawlinebtn;

    @FXML
    private Button areabtn;

    @FXML
    private Button quarbtn;

    @FXML
    private Button drawcircle;

    @FXML
    private Button convertbtn;

    @FXML
    void Areaaction(ActionEvent event) throws IOException {
        Stage primaryStage=new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 675));
        primaryStage.show();

    }

    @FXML
    void Drawciecleaction(ActionEvent event) throws IOException {
        Stage primaryStage=new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Circle.fxml"));
        primaryStage.setTitle("Draw a circle");
        primaryStage.setScene(new Scene(root, 600, 475));
        primaryStage.show();

    }

    @FXML
    void Drawlineaction(ActionEvent event) throws IOException {
        Stage primaryStage=new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Drawline.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 575));
        primaryStage.show();

    }

    @FXML
    void convertaction(ActionEvent event) throws IOException {
        Stage primaryStage=new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 675));
        primaryStage.show();

    }

    @FXML
    void quaraction(ActionEvent event) throws IOException {
        Stage primaryStage=new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("quar.fxml"));
        primaryStage.setTitle("AYAZ");
        primaryStage.setScene(new Scene(root, 500, 575));
        primaryStage.show();

    }

}