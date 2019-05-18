package lk.inli.algorithms;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> colorMap = new HashMap<>();

        for (int color : ar) {
            if (colorMap.containsKey(color)) {
                colorMap.put(color, (colorMap.get(color) + 1));
            } else {
                colorMap.put(color, 1);
            }
        }

        int totalPairs = 0;
        for (int color : colorMap.keySet()) {
            totalPairs += colorMap.get(color) / 2;
        }

        return totalPairs;
    }

    public static void main(String[] args) {
        System.out.println( SockMerchant.sockMerchant(7, new int[]{1,2,1,2,1,3,2}) );
        System.out.println( SockMerchant.sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}) );
    }
}
