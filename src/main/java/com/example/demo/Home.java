package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;


public class Home {
    @FXML
    private Label test1;


    public void display(String name){
        test1.setText("Welcome "+name);
    }

    public void start() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
        Parent root = loader.load();
        Home home = loader.getController();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
