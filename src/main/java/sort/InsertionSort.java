package sort;
/*
    12,11,3,4,22
    KEY = 11->3->4->22
   3, 11,12,4,22 , KEY=4 (indexKey = 3, temp=(indexKey-1) = 2)
   3, 11,11,12,22
   while(array[temp]>key){
   array[temp+1]=array[temp];
   temp--;
   }
   array[temp+1] = KEY;
   3,11,12,12,22
   3,11,11,12,22
   3,4,11,12,22


    34,11,12,4,22
    34,11,12,12,22
    34,11,11,12,22
    34,34,11,12,22

 */
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
