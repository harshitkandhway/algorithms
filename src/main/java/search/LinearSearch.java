package search;

public class LinearSearch {
    //arr={2,4,8,1,6},7
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
