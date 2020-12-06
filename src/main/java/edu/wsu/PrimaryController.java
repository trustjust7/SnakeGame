package edu.wsu;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

public class PrimaryController {

    @FXML
    private Button startButton;

    @FXML
    private Button cancelButton;

    @FXML
    TextField playerName;

    @FXML
    ComboBox<Integer> snakeLength;

    @FXML
    ColorPicker snakeColor;

    @FXML
    ColorPicker snakeHeadColor;

    @FXML
    ComboBox<Integer> numberFruits;

    @FXML
    ColorPicker fruitColor;

    @FXML
    ComboBox<Integer> gridWidth;

    @FXML
    ComboBox<Integer> gridHeight;

    public void initialize() {
        System.out.println("Primary controller initialize");
        for(int i =1; i <= 10; i++) {
            snakeLength.getItems().add(i);
        }
        snakeLength.setValue(4);

        for(int i =1; i <= 2; i++) {
            numberFruits.getItems().add(i);
        }
        numberFruits.setValue(1);

        for(int i =1; i <= 30; i++) {
            gridWidth.getItems().add(i);
        }
        gridWidth.setValue(25);

        for(int i =1; i <= 30; i++) {
            gridHeight.getItems().add(i);
        }
        gridHeight.setValue(20);
    }
    @FXML
    public void startGame(ActionEvent actionEvent) {
        System.out.println(startButton.getText() + " is clicked");
        System.out.println(cancelButton.getText() + "is clicked");
        System.out.println("Player name " + playerName.getText());
        System.out.println("Snake length = " + snakeLength.getValue());
        System.out.println("Selected color = " + snakeColor.getValue());
        System.out.println("Selected head color = " + snakeHeadColor.getValue());
        System.out.println("Number of fruits = " + numberFruits.getValue());
        System.out.println("Fruit color = " + fruitColor.getValue());
        System.out.println("Grid Width = " + gridWidth.getValue());
        System.out.println("Grid Height = " + gridHeight.getValue());

        Node source = (Node) actionEvent.getSource();
        Window theStage = source.getScene().getWindow();

        SnakePane snakePane = new SnakePane();
        snakePane.start((Stage) theStage);
    }
}
