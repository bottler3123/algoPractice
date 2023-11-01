package algo0408;

import java.util.Scanner;

public class Main_14652_나는행복합니다 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (cnt == K) {
					System.out.println(i + " " + j);
				}
				cnt++;
			}
		}
	}
}
