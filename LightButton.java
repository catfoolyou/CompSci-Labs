import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class LightButton extends JButton
{
   private static final int MAXSIZE = 50;
   private int row = 0;
   private int col = 0;
   
   public LightButton(int row, int col)
   {
      this.row = row;
      this.col = col;
      this.setBackground(Color.BLACK);
      this.setPreferredSize(new Dimension(MAXSIZE, MAXSIZE));
   }
   
   public int getRow()
   {
      return this.row;
   }
   
   public int getCol()
   {
      return this.col;
   }
   
   public void turnOn()
   {
      this.setBackground(Color.RED);
   }
   
   public void turnOff()
   {
      this.setBackground(Color.BLACK);
   }

   public boolean isLit()
   {
      Color color = getBackground();
      return color.equals(Color.RED);
   }
   
   public void toggle()
   {
      if(this.isLit()){
         turnOff();
      }
      else{
         turnOn();
      }
   }
}