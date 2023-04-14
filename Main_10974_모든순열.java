package algo;

import java.util.*;
import java.io.*;

public class Main_10974_모든순열 {

	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int arr[] = new int [N];
		boolean check [] = new boolean [N];
		
		comp(N,arr,check,0);
	}
	
	private static void comp(int N, int arr [], boolean [] check, int cnt) {
		if (cnt == N) {
			for (int i = 0; i < N; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if (check[i]) continue;
			arr[cnt] = i+1;
			check[i] = true;
			comp(N,arr,check,cnt+1);
			check[i] = false;
		}
	}
}
