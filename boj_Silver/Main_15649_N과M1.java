package practice;

import java.util.Scanner;

public class Main_15649_N과M1 {
	// boj Silver3
	
	static int N,M;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		int [] arr = new int [M];
		boolean [] check = new boolean [N];
		
		dfs(arr,check,0);
	}

	private static void dfs(int[] arr, boolean[] check, int dep) {
		if (dep == M) {
			for (int ans : arr) {
				System.out.print(ans + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if (!check[i]) {
				arr[dep] = i+1;
				check[i] = true;
				dfs(arr, check, dep+1);
				check[i] = false;
			}
		}
	}
}
