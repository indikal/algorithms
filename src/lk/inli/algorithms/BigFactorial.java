package lk.inli.algorithms;

import java.math.BigInteger;

public class BigFactorial {

	public static void main(String[] args) {
		extraLongFactorials(1);
		extraLongFactorials(2);
		extraLongFactorials(3);
		extraLongFactorials(4);
		extraLongFactorials(5);
		extraLongFactorials(6);
		extraLongFactorials(7);
		extraLongFactorials(8);
		extraLongFactorials(9);
		extraLongFactorials(30);
	}

	static void extraLongFactorials(int n) {
        BigInteger factorial = new BigInteger("" + n);
        
        for (int i=n-1; i>0; i--) {
            factorial = factorial.multiply(new BigInteger("" + i));
        }
        System.out.println("Factorial of " + n + ": " + factorial.toString());
    }
}
