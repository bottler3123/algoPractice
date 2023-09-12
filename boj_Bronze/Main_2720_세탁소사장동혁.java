package algo0408;

import java.util.Scanner;

public class Main_2720_세탁소사장동혁 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int C = sc.nextInt();
			// 쿼터
			if (C >= 25) {
				System.out.print(C / 25 + " ");
				C -= 25 * (C / 25);
			} else {
				System.out.print("0" + " ");
			}
			// 다임
			if (C >= 10) {
				System.out.print(C / 10 + " ");
				C -= 10 * (C / 10);
			} else {
				System.out.print("0" + " ");
			}
			// 니켈
			if (C >= 5) {
				System.out.print(C / 5 + " ");
				C -= 5 * (C / 5);
			} else {
				System.out.print("0" + " ");
			}
			// 페니
			if (C >= 1) {
				System.out.print(C);
			} else {
				System.out.print("0");
			}
			
			System.out.println();
		}
	}
}
