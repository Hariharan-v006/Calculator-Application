import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private StringBuilder currentInput;
    private double firstNumber = 0;
    private String operator = "";
    private boolean isOperatorPressed = false;

    public Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);

        currentInput = new StringBuilder();

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.matches("[0-9]")) {
            if (isOperatorPressed) {
                currentInput.setLength(0);
                isOperatorPressed = false;
            }
            currentInput.append(command);
            display.setText(currentInput.toString());
        } 
        else if (command.matches("[+\\-*/]")) {
            try {
                firstNumber = Double.parseDouble(display.getText());
                operator = command;
                isOperatorPressed = true;
            } catch (Exception ex) {
                display.setText("Error");
            }
        } 
        else if (command.equals("=")) {
            try {
                double secondNumber = Double.parseDouble(display.getText());
                double result = 0;

                switch (operator) {
                    case "+": result = firstNumber + secondNumber; break;
                    case "-": result = firstNumber - secondNumber; break;
                    case "*": result = firstNumber * secondNumber; break;
                    case "/": result = secondNumber != 0 ? firstNumber / secondNumber : Double.NaN; break;
                }

                display.setText(String.valueOf(result));
                currentInput.setLength(0);
                currentInput.append(result);
                operator = "";
            } catch (Exception ex) {
                display.setText("Error");
            }
        } 
        else if (command.equals("C")) {
            currentInput.setLength(0);
            display.setText("");
            firstNumber = 0;
            operator = "";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Calculator::new);
    }
}
