package sort;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void should_run_in_worst_case_time_complexity() {
        //for each comparision swapping is done.(O(n^2))
        double[] input = {5.0,4,3,2,1};
        double[] output = BubbleSort.bubbleSort(input);
        Assertions.assertThat(output).isEqualTo(new double[]{1.0,2.0,3.0,4.0,5.0});
    }
    @Test
    public void should_run_in_average_case_time_complexity() {
        double[] input = {1,2,6,3.5,4.2,5.2};
        double[] output = BubbleSort.bubbleSort(input);
        Assertions.assertThat(output).isEqualTo(new double[]{1.0,2.0,3.5,4.2,5.2,6});
    }

    @Test
    public void should_run_in_best_case_time_complexity() {
        //when already sorted
        double[] input = {1,2,3,4.0,4.2,5.2};
        double[] output = BubbleSort.bubbleSort(input);
        Assertions.assertThat(output).isEqualTo(new double[]{1.0,2.0,3.0,4.0,4.2,5.2});
    }
}