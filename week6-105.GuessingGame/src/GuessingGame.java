
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class GuessingGame {

    private final Scanner reader;

    /**
     *
     */
    public GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    
    /**
     * This method first prompts, "Is your number greater than " + @param + "? (y/n)");
     * The method reads in the user's input, then returns 'true' if the user wrote "y";
     * the method returns false otherwise.
     * @param value
     * @return boolean
     */
    public boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than " + value + "? (y/n)");
        String answer = reader.nextLine();
        return answer.equals("y");
    }

    /**
     *
     * @param firstNumber
     * @param secondNumber
     * @return
     */
    public int average(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }

    /**
     *
     * @param lowerLimit
     * @param upperLimit
     */
    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        while (lowerLimit != upperLimit) {
            if (isGreaterThan(average(lowerLimit, upperLimit))) {
                lowerLimit = average(lowerLimit, upperLimit) + 1;
            } else {
                upperLimit = average(lowerLimit, upperLimit);
            }
        }
        System.out.println("The number you're thinking of is " + lowerLimit);

    }

    /**
     *
     * @param lowerLimit
     * @param upperLimit
     */
    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    /**
     *
     * @param number
     * @return
     */
    public static int howManyTimesHalvable(int number) {
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
