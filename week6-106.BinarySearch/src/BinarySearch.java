
public class BinarySearch {

    public static boolean search(int[] array, int searchedValue) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (array[middle] == searchedValue) {
                return true;
            }
            if (array[middle] > searchedValue) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return false;
    }
}
