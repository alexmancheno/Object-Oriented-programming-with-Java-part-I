
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        
        if (num1 > 0) {
            System.out.println("The number is positive.");
        } else {
                    System.out.println("The number is not positive.");
                    };
        }
        // Type your program here:
    }

