
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number? ");
        int num = Integer.parseInt(reader.nextLine());
        int num2 = 1;
        while (num2 <= num) {
            System.out.println(num2);
            num2 += 1;
        }
        // Write your code here
        
    }
}
