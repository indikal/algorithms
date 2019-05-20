package lk.inli.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MagicSquare {

	private static List<Integer> nosNotUsed = null;
	private static int M;
	
	public static void main(String[] args) {
		formingMagicSquare(new int[][] {{4, 8, 2}, {4, 5, 7}, {6, 1, 6}});

	}

	static int formingMagicSquare(int[][] s) {
        M = s[0].length * (s[0].length * s[0].length + 1) / 2; //Magic constant
        List<Integer> nosUsed = new ArrayList<>();
        nosNotUsed = IntStream.range(1, 10)
        								.boxed()
        								.collect(Collectors.toList());
        
        for (int i=0; i<3; i++) {
        	for (int j=0; j<3; j++) {
        		if (!nosUsed.contains(s[i][j])) {
        			nosUsed.add(s[i][j]);
        			nosNotUsed.remove(Integer.valueOf(s[i][j]));
        		}
        	}
        }
        
        nosUsed.stream().forEach(System.out::println);
        System.out.println("----------------------------------");
        nosNotUsed.stream().forEach(System.out::println);
           
        if (checkAgainsMagicNo(s[0])) {
        	//check vertically
        	
        } else {
        	//fix the problem values
        	
        }
        
        int M_row1 = Arrays.stream(s[0]).reduce(0, Integer::sum);
        int M_row2 = Arrays.stream(s[1]).reduce(0, Integer::sum);
        int M_row3 = Arrays.stream(s[2]).reduce(0, Integer::sum);
        
        int M_col1 = Arrays.stream(new int[]{s[0][0], s[1][0], s[2][0]}).reduce(0, Integer::sum);
        int M_col2 = Arrays.stream(new int[]{s[0][1], s[1][1], s[2][1]}).reduce(0, Integer::sum);
        int M_col3 = Arrays.stream(new int[]{s[0][2], s[1][2], s[2][2]}).reduce(0, Integer::sum);
        
        int M_diaL2R = Arrays.stream(new int[]{s[0][0], s[1][1], s[2][2]}).reduce(0, Integer::sum);
        int M_diaR2L = Arrays.stream(new int[]{s[0][2], s[1][1], s[2][0]}).reduce(0, Integer::sum);
        
        
        return 0;
    }
	
	private static boolean checkAgainsMagicNo(int[] arr) {
		int M_row = Arrays.stream(arr).reduce(0, Integer::sum);
		
		return M_row == M;
	}
	
	private static boolean fixSingleLine(int[] arr) {
		int M_row = Arrays.stream(arr).reduce(0, Integer::sum);
		int diff = Math.abs(M - M_row);
		
		//if duplicate is there definitely one must go
		if (arr[0] == arr[1]) {
			int tmp = arr[0];
			arr[0] = nosNotUsed.get(0);
			nosNotUsed.remove(0);
			nosNotUsed.add(tmp);
		}
		
		return M_row == M;
	}
	
	private static int[] replaceDuplicate(int[] arr) {
		if (arr[0] == arr[1]) {
			int tmp = arr[0];
			arr[0] = nosNotUsed.get(0);
			nosNotUsed.remove(0);
			nosNotUsed.add(tmp);
		}
		
		return arr;
	}

	// Complete the formingMagicSquare function below.
	static int formingMagicSquare2(int[][] s) {
		int totalCost = 0;

		int M = s.length * (s.length * s.length + 1) / 2; //Magic constant

		if (s[1][1] != 5) {
			totalCost = Math.abs(s[1][1] - 5);
			s[1][1] = 5;
		}

		for (int i=0; i<s.length; i++) {
			int M_row_i = Arrays.stream(s[i]).reduce(0, Integer::sum);

			if (M_row_i != M) {
				//if (s[i][0] == 5)
			}
		}

		return -1;
	}
}
