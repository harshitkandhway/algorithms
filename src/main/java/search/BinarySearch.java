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

    //Apoorva's code
    public static int binarySearch2(double[] input,
                                    double toBeSearched) {
       //2,4,5,6,9   6
        int leftPtr = 0;
        int rightPtr = input.length;
        while(leftPtr<=rightPtr) {
            int mid = (leftPtr + rightPtr) / 2;
            if (input[mid] == toBeSearched)
                return mid;
            else {
                if (input[mid] > toBeSearched) {
                    rightPtr = mid - 1;
                } else
                    leftPtr = mid + 1;
            }
        }
        return -1;
    }
}
//1) 1,2,3,4,5,6,7,8 | 2
//2) 1,2,3,4,5 | 2
//3) 1,2,3 | 2

