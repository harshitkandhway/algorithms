package sort;

public class BubbleSort {
    public static double[] bubbleSort(double[] input) {
        //long startTime = System.nanoTime();
        double temp;
        boolean swapped = false;
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1 - i; j++) {
                if (input[j] > input[j + 1]) {
                    temp = input[j + 1];
                    input[j + 1] = input[j];
                    input[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        //long endTime = System.nanoTime();
        //RunningTimeCalculation.printTimeToExecute(startTime,endTime);
        return input;
    }
}
