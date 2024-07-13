package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Login {
    @FXML
    private Label head;
    @FXML
    private Button login;
    @FXML
    private Button exit;
    @FXML
    private TextField user;
    @FXML
    private PasswordField pass;

  public void Login1(ActionEvent e) throws IOException {
      if(Check.check(user,pass)){
      Stage stage = new Stage();
      FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
      Parent root = loader.load();
      Home home = loader.getController();
      home.display(user.getText());
      Scene scene = new Scene(root);
      stage.setScene(scene);
      //stage.setMaximized(true);
      stage.show();

      Stage currentStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
      currentStage.close();
      }
  }

  public void Exit(ActionEvent e){
     System.exit(0);
  }
}
