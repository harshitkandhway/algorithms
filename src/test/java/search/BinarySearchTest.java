package search;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void binarySearch2() {
        double[] input = {2,4,6,8,9};
        int output = BinarySearch.binarySearch2(input,8);
        Assertions.assertThat(output).isEqualTo(3);
    }
}