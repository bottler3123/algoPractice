package algo0408;

import java.util.Scanner;

public class Main_1500_최대곱 {
	// boj Silver2
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int K = sc.nextInt();
		
		int div = S / K;
		int mod = S % K;
		
		long result = 1;
		
		for (int i = 1; i <= K; i++) {
			if (i <= mod) {
				result *= div + 1;
			} else {
				result *= div;
			}
		}
		
		System.out.println(result);
	}
}
