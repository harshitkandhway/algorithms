package algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class SortArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 5, 2, 4));
        mySort(arr);
        arr.forEach(System.out::print);
    }

    private static void mySort(List<Integer> arr) {
        if (arr.size() <= 1)
            return;
        int temp = arr.remove(arr.size() - 1);
        mySort(arr);
        myInsert(arr, temp);
    }

    private static void myInsert(List<Integer> arr, int temp) {
        if (arr.isEmpty() || arr.get(arr.size() - 1) <= temp) {
            arr.add(temp);
            return;
        }
        int last = arr.remove(arr.size() - 1);
        myInsert(arr, temp);
        arr.add(last);
    }


}
