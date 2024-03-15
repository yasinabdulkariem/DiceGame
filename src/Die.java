// Yasin Abdulkariem
import javax.swing.*;
import java.awt.*;
public class Die {
    private int numSides;
    private int lastRoll;
    private Image[] dieImages;
    private DiceGameView window;
    public Die(int numSides, DiceGameView window) {
        this.window = window;
        // if the user enters an int less than 2
        // set numSides to 6.
        if (numSides < 2)
        {
            this.numSides = 6;
        }
        else
        {
            this.numSides = numSides;
        }
        Images();
    }
    //Returns the value of the last roll
    public int getLastRoll(){
        return lastRoll;
    }
    public int roll() {
        lastRoll = (int)(Math.random() * numSides + 1);
        return lastRoll;
    }
    public void draw(Graphics g, int x, int y, int imageWidth, int imageHeight){
        int imageIndex = lastRoll - 1;
        //Adjusts the index to start from 0
        if (imageIndex >= 0 && imageIndex < 6 && dieImages[imageIndex] != null){
            g.drawImage(dieImages[imageIndex], x, y, imageWidth, imageHeight, window);
        }
    }
    private void Images(){
        dieImages = new Image[6];
        for(int i = 0; i < 6; i++){
            dieImages[i] = new ImageIcon("Resources/real_die_number_" + (i + 1) + ".png").getImage();
        }
    }

}

