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
                input[j] = key;
                j--;
            }
        }
        return input;
    }
}
