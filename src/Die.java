// Yasin Abdulkariem
import javax.swing.*;
import java.awt.*;
public class Die {
        /** Instance Variables **/
        private int numSides;
        /** Constructors **/

        public Die(int numSides) {
            // NOTE: if the user enters an int less than 2
            // set numSides to 6.
            if (numSides < 2)
            {
                this.numSides = 6;
            }
            else
            {
                this.numSides = numSides;
            }
        }
        public Die() {
            numSides = 6;
        }

        /** Methods **/

        /**
         * Returns the number of sides on the Die.
         */
        public int getSides() {
            return numSides;
        }
        /**
         * Returns a random int between 1 and 6
         * the number of sides on the Die
         */
        public int roll() {
            // TODO: complete roll()
            return (int)(Math.random() * numSides + 1);
        }
        /**
         * Rolls the dice the numRolls times
         * and returns the max value of the rolls
         */
        public int getMaxRoll() {
            // this gets the max roll
            int max  = 0;
            for (int i = 0; i < 3; i++)
            {
                int roll = this.roll();
                max = Math.max(max, roll);
            }
            return max;
        }

        /**
         * Returns a String in the following form:
         * "This is a n-sided die."
         */
        public String toString() {
            return "This is a " + numSides + "-sided die";
        }
        public void draw(Graphics g){

        }
}

