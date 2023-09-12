package algo0408;

import java.util.Scanner;

public class Main_2903_중앙이동알고리즘 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int dot = 4;
		int num = 1;
		
		for (int i = 0; i < N; i++) {
			dot *= 4;
			dot -= num * 4 + 3;
			num *= 2;
		}
		
		System.out.println(dot);
	}
}
