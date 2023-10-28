package algo0408;

import java.util.Scanner;

public class Main_1629_곱셈 {
	// boj Silver1
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		int C = sc.nextInt();
		
		long result = multi(A,B,C);
		System.out.println(result);
	}

	private static long multi(long a, long b, int c) {
		if (b == 1) {
			return a % c;
		} else {
			long x = multi(a, b/2, c);
			if (b % 2 == 0) {
				return (x * x) % c;
			} else {
				return (x * x % c) * a % c;
			}			
		}
	}
}
