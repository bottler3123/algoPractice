package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_9656_돌게임2 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] dp = new String[N+1];
		
		if (N >= 1) {
			dp[1] = "CY";
		}
		if (N >= 2) {
			dp[2] = "SK";
		}
		if (N >= 3) {
			dp[3] = "CY";
		}
		
		if (N >= 4) {
			for (int i = 4; i < N+1; i++) {
				if (dp[i-1] == "CY") {
					dp[i] = "SK";
				} else {
					dp[i] = "CY";
				}
			}
		}
		
		System.out.println(dp[N]);
	}
}
