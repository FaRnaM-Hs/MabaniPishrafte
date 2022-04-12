import javax.swing.*;

public class CalculatorUI {

    private static JTextField result;

    public static void main(String[] args) {
        JFrame mashinHesab = new JFrame("Mashin Hesab");

        result = new JTextField();
        result.setBounds(0,0, 150, 50);
        result.setEditable(false);

        JButton cancel = new JButton("C");
        cancel.setBounds(150, 0, 50, 50);
        cancel.addActionListener(event -> result.setText(""));

        JButton one = getButton("1", 0, 50);
        JButton two = getButton("2", 50, 50);
        JButton three = getButton("3", 100, 50);

        JButton plus = new JButton("+");
        plus.setBounds(150, 50, 50, 50);

        JButton four = getButton("4", 0, 100);
        JButton five = getButton("5", 50, 100);
        JButton six = getButton("6", 100, 100);

        JButton minus = new JButton("-");
        minus.setBounds(150, 100, 50, 50);

        JButton seven = getButton("7", 0, 150);
        JButton eight = getButton("8", 50, 150);
        JButton nine = getButton("9", 100, 150);

        JButton multiply = new JButton("x");
        multiply.setBounds(150, 150, 50, 50);

        JButton point = getButton(".", 0, 200);

        JButton zero = getButton("0", 50, 200);

        JButton equal = new JButton("=");
        equal.setBounds(100, 200, 50, 50);

        JButton division = new JButton("/");
        division.setBounds(150, 200, 50, 50);

        mashinHesab.add(cancel);
        mashinHesab.add(result);
        mashinHesab.add(one);
        mashinHesab.add(two);
        mashinHesab.add(three);
        mashinHesab.add(plus);
        mashinHesab.add(four);
        mashinHesab.add(five);
        mashinHesab.add(six);
        mashinHesab.add(minus);
        mashinHesab.add(seven);
        mashinHesab.add(eight);
        mashinHesab.add(nine);
        mashinHesab.add(multiply);
        mashinHesab.add(point);
        mashinHesab.add(zero);
        mashinHesab.add(equal);
        mashinHesab.add(division);

        mashinHesab.setSize(250, 300);
        mashinHesab.setLayout(null);
        mashinHesab.setVisible(true);
    }

    private static JButton getButton(String label, int xPosition, int yPosition) {
        JButton button = new JButton(label);
        button.setBounds(xPosition, yPosition, 50, 50);
        button.addActionListener(event -> result.setText(result.getText() + button.getText()));
        return button;
    }
}
