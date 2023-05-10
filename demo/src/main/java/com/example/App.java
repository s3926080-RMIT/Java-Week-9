package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.util.Calendar;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        
    // BorderPane first exercise
        // BorderPane bPane = new BorderPane();

        // bPane.setTop(new TextField("Top"));
        // bPane.setBottom(new TextField("Bottom"));
        // bPane.setLeft(new TextField("Left"));
        // bPane.setRight(new Text("Right"));

        // Scene scene = new Scene(bPane);

        // stage.setTitle("Yo what's up here");

        // stage.setScene(scene);

        // stage.show();

    // BorderPane get time of day and output greeting message
        // Calendar time = Calendar.getInstance();
        // final String AM = "Good morning";
        // final String PM = "Good afternoon";
        // final String EVE = "Good evening";

        // String timeOfDay;
        // int checkTime = time.get(Calendar.HOUR_OF_DAY);
        // if (checkTime >= 5 && checkTime < 13) {
        //     timeOfDay = AM;
        // } else if (checkTime >= 13 && checkTime < 18) {
        //     timeOfDay = PM;
        // } else {
        //     timeOfDay = EVE;
        // }

        // BorderPane bPane = new BorderPane();

        // bPane.setCenter(new Text(timeOfDay));

        // Scene scene = new Scene(bPane);

        // stage.setScene(scene);

        // stage.show();

    // Event Handling
        Label lblSum = new Label();
        TextField txtNum1 = new TextField();

        BorderPane root = new BorderPane();
        lblSum = new Label("result");
        root.setBottom(lblSum);

        GridPane center = new GridPane();
        center.setHgap(5);
        center.setVgap(5);

        txtNum1 = new TextField("0");


        Scene scene = new Scene(center);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }



    // static void setRoot(String fxml) throws IOException {
    //     scene.setRoot(loadFXML(fxml));
    // }

    // private static Parent loadFXML(String fxml) throws IOException {
    //     FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
    //     return fxmlLoader.load();
    // }

    public static void main(String[] args) {
        launch();
    }

}