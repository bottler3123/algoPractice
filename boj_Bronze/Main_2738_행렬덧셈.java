package algo0408;

import java.util.*;
import java.io.*;

public class Main_2738_행렬덧셈 {
	// boj Bronze5
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int [][] arr = new int [N][M];
		int [][] arr2 = new int [N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr2[i][j] = Integer.parseInt(st.nextToken());
				if (j == M-1) {
					System.out.print(arr[i][j]+arr2[i][j]);
				} else {
					System.out.print(arr[i][j]+arr2[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}
