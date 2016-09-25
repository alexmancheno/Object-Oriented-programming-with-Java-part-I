
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int number = Integer.parseInt(reader.nextLine());
        int i = 1;
        int x = 1;
        int sum = 1;
        while (i != number) {
            i++;
            x++;
            sum += x;
        }
            System.out.println("Sum is " + sum);        
    }
}
