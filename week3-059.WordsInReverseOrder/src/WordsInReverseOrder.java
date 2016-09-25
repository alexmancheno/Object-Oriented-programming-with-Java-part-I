
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (word.isEmpty()) {
                Collections.reverse(list);
                System.out.println("You typed the following words: ");
                for (String words : list) {
                    System.out.println(words);
                }
                break;
            }
            list.add(word);

        }
    }
}
