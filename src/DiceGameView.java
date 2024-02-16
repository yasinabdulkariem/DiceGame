// Yasin Abdulkariem
import javax.swing.*;
import java.awt.*;
public class DiceGameView extends JFrame{
    private final int WINDOW_WIDTH = 1000;
    private final int WINDOW_HEIGHT = 800;
    private Image die1;
    private Image die2;
    private DiceGame game;
    private static final int start = 50;

    public DiceGameView(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Dice Game");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }
    public void paint(Graphics g){
        g.drawString("--> Welcome to Best of 3!", start, start);
        g.drawString("--> The goal is to beat the AI in a best of 3 rolls", start, start + 20);
        g.drawString("--> Player with the higher value after 3 rolls wins", start, start + 40);
        g.drawString("--> Good luck!", start, start + 60);
    }
    public void win(Graphics g){
        
    }
    public void drawInstructions(){

    }
}
