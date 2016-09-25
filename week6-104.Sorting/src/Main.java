
public class Main {

    public static void main(String[] args) {

    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[index];
        int smallestIndex = index;
        for (int i = index; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int one = array[index1];
        array[index1] = array[index2];
        array[index2] = one;
    }

    public static void sort(int[] array) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, num);
        }
    }
}
