package algo0408;

import java.util.*;

public class Main_2522_별찍기12 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			for (int j2 = 0; j2 < N - i ; j2++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= N-1; i++) {
			for (int j2 = 0; j2 < i ; j2++) {
				System.out.print(" ");
			}
			for (int j = 0; j < N -i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
