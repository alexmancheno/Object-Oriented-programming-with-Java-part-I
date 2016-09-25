
public class Main {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }

    public static int sum(int[] array) {
       int sumOfArray = 0;
       for (int i = 0; i < array.length; i++) {
           sumOfArray += array[i];
       }
        return sumOfArray;
    }
}
