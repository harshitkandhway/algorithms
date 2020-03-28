package sort;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {
    @Test
    public void selectionSort_worst_case(){
        double[] input = {5, 4, 3, 2, 1};
        double[] output = SelectionSort.selectionSort(input);
        Assertions.assertThat(output).isEqualTo(new double[]{1.0, 2.0, 3.0,
                4.0, 5.0});
    }
}