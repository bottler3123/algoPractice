package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1015_수열정렬 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] A = new int [N];
		int[] B = new int [N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
			B[i] = A[i];
		}
		
		Arrays.sort(B);
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (A[i] == B[j]) {
					System.out.print(j + " ");
					B[j] = -1;
					break;
				}
			}
		}
		System.out.println();
		
//		for (int i = 0; i < N; i++) {
//			System.out.println(A[i] + " " + B[i] + " " + i);
//		}
	}
}
