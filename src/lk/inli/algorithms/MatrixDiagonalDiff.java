package lk.inli.algorithms;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MatrixDiagonalDiff {

	public static void main(String[] args) {
		int[][] matrix = {{11,2,4}, {4,5,6}, {10,8,-12}};
		System.out.println("Diagonal diff: " + diagonalDifference(matrix));
	}

	static int diagonalDifference(int[][] arr) {
        int sumLeftDiagonal = 0;
        int sumRightDiagonal = 0;
        int i = 0, j = 2;
        
        /*for (int[] line : arr) {
        	sumLeftDiagonal += line[i];
        	i++;
        	sumRightDiagonal += line[j];
        	j--;
        }*/
        
        sumLeftDiagonal = IntStream.range(0, arr.length).parallel()
        		.map(x -> arr[x][x])
        		.reduce(0, Integer::sum);
        
        sumRightDiagonal = IntStream.range(0, arr.length).parallel()
        		.map(y -> arr[(arr.length - 1) - y][y])
        		.reduce(0, Integer::sum);

        return Math.abs(sumLeftDiagonal - sumRightDiagonal); 
    }
}
