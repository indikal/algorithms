package lk.inli.algorithms;

import java.util.Arrays;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long min = 0, max=0;

        for (int i=0; i < arr.length; i++) {
            if (i > 0) {
                max += arr[i];
            }

            if (i < (arr.length-1)) {
                min += arr[i];
            }
        }

        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        int[] arr = new int[5];

        MiniMaxSum obj = new MiniMaxSum();
        obj.miniMaxSum(new int[]{1, 2, 3, 4, 5});
        obj.miniMaxSum(new int[]{1, 3, 5, 7, 9});
    }
}
