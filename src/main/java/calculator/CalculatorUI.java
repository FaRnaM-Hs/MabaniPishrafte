package calculator;

import javax.swing.*;

public class CalculatorUI {

    private static final int WIDTH = 45;
    private static final int HEIGHT = 45;

    private static JTextField jTextField;
    private static String adadAval;
    private static String operator = null;
    private static int op = 0;

    public static void main(String[] args) {

        JFrame mashinHesab = new JFrame("Mashin Hesab");
        mashinHesab.setSize(250, 300);
        mashinHesab.setLayout(null);
        mashinHesab.setVisible(true);
        mashinHesab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        jTextField = new JTextField();
        jTextField.setBounds(0,0, 145, HEIGHT);
        jTextField.setEditable(false);
        mashinHesab.add(jTextField);

        JButton[] numberButton = new  JButton[10];
        numberButton[0] = getButton("0", 50, 200);
        numberButton[1] = getButton("1", 0, 50);
        numberButton[2] = getButton("2", 50, 50);
        numberButton[3] = getButton("3", 100, 50);
        numberButton[4] = getButton("4", 0, 100);
        numberButton[5] = getButton("5", 50, 100);
        numberButton[6] = getButton("6", 100, 100);
        numberButton[7] = getButton("7", 0, 150);
        numberButton[8] = getButton("8", 50, 150);
        numberButton[9] = getButton("9", 100, 150);

        JButton[] operatorButton = new  JButton[7];

        // Point Button
        operatorButton[0] = new JButton(".");
        operatorButton[0].setBounds(0, 200, WIDTH, HEIGHT);
        operatorButton[0].addActionListener(e -> {
            if (jTextField.getText().contains("."));
            else if (jTextField.getText().isEmpty())
                jTextField.setText("0.");
            else
                jTextField.setText(jTextField.getText() + ".");
        });

        // Plus Button
        operatorButton[1] = new JButton("+");
        operatorButton[1].setBounds(150, 50, WIDTH, HEIGHT);
        operatorButton[1].addActionListener(e -> {
            operator = "+";
            adadAval = jTextField.getText();
            jTextField.setText("");
        });

        // Minus Button
        operatorButton[2] = new JButton("-");
        operatorButton[2].setBounds(150, 100, WIDTH, HEIGHT);
        operatorButton[2].addActionListener(e -> {
            adadAval = jTextField.getText();
            jTextField.setText("");
            operator = "-";
        });

        // Multiply Button
        operatorButton[3] = new JButton("x");
        operatorButton[3].setBounds(150, 150, WIDTH, HEIGHT);
        operatorButton[3].addActionListener(e -> {
            adadAval = jTextField.getText();
            jTextField.setText("");
            operator = "*";
        });

        // Division Button
        operatorButton[4] = new JButton("/");
        operatorButton[4].setBounds(150, 200, WIDTH, HEIGHT);
        operatorButton[4].addActionListener(e -> {
            adadAval = jTextField.getText();
            jTextField.setText("");
            operator = "/";
        });

        // Equal Button
        operatorButton[5] = new JButton("=");
        operatorButton[5].setBounds(100, 200, WIDTH, HEIGHT);
        operatorButton[5].addActionListener(e -> {
            equalOperation(operator);
        });

        // Clear/Cancel Button
        operatorButton[6] = new JButton("C");
        operatorButton[6].setBounds(150, 0, WIDTH, HEIGHT);
        operatorButton[6].addActionListener(event -> {
            jTextField.setText("");
            op = 0;
            adadAval = "0";
            operator = null;
        });

        for (JButton btn : numberButton) {
            mashinHesab.add(btn);
        }

        for (JButton btn : operatorButton) {
            mashinHesab.add(btn);
        }

    }

    private static JButton getButton(String label, int xPosition, int yPosition) {
        JButton button = new JButton(label);
        button.setBounds(xPosition, yPosition, WIDTH, HEIGHT);
        button.addActionListener(event -> {
            if (op == 1) {
                if (!jTextField.getText().equals("0.")) {
                    jTextField.setText("");
                    jTextField.setText(jTextField.getText() + button.getText());
                } else {
                    jTextField.setText(jTextField.getText() + button.getText());
                }
                op = 0;
            } else {
                jTextField.setText(jTextField.getText() + button.getText());
            }

        });
        return button;
    }

    public static void equalOperation(String operatorMark) {
        if (operator == null) {
            jTextField.setText(jTextField.getText());
        } else {
            final Calculator calculator = new Calculator();
            String result;
            switch (operator) {
                case "+":
                    result = calculator.add(adadAval, jTextField.getText());
                    jTextField.setText(result);
                    break;

                case "-":
                    result = calculator.submission(adadAval, jTextField.getText());
                    jTextField.setText(result);
                    break;

                case "*":
                    result = calculator.multiply(adadAval, jTextField.getText());
                    jTextField.setText(result);
                    break;

                case "/":
                    if (Double.parseDouble(jTextField.getText()) == 0) {
                        jTextField.setText("Erorr!");
                    } else {
                        result = calculator.division(adadAval, jTextField.getText());
                        jTextField.setText(result);
                    }
                    break;

                default:
                    jTextField.setText("0");
            }
            op = 1;
            adadAval = "0";
            operator = null;
        }
    }

}
