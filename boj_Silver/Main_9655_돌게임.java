package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_9655_돌게임 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[] dp = new String [N+1];
		if (N >= 1) {
			dp[1] = "SK";
		}
		
		if (N >= 2) {
			dp[2] = "CY";
		}
		
		if (N >= 3) {
			dp[3] = "SK";
		}
		
		if (N >= 4) {
			for (int i = 4; i < N+1; i++) {
				if (dp[i-1].equals("SK") ) {
					dp[i] = "CY";
				} else {
					dp[i] = "SK";
				}
			}			
		}
		
		System.out.println(dp[N]);
	}
}
