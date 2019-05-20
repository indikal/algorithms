package lk.inli.algorithms;

import java.util.Arrays;

public class ElectronicsShop {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Arrays.parallelSort(keyboards);
        Arrays.parallelSort(drives);

        int totalSpent = -1;
        for (int kbprice : keyboards) {
            for (int usbprice : drives) {
                int tempTotal = kbprice + usbprice;

                if (tempTotal > b) {
                    System.out.println("Spent amount above budget");
                    break;
                }

                if (totalSpent < tempTotal && tempTotal <= b) {
                    totalSpent = kbprice + usbprice;
                }
            }
        }

        return totalSpent;
    }

    public static void main(String[] args) {
        System.out.println(getMoneySpent(new int[]{40,50,60}, new int[]{5,8,12}, 60));
        System.out.println(getMoneySpent(new int[]{3,1}, new int[]{5,2,8}, 10));
        System.out.println(getMoneySpent(new int[]{4}, new int[]{5}, 5));
    }
}
