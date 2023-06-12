package algo0408;

import java.util.Scanner;

public class Main_2445_별찍기8 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = N; i > 0; i--) {
			for (int j = 0; j <= N - i; j++) {
				System.out.print("*");
			}
			for (int j = i*2-1; j > 1 ; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= N - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < N; i++) {
			for (int j = N; j > i; j--) {
				System.out.print("*");
			}
			for (int j = 2*i-1; j >= 0; j--) {
				System.out.print(" ");
			}
			for (int j = N; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
