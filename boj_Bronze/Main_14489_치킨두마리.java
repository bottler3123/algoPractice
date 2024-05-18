package algo;

import java.util.Scanner;

public class Main_14489_치킨두마리 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		
		if (A + B >= (C*2)) {
			System.out.println(A + B - (C*2));
		} else {
			System.out.println(A + B);
		}
	}
}
