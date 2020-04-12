package datastructures.questions;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {
        String str1 = "Pale";
        String str2 = "Pal";
        method(str1);
    }
public static void method2(){
        String s = "highlow";
        String t = "lowhigh";
        int count=0;
        while(!s.equals(t)){
            t = t.substring(1)+t.charAt(0); //lowhighowhighl
            count++;
        }

}

    private static void method(String str1) {
        str1 = "aabcccccaaa";
        int count =1;
        String result="";
        for (int i = 0; i < str1.length()-1; i++) {
            if(str1.charAt(i)==str1.charAt(i+1))
                count++;
            else
            {
                result+=str1.charAt(i)+""+count;
                count=1;
            }

        }
        if(str1.charAt(str1.length()-1)==str1.charAt(str1.length()-2)){
            result+=str1.charAt(str1.length()-1)+""+count;
        }
        System.out.println(result);

// str1 = ccb accc
// str2 = cbcb

//        int max = str1.length();
//        if(str2.length()>max){
//            max = str2.length();
//        }
//
//        int count=0;
//        for (int i = 0;i<max; i++) {
//            if(str1.charAt(i)!=str2.charAt(i)){
//                count++;
//            }
//        }
//        if(count>1)
//            System.out.println("false");




    }


}
