// Yasin Abdulkariem
import javax.swing.*;
import java.awt.*;
public class DiceGameView extends JFrame{
    private final int WINDOW_WIDTH = 1000;
    private final int WINDOW_HEIGHT = 800;
    private Image[] dieImages;
    private DiceGame game;
    private Die die;
    private static final int start = 50;

    public DiceGameView(DiceGame game){
        this.game = game;
        loadDieImages();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Dice Game");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }
    public void loadDieImages(){
        dieImages = new Image[6];
        for(int i = 0; i < 6; i++){
            dieImages[i] = new ImageIcon("Resources/real_die_number_" + (i + 1) + ".png").getImage();
        }
    }

    public void paint(Graphics g){
        Die[] playerDice = game.getPlayerDice();
        Die[] dealerDice = game.getDealerDice();

        g.drawImage(dieImages[0], 100, 100, 20, 20, this);

        if (playerDice != null){
            for(int i = 0; i < playerDice.length; i++){
                g.drawImage(dieImages[playerDice[i].getLastRoll() - 1], start + i * 10, 100, this);
            }
        }
        if (dealerDice != null){
            for(int i = 0; i < dealerDice.length; i++){
                g.drawImage(dieImages[dealerDice[i].getLastRoll() - 1], start + i * 10, 200, this);
            }
        }

        drawInstructions(g);
        drawWinner(g);
    }
    public void drawWinner(Graphics g){
        int[] playerTotals = game.getPlayerTotals(); // Get player's totals
        int[] dealerTotals = game.getDealerTotals();
        String winnerMessage = game.checkWin(playerTotals, dealerTotals);
        g.drawString(winnerMessage, start, start + 100);
    }
    public void drawInstructions(Graphics g){
        g.drawString("--> Welcome to Best of 3!", start, start);
        g.drawString("--> The goal is to beat the dealer in a best of 3 rolls", start, start + 20);
        g.drawString("--> Player with the higher value after 3 rolls wins", start, start + 40);
        g.drawString("--> Good luck!", start, start + 60);
    }
}
