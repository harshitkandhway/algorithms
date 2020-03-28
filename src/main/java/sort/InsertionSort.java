package sort;

public class InsertionSort {
    public static double[] insertionSort(double[] input) {
        int n = input.length;
        int j;
        double key;
        for (int i = 1; i < n; i++) {
            key = input[i];
            j = i - 1;
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j--;
            }
            input[j+1] = key;
        }
        return input;
    }

    //BinaryInsertionSort is another enhanced version of insertion sort.
    //But time compexity in it is also O(n^2)

//    1) 2|5,7,4,3 | key=5
//    2) 2,5|7,4,3 | key=7
//    3) 2,5,7|4,3 | key=4 -> 2,5,5|7,3 | key=4
//    4) 2,4,5,7|3 | key=3
//    5) 2,3,4,5,7
}
