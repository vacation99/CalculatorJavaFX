package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button divisionButton;

    @FXML
    private Button multiplicationButton;

    @FXML
    private Button minusButton;

    @FXML
    private Button plusButton;

    @FXML
    private TextField secondNum;

    @FXML
    private TextField firstNum;

    @FXML
    private TextField result;

    @FXML
    private Button closeButton;

    @FXML
    void initialize() {
        plusButton.setOnAction(event -> {
            String first = firstNum.getText();
            String second = secondNum.getText();
            int outcome = Integer.parseInt(first) + Integer.parseInt(second);
            result.setText(String.valueOf(outcome));
        });

        minusButton.setOnAction(event -> {
            String first = firstNum.getText();
            String second = secondNum.getText();
            int outcome = Integer.parseInt(first) - Integer.parseInt(second);
            result.setText(String.valueOf(outcome));
        });

        multiplicationButton.setOnAction(event -> {
            String first = firstNum.getText();
            String second = secondNum.getText();
            int outcome = Integer.parseInt(first) * Integer.parseInt(second);
            result.setText(String.valueOf(outcome));
        });

        divisionButton.setOnAction(event -> {
            String first = firstNum.getText();
            String second = secondNum.getText();
            float outcome = Float.parseFloat(first) / Float.parseFloat(second);
            result.setText(String.valueOf(outcome));
        });

        closeButton.setOnAction(event -> {
            Stage stage = (Stage) closeButton.getScene().getWindow();
            stage.close();
        });
    }
}
