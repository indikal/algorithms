package lk.inli.algorithms;

import java.util.stream.Stream;

public class CountPattern {

	public static void main(String[] args) {
		CountPattern p = new CountPattern();
		
		String subPattern = "AABBABA";
		System.out.println("No of chars: " + p.searchPattern(subPattern, 7, 7, 'A'));
		System.out.println("No of chars: " + p.searchPattern(subPattern, 7, 8, 'A'));
		System.out.println("No of chars: " + p.searchPattern(subPattern, 8, 8, 'A'));
		System.out.println("No of chars: " + p.searchPattern(subPattern, 6, 12, 'A'));
		System.out.println("No of chars: " + p.searchPattern(subPattern, 6, 16, 'A'));
		System.out.println("No of chars: " + p.searchPattern(subPattern, 6, 1000, 'A'));
	}

	/* 
	 * Given a repeting pattern find the no of cearch charactor with in the start and end
	 * 
	 */
	private int searchPattern(String pattern, int start, int end, char c) {
		//AABBABA|AABBABA|AABBABA|AABBABA|AABBABA......
		System.out.println("----------------------------------------------------------------");
		System.out.println("Patter: " + pattern + ", start: " + start + ", end: " + end + ", char: " + c);
		if (start <= 0) {
			System.out.println("Start index must be positive nune zero number");
			throw new NumberFormatException();
		}
		//make sure 'start' always come first
		if (start > end) {
			int tmp = start;
			start = end;
			end = start;
		}
		
		int startWithInPattern = start % pattern.length();
		int endWithInPattern = end % pattern.length();
		
		int startIndex = (startWithInPattern == 0) ? 6 : startWithInPattern - 1;
		int endIndex = (endWithInPattern == 0) ? 6 : endWithInPattern - 1;
		
		System.out.println("Pattern start index: " + startIndex + ", Pattern end index: " + endIndex);
		
		if (start == end || (start/pattern.length() == end/pattern.length() && start % pattern.length() > 0)) {
			return CountPattern.countChars(pattern.substring(startIndex, endIndex + 1), c);
		}
		
		int charsFromStartIndexToEndOfPattern = CountPattern.countChars(pattern.substring(startIndex), c);
		int charsFromStartOfPatternToEndIndex = CountPattern.countChars(pattern.substring(0, endIndex + 1), c);
		
		int totalPattenLength = (end - start) + 1;
		totalPattenLength = totalPattenLength - pattern.substring(startIndex).length();
		totalPattenLength = totalPattenLength - pattern.substring(0, endIndex).length();
		
		int noOfPatternRepeats = totalPattenLength / pattern.length();
		int charsInOneCompletePattern = (noOfPatternRepeats > 0) ? CountPattern.countChars(pattern, c) : 0;
		System.out.println("No of patterns " + pattern + " repeats: " + noOfPatternRepeats);
		
		return ((charsFromStartIndexToEndOfPattern + charsFromStartOfPatternToEndIndex) + (charsInOneCompletePattern * noOfPatternRepeats));
	}
	
	private static int countChars(String subPattern, char c) {
		int charCount = 0;
		
		for (int i=0; i<subPattern.length(); i++) {
			if (subPattern.charAt(i) == c) {
				charCount++;
			}
		}
		System.out.println("Chars in sub-pattern " + subPattern + ": " + charCount);
		return charCount;
	}
}
