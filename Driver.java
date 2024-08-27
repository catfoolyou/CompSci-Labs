import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Driver{
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first GUI");
        frame.setSize(500, 500);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setContentPane(new Panel());

        frame.setVisible(true);
    }

}
