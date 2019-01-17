package commonMethods;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class LoadFxml {

    public LoadFxml(String buttonpres, String pathfxml, String title) {
        String path2load = "fxml" + "/"+ pathfxml;
        Stage newStage = new Stage();

        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource(path2load)));
            newStage.setTitle(title);
            newStage.setScene(new Scene(root));
            newStage.show();

        }
        catch (Exception e){
           e.printStackTrace();
        }
    }
}
