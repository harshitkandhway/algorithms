package sort;

//WIP
public class MergeSort {
    public static void mergeSort(int input[], int left, int right) {
        int mid = (left + right) / 2;

        mergeSort(input, left, mid);
        mergeSort(input, mid + 1, right);
        //merge();
    }

    public static int[] merge(int left[], int right[]) {
        int totalElements = left.length + right.length;
        int result[] = new int[totalElements];
        int leftptr = 0, rightptr = 0;
        int counter = 0;
        while (counter <= totalElements) {
            if (left[leftptr] < right[rightptr]) {
                result[counter] = left[leftptr];
                counter++;
                leftptr++;
            } else {
                result[counter] = right[rightptr];
                counter++;
                rightptr++;
            }
        }
        return result;
    }
}
