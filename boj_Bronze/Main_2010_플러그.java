package algo;

import java.util.Scanner;

public class Main_2010_플러그 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int result = 0;
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			result += num;
		}
		result = result - N + 1;
		System.out.println(result);
	}
}
