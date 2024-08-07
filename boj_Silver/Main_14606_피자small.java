package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_14606_피자small {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[11];
        dp[2] = 1;
        
        for (int i = 3; i <= n; i++) {
            dp[i] = i-1 + dp[i-1];
        }
        
        System.out.print(dp[n]);
	}
}
