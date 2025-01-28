package com.example.demo_chatapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Luncher extends Application {
    public static void main(String[] args) {launch(args);}


    @Override
    public void start(Stage stage) throws Exception {
            stage.setScene(new Scene(javafx.fxml.FXMLLoader.load(this.getClass().getResource("/view/server_form.fxml"))));

            Stage stage1 = new Stage();
            stage1.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/client_form.fxml"))));

            Stage stage2 = new Stage();
            stage2.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/client_form1.fxml"))));

            stage.setTitle("Server Form");
            stage1.setTitle("Client Form");
            stage2.setTitle("Client Form1");

            stage.centerOnScreen();
            stage1.centerOnScreen();
            stage2.centerOnScreen();

            stage.show();
            stage1.show();
            stage2.show();

    }
}





