package search;

public class BinarySearch {
    public static int binarySearch(double[] input, int leftPtr, int rightPtr,
                                   double toBeSearched) {
        int mid;
        while (leftPtr <= rightPtr) {
            mid = (leftPtr + rightPtr) / 2;
            if (input[mid] == toBeSearched)
                return mid;
            else {
                if (input[mid] > toBeSearched) {
                    return binarySearch(input, leftPtr, mid - 1, toBeSearched);
                } else
                    return binarySearch(input, mid + 1, rightPtr, toBeSearched);
            }
        }
        return -1;
    }
}
