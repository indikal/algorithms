package lk.inli.algorithms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrintStairCaseOfChars {

	public static void main(String[] args) {
		staircase(200);
	}

	static void staircase(int n) {
        final char STAIRS_CHAR = '#';
        char[] arrChar = new char[n];
    	Arrays.fill(arrChar, 0, arrChar.length, ' ');
        
        IntStream.range(0, n)
            .forEach(x -> {
            	//System.out.print(x + ": ");
            	Arrays.fill(arrChar, arrChar.length-x-1, arrChar.length, STAIRS_CHAR);
            	System.out.println(arrChar);
            });

    }
}
