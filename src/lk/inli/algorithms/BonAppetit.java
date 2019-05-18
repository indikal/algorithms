package lk.inli.algorithms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BonAppetit {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = bill.stream().mapToInt(Integer::intValue).sum();
        sum = (sum - bill.get(k).intValue()) / 2;

        if (sum == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - sum);
        }
    }

    public static void main(String[] args) throws IOException {
        BonAppetit.bonAppetit(new ArrayList<Integer>() {{add(3);add(10);add(2);add(9);}}, 1, 12);
        BonAppetit.bonAppetit(new ArrayList<Integer>() {{add(3);add(10);add(2);add(9);}}, 1, 7);
    }
}
