package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_9625_BABBA {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		
		int[] A = new int [46];
		int[] B = new int [46];
		A[0] = 1;
		B[0] = 0;
		for (int i = 1; i <= K; i++) {
			A[i] = B[i-1];
			B[i] = A[i-1] + B[i-1];
		}
		System.out.println(A[K] + " " + B[K]);
	}
}
