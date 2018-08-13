package lk.inli.algorithms;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {
		long[] input1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.println("Sum of " + input1 + ": " + aVeryBigSum(input1));
	}

	static long aVeryBigSum(long[] ar) {
		long t1 = System.currentTimeMillis();
		Long sum1 =  Arrays.stream(ar).reduce(0, Long::sum);
		System.out.println("Time for Arrays.stream: " + (System.currentTimeMillis() - t1) + " sum = " + sum1);
		
		t1 = System.currentTimeMillis();
		Long sum2 =  Arrays.stream(ar).parallel().reduce(0, Long::sum);
		System.out.println("Time for Arrays.stream.parallel: " + (System.currentTimeMillis() - t1) + " sum = " + sum2);
		
		t1 = System.currentTimeMillis();
		Long sum3 =  Arrays.stream(ar).parallel().reduce(0, (long a, long b) -> a + b);
		System.out.println("Time for Arrays.stream.parallel2: " + (System.currentTimeMillis() - t1) + " sum = " + sum3);
		
		return sum1;
    }
}
