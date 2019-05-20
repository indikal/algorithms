package lk.inli.algorithms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SmallestPositiveInteger {

    public int solution(int[] A) {

        /*ArrayList<Integer> _array = new ArrayList<Integer>();
        for (int a : A) {
            if (a > 0) {
                _array.add(a);
            }
        }*/

        /*LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        for (int a : A) {
            if (a > 0) {
                hashSet.add(a);
            }
        }*/

        List<Integer> array = Arrays.stream(A)
                .parallel()
                .filter(a -> a > 0)
                .sorted()
                .boxed()
                .collect(Collectors.toList());// new ArrayList<>(hashSet);

        if (array.isEmpty()) {
            System.out.println("Collection is empty");
            return 1;
        }

        //array.sort(Comparator.naturalOrder());
        System.out.println(array);

        int index = 0;
        for (Integer a : array) {
            System.out.println("Element " + index + " is " + a);

            if (a > 1 && index == 0) {
                System.out.println("1st element is above 1");
                return 1;
            } else if (index == (array.size() - 1)) {
                System.out.println("End of collection. Returning one above last element, " + array.get(index));
                return array.get(index) + 1;
            } else if ((a+1) < array.get(index + 1)) {
                System.out.println("Element + 1 is less than next element. Index = " + index);
                return a + 1;
            } else {
                index ++;
            }
        }

        return array.get(array.size()-1)+1;
    }

    public static void main(String[] args) {
        SmallestPositiveInteger spi = new SmallestPositiveInteger();
        System.out.println(spi.solution(new int[]{1, 2, 3, 4}));
        System.out.println();
        System.out.println(spi.solution(new int[]{-1, 2, 3, 4}));
        System.out.println();
        System.out.println(spi.solution(new int[]{-1}));
        System.out.println();
        System.out.println(spi.solution(new int[]{1}));
        System.out.println();
        System.out.println(spi.solution(new int[]{2}));
        System.out.println();
        System.out.println(spi.solution(new int[]{1, 3, 6, 4, 1, 2}));

    }
}
