package algo;

import java.util.Scanner;

public class Main_9461_파도반수열 {
	// boj Silver3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		long[] arr = new long[101];
		arr[1] = 1;
		arr[2] = 1;
		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			for (int i = 1; i <= N; i++) {
				if (arr[i] == 0) {
					arr[i] = arr[i-2] + arr[i-3];
				}
			}
			System.out.println(arr[N]);
		}
	}
}
