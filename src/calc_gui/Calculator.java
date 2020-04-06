package calc_gui;

import javax.swing.*;

public class Calculator {
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
