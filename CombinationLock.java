package mod;

import cont.JOP;

/**
 * This class handles the game, processing guesses and comparing them against the answer.
 */
public class CombinationLock {
    /**
     * The word to be guessed
     */
    private String answer;
    /**
     * The current guess
     */
    private String guess;

    /**
     * Constructs a new CombinationLock object.
     * @param theAnswer The word to be guessed
     */
    public CombinationLock(String theAnswer) {
        answer = theAnswer;
        guess = "";
    }

    /**
     * Processes a user guess. The method asks for the user guess first, and then compares it to the answer to determine
     * what to print.
     */
    public void getClue() {
        guess = JOP.in("This combination lock contains a 4-letter word as the answer. \n" +
                "If you get a letter returned, that is the correct letter for that space. \n" +
                "If you get a +, that letter is in the word, else if you get * the letter is not in the word.\n" +
                "Click cancel or the x to leave this program.");
        if(guess == null) {
            System.exit(0);
        }
        if(guess.length() > answer.length()) {
            for(int i = 0; i < answer.length(); i++) {
                if(guess.charAt(i) == answer.charAt(i)) {
                    System.out.print(guess.charAt(i));
                } else if(guess.charAt(i) == answer.charAt(0) || guess.charAt(i) == answer.charAt(1) || guess.charAt(i) == answer.charAt(2) || guess.charAt(i) == answer.charAt(3)) {
                    System.out.print("+");
                } else {
                    System.out.print("*");
                }
            }
        }
        else {
            for(int i = 0; i < guess.length(); i++) {
                if(guess.charAt(i) == answer.charAt(i)) {
                    System.out.print(guess.charAt(i));
                } else if(guess.charAt(i) == answer.charAt(0) || guess.charAt(i) == answer.charAt(1) || guess.charAt(i) == answer.charAt(2) || guess.charAt(i) == answer.charAt(3)) {
                    System.out.print("+");
                } else {
                    System.out.print("*");
                }
            }
        }
        System.out.println();
    }

    /**
     * Getter for the current guess
     * @return The current guess
     */
    public String getGuess() {
        return guess;
    }
}
