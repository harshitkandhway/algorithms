package util;

public class RunningTimeCalculation {

    //Use startTime = System.nanoTime();
    public static void printTimeToExecute(long startTime,long endTime){
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
