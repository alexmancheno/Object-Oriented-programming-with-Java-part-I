
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int second = Integer.parseInt(reader.nextLine());
        
        while (first <= second) {

                System.out.println(first);
                first++;
            }
        }
       
        // write your code here

    }

