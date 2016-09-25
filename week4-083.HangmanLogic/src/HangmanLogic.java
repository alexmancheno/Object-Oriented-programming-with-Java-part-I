
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if (!guessedLetters.contains(letter)) {
            this.guessedLetters += letter;
            if (!this.word.contains(letter)) {
                this.numberOfFaults++;
            }

        }
    }

    public String hiddenWord() {
        int i = 0;
        String hiddenWord = "";
        while (i < this.word.length()) {
            char c = this.word.charAt(i);
            String letter = "" + c;
            if (this.guessedLetters.contains(letter)) {
                hiddenWord += letter;
            } else {
                hiddenWord += "_";
            }
            i++;
        }
        return hiddenWord;
    }

    private CharSequence charAt(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
