package calc_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import mathlib.MathLibImpl;

public class Calculator {
    private double firstNum = 0.0;
    private double secondNum = 0.0;

    String Operation = "";
    MathLibImpl Result = new MathLibImpl();

    private JPanel Calculator;
    private JTextField TextField;
    private JButton btnEqual;
    private JButton btnNlog;
    private JButton btnAbsolut;
    private JButton btnPower;
    private JButton btnSeven;
    private JButton btnFour;
    private JButton btnOne;
    private JButton btnRoot;
    private JButton btnEight;
    private JButton btnFive;
    private JButton btnTwo;
    private JButton btnZero;
    private JButton btnDeleteAll;
    private JButton btnNine;
    private JButton btnSix;
    private JButton btnThree;
    private JButton btnDot;
    private JButton btnDelete;
    private JButton btnDivide;
    private JButton btnMultiply;
    private JButton btnMinus;
    private JButton btnPlus;

    public Calculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnOneText = TextField.getText() + btnOne.getText();
                TextField.setText(btnOneText);
            }
        });

        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnTwoText = TextField.getText() + btnTwo.getText();
                TextField.setText(btnTwoText);
            }
        });

        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnThreeText = TextField.getText() + btnThree.getText();
                TextField.setText(btnThreeText);
            }
        });

        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnFourText = TextField.getText() + btnFour.getText();
                TextField.setText(btnFourText);
            }
        });

        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnFiveText = TextField.getText() + btnFive.getText();
                TextField.setText(btnFiveText);
            }
        });

        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnSixText = TextField.getText() + btnSix.getText();
                TextField.setText(btnSixText);
            }
        });

        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnSevenText = TextField.getText() + btnSeven.getText();
                TextField.setText(btnSevenText);
            }
        });

        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnEightText = TextField.getText() + btnEight.getText();
                TextField.setText(btnEightText);
            }
        });

        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnNineText = TextField.getText() + btnNine.getText();
                TextField.setText(btnNineText);
            }
        });

        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnZeroText = TextField.getText() + btnZero.getText();
                TextField.setText(btnZeroText);
            }
        });

        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (TextField.getText().contains(".")){
                    btnDot.setEnabled(false);
                }
                if (TextField.getText().equals("")){
                    TextField.setText("0.");
                }
                else{
                    String btnDotText = TextField.getText() + btnDot.getText();
                    TextField.setText(btnDotText);
                }
                btnDot.setEnabled(true);
            }
        });

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstNum = firstNum + Double.parseDouble(TextField.getText());
                Operation = btnPlus.getText();
                TextField.setText("");
            }
        });

        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstNum = firstNum + Double.parseDouble(TextField.getText());
                Operation = btnMinus.getText();
                TextField.setText("");
            }
        });

        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstNum = firstNum + Double.parseDouble(TextField.getText());
                Operation = btnMultiply.getText();
                TextField.setText("");
            }
        });

        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstNum = firstNum + Double.parseDouble(TextField.getText());
                Operation = btnDivide.getText();
                TextField.setText("");
            }
        });

        btnNlog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //firstNum = firstNum + Double.parseDouble(TextField.getText());
                Operation = btnNlog.getText();
                TextField.setText("");
            }
        });

        btnRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstNum = firstNum + Double.parseDouble(TextField.getText());
                Operation = btnRoot.getText();
                TextField.setText("");
            }
        });

        btnPower.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstNum = firstNum + Double.parseDouble(TextField.getText());
                Operation = btnPower.getText();
                TextField.setText("");
            }
        });

        btnAbsolut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstNum = firstNum + Double.parseDouble(TextField.getText());
                Operation = btnAbsolut.getText();
                TextField.setText("");
            }
        });

        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (!Operation.equals("x!")) {
                    secondNum = secondNum + Double.parseDouble(TextField.getText());
                }

                switch (Operation){
                    case "+":
                        TextField.setText(Double.toString(Result.add(firstNum,secondNum)));
                        break;
                    case "-":
                        TextField.setText(Double.toString(Result.subtract(firstNum,secondNum)));
                        break;
                    case "*":
                        TextField.setText(Double.toString(Result.multiply(firstNum,secondNum)));
                        break;
                    case "/":
                        TextField.setText(Double.toString(Result.divide(firstNum,secondNum)));
                        break;
                    case "ln":
                        TextField.setText(Double.toString(Result.naturalLogarithm(secondNum)));
                        break;
                    case "x!":
                        BigInteger integer_value = Result.factorial((int) firstNum);
                        TextField.setText(integer_value.toString());
                        break;
                    case "x^y":
                        TextField.setText(Double.toString(Result.exponentiate(firstNum,(int)secondNum)));
                        break;
                    case "√x":
                        TextField.setText(Double.toString(Result.root(firstNum,secondNum)));
                        break;
                    default:
                        break;
                }

            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent actionEvent) {
                firstNum = 0;
                secondNum = 0;
                TextField.setText("");
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
