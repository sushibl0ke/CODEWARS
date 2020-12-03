package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class BMIController {

    @FXML
    private Label label;

    @FXML
    private RadioButton km;

    @FXML
    private TextField weight;

    @FXML
    private TextField height;

    @FXML
    private Button btnExit;

    @FXML
    private Button btnClear;

    @FXML
    private void handleButtonAction(ActionEvent event) {

            Double w = new Double(weight.getText());
            Double h = new Double(height.getText());
            Double bmi;

            if (km.isSelected()) {
                bmi = w / (h * h);
                label.setText(String.format("%.2f", bmi));
            }
    }

    @FXML
    void handleButtonClear(ActionEvent event) {

        weight.setText(null);
        height.setText(null);

    }

    @FXML
    void handleButtonExit(ActionEvent event) {

        System.exit(0);

    }
}
