package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Anagrams {
    public static void main(String[] args) {
        String originalValue;
        String[] input =  new String[]{"cat","april","eat","tac","tea","made"};

        Arrays.sort(input);// nlogn
        Set<String> anagrams;
        Map<String, Set<String>> table = new HashMap<>();
        for (String temp : input) {//n
            originalValue = temp;
            //System.out.println("original value : "+temp);
            char[] tmp = temp.toCharArray();
            Arrays.sort(tmp);//nlogn
            temp = new String(tmp);
            //System.out.println("sorted value : "+temp);
            if(table.containsKey(temp))
            {
                anagrams = table.get(temp);
                anagrams.add(originalValue);
            }
            else{
                anagrams = new HashSet<>();
                anagrams.add(originalValue);
            }
            table.put(temp,anagrams);
        }
        ArrayList<String> result = new ArrayList<>();
        for (String key:table.keySet()) {//n
            result.addAll(table.get(key));
        }
        System.out.println("table -> "+ result);
    }
}
//n2logn


