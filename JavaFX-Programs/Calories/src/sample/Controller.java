package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ComboBox combo;

    ObservableList<String> sport = FXCollections.observableArrayList("Футбол", "Волейбол", "Аеробика", "Тенис", "Боулинг");

    @FXML
    private TextField txtInputHours;

    @FXML
    private Button btnCalc;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnExit;

    @FXML
    private TextField txtFinal;

    @FXML
    private void initialize(){
        combo.setItems(sport);
    }

    @FXML
    private ComboBox<String> ComboBox;


    @FXML
    public void btnCalculateAction(ActionEvent actionEvent) {

        switch (combo.getValue().toString()) {
            case "Футбол":
                txtFinal.setText(Integer.parseInt(txtInputHours.getText()) * 420 + " калории изгоряни за " +Integer.parseInt(txtInputHours.getText())+" час/a" );
                break;
            case "Волейбол":
                txtFinal.setText(Integer.parseInt(txtInputHours.getText()) * 220 + " калории изгоряни за " +Integer.parseInt(txtInputHours.getText())+" час/a" );
                break;
            case "Аеробика":
                txtFinal.setText(Integer.parseInt(txtInputHours.getText()) * 500 + " калории изгоряни за " +Integer.parseInt(txtInputHours.getText())+" час/a" );
                break;
            case "Тенис":
                txtFinal.setText(Integer.parseInt(txtInputHours.getText()) * 540 + " калории изгоряни за " +Integer.parseInt(txtInputHours.getText())+" час/a" );
                break;
            case "Боулинг":
                txtFinal.setText(Integer.parseInt(txtInputHours.getText()) * 200 + " калории изгоряни за " +Integer.parseInt(txtInputHours.getText())+" час/a" );
                break;
        }
    }

    @FXML
    void btnClearAction(ActionEvent event) {

        txtInputHours.setText(null);
        txtFinal.setText(null);

    }

    @FXML
    void btnExitAction(ActionEvent event) {

        System.exit(0);


    }
}
