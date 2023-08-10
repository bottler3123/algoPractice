package algo0408;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2579_계단오르기 {
	// boj Silver3
	
	static int [] arr;
	static Integer [] dp;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int [N+1];
		dp = new Integer [N+1];
		for (int i = 1; i < N+1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = arr[0];
		dp[1] = arr[1];
		if (N >= 2) {
			dp[2] = arr[1] + arr[2];			
		}
		
		System.out.println(step(N));
	}
	
	private static int step(int num) {
		

			if (dp[num] == null) {
				dp[num] = Math.max(step(num-2), step(num-3) + arr[num - 1]) + arr[num];
			}
		
		
		return dp[num];
	}

}
