
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]" );
        int grade = Integer.parseInt(reader.nextLine());
        if (grade <= 29) {
            System.out.println("Grade: failed");    
        } else if (grade >= 30 && grade <= 34) {
            System.out.println("Grade: 1");           
        } else if (grade >= 35 && grade <= 39) {
            System.out.println("Grade: 2");
        } else if (grade >= 40 && grade <= 44) {
            System.out.println("Grade: 3");
        } else if (grade >= 45 && grade <= 49) {
            System.out.println("Grade: 4");
        } else if (grade >= 50 && grade <= 60) {
            System.out.println("Grade: 5");
        }
        
    }
}
