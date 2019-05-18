package lk.inli.algorithms;

import java.util.Arrays;

public class BirthdayCakeCandles {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        Arrays.sort(ar);
        int noCandles = 0;

        if (ar.length > 0) {
            noCandles = 1;

            for (int i = (ar.length - 2); i >= 0; i--) {
                if (ar[i] == ar[ar.length - 1]) {
                    noCandles ++;
                }
            }
        }

        return noCandles;
    }

    public static void main(String[] args) {
        BirthdayCakeCandles obj = new BirthdayCakeCandles();
        System.out.println(obj.birthdayCakeCandles(new int[]{4, 4, 1, 3}));
        System.out.println(obj.birthdayCakeCandles(new int[]{3, 2, 1, 3}));
    }
}
