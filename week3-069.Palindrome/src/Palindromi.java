
import java.util.Scanner;

public class Palindromi {

    public static String reverse(String text) {
        String help = "";
        int i = text.length() - 1;
        while (i >= 0) {
            help += text.charAt(i);
            i--;
        }
        return help;
    }

    public static boolean palindrome(String userString) {
        int n = userString.length();
        for (int i = 0; i < (n / 2) ; i++) {
            if (userString.charAt(i) != userString.charAt(n - i - 1)) {
                return false;
                
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
