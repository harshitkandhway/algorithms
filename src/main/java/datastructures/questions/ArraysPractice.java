package datastructures.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ArraysPractice {
    public static void main(String[] args) {
        String str = "Tact Coa";
        str = str.toLowerCase().replaceAll(" ","");//TactCoa
        System.out.println(str+"    - not updated");
        char[] str2 = str.toCharArray();
        Arrays.sort(str2);
        System.out.println(str2);

        HashMap<Character,Integer> count = new HashMap<>();

        int presentValue;
        for (int i = 0; i < str2.length; i++) {
            char temp = str2[i];
            if(count.containsKey(temp))
            {
                presentValue = count.get(temp);
                count.put(temp,presentValue+1);
            }
            else{
                count.put(temp,1);
            }
        }
        System.out.println(count);
        int oddCounter=0;
        for (int eachValue: count.values()){
            if(eachValue%2!=0)
                oddCounter++;
        }

        if(oddCounter>1)
            System.out.println("False");
        else
            System.out.println("true");

    }
}

