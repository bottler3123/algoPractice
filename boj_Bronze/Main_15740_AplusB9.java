package algo;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_15740_AplusB9 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		BigInteger num_A = new BigInteger(A);
		BigInteger num_B = new BigInteger(B);
		System.out.println(num_A.add(num_B));
	}
}
