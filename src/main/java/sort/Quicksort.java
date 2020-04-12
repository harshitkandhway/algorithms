package sort;

public class Quicksort {
    public static int partition(int input[], int left, int right) {
        int pivot = input[right];
        int i = left - 1;
        for (int j = left; j <= input.length - 1; j++) {
            if (pivot > input[j]) {
                i++;
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }
        int temp = input[i + 1];
        input[i+1] = input[right];
        input[right] = temp;
        return (i + 1);
    }

    public static int[] quickSort(int[] input, int left, int right) {
        if (left < right) {
            int keyIndex = partition(input, left, right);
            quickSort(input, left, keyIndex - 1);
            quickSort(input, keyIndex + 1, right);
        }
        return input;
    }
}
