package search;

public class LinearSearch {
    public static int linearSearch(double[] input, double toBeSearched) {
        int count = 0;
        for (double temp : input) {
            if (temp == toBeSearched) {
                return count;
            }
            count++;
        }
        return -1;
    }
}
