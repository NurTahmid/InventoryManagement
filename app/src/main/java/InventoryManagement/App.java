/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package InventoryManagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class App extends Application {

    public static void main(String[] args) {
       launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("/main.fxml"));
       Scene scene = new Scene(root);
       primaryStage.setTitle("Inventory Management");
       primaryStage.setScene(scene);
       primaryStage.show();
        
    }
}
