package sort;

public class SelectionSort {
    public static double[] selectionSort(double[] input) {
        int n = input.length;
        double min;
        int index = 0;
        boolean skip = false;
        for (int i = 0; i < n; i++) {
            skip = false;
            min = input[i];
            for (int j = i + 1; j < n; j++) {
                if (min > input[j]) {
                    min = input[j];
                    index = j;
                    skip = true;
                }
            }
            if (skip) {
                input[i] += input[index];
                input[index] = input[i] - input[index];
                input[i] -= input[index];
            }
        }
        return input;
    }
}
