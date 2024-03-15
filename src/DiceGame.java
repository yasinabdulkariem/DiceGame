// Yasin Abdulkariem
import javax.swing.*;
import java.awt.*;
public class DiceGame {
    private Die[] playerDice;
    private Die[] dealerDice;
    private int[] playerTotals;
    private int[] dealerTotals;
    private DiceGameView window;

    public DiceGame(){
        this.window = new DiceGameView(this);
        playerDice = new Die[3];
        dealerDice = new Die[3];
        playerTotals = new int[0];
        dealerTotals = new int[0];

        for(int i = 0; i < playerDice.length; i++){
            playerDice[i] = new Die(6, window);
        }
        for(int i = 0; i < dealerDice.length; i++){
            dealerDice[i] = new Die(6, window);
        }
    }

    public Die[] getPlayerDice(){
        return playerDice;
    }
    public Die[] getDealerDice() {
        return dealerDice;
    }
    public int[] getPlayerTotals() {
        return playerTotals;
    }
    public int[] getDealerTotals() {
        return dealerTotals;
    }

    // takes both totals of the players and compares
    // print all 3 of the possible solutions
    public String checkWin(int[] playerTotals, int[] dealerTotals){
        int playerTotal = 0;
        int dealerTotal = 0;

        for(int total : playerTotals){
            playerTotal += total;
        }
        for(int total : dealerTotals){
            dealerTotal += total;
        }

        if(playerTotal > dealerTotal){
            return "You Win! Nice Job!";
        }
        else if(playerTotal == dealerTotal){
            return "You Tied! Try Again!";
        }
        else{
            return "You Lose! Better luck next time!";
        }
    }
    //This rolls the dice
    public int[] rollDice(Die[] dice){
        int[] totals = new int[dice.length];
        for(int i = 0; i < dice.length; i++){
            totals[i] = dice[i].roll() + dice[i].roll() + dice[i].roll();
        }
        return totals;
    }
    public void printTotals(int[] totals){
        for(int total : totals){
            System.out.println(total);
        }
    }
    public void play(){
        System.out.println("Rolling the dice for the player and dealer...");
        int[] playerTotals = rollDice(playerDice);
        int[] dealerTotals = rollDice(dealerDice);

        System.out.println("Player's totals: ");
        printTotals(playerTotals);
        System.out.println("Dealer's totals: ");
        printTotals(dealerTotals);

        checkWin(playerTotals, dealerTotals);
        window.repaint();
    }
    public static void main(String[] args)
    {
        DiceGame game = new DiceGame();
        game.play();
    }
}
