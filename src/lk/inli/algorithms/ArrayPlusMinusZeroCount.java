package lk.inli.algorithms;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class ArrayPlusMinusZeroCount {

	public static void main(String[] args) {
		int[] arr = {-4,3,-9,0,4,1}; 
		plusMinus(arr);
	}

	static void plusMinus(int[] arr) {
		BigDecimal plusCount = new BigDecimal(Arrays.stream(arr)
				.filter(x -> x > 0)
				.count()).divide(new BigDecimal(arr.length), 6, RoundingMode.HALF_UP);
		BigDecimal minusCount = new BigDecimal(Arrays.stream(arr)
				.filter(x -> x < 0)
				.count()).divide(new BigDecimal(arr.length), 6, RoundingMode.HALF_UP);
		
		BigDecimal zeroCount = new BigDecimal(Arrays.stream(arr)
					.filter(x -> x == 0)
					.count()).divide(new BigDecimal(arr.length), 6, RoundingMode.HALF_UP);
		
		System.out.println(plusCount);
		System.out.println(minusCount);
		System.out.println(zeroCount);

    }
}
