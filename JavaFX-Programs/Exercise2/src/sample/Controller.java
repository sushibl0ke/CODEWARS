package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class Controller {

    @FXML
    private Button btnSum;

    @FXML
    private Button btnClear;

    @FXML
    private TextField productPrice;

    @FXML
    private TextField productPriceDDS;

    @FXML
    private TextField productQuant;

    @FXML
    private TextField productALL;

    @FXML
    private TextField productName;

    @FXML
    private Button btnExit;

    @FXML
    void btnSumAction(ActionEvent event) {
        String pName = productName.getText();
        int quant = Integer.parseInt(productQuant.getText());
        double pPrice = Double.parseDouble((productPrice.getText()));
        double tempcalc = pPrice * (20.0/100.0); //20% DDS lol
        double pPriceDDS = tempcalc + pPrice;
        double pALLSUM = pPriceDDS*quant;

           DecimalFormat df = new DecimalFormat("#.##");
           String format = df.format(pALLSUM);

        productPriceDDS.setText(String.valueOf(pPriceDDS));
        productALL.setText(pName + " " + "x" + " " + quant + " =  " + format + " lv");

    }

    @FXML
    void btnClearAction(ActionEvent event) {

        productName.setText(null);
        productQuant.setText(null);
        productPrice.setText(null);
        productPriceDDS.setText(null);
        productALL.setText(null);

    }

    @FXML
    void btnExitAction(ActionEvent event) {
          System.exit(0);
    }


}
