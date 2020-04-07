package chessgame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuFrame extends JFrame
{
    private GameFrame f1;
    private JLabel StartLabel = new JLabel();
    private JLabel QuitLabel = new JLabel();

    private ImageIcon StartImage = new ImageIcon("Resources/button_start-game.png");
    private ImageIcon QuitImage = new ImageIcon("Resources/button_quit.png");
    private ImageIcon StartImageHL = new ImageIcon("Resources/button_start-game-highlighted.png");
    private ImageIcon QuitImageHL = new ImageIcon("Resources/button_quit-highlighted.png");
    private StartPanel BackgroundPanel = new StartPanel();
    
    
    public MenuFrame()
    {
        init();
    }
    
    public void init()
    {
        Container c = getContentPane();
        BackgroundPanel.setLayout(null);
        StartLabel.setBounds(193,160,265,82);
        QuitLabel.setBounds(261,321,128,82);
        
        StartLabel.setIcon(StartImage);
        QuitLabel.setIcon(QuitImage);
        
        BackgroundPanel.add(StartLabel);
        BackgroundPanel.add(QuitLabel);
        c.add(BackgroundPanel);
        StartLabel.addMouseListener(new StartButton());
        QuitLabel.addMouseListener(new QuitButton());       
     
        setTitle("Chess game ver. 1.0");
        setLocation(300,10);
        setSize(646, 692);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);  
    }
    
    class QuitButton extends MouseAdapter
    {
        public void mouseClicked(MouseEvent e)
        {
            System.exit(0);
        }
        
        public void mouseEntered(MouseEvent e)
        {
            QuitLabel.setIcon(QuitImageHL);
        }
        
        public void mouseExited(MouseEvent e)
        {
            QuitLabel.setIcon(QuitImage);
        }
    }
    
    class StartButton extends MouseAdapter
    {
        public void mouseClicked(MouseEvent e)
        {
            f1 = new GameFrame();
            f1.setTitle("Chess game ver. 1.0");
            f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f1.setBounds(300, 10, 646, 692);
            f1.setResizable(false);
            f1.setVisible(true);
            setVisible(false);
        }
        
        public void mouseEntered(MouseEvent e)
        {
           StartLabel.setIcon(StartImageHL);
        }
        
        public void mouseExited(MouseEvent e)
        {
            StartLabel.setIcon(StartImage);
        }
    }
}