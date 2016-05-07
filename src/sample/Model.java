package sample;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Created by Fedorov Danil on 07.05.2016.
 */
public class Model {

    @FXML
    double firstValue, secondValue;
    String operator;

    public void inputOperator(String operator, double firstValue) {
        this.operator = operator;
        this.firstValue = firstValue;
    }

    public String calculation() {



        switch (operator) {
            case "-":
                return String.valueOf(firstValue - secondValue);
            case "+":
                return String.valueOf(firstValue + secondValue);
            case "*":
                return String.valueOf(firstValue * secondValue);
            case "÷":
                return String.valueOf(firstValue / secondValue);
            default:
                return "ERROR";

        }
    }





}
