package algo0408;

import java.util.Scanner;

public class Main_11051_이항계수2 {
	// boj Silver2
	
	static int dp [][];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		dp = new int [N+1][K+1];
		System.out.println(bino_peoi(N, K));
	}
	
	private static int bino_peoi(int n, int k) {
		if (dp[n][k] > 0) {
			return dp[n][k];
		}
		
		if (k == 0 || n == k) {
			dp[n][k] = 1;
			return dp[n][k];
		}
		
		dp[n][k] = (bino_peoi(n-1, k-1) + bino_peoi(n-1, k)) % 10007;
		return dp[n][k];
	}
}
