package algo;

import java.util.Scanner;

public class Main_30007_라면공식 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int X = sc.nextInt();
			System.out.println(A * (X - 1) + B);
		}
	}
}
