import javax.swing.*;
import java.awt.*;

public class TitleLabel extends JLabel
{
   public TitleLabel(String title)
   {
      Font font = new Font("Serif", Font.BOLD, 32);
      setFont(font);
      setBackground(Color.BLACK);
      setForeground(Color.WHITE);
      setOpaque(true);
      setHorizontalAlignment(JLabel.CENTER);
      setText(title);
   }
}