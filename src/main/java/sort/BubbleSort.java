package sort;

/*
4,2,8,5,7,  i=0  , j=0 // A<b<C<D 12,
i=0;
j=0 => 2,4,8 , 5, 7
j=1 => 2,4,8,5,7
j=2 => 2,4,5,8,7
j-3=> 2,4,5,7,8
i = 1
J=0 => 2,4,5,7,8 , SWAPPED =FALSE ;

 */




public class BubbleSort {
    public static double[] bubbleSort(double[] input) {
        //long startTime = System.nanoTime();
        double temp;

        for (int i = 0; i < input.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < input.length - 1 - i; j++) {
                if (input[j] > input[j + 1]) {
                    temp = input[j + 1];
                    input[j + 1] = input[j];
                    input[j] = temp;
                    swapped = true;
                }
                if (!swapped)
                break;
            }
        }
        //long endTime = System.nanoTime();
        //RunningTimeCalculation.printTimeToExecute(startTime,endTime);
        return input;
    }
}
