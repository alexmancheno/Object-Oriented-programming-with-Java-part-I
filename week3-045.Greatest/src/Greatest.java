
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {

        int max = Math.max(number1, number2);
        int max2 = Math.max(max, number3);
        return max2;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}