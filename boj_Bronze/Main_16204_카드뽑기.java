package algo;

import java.util.Scanner;

public class Main_16204_카드뽑기 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
		int result = 0;
		if (M > K) {
			result += K + (N - M);
		} else if (M < K) {
			result += M + (N - K);
		} else {
			result = N;
		}
		
		System.out.println(result);
	}
}
