package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_14916_거스름돈 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int [100001];
		dp[1] = -1;
		dp[2] = 1;
		dp[3] = -1;
		dp[4] = 2;
		dp[5] = 1;
		
		for (int i = 6; i < n+1; i++) {
			if (dp[i-2] == -1 && dp[i-5] == -1) {
				dp[i] = -1;
				continue;
			}
			
			if (dp[i-2] < dp[i-5]) {
				if (dp[i-2] != -1) {
					dp[i] = dp[i-2] + 1;
				} else {
					if (dp[i-5] != -1) {
						dp[i] = dp[i-5] + 1;
					} else {
						dp[i] = -1;
					}
				}
			} else {
				if (dp[i-5] != -1) {
					dp[i] = dp[i-5] + 1;
				} else {
					if (dp[i-2] != -1) {
						dp[i] = dp[i-2] + 1;
					} else {
						dp[i] = -1;
					}
				}
			}
		}
		
		System.out.println(dp[n]);
	}
}
