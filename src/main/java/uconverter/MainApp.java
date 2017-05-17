package uconverter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by JavaCourses on 10.05.2017..
 */
public class MainApp extends Application  {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/main_window.fxml"));

        Scene scene = new Scene(root, 500, 200); // Scene(Parent, Size1 length, Size2 height)
        // 3d Scene

        primaryStage.setTitle("Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
