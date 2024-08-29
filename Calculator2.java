import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.*;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends JPanel{
    private JButton plus, minus, multiply, divide, percent, reset, test;
    private JPanel top, bottom;
    private JLabel inputLabel, input2Label, answerLabel;
    private JTextField inputField, input2Field, answerField;

    private double answer = 0;

    public Calculator(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.WHITE);
        setBorder(new EmptyBorder(5,5,5,5));

        /*There is most definetly a better way to write all of this but I am dumb and lazy 
        * and if you look really closely you will see that I cannot be bothered
        */

        top = new JPanel();
        top.setBounds(100, 50, 200, 100);
        top.setBorder(new EmptyBorder(5,5,5,5));
        top.setBackground(Color.WHITE);
        top.setLayout(null);

        bottom = new JPanel();
        bottom.setBounds(100, 100, 100, 100);
        bottom.setBorder(new EmptyBorder(5,5,5,5));
        bottom.setLayout(null);
        
        add(top);
        add(bottom);

        inputLabel = new JLabel("Input 1");
        inputLabel.setPreferredSize(new Dimension(50, 50));
        inputLabel.setBounds(50,40,50,50);
        top.add(inputLabel, BorderLayout.CENTER);

        inputField = new JTextField();
        inputField.setPreferredSize(new Dimension(50, 50));
        inputField.setBounds(105,55,80,25);
        top.add(inputField, BorderLayout.CENTER);

        input2Label = new JLabel("Input 2");
        input2Label.setPreferredSize(new Dimension(50, 50));
        input2Label.setBounds(200,40,50,50);
        top.add(input2Label, BorderLayout.CENTER);

        input2Field = new JTextField();
        input2Field.setPreferredSize(new Dimension(50, 50));
        input2Field.setBounds(255,55,80,25);
        top.add(input2Field, BorderLayout.CENTER);

        answerLabel = new JLabel("Answer");
        answerLabel.setPreferredSize(new Dimension(50, 50));
        answerLabel.setBounds(350,40,50,50);
        top.add(answerLabel, BorderLayout.CENTER);

        answerField = new JTextField();
        answerField.setPreferredSize(new Dimension(50, 50));
        answerField.setBounds(405,55,125,25);
        answerField.setEditable(false);
        top.add(answerField, BorderLayout.CENTER);

        plus = new JButton("+");
        plus.setPreferredSize(new Dimension(50, 50));
        plus.setBounds(50,50,50,50);
        bottom.add(plus, BorderLayout.CENTER);

        plus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                double val1 = Integer.parseInt(inputField.getText());
                double val2 = Integer.parseInt(input2Field.getText());

                answer = val1 + val2;
                answerField.setText(" " + answer);
            }
        });

        minus = new JButton("-");
        minus.setPreferredSize(new Dimension(50, 50));
        minus.setBounds(125,50,50,50);
        bottom.add(minus, BorderLayout.CENTER);

        minus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                double val1 = Integer.parseInt(inputField.getText());
                double val2 = Integer.parseInt(input2Field.getText());

                answer = val1 - val2;
                answerField.setText(" " + answer);
            }
        });

        multiply = new JButton("*");
        multiply.setPreferredSize(new Dimension(50, 50));
        multiply.setBounds(200,50,50,50);
        bottom.add(multiply, BorderLayout.CENTER);

        multiply.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                double val1 = Integer.parseInt(inputField.getText());
                double val2 = Integer.parseInt(input2Field.getText());

                answer = val1 * val2;
                answerField.setText(" " + answer);
            }
        });

        divide = new JButton("/");
        divide.setPreferredSize(new Dimension(50, 50));
        divide.setBounds(275,50,50,50);
        bottom.add(divide, BorderLayout.CENTER);

        divide.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                double val1 = Integer.parseInt(inputField.getText());
                double val2 = Integer.parseInt(input2Field.getText());

                answer = val1 / val2;
                answer = (double)Math.round(answer * 100000d) / 100000d;
                answerField.setText(" " + answer);
            }
        });

        percent = new JButton("%");
        percent.setPreferredSize(new Dimension(50, 50));
        percent.setBounds(350,50,50,50);
        bottom.add(percent, BorderLayout.CENTER);

        percent.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                double val1 = Integer.parseInt(inputField.getText());
                double val2 = Integer.parseInt(input2Field.getText());

                answer = val2 * 100 / val1;
                answer = (double)Math.round(answer * 100000d) / 100000d;
                answerField.setText(" " + answer);
            }
        });

        reset = new JButton("Reset");
        reset.setPreferredSize(new Dimension(100, 50));
        reset.setBounds(425,50,100,50);
        bottom.add(reset, BorderLayout.CENTER);

        reset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                inputField.setText(" ");
                input2Field.setText(" ");
                answerField.setText(" ");
            }
        });

    }
}