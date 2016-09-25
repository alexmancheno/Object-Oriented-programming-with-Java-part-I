
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int max = Integer.parseInt(reader.nextLine());
        int i = 0;
        int finalResult = 0;
        while (i <= max) {
            int powers = (int)Math.pow(2, i);
            finalResult += powers;
            i++;
        }
        System.out.println("The result is: " + finalResult);
    }
}
