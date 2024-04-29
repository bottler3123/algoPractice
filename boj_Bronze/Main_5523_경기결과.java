package algo;

import java.util.Scanner;

public class Main_5523_경기결과 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x > y) {
				a++;
			} else if (y > x) {
				b++;
			}
		}
		
		System.out.println(a + " " + b);
	}
}
