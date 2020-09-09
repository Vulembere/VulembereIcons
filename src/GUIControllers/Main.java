package GUIControllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author SMART PC
 */
public class Main extends Application {

    public static ObservableList<String> stylesheets;
    public static Stage stage;

    public void start(Stage stage) throws Exception {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("/GUI/MAIN.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("VULEMBERE FX-ICONS");
            stage.setResizable(Boolean.FALSE);
            stage.initStyle(StageStyle.DECORATED);
            stage.setResizable(Boolean.FALSE);
            stage.getIcons().add(new javafx.scene.image.Image("/GUI/App.png"));
            Main.stage = stage;
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
