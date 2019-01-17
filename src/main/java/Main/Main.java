package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application {

    private static Parent root1;


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root1 = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/main.fxml"));
        primaryStage.setTitle("Расчет цикла светофорного регулирования");
        Scene scene = new Scene(root1,600 , 500);
        scene.getStylesheets().add("css/main.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void setRoot(Parent root) {
        root1 = root;
    }

    public static void main(String[] args) {
        launch(args);
    }


}
