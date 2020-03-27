package sort;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class InsertionSortTest {

    @Test
    public void worst_case_time_complexity_for_insertionSort() {
        //O(n^2)
        double[] input = {5, 4, 3, 2, 1};
        double[] output = InsertionSort.insertionSort(input);
        Assertions.assertThat(output).isEqualTo(new double[]{1.0, 2.0, 3.0,
                4.0, 5.0});
    }

    @Test
    public void best_case_time_complexity_for_insertionSort() {
        //O(n)
        double[] input = {1, 2, 3, 3.7, 5};
        double[] output = InsertionSort.insertionSort(input);
        Assertions.assertThat(output).isEqualTo(new double[]{1.0, 2.0, 3.0, 3.7, 5.0});
    }
}