import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Framed extends JFrame
{
   private static final int GRIDSIZE = 3;
   private LightButton[][] lightButton = new LightButton[GRIDSIZE][GRIDSIZE];

   public Framed() 
   {
      this.initGUI();
      this.setTitle("Framed");
      //this.setResizable(false);
      this.pack();
      this.setLocationRelativeTo(null);
      this.setVisible(true);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.newGame();
   }
   
   public void initGUI()
   {  
      TitleLabel titleLabel = new TitleLabel("Framed");
      this.add(titleLabel, BorderLayout.NORTH);
      
      JPanel centerPanel = new JPanel();
      centerPanel.setLayout(new GridLayout(GRIDSIZE, GRIDSIZE));

      for(int i = 0; i < GRIDSIZE; i++){

         for(int j = 0; j < GRIDSIZE; j++){

            lightButton[i][j] = new LightButton(i, j);
            lightButton[i][j].addActionListener(new ToggleListener());
            centerPanel.add(lightButton[i][j]);

         }
      }

      this.add(centerPanel, BorderLayout.CENTER);
      
   }
   
   public class ToggleListener implements ActionListener
   {
      private int row;
      private int col;

      public void actionPerformed(ActionEvent e)
      {
         LightButton button = (LightButton) e.getSource();
         this.row = button.getRow();
         this.col = button.getCol();
         
         toggleLights(row, col);
         
         endGameIfDone();
      }
   }
   
   private void endGameIfDone()
   {
      boolean done = false;

      for(int i = 0; i < GRIDSIZE; i++){

         for(int j = 0; j < GRIDSIZE; j++){

            if(!lightButton[i][j].isLit()){
               //done = true;
            }
            else{
               done = false;
            }
         }
      }
      
      if(done)
      {
         String message = "Congrats! You Won! Do you want to play again?";
         int option = JOptionPane.showConfirmDialog(this, message, "Play Again?", JOptionPane.YES_NO_OPTION);
         if(option == JOptionPane.YES_OPTION)
            newGame();
         else
            System.exit(0);
      }
   }
   
   private void newGame()
   {
      for(int i = 0; i < GRIDSIZE; i++){
         for(int j = 0; j < GRIDSIZE; j++){
            lightButton[i][j].turnOn();
         }
      }
      
      lightButton[1][1].turnOff();
      
      int random = (int) (Math.random() * 20) + 10;

      for(int i = 0; i < random; i++){
         int row = (int) Math.random() * 2;
         int col = (int) Math.random() * 2;

         //lightButton[row][col].toggle();
         this.toggleLights(row, col);
      }
    
   }
   
   private void toggleLights(int row, int col)
   {
      lightButton[row][col].toggle();
            
      if(row != 1 && col != 1){
         // Corners
         if (row == 0){
            lightButton[row+1][col].toggle();
            if(col == 0){
               lightButton[row][col+1].toggle();
            }
            if (col == 2){
               lightButton[row][col-1].toggle();
            }
         }
         if (row == 2){
            lightButton[row-1][col].toggle();
            if (col == 2){
               lightButton[row][col-1].toggle();
            }
            if(col == 0){
               lightButton[row][col+1].toggle();
            }
         }

      }
      else if (row == 1 && col == 1){
         lightButton[0][1].toggle();
         lightButton[1][0].toggle();
         lightButton[1][2].toggle();
         lightButton[2][1].toggle();
      }
      else if(col == 1){
         if(row == 0){
            lightButton[row][col-1].toggle();
            lightButton[row][col+1].toggle();
            lightButton[row+1][col].toggle();
         }
         if(row == 2){
            lightButton[row][col-1].toggle();
            lightButton[row][col+1].toggle();
            lightButton[row-1][col].toggle();
         }
      }
      else if(row == 1){
         if(col == 0){
            lightButton[row+1][col].toggle();
            lightButton[row-1][col].toggle();
            lightButton[row][col+1].toggle();
         }
         if(col == 2){
            lightButton[row+1][col].toggle();
            lightButton[row-1][col].toggle();
            lightButton[row][col-1].toggle();
         }
      }

     
   }
   
   public static void main(String[] arg)
   {
      try{
         String className = UIManager.getCrossPlatformLookAndFeelClassName();
         UIManager.setLookAndFeel(className);
      }
      catch (Exception e) {}
      
      EventQueue.invokeLater(
         new Runnable() {
            public void run() 
            {
               new Framed();
            }
         });  
   }

}