package algo0408;

import java.util.Scanner;

public class Main_1267_휴대폰요금 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = 0;
		int M = 0;
		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			Y += temp / 30 * 10;
			if (temp % 30 != 0) {
				Y += 10;
			}
			if (temp % 30 == 0 && temp / 30 > 0) {
				Y += 10;
			}
			M += temp / 60 * 15;
			if (temp % 60 != 0) {
				M += 15;
			}
			if (temp % 60 == 0 && temp / 60 > 0) {
				M += 15;
			}
			
		}
		
		if (Y > M) {
			System.out.println("M " + M);
		} else if (Y < M) {
			System.out.println("Y " + Y);
		} else {
			System.out.println("Y M " + Y);
		}
	}

}
