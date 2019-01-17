package commonMethods;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class ErrAlert {
    public ErrAlert(String text) {
        Alert alert = new Alert(Alert.AlertType.ERROR, text, ButtonType.YES);
        alert.setTitle("Ошибка!");
        alert.setHeaderText("Ошибка!!!");
        alert.setContentText(text);
        alert.showAndWait();
    }
}
