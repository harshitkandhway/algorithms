package datastructures.stack.hackerrank;

import org.assertj.core.util.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CamelCaseWordDetection {

    public static int camelcase(String s) {
        long count = IntStream.range(0, s.length()).map(s::charAt).filter(c -> c>='A' && c<='Z').count();
        return (int)count+1;
    }

    public static void main(String[] args) {
//        List<String> list = List.of("a","b","c");
//        list.add("d");
//        System.out.println(list);
//        list.forEach(System.out::println);

        Stream.of(1,2,3,4,5).filter(x-> {
            System.out.println("filtering "+ x);
            return x%2==0;
        }).findFirst();
    }

    public static void minimumBribes(List<Integer> q) {
        int minBribes = 0;
        for (int i = 0; i < q.size(); i++) {
            if (q.get(i) - 2 > i + 1) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = i - 1; j >= q.get(i) - 2 && j >= 0; j--) {
                if (q.get(j) > q.get(i)) minBribes++;
            }
        }
        System.out.println(minBribes);
    }
}

