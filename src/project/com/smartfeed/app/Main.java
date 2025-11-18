package com.smartfeed.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage; 
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/com/smartfeed/app/view/main-view.fxml"));

        TitledPane root = loader.load();
        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void main(String[] args) {
        launch(args);
    }

}