package mod;

import cont.JOP;

/**
 * The main class of this program.
 */
public class Main {

    /**
     * Starts the program, asking for the word to be guessed before beginning the game.
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String guess = JOP.in("Enter the word you would like the guesser to guess.");
        if(guess == null || guess.equals("")) {
            guess = "frog";
        }
        CombinationLock comboLock = new CombinationLock(guess);
        while(!comboLock.getGuess().equals(guess)) {
            comboLock.getClue();
        }
        JOP.msg("Congrats, you guessed the word.");
    }
}
