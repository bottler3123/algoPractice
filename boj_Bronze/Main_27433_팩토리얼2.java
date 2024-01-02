package algo0408;

import java.util.Scanner;

public class Main_27433_팩토리얼2 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		
		System.out.print(facto(N));
	}

	private static long facto(long n) {
		if (n == 0) {
			return 1;
		} else {
			return facto(n-1) * n;
		}
	}
}
