package lk.inli.algorithms;

public class Binarian {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int binarianVal = this.binarian(A);

        int val = 0;
        int sqrt = (int) Math.sqrt(binarianVal);
        System.out.println("sqrt: " + sqrt);
        val += (int) Math.pow(2, sqrt);
        int count = 1;
        System.out.println("Val: " + val);

        int remainder = binarianVal - val;
        System.out.println("Remainder " + remainder);


        while (remainder > 1) {
            System.out.println(remainder);
            sqrt = (int) Math.sqrt(remainder);

            val += (int) Math.pow(2, sqrt);
            System.out.println("Val: " + val);

            remainder = binarianVal - val;
            System.out.println("Remainder " + remainder);
            count ++;
        }

        System.out.println("Count: " + count);
        return count+1;
    }

    private int binarian(int[] A) {
        int val = 0;
        for (int a : A) {
            val += (int) Math.pow(2, a);
        }

        System.out.println("binarian val: " + val);
        return val;
    }

    public static void main(String[] args) {
        Binarian binarian = new Binarian();
        System.out.println(binarian.solution(new int[]{1,0,2,0,0,2}));
    }
}
