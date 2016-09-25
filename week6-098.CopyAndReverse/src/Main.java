
public class Main {

    public static int[] copy(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }
    
    public static int[] reverseCopy(int[] array) {
        int[] reverseCopy = new int[array.length];
        int x = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverseCopy[i] = array[x];
            x++;
        }
        return reverseCopy;
    }

    public static void main(String[] args) {

    }

}
