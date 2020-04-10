package calc_gui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import mathlib.MathLibImpl;

import javax.print.DocFlavor;
import java.math.BigInteger;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private double firstNum = 0.0;
    private double secondNum = 0.0;
    private boolean equal_click = false;

    String Operation = "";
    MathLibImpl Result = new MathLibImpl();

    @FXML
    public JFXButton btnOne;
    public JFXButton btnTwo;
    public JFXButton btnThree;
    public JFXButton btnFour;
    public JFXButton btnFive;
    public JFXButton btnSix;
    public JFXButton btnSeven;
    public JFXButton btnEight;
    public JFXButton btnNine;
    public JFXButton btnZero;
    public JFXButton btnDelete;
    public JFXButton btnDeleteAll;
    public JFXButton btnPoint;
    public JFXButton btnPower;
    public JFXButton btnPlus;
    public JFXButton btnMinus;
    public JFXButton btnEqual;
    public JFXButton btnFactor;
    public JFXButton btnMultiply;
    public JFXButton btnDivide;
    public JFXButton btnRoot;
    public JFXButton btnNlog;
    public JFXButton btnTZero;
    public JFXTextField input;
    public Label prom;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
        input.setEditable(false);
    }

    public void Zero_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnZeroText = input.getText() + btnZero.getText();
        input.setText(btnZeroText);
    }

    public void TZero_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnTZeroText = input.getText() + btnTZero.getText();
        input.setText(btnTZeroText);
    }

    public void One_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnOneText = input.getText() + btnOne.getText();
        input.setText(btnOneText);
    }

    public void Two_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnTwoText = input.getText() + btnTwo.getText();
        input.setText(btnTwoText);
    }

    public void Three_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnThreeText = input.getText() + btnThree.getText();
        input.setText(btnThreeText);
    }

    public void Four_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnFourText = input.getText() + btnFour.getText();
        input.setText(btnFourText);
    }

    public void Five_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnFiveText = input.getText() + btnFive.getText();
        input.setText(btnFiveText);
    }

    public void Six_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnSixText = input.getText() + btnSix.getText();
        input.setText(btnSixText);
    }

    public void Seven_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnSevenText = input.getText() + btnSeven.getText();
        input.setText(btnSevenText);
    }

    public void Eight_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnEightText = input.getText() + btnEight.getText();
        input.setText(btnEightText);
    }

    public void Nine_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnNineText = input.getText() + btnNine.getText();
        input.setText(btnNineText);
    }

    public void Point_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        if (input.getText().contains(".")){
            input.setText(input.getText());
        }
        if (input.getText().equals("")){
            input.setText("0.");
        }
        if (!input.getText().equals("") && !input.getText().contains(".")) {
            String btnPointText = input.getText() + btnPoint.getText();
            input.setText(btnPointText);
        }
    }

    public void Plus_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnPlusText = "";

        if (input.getText().equals("")){
            return;
        }

        if (input.getText().substring(input.getText().length()-1).equals(".")){
            btnPlusText = input.getText().substring(0,input.getText().length()-1);
        }
        else {
            btnPlusText = input.getText();
        }


        firstNum = firstNum + Double.parseDouble(input.getText());
        Operation = btnPlus.getText();
        input.setText("");
        prom.setText(btnPlusText + "+");
    }

    public void Minus_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnMinusText = "";

        if (input.getText().equals("")){
            return;
        }

        if (input.getText().substring(input.getText().length()-1).equals(".")){
            btnMinusText = input.getText().substring(0,input.getText().length()-1);
        }
        else {
            btnMinusText = input.getText();
        }
        firstNum = firstNum + Double.parseDouble(input.getText());
        Operation = btnMinus.getText();
        input.setText("");
        prom.setText(btnMinusText + "-");
    }

    public void Multiply_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnMultiplyText = "";

        if (input.getText().equals("")){
            return;
        }

        if (input.getText().substring(input.getText().length()-1).equals(".")){
            btnMultiplyText = input.getText().substring(0,input.getText().length()-1);
        }
        else {
            btnMultiplyText = input.getText();
        }
        firstNum = firstNum + Double.parseDouble(input.getText());
        Operation = "*";
        input.setText("");
        prom.setText(btnMultiplyText + "*");
    }

    public void Divide_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnDivideText = "";

        if (input.getText().equals("")){
            return;
        }

        if (input.getText().substring(input.getText().length()-1).equals(".")){
            btnDivideText = input.getText().substring(0,input.getText().length()-1);
        }
        else {
            btnDivideText = input.getText();
        }
        firstNum = firstNum + Double.parseDouble(input.getText());
        Operation = btnDivide.getText();
        input.setText("");
        prom.setText(btnDivideText + "/");
    }

    public void Nlog_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnNlogText = input.getText();

        if (input.getText().equals("")){
            return;
        }

        firstNum = firstNum + Double.parseDouble(input.getText());
        Operation = btnNlog.getText();
        input.setText("");
        prom.setText("ln(" + btnNlogText + ")");
    }

    public void Root_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnRootText = input.getText();

        if (input.getText().equals("")){
            return;
        }
        firstNum = firstNum + Double.parseDouble(input.getText());
        Operation = btnRoot.getText();
        input.setText("");
        prom.setText("\u221A" + btnRootText);
    }

    public void Power_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnPowerText = input.getText();

        if (input.getText().equals("")){
            return;
        }

        firstNum = firstNum + Double.parseDouble(input.getText());
        Operation = btnPower.getText();
        input.setText("");
        prom.setText(btnPowerText + "^");
    }

    public void Factor_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnFactorText = input.getText();

        if (input.getText().equals("")){
            return;
        }

        firstNum = firstNum + Double.parseDouble(input.getText());
        Operation = btnFactor.getText();
        input.setText("");
        prom.setText(btnFactorText + "!");
    }

    public void Delete_click(){
        firstNum = 0.0;
        secondNum = 0.0;
        input.setText("");
    }

    public void DeleteAll_click(){
        firstNum = 0.0;
        secondNum = 0.0;
        input.setText("");
        prom.setText("");
    }

    public void Equal_click(){
        equal_click = true;
        String Prom_value = "";
        switch (Operation){
            case "+":
                if (!input.getText().equals("")){
                    secondNum = secondNum + Double.parseDouble(input.getText());
                }
                input.setText(Double.toString(Result.add(firstNum,secondNum)));
                Prom_value = prom.getText();
                prom.setText(Prom_value + secondNum);
                break;
            case "-":
                if (!input.getText().equals("")){
                    secondNum = secondNum + Double.parseDouble(input.getText());
                }
                input.setText(Double.toString(Result.subtract(firstNum,secondNum)));
                Prom_value = prom.getText();
                prom.setText(Prom_value + secondNum);
                break;
            case "*":
                if (!input.getText().equals("")){
                    secondNum = secondNum + Double.parseDouble(input.getText());
                }
                input.setText(Double.toString(Result.multiply(firstNum,secondNum)));
                Prom_value = prom.getText();
                prom.setText(Prom_value + secondNum);
                break;
            case "/":
                if (!input.getText().equals("")){
                    secondNum = secondNum + Double.parseDouble(input.getText());
                }
                input.setText(Double.toString(Result.divide(firstNum,secondNum)));
                Prom_value = prom.getText();
                prom.setText(Prom_value + secondNum);
                break;
            case "ln":
                input.setText(Double.toString(Result.naturalLogarithm(firstNum)));
                break;
            case "x!":
                BigInteger integer_value = Result.factorial((int) firstNum);
                input.setText(integer_value.toString());
                break;
            case "x^y":
                if (!input.getText().equals("")){
                    secondNum = secondNum + Double.parseDouble(input.getText());
                }
                input.setText(Double.toString(Result.exponentiate(firstNum,(int)secondNum)));
                Prom_value = prom.getText();
                prom.setText(Prom_value + secondNum);
                break;
            case "\u221Ax":
                if (!input.getText().equals("")){
                    secondNum = secondNum + Double.parseDouble(input.getText());
                }
                input.setText(Double.toString(Result.root(firstNum,secondNum)));
                Prom_value = prom.getText();
                prom.setText(secondNum + Prom_value);
                break;
            default:
                break;
        }
    }
}
