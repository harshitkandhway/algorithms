package sort;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuicksortTest {

    @Test
    public void quickSort() {
         int[] input = {5, 4, 3, 2, 1};
        int[] output = Quicksort.quickSort(input,0,input.length-1);
        Assertions.assertThat(output).isEqualTo(new int[]{1, 2, 3,
                4, 5});
    }
}