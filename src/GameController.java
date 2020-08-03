import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameController {
    @FXML
    private TextField textField0;
    @FXML
    private TextField textField1;
    @FXML
    private TextField textField2;
    @FXML
    private TextField textField3;
    @FXML
    private TextField textField4;
    @FXML
    private TextField textField5;
    @FXML
    private TextField textField6;
    @FXML
    private TextField textField7;
    @FXML
    private TextField textField8;
    @FXML
    private TextField textField9;
    @FXML
    private TextField textField10;
    @FXML
    private TextField textField11;
    @FXML
    private TextField textField12;
    @FXML
    private TextField textField13;
    @FXML
    private TextField textField14;
    @FXML
    private TextField textField15;
    @FXML
    private TextField textField16;
    @FXML
    private TextField textField17;
    @FXML
    private TextField textField18;
    @FXML
    private TextField textField19;
    @FXML
    private TextField textField20;
    @FXML
    private TextField textField21;
    @FXML
    private TextField textField22;
    @FXML
    private TextField textField23;
    @FXML
    private TextField textField24;
    @FXML
    private TextField textField25;
    @FXML
    private TextField textField26;
    @FXML
    private TextField textField27;
    @FXML
    private TextField textField28;
    @FXML
    private TextField textField29;
    @FXML
    private TextField textField30;
    @FXML
    private TextField textField31;
    @FXML
    private TextField textField32;
    @FXML
    private TextField textField33;
    @FXML
    private TextField textField34;
    @FXML
    private TextField textField35;
    @FXML
    private TextField textField36;
    @FXML
    private TextField textField37;
    @FXML
    private TextField textField38;
    @FXML
    private TextField textField39;
    @FXML
    private TextField textField40;
    @FXML
    private TextField textField41;
    @FXML
    private TextField textField42;
    @FXML
    private TextField textField43;
    @FXML
    private TextField textField44;
    @FXML
    private TextField textField45;
    @FXML
    private TextField textField46;
    @FXML
    private TextField textField47;
    @FXML
    private TextField textField48;
    @FXML
    private TextField textField49;
    @FXML
    private TextField textField50;
    @FXML
    private TextField textField51;
    @FXML
    private TextField textField52;
    @FXML
    private TextField textField53;
    @FXML
    private TextField textField54;
    @FXML
    private TextField textField55;
    @FXML
    private TextField textField56;
    @FXML
    private TextField textField57;
    @FXML
    private TextField textField58;
    @FXML
    private TextField textField59;
    @FXML
    private TextField textField60;
    @FXML
    private TextField textField61;
    @FXML
    private TextField textField62;
    @FXML
    private TextField textField63;
    @FXML
    private TextField textField64;
    @FXML
    private TextField textField65;
    @FXML
    private TextField textField66;
    @FXML
    private TextField textField67;
    @FXML
    private TextField textField68;
    @FXML
    private TextField textField69;
    @FXML
    private TextField textField70;
    @FXML
    private TextField textField71;
    @FXML
    private TextField textField72;
    @FXML
    private TextField textField73;
    @FXML
    private TextField textField74;
    @FXML
    private TextField textField75;
    @FXML
    private TextField textField76;
    @FXML
    private TextField textField77;
    @FXML
    private TextField textField78;
    @FXML
    private TextField textField79;
    @FXML
    private TextField textField80;
    @FXML
    private Text resultText;
    @FXML
    private Button checkResultButton;

    private Sudoku sudoku;
    private List<TextField> allTextField;
    @FXML
    private Button showAnswerButton;

    @FXML
    public void initialize() throws FileNotFoundException {
        allTextField = Arrays.asList(textField0, textField1, textField2, textField3, textField4, textField5,
                textField6, textField7, textField8, textField9, textField10, textField11, textField12, textField13, textField14, textField15,
                textField16, textField17, textField18, textField19, textField20, textField21, textField22, textField23, textField24, textField25,
                textField26, textField27, textField28, textField29, textField30, textField31, textField32, textField33, textField34, textField35,
                textField36, textField37, textField38, textField39, textField40, textField41, textField42, textField43, textField44, textField45,
                textField46, textField47, textField48, textField49, textField50, textField51, textField52, textField53, textField54, textField55,
                textField56, textField57, textField58, textField59, textField60, textField61, textField62, textField63, textField64, textField65,
                textField66, textField67, textField68, textField69, textField70, textField71, textField72, textField73, textField74, textField75,
                textField76, textField77, textField78, textField79, textField80);
        sudoku = new Sudoku();
        for (int i = 0; i < sudoku.getNumbers().length(); i++) {
            if (sudoku.getNumbers().charAt(i) != '0') {
                allTextField.get(i).setText(String.valueOf(sudoku.getNumbers().charAt(i)));
                allTextField.get(i).setDisable(true);
                allTextField.get(i).setStyle("-fx-font-weight: bold;");
            } else {
                allTextField.get(i).setText("");
                allTextField.get(i).setDisable(false);
            }
        }
        System.out.println("x");

    }
    public void checkResultButtonPressed(ActionEvent event) throws IOException {
        String answer = sudoku.printBoard();
        String playerAnswer = "";
        for (int i = 0; i < sudoku.getNumbers().length(); i++) {
            playerAnswer = playerAnswer + allTextField.get(i).getText();
        }
        if (playerAnswer.equals(answer)) {
            resultText.setText("Yeah");
        } else {
            resultText.setText("No");
        }
    }
    public void showAnswerButtonPressed(ActionEvent event) throws IOException {
        String answer = sudoku.printBoard();
        for (int i = 0; i < sudoku.getNumbers().length(); i++) {
            if (sudoku.getNumbers().charAt(i) == '0') {
                allTextField.get(i).setText(String.valueOf(answer.charAt(i)));
            }
        }
    }

    public void resetButtonPressed(ActionEvent event) throws IOException {
        for (int i = 0; i < sudoku.getNumbers().length(); i++) {
            if (sudoku.getNumbers().charAt(i) == '0') {
                allTextField.get(i).setText("");
            }
        }
    }

    public void newGamePressed(ActionEvent event) throws IOException {
        initialize();
    }
}
