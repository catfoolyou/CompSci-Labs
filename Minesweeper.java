import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Minesweeper extends JFrame
{
   private static final int GRIDSIZE = 10;
   private static final int NumberOfMines = 10;
   private TerrainButton[][] terrain = new TerrainButton[GRIDSIZE][GRIDSIZE];
   private int totalRevealed = 0;
   
   public Minesweeper()
   {
      initGUI();
      makeMines();
      setTitle("Minesweeper");
      setResizable(false);
      pack();
      setLocationRelativeTo(null);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
   }
   
   private void initGUI()
   {
      TitleLabel titleLabel = new TitleLabel("Minesweeper");
      this.add(titleLabel, BorderLayout.NORTH);
      
      JPanel centerPanel = new JPanel();
      centerPanel.setLayout(new GridLayout(GRIDSIZE, GRIDSIZE));

      for(int i = 0; i < GRIDSIZE; i++){
         for(int j = 0; j < GRIDSIZE; j++){
            terrain[i][j] = new TerrainButton(i, j);
            terrain[i][j].addActionListener(new ButtonListener());
            centerPanel.add(terrain[i][j]);
         }
      }

      this.add(centerPanel);
   }
   private class ButtonListener implements ActionListener
   {
      private int row;
      private int col;

      public void actionPerformed(ActionEvent arg0) {
         TerrainButton button = (TerrainButton) arg0.getSource();
         this.row = button.getRow();
         this.col = button.getCol();

         clickedTerrain(row, col);
      }
      
   }
   
   private void clickedTerrain(int r, int c)
   {
      check(r, c);
      checkNeighbors(r, c);               
   }
   
   //checks if a clicked button and its neighbors should be revealed.  
   private void check(int r, int c)
   {
      if((r >= 0 && r < GRIDSIZE) && (c >= 0 && c < GRIDSIZE)){
         if(!terrain[r][c].hasMine() && !terrain[r][c].isRevealed()){
            terrain[r][c].revealSpace();
            totalRevealed++;
            if(r <= 8 && r >= 1 && c <= 8 && c >= 1)
               if(terrain[r][c].isNextToMines() == false)
                  checkNeighbors(r, c);
         }
         else if (terrain[r][c].hasMine() && !terrain[r][c].isRevealed()){
            terrain[r][c].setBackground(Color.DARK_GRAY);
            promptForNewGame("You ded lol");
         }
      }
   }
  
  /*checks all eight neighbors of a button to see if it needs to be revealed, recursively
  checks if the neighbors of the neighbors should also be revealed.*/
   private void checkNeighbors(int r, int c)
   {
      for(int i = 0; i < GRIDSIZE - 1; i++){
         if(!terrain[r+1][c].hasMine())
            check(r+1, c);
         if(!terrain[r+1][c+1].hasMine())
            check(r+1, c+1);
         if(!terrain[r][c+1].hasMine())
            check(r, c+1);
         if(!terrain[r-1][c].hasMine())
            check(r-1, c);
         if(!terrain[r-1][c-1].hasMine())
            check(r-1, c-1);
         if(!terrain[r][c-1].hasMine())
            check(r, c-1);
         if(!terrain[r+1][c-1].hasMine())
            check(r+1, c-1);
         if(!terrain[r-1][c+1].hasMine())
            check(r-1, c+1);
      }
   }
   
   //creates and randomly places Mines throughout the grid
   private void makeMines()
   {
      for(int i = 0; i < NumberOfMines; i++){
         int rand1 = (int) (Math.random() * 10);
         int rand2 = (int) (Math.random() * 10);

         while(terrain[rand1][rand2].hasMine()){
            rand1 = (int) (Math.random() * 10);
            rand2 = (int) (Math.random() * 10);
         }

         terrain[rand1][rand2].setMine(true);
         addToNeighborsMineCount(rand1, rand2);

      }
         /* terrain[pickRow][pickCol].revealSpace(true); 
         //temporarily uncomment to see the Mines on the board. */
   }
   
   //checks that a set of coordinates are valid and if so increases the Mine count for the button
   private void addToMineCount(int r, int c)
   {
      if((r >= 0 && r < GRIDSIZE) && (c >= 0 && c < GRIDSIZE)){
         terrain[r][c].increaseMineCount();
      }
         /*// terrain[r][c].revealSpace(true);
         //temporarily uncomment to see the numbers on the board. */
   }
   
   //increases the Mine count of neighbor buttons when a Mine is created.
   private void addToNeighborsMineCount(int r, int c)
   {
      addToMineCount(r+1, c);
      addToMineCount(r+1, c+1);
      addToMineCount(r, c+1);
      addToMineCount(r-1, c);
      addToMineCount(r-1, c-1);
      addToMineCount(r, c-1);
      addToMineCount(r+1, c-1);
      addToMineCount(r-1, c+1);
   }
   
   //notifies the player the game is over and checks if a new game should be created.
   private void promptForNewGame(String message)
   {
      showMines();
      int option = JOptionPane.showConfirmDialog(this, message, "Play Again?", JOptionPane.YES_NO_OPTION);
      if(option == JOptionPane.YES_OPTION)
         newGame();
      else
         System.exit(0); 
   }
   
   //shows all the Mines on the board.
   private void showMines()
   {
      for(int i = 0; i < GRIDSIZE; i++){
         for(int j = 0; j < GRIDSIZE; j++){
            if(terrain[i][j].hasMine()){
               terrain[i][j].setBackground(Color.DARK_GRAY);
            }
         }
      }
   }
   
   //creates a new game to be played by resetting game stats
   private void newGame()
   {
      for(int i = 0; i < GRIDSIZE; i++){
         for(int j = 0; j < GRIDSIZE; j++){
            terrain[i][j].reset();
         }
      }

      new Minesweeper();
      this.setVisible(false);
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
               new Minesweeper();
            }
         });  
   }
}