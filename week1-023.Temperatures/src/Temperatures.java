
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
    while (true) {
        System.out.println("Enter a value: ");            
        double value = Double.parseDouble(reader.nextLine());       
        if (value > -30 && value < 40) {
            Graph.addNumber(value);      
            }
    }

    }
}