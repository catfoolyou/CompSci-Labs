import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class Panel extends JPanel{
    private JLabel centerLabel, rightLabel, upperLabel, lowerLabel, leftLabel;

    public Panel(){
        setLayout(new BorderLayout());

        Scanner input = new Scanner(System.in); 

        centerLabel = new JLabel("Center");
        rightLabel = new JLabel("West");
        leftLabel = new JLabel("East");
        upperLabel = new JLabel("North");
        lowerLabel = new JLabel("South");

        centerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        centerLabel.setVerticalAlignment(SwingConstants.CENTER);
        centerLabel.setForeground(Color.GREEN);
        centerLabel.setFont(new Font("Helvetica", Font.ITALIC, 26));

        rightLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        rightLabel.setForeground(Color.MAGENTA);

        leftLabel.setHorizontalAlignment(SwingConstants.LEFT);

        System.out.println("Enter the custom color as an integer from 0 to 16777215" + "\n" + "You can use http://www.shodor.org/~efarrow/trunk/html/rgbint.html");
        int color = input.nextInt();
        
        leftLabel.setForeground(new Color(color));

        upperLabel.setHorizontalAlignment(SwingConstants.CENTER);
        upperLabel.setVerticalAlignment(SwingConstants.TOP);
        upperLabel.setForeground(Color.RED);

        lowerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lowerLabel.setVerticalAlignment(SwingConstants.BOTTOM);

        add(centerLabel, BorderLayout.CENTER);
        add(rightLabel, BorderLayout.WEST);
        add(leftLabel, BorderLayout.EAST);
        add(upperLabel, BorderLayout.NORTH);
        add(lowerLabel, BorderLayout.SOUTH);
    }
}