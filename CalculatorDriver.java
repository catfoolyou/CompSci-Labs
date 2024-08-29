import javax.swing.*;

public class CalculatorDriver {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(600, 300);
        frame.setLocationRelativeTo(null);;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.setContentPane(new Calculator());

        frame.setVisible(true);
    }
}

// I would have crammed the other class into this file as well but apparently that's "bad practice"
