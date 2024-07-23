package algo;

import java.io.*;
import java.util.*;

public class Main_10819_차이를최대로 {
	// boj Silver2
	
	static int N, result;
	static int [] arr;
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		result = 0;
		
		perm(0);
		System.out.println(result);
	}

	private static void perm(int i) {
		if (i == N) {
			if (sumarray() > result) {
				result = sumarray();
			}
			return;
		}
		
		for (int j = i; j < N; j++) {
			swap(i,j);
			perm(i+1);
			swap(i,j);
		}
		
		
	}
	
	private static int sumarray() {
		int numadd = 0;
		for (int i = 0; i < N-1; i++) {
			numadd += Math.abs(arr[i] - arr[i+1]);
		}
		return numadd;
	}
	// 배열의 차이를 구해주는 매서드
	
	private static void swap(int x, int y) {
		int temp = arr[y];
		arr[y] = arr[x];
		arr[x] = temp;
	}
	// 배열 위치 스왑
}
