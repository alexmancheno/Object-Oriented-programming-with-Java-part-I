import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
 Scanner reader = new Scanner(System.in);

    System.out.println("Type numbers: ");
    int number = Integer.parseInt(reader.nextLine());
    int total = 0;
    int counter = 0;
    int even = 0;
    int odd = 0;

    while(number != -1){
        total = total + number;
        counter++;

        if (number % 2 == 0){
            even = even + 1;
        }
        else{
            odd = odd + 1;
        }
            number = Integer.parseInt(reader.nextLine());
    }

    System.out.println("Thank you and see you later!");
    System.out.println("The sum is " + total);
    System.out.println("How many numbers: " + counter);

    double average = (double)total / counter;
    System.out.println("Average: " + average);
    System.out.println("Even numbers: " + even);
    System.out.println("Odd numbers: " + odd);
    }
}