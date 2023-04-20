package algo0408;

import java.util.*;
import java.io.*;

public class Main_1182_부분수열의합 {
	// boj Silver2
	static int N,S,result;
	static int [] arr;
	
	public static void main(String [] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		arr = new int [N];
		result = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i <= N; i++) {
			comb(0,0,i,0);			
		}
		System.out.println(result);
	}
	
	private static void comb(int cnt, int num,int choice, int sum) {
//		System.out.println("돌아라 : " + sum);
	if (cnt == choice) {
		if (sum == S) {
			result++;
			return;
		}
	}
		
		for (int i = num; i < N; i++) {
			comb(cnt+1,i+1,choice,sum+arr[i]);
		}
	}
}
