package lk.inli.algorithms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
This is a demo task.

Write a function:

    class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].
*/

public class RakutenCodilityDemoTest2 {

    public int solution(int[] A) {
        List<Integer> list = IntStream.rangeClosed(1,1000000).boxed().collect(Collectors.toList());
        List<Integer> B = Arrays.stream(A)
                .parallel()
                .distinct()
                .filter(a -> a > 0)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        Optional<Integer> min = list.stream()
                .parallel()
                .filter(i -> !B.contains(i))
                .findFirst();

        return min.get();

    }

    public static void main(String[] args) {
        RakutenCodilityDemoTest2 obj = new RakutenCodilityDemoTest2();

        System.out.println(obj.solution(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(obj.solution(new int[]{1, 2, 3}));
        System.out.println(obj.solution(new int[]{-1, -3}));
        long start = System.currentTimeMillis();
        System.out.println(obj.solution(IntStream.rangeClosed(-10000, 10000).toArray()));
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(IntStream.rangeClosed(-200, 200).boxed().collect(Collectors.toList()));
    }
}
