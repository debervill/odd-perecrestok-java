package zadanie;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class zadanie extends Application{

    private static Parent root1;

    public void start (Stage zadanie) throws Exception{
        Parent root = (Parent)FXMLLoader.load(getClass().getResource("fxml/zadanie.fxml"));
        zadanie.setTitle("Генератора задния");
        Scene zdscene = new Scene(root1, 600,500);
        zdscene.getStylesheets().add("css/zadanie.css");
        zadanie.setScene(zdscene);
        zadanie.show();

    }

    public static void setRoot(Parent root) {
        root1 = root;

    }
}