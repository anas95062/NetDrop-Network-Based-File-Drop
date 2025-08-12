package com.example.netdrop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Image img=new Image("com/example/netdrop/images/logo.png");
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Netdrop");
        stage.setWidth(730);
        stage.setHeight(530);
        stage.getIcons().add(img);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}