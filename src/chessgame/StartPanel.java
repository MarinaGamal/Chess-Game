package chessgame;

import java.awt.*;
import javax.swing.*;

public class StartPanel extends JPanel
{
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        ImageIcon Background = new ImageIcon("Resources/b2.jpg");
        g.drawImage(Background.getImage(), 0, 0, getWidth(), getHeight(), this);       
    }    
}
