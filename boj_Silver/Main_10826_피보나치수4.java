package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main_10826_피보나치수4 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		BigInteger[] dp = new BigInteger [10001];
		dp[0] = new BigInteger("0");
		dp[1] = new BigInteger("1");
		
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i-1].add(dp[i-2]);
		}
		
		System.out.println(dp[n]);
	}
}
