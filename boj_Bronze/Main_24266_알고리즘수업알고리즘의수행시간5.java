package algo;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_24266_알고리즘수업알고리즘의수행시간5 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		BigInteger result = new BigInteger(str);
		result = result.multiply(result).multiply(result);
		System.out.println(result);
		System.out.println(3);
	}
}
