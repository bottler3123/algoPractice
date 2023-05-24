package algo0408;

import java.util.Scanner;

public class Main_2845_파티가끝나고난뒤 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int P = sc.nextInt();

		for (int i = 0; i < 5; i++) {
			int news = sc.nextInt();
			System.out.print(news - (L * P) + " ");
		}
	}
}
