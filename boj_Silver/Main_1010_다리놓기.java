package algo0408;

import java.util.*;
import java.io.*;

public class Main_1010_다리놓기 {
	// boj Silver5
	
	static int result;
	static int [][] dp = new int [30][30];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			// 2안
//			if (N == M) {
//				result = 1;
//			} else {
//				result = facto(M) / (facto(M-N) * facto(N));
//			}
			
			// 1안
//			comb(N,M,0,0);
			
			bw.write(combination(M,N) + "\n");
			
		}
		bw.flush();
		bw.close();
	}
	
	public static int combination(int M, int N) {
	 
		if(dp[M][N] > 0) {
			return dp[M][N];
		}
	 
		// 2번 성질
		if(M == N || N == 0) {
			return dp[M][N] = 1;
		}
		// 1번 성질
		return dp[M][N] = combination(M - 1, N - 1) + combination(M - 1, N);
	}
	
	// 2안
//	public static int facto(int num) {
//		if (num == 1) {
//			return 1;
//		}
//		return num * facto(num-1);
//	}
	
	
	// 1안
//	public static void comb(int N, int M, int cnt, int num) {
//		if (cnt == N) {
//			result += 1;
//			return;
//		}
//		
//		for (int i = num; i < M; i++) {
//			comb(N, M, cnt+1, i+1);
//		}
//	}
}
