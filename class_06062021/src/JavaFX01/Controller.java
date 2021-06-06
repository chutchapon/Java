package JavaFX01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.shape.Circle;

public class Controller {
    @FXML
    private ColorPicker colorPicker;

    @FXML
    private Circle circle;

    public void handleColorPicker(ActionEvent actionEvent) {
        circle.setFill(colorPicker.getValue());
    }
}