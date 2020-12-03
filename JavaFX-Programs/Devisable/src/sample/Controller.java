package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtDelimo;
    @FXML
    private TextField txtDelitel;
    @FXML
    private Button btnCheck;
    @FXML
    private Label labelDelimo;
    @FXML
    private Button btnClear;
    @FXML
    private Button btnExit;

    @FXML
    void btnCheckOnAction(ActionEvent event) {
        int delimo = Integer.parseInt(txtDelimo.getText());
        int delitel = Integer.parseInt(txtDelitel.getText());
        if (delitel == 0) {
            labelDelimo.setText("Грешка, делителя не може да бъде 0");
            txtDelitel.setText(null);
        } else {
            do {
                delimo = delimo - delitel;
                if (delimo == 0) {
                    labelDelimo.setText("Числото " + delitel + " дели числото " + txtDelimo.getText() + " без остатък.");
                } else {
                    labelDelimo.setText("Числото " + delitel + " дели числото " + txtDelimo.getText() + " с остатък.");
                }
            } while (delimo >= delitel);
        }
    }
    @FXML
    void btnClearAction(ActionEvent event) {
        txtDelimo.setText(null);
        txtDelitel.setText(null);
    }
    @FXML
    void btnExitAction(ActionEvent event) {
        System.exit(0);
    }
}

