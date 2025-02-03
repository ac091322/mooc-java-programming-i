
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println(Arrays.toString(array));

        System.out.println(smallest(array));
        System.out.println(indexOfSmallest(array));
        System.out.println(indexOfSmallestFrom(array, 2));

        MainProgram.swap(array, 0, 3);
        System.out.println(Arrays.toString(array));

        int[] sortedArray = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(sortedArray);
    }

    public static int smallest(int[] array) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i += 1) {
            int num = array[i];
            if (num < smallest) {
                smallest = num;
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;

        for (int i = 0; i < array.length; i += 1) {
            if (array[i] < array[indexOfSmallest]) {
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexOfSmallest = startIndex;

        for (int i = startIndex; i < array.length; i += 1) {
            if (array[i] < array[indexOfSmallest]) {
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] sortedArray) {
        // no need to check the last index, the number at the last index must be the largest because everything before it is already sorted
        for (int i = 0; i < sortedArray.length - 1; i += 1) {
            int smallestIndex = indexOfSmallestFrom(sortedArray, i);
            swap(sortedArray, i, smallestIndex);
            System.out.println(Arrays.toString(sortedArray));
        }
    }
}
