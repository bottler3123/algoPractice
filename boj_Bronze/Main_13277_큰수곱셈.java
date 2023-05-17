package algo0408;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_13277_큰수곱셈 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		
		System.out.println(n.multiply(m));
	}
}
