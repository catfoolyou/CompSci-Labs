import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class TerrainButton extends JButton
{
   private int size = 50;
   private int row, col;
   private int nextToMines = 0;

   private boolean mine = false;
   private boolean revealed = false;
   
   public TerrainButton(int r, int c)
   {
      this.row = r;
      this.col = c;
      this.setPreferredSize(new Dimension(this.size, this.size));
   }

   public int getRow()
   {
      return this.row;
   }

   public int getCol()
   {
      return this.col;
   }

   public boolean hasMine()
   {
      return this.mine;
   }

   public boolean isRevealed()
   {
      return this.revealed;
   }

   public void setMine(boolean hasMine)
   {
      this.mine = hasMine;
   }
   
   public void increaseMineCount()
   {
      this.nextToMines++;
      if(this.nextToMines == 1)
         this.setForeground(Color.BLUE);
      if(this.nextToMines == 2)
         this.setForeground(new Color(4822575));
      if(this.nextToMines == 3)
         this.setForeground(Color.RED);
      if(this.nextToMines == 4)
         this.setForeground(new Color(1444710));
      if(this.nextToMines == 5)
         this.setForeground(new Color(6687499));
   }
   
   //checks the nextToMines value and returns true or false
   public boolean isNextToMines()
   {
      if(nextToMines > 0){
         return true;
      }
      else{
         return false;
      }
   }
   
   //Changes the appearance of the button when it is clicked.
   public void revealSpace()
   {
      this.revealed = true;
      if(hasMine()){
         this.setBackground(Color.DARK_GRAY);
      }
      else{
         this.setBackground(new Color(13158600));
      }

      if(isNextToMines()){
         this.setText("" + this.nextToMines);
      }
      
      setFocusPainted(false);
   }
   
   //This function should reset the Mine, revealed, nextToMines, text and background back to the default values.
   public void reset()
   {
      this.mine = false;
      this.revealed = false;
      this.nextToMines = 0;
      this.setText("");
   }
}