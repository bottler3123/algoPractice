package algo0408;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1904_01타일 {
	// boj Silver3
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] dp = new long[N + 1];
		
		
		if (N == 1) {
			System.out.println(1);
		} else if (N == 2) {
			System.out.println(2);
		} else {
			dp[1] = 1;
			dp[2] = 2;
			for (int i = 3; i < N + 1; i++) {
				dp[i] = (dp[i - 2] + dp[i - 1]) % 15746;
			}						
			System.out.println(dp[N]);
		}
	}
}
