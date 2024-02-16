// Yasin Abdulkariem
import javax.swing.*;
import java.awt.*;
    public class DiceGame {

        // print the instructions
        public static void intructions(){
            System.out.println("Welcome to Best of 3!");
            System.out.println("--> Here's how the game works: ");
            System.out.println("--> The goal is to beat the AI in a best of 3 rolls");
            System.out.println("--> Player with the higher value after 3 rolls wins");
            System.out.println("--> Good luck!");
        }
        // takes both totals of the players and compares
        // print all 3 of the possible solutions
        public void checkWin(int total1, int total2){

            if(total1 > total2){
                System.out.println("You Win! Nice Job!");
            }
            else if(total1 == total2){
                System.out.println("You Tied! Try Again!");
            }
            else{
                System.out.println("You Lose! Better luck next time!");
            }
        }
        public void play(){

            DiceGame dg = new DiceGame();

            Die d1 = new Die(6);
            System.out.println(d1);
            System.out.println("Rolling the die 3 times");
            // gets the total after 3 rolls
            int total1 = d1.roll() + d1.roll() + d1.roll();
            System.out.println("You rolled a ");
            System.out.println(total1);

            System.out.println();

            Die d2 = new Die(6);
            System.out.println(d2);
            System.out.println("Rolling the die 3 times");
            // gets the total after 3 rolls
            int total2 = d2.roll() + d2.roll() + d2.roll();
            System.out.println("The Dealer rolled a ");
            System.out.println(total2);
            dg.checkWin(total1, total2);
        }
        public static void main(String[] args)
        {
            DiceGame game = new DiceGame();
            DiceGame.intructions();
            game.play();
        }

    }
