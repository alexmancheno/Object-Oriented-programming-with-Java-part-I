
public class GradesDistribution {

    private final int[] grades = new int[6];

    public void addGrade (int grade) {
        if (grade >= 0 && grade < 30) grades[0]++;
        else if (grade >= 30 && grade <= 34) grades[1]++;
        else if (grade >= 35 && grade <= 39) grades[2]++;
        else if (grade >= 40 && grade <= 44) grades[3]++;
        else if (grade >= 45 && grade <= 49) grades[4]++;
        else if (grade >= 50 && grade <= 60) grades[5]++;
     }
    
    public void printLine (int row) {
        System.out.print(row + ": ");
        for (int i = 0; i < grades[row]; i++)
            System.out.print("*");
        System.out.println();
    }
    
    public void printGradesDistribution () {
        System.out.println("Grade distribution: ");
        for (int i = 0; i < grades.length; i++) {
            this.printLine(i);
        }
    }
    
    public double acceptancePercentage () {
        int accepted = 0;
        int allScores = 0;
        
        for (int r = 0; r < this.grades.length; r++) {
            for (int i = 0; i < grades[r]; i++) {
                allScores++;
                if (r > 0)
                    accepted++;
            }
        }
        return ((double) 100 * accepted / allScores);      
    } 

}
