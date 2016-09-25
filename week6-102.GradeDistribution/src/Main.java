
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradesDistribution grades = new GradesDistribution();
        System.out.print("Type exam scores, -1 completes: ");
        int num = Integer.parseInt(scanner.nextLine());
        while (true) {
            if (num == -1) break;
            if (num >= 0 && num <= 60) grades.addGrade(num);
            num = Integer.parseInt(scanner.nextLine());
        }
        grades.printLine(0);
        grades.printGradesDistribution();
        System.out.println("Acceptance percentage: " + grades.acceptancePercentage());
        System.out.println("Done");
    }
}

