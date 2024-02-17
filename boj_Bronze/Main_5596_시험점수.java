package algo;

import java.util.Scanner;

public class Main_5596_시험점수 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < 4; i++) {
			int num = sc.nextInt();
			a += num;
		}
		for (int i = 0; i < 4; i++) {
			int num = sc.nextInt();
			b += num;
		}
		
		if (a >= b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}
