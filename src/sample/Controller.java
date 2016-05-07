package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;




public class Controller {
    Model model = new Model();
    String tempValue = new String();

    @FXML
    public TextField display = new TextField();

    public void oneAction(ActionEvent actionEvent) {
        display.appendText("1");
    }

    public void twoAction(ActionEvent actionEvent) {
        display.appendText("2");
    }

    public void threeAction(ActionEvent actionEvent) {
        display.appendText("3");
    }

    public void fourAction(ActionEvent actionEvent) {
        display.appendText("4");
    }

    public void fiveAction(ActionEvent actionEvent) {
        display.appendText("5");
    }

    public void sixAction(ActionEvent actionEvent) {
        display.appendText("6");
    }

    public void sevenAction(ActionEvent actionEvent) {
        display.appendText("7");
    }

    public void eightAction(ActionEvent actionEvent) {
        display.appendText("8");
    }

    public void nineAction(ActionEvent actionEvent) {
        display.appendText("9");
    }

    public void zeroAction(ActionEvent actionEvent) {
        display.appendText("0");
    }

    public void dotAction(ActionEvent actionEvent) {
        display.appendText(".");
    }

    public void divideAction(ActionEvent actionEvent) {
        model.inputOperator("÷", Double.parseDouble(display.getText()));
        display.appendText("÷");
    }

    public void multiplyAction(ActionEvent actionEvent) {
        model.inputOperator("*", Double.parseDouble(display.getText()));
        display.appendText("*");
    }

    public void minAction(ActionEvent actionEvent) {
        model.inputOperator("-", Double.parseDouble(display.getText()));
        display.appendText("-");
    }

    public void plusAction(ActionEvent actionEvent) {
        model.inputOperator("+", Double.parseDouble(display.getText()));
        display.appendText("+");
    }

    public void squareAction(ActionEvent actionEvent) {
        model.operator = "√";
        display.appendText("√");
    }

    public void equalAction(ActionEvent actionEvent) {
        model.calculation();
        if(model.operator=="") return;
        if(model.operator=="√"){
            for (int i = 1; i < display.getLength(); i++) {
                tempValue += display.getText().charAt(i);
            }
            display.setText(String.valueOf(Math.sqrt(Double.parseDouble(tempValue))));
            tempValue = "";
            model.firstValue=0;
            model.secondValue=0;
            model.operator="";
            return;
        }
        for (int i = 0; i < display.getLength(); i++) {
            if (display.getText().charAt(i) == '+'
                    || display.getText().charAt(i) == '-'
                    || display.getText().charAt(i) == '*'
                    || display.getText().charAt(i) == '÷'){
                for (int j = i+1; j < display.getLength(); j++) {
                    tempValue += display.getText().charAt(j);
                }
                model.secondValue = Double.parseDouble(tempValue);

            }
        }

        display.setText(model.calculation());
        model.firstValue=0;
        model.secondValue=0;
        model.operator="";
        tempValue = "";
    }

    public void clearAction(ActionEvent actionEvent) {
        tempValue = "";
        model.firstValue=0;
        model.secondValue=0;
        model.operator="";
        display.setText("");

    }
}
