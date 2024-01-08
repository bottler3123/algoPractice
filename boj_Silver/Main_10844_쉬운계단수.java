package algo0408;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10844_쉬운계단수 {
	// boj Silver1
	
	static int N;
	static Long[][] dp;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		dp = new Long[N+1][10];
		
		for (int i = 0; i < 10; i++) {
			dp[1][i] = 1L;
		}
		
		long result = 0;
		
		for (int i = 1; i < 10; i++) {
			result += step(N,i);
		}
		
		System.out.println(result % 1000000000);
	}

	private static long step(int digit, int val) {
		
		if (digit == 1) {
			return dp[digit][val];
		}
		
		if (dp[digit][val] == null) {
			if (val == 0) {
				dp[digit][val] = step(digit - 1, 1);
			} else if (val == 9) {
				dp[digit][val] = step(digit -1, 8);
			} else {
				dp[digit][val] = step(digit -1, val -1) + step(digit - 1, val + 1);
			}
		}
		
		return dp[digit][val] % 1000000000;
	}
}
