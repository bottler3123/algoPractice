package solvedacGrandArena1;

import java.io.*;
import java.util.*;

public class Main_H번_행렬연산행렬계산하기 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		int arr [][] = new int [N+1][M+1];
		for (int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			int q = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			if (q == 1) {
				for (int j = 1; j < M+1; j++) {
					arr[num][j] += v;
				}
			} else if (q == 2){
				for (int j = 1; j < N+1; j++) {
					arr[j][num] += v;
				}
			}
		}
		
		for (int i = 1; i < N+1; i++) {
			for (int j = 1; j < M+1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
