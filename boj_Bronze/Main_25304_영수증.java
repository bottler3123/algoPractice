package algo0408;

import java.util.Scanner;

public class Main_25304_영수증 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int result = 0;
		for (int i = 0; i < N; i++) {
			int item = sc.nextInt();
			int cnt = sc.nextInt();
			result += item * cnt;
		}
		
		if (result == X) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
