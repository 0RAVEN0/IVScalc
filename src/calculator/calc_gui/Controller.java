package calc_gui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import mathlib.MathLibImpl;

import java.math.BigInteger;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Controller class called Controller for calculator.fxml
 */
public class Controller implements Initializable {
    private double firstNum = 0.0;
    private double secondNum = 0.0;

    private final List<Double> numbers = new ArrayList<>();
    private final List<String> operations = new ArrayList<>();
    private boolean equal_click = false;

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
    public JFXButton btnChwindow;
    public JFXTextField input;
    public Label prom;

    @FXML
    private AnchorPane root_pane;

    @Override
    /**
     * Function that set TextField not editable(you can not write into it)
     */
    public void initialize(URL arg0, ResourceBundle arg1){
        input.setEditable(false);
    }

    @FXML
    /**
     * Function for redirection to another window
     */
    public void Button_click(javafx.event.ActionEvent actionEvent) throws Exception{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("helper.fxml"));
        root_pane.getChildren().setAll(pane);
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
        String btnPlusText;

        if (input.getText().equals("")){
            if (numbers.size() != operations.size()) {
                operations.add(btnPlus.getText());
                input.setText("");
                prom.setText(prom.getText() + "+");
            }
            if (operations.get(operations.size()-1).equals("x!")){
                operations.add(btnPlus.getText());
                input.setText("");
                prom.setText(prom.getText() + "+");
            }
            return;
        }

        if (input.getText().substring(input.getText().length()-1).equals(".")){
            btnPlusText = input.getText().substring(0,input.getText().length()-1);
        }
        else {
            btnPlusText = input.getText();
        }

        numbers.add(Double.parseDouble(input.getText()));
        operations.add(btnPlus.getText());
        input.setText("");
        prom.setText(prom.getText() + btnPlusText + "+");
    }

    public void Minus_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnMinusText;

        if (input.getText().equals("")){
            if (numbers.size() != operations.size()) {
                operations.add(btnMinus.getText());
                input.setText("");
                prom.setText(prom.getText() + "-");
            }

            if(numbers.isEmpty() && operations.isEmpty()){
                input.setText("-");
            }

            return;
        }

        if (input.getText().substring(input.getText().length()-1).equals(".")){
            btnMinusText = input.getText().substring(0,input.getText().length()-1);
        }
        else {
            btnMinusText = input.getText();
        }
        numbers.add(Double.parseDouble(input.getText()));
        operations.add(btnMinus.getText());
        input.setText("");
        prom.setText(prom.getText() + btnMinusText + "-");
    }

    public void Multiply_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }

        String btnMultiplyText;

        if (input.getText().equals("")){
            if (numbers.size() != operations.size()) {
                operations.add("*");
                input.setText("");
                prom.setText(prom.getText() + "*");
            }
            return;
        }

        if (input.getText().substring(input.getText().length()-1).equals(".")){
            btnMultiplyText = input.getText().substring(0,input.getText().length()-1);
        }
        else {
            btnMultiplyText = input.getText();
        }
        numbers.add(Double.parseDouble(input.getText()));
        operations.add("*");
        input.setText("");
        prom.setText(prom.getText() + btnMultiplyText + "*");
    }

    public void Divide_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnDivideText;

        if (input.getText().equals("")){
            if (numbers.size() != operations.size()) {
                operations.add(btnDivide.getText());
                input.setText("");
                prom.setText(prom.getText() + "/");
            }
            return;
        }

        if (input.getText().substring(input.getText().length()-1).equals(".")){
            btnDivideText = input.getText().substring(0,input.getText().length()-1);
        }
        else {
            btnDivideText = input.getText();
        }
        numbers.add(Double.parseDouble(input.getText()));
        operations.add(btnDivide.getText());
        input.setText("");
        prom.setText(prom.getText() + btnDivideText + "/");
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
        numbers.add(Double.parseDouble(input.getText()));
        operations.add(btnNlog.getText());
        input.setText("");
        prom.setText(prom.getText() + "ln(" + btnNlogText + ")");
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
        numbers.add(Double.parseDouble(input.getText()));
        operations.add("\u221Ax");
        input.setText("");
        prom.setText(prom.getText() + "sqrt(" + btnRootText + ")");
    }

    public void Power_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
        }
        String btnPowerText = input.getText();

        if (input.getText().equals("")){
            if (numbers.size() != operations.size()) {
                operations.add(btnPower.getText());
                input.setText("");
                prom.setText(prom.getText() + "^");
            }
            return;
        }
        numbers.add(Double.parseDouble(input.getText()));
        operations.add(btnPower.getText());
        input.setText("");
        prom.setText(prom.getText() + btnPowerText + "^");
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
        numbers.add(Double.parseDouble(input.getText()));
        operations.add(btnFactor.getText());
        input.setText("");
        prom.setText(prom.getText() + btnFactorText + "!");
    }

    public void Delete_click(){
        if (input.getText().isEmpty()){
            if (operations.size() == 0){
                return;
            }
            operations.remove(operations.size()-1);
            prom.setText(prom.getText().substring(0,prom.getText().length()-1));
        }
        firstNum = 0.0;
        secondNum = 0.0;
        input.setText("");
    }

    public void DeleteAll_click(){
        numbers.clear();
        operations.clear();
        firstNum = 0.0;
        secondNum = 0.0;
        input.setText("");
        prom.setText("");
    }

    public void Equal_click(){
        if (equal_click){
            DeleteAll_click();
            equal_click = false;
            return;
        }

        if (numbers.isEmpty() || operations.isEmpty()){
            return;
        }

        equal_click = true;
        String Prom_value;
        Prom_value = prom.getText();
        prom.setText(Prom_value + input.getText());

        if (!input.getText().equals("")) {
            numbers.add(Double.parseDouble(input.getText()));
        }

        firstNum = numbers.get(0);
        for (int i = 0; i < operations.size(); i++) {
            switch (operations.get(i)) {
                case "+":
                    if (!input.getText().equals("")) {
                        secondNum = numbers.get(i + 1);
                    }
                    else{
                        secondNum = 0.0;
                    }
                    firstNum = Result.add(firstNum, secondNum);
                    break;
                case "-":
                    if (!input.getText().equals("")) {
                        secondNum = numbers.get(i + 1);
                    }
                    else{
                        secondNum = 0.0;
                    }
                    firstNum = Result.subtract(firstNum, secondNum);
                    break;
                case "*":
                    if (!input.getText().equals("")) {
                        secondNum = numbers.get(i + 1);
                    }
                    else{
                        secondNum = 0.0;
                    }
                    firstNum = Result.multiply(firstNum, secondNum);
                    break;
                case "/":
                    if (!input.getText().equals("")) {
                        secondNum = numbers.get(i + 1);
                    }
                    else{
                        secondNum = 0.0;
                    }
                    firstNum = Result.divide(firstNum, secondNum);
                    break;
                case "ln":
                    if (operations.size() > 1) {
                        secondNum = numbers.get(i + 1);
                        firstNum = Result.naturalLogarithm(secondNum);
                    }
                    else {
                        firstNum = Result.naturalLogarithm(firstNum);
                    }
                    break;
                case "x!":
                    BigInteger integer_value;
                    if (operations.size() > 1) {
                        secondNum = numbers.get(i);
                        integer_value = Result.factorial((int) secondNum);
                        firstNum = firstNum + integer_value.doubleValue();
                    }
                    else {
                        integer_value = Result.factorial((int) firstNum);
                        firstNum = integer_value.doubleValue();
                    }
                    break;
                case "xⁿ":
                    if (!input.getText().equals("")) {
                        secondNum = numbers.get(i + 1);
                    }
                    firstNum = Result.exponentiate(firstNum, (int) secondNum);
                    break;
                case "\u221Ax":
                    if (!input.getText().equals("")) {
                        secondNum = numbers.get(i + 1);
                    }
                    firstNum = Result.root(firstNum, secondNum);
                    break;
                default:
                    break;
            }
        }

        input.setText(Double.toString(firstNum));
    }


}
