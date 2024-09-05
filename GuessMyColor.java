
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class GuessMyColor extends JFrame
{
   private JPanel samplePanel = new JPanel();
   private JPanel targetPanel = new JPanel();
   private JLabel titleLabel = new JLabel();

   private JButton plusR, minusR, plusG, minusG, plusB, minusB;
   
   private JPanel targetColor = new JPanel();
   private JPanel userColor = new JPanel();

   private int targetRed = 0;
   private int targetGreen = 0;
   private int targetBlue = 0;
   private int red = 0;
   private int green = 0;
   private int blue = 0;
   
   public GuessMyColor()
   {
      initGUI();
      setTitle("Guess my color");
      setSize(640, 400);       
      setResizable(false);
      setLocationRelativeTo(null);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      generateTargetColor();
   }
   
   private void initGUI()
   {
      titleLabel = new JLabel("Guess my color");
      titleLabel.setFont(new Font("Serif", Font.PLAIN, 30));
      titleLabel.setBounds(210,-15,500,100);
      add(titleLabel, BorderLayout.CENTER);

      samplePanel = new JPanel();
      samplePanel.setBounds(0, 75, 640, 200);
      samplePanel.setBorder(new EmptyBorder(5,5,5,5));
      samplePanel.setBackground(Color.WHITE);
      samplePanel.setLayout(null);

      targetColor = new JPanel();
      targetColor.setBounds(350, 50, 100, 100);
      targetColor.setBorder(new EmptyBorder(5,5,5,5));
      targetColor.setLayout(null);

      userColor = new JPanel();
      userColor.setBounds(190, 50, 100, 100);
      userColor.setBorder(new EmptyBorder(5,5,5,5));
      userColor.setBackground(new Color(red, green, blue));
      userColor.setLayout(null);

      targetPanel = new JPanel();
      targetPanel.setBounds(100, 100, 100, 100);
      targetPanel.setBorder(new EmptyBorder(5,5,5,5));
      targetPanel.setLayout(null);

      plusR = new JButton("+");
      plusR.setBackground(Color.RED);
      plusR.setPreferredSize(new Dimension(50, 50));
      plusR.setBounds(50,295,50,50);
      targetPanel.add(plusR, BorderLayout.CENTER);

      minusR = new JButton("-");
      minusR.setBackground(Color.RED);
      minusR.setPreferredSize(new Dimension(50, 50));
      minusR.setBounds(120,295,50,50);
      targetPanel.add(minusR, BorderLayout.CENTER);

      plusG = new JButton("+");
      plusG.setBackground(Color.GREEN);
      plusG.setPreferredSize(new Dimension(50, 50));
      plusG.setBounds(260,295,50,50);
      targetPanel.add(plusG, BorderLayout.CENTER);

      minusG = new JButton("-");
      minusG.setBackground(Color.GREEN);
      minusG.setPreferredSize(new Dimension(50, 50));
      minusG.setBounds(330,295,50,50);
      targetPanel.add(minusG, BorderLayout.CENTER);

      plusB = new JButton("+");
      plusB.setBackground(Color.BLUE);
      plusB.setPreferredSize(new Dimension(50, 50));
      plusB.setBounds(475,295,50,50);
      targetPanel.add(plusB, BorderLayout.CENTER);

      minusB = new JButton("-");
      minusB.setBackground(Color.BLUE);
      minusB.setPreferredSize(new Dimension(50, 50));
      minusB.setBounds(545,295,50,50);
      targetPanel.add(minusB, BorderLayout.CENTER);

      plusR.addActionListener(new MoreRedListener());
      minusR.addActionListener(new LessRedListener());

      plusG.addActionListener(new MoreGreenListener());
      minusG.addActionListener(new LessGreenListener());

      plusB.addActionListener(new MoreBlueListener());
      minusB.addActionListener(new LessBlueListener());
        
      add(samplePanel);
      add(targetPanel);
      samplePanel.add(targetColor);
      samplePanel.add(userColor);
   }

   
   private void updateColorSample()
   {
      userColor.setBackground(new Color(targetRed, targetGreen, targetBlue));
      
      System.out.println(red + " " + green + " " + blue);
      System.out.println(targetRed + " " + targetGreen + " " + targetBlue);

      boolean gotRed = (targetRed - red) < 10 && (targetRed - red) > -10;
      boolean gotGreen = (targetGreen - green) < 10 && (targetGreen - green) > -10;
      boolean gotBlue = (targetBlue - blue) < 10 && (targetBlue - blue) > -10;

      if (gotBlue && gotGreen && gotRed) {
          JOptionPane.showMessageDialog(null, "You guessed the color within a margin of 10");
      }
      
   }
   
   private void generateTargetColor()
   {
      Random rand = new Random();
      red = rand.nextInt(255);
      green = rand.nextInt(255);
      blue = rand.nextInt(255);

      System.out.println(red + " " + green + " " + blue);
      System.out.println(targetRed + " " + targetGreen + " " + targetBlue);
      targetColor.setBackground(new Color(red, green, blue));
      
   }
   
         
   private class MoreRedListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         targetRed += 10;
         if(targetRed > 255) targetRed = 255;
         updateColorSample();
      }
   }
   
   private class LessRedListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         targetRed -= 10;
         if(targetRed < 0) targetRed = 0;
         updateColorSample();
      }
   }
   
   private class MoreGreenListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         targetGreen += 10;
         if(targetGreen > 255) targetGreen = 255;
         updateColorSample();
      }
   }
   
   private class LessGreenListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         targetGreen -= 10;
         if(targetGreen < 0) targetGreen = 0;
         updateColorSample();
      }
   }
   
   private class MoreBlueListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         targetBlue += 10;
         if(targetBlue > 255) targetBlue = 255;
         updateColorSample();
      }
   }
   
   private class LessBlueListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         targetBlue -= 10;
         if(targetBlue < 0) targetBlue = 0;
         updateColorSample();
      }
   }
   
   public static void main(String[] arg)
   {
      EventQueue.invokeLater(
         new Runnable() {
            public void run() 
            {
               new GuessMyColor();
            }
         });  
   }
}
