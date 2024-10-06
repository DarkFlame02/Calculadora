package dad.calculator;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable {

    // view

    @FXML
    private Button cButton;

    @FXML
    private Button ceButton;

    @FXML
    private Button divideButton;

    @FXML
    private Button dotButton;

    @FXML
    private Button eightButton;

    @FXML
    private Button equalsButton;

    @FXML
    private Button fiveButton;

    @FXML
    private Button fourButton;

    @FXML
    private Button minusButton;

    @FXML
    private Button multiplyButton;

    @FXML
    private Button nineButton;

    @FXML
    private Button oneButton;

    @FXML
    private Button plusButton;

    @FXML
    private Button sevenButton;

    @FXML
    private Button sixButton;

    @FXML
    private Button threeButton;

    @FXML
    private Button twoButton;

    @FXML
    private Button zeroButton;

    @FXML
    private BorderPane root;

    @FXML
    private TextField operationText;

    public CalculatorController() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculatorView.fxml"));
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public BorderPane getRoot() {
        return root;
    }
}
