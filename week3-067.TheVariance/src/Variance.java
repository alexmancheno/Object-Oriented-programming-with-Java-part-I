import java.util.ArrayList;

public class Variance {

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum; 
    }

    public static double average(ArrayList<Integer> list) {
        
        return (double)sum(list) / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        double variance = 0;
        double difference = 0;
        double average = average(list);
            for (double number : list) {
               difference = average - number;
               variance += Math.pow(difference, 2);
               
            }
            
            return variance / (list.size() - 1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
