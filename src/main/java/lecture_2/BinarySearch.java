package lecture_2;

public class BinarySearch {
    /*
    Бинарный поиск
     */
    public static void maiт(String[] args) {
        int[] array = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9
        };

        System.out.println(binarySearch(array, 5, 0, array.length-1));
    }

    public static int binarySearch(int[] array, int value, int min, int max) {
        int midpoint;
        if (max < min) {
            return -1;
        } else {
            midpoint = (max - min) / 2 + min;
        }

        if (array[midpoint] < value) {
            return binarySearch(array, value, midpoint + 1, max);
        } else {
            if (array[midpoint] > value) {
                return binarySearch(array, value, min, midpoint - 1);
            } else {
                return midpoint;
            }
        }
    }
}
