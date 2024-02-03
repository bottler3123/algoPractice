package algo;

import java.util.Scanner;

public class Main_2576_홀수 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int small = 101;
		int sum = 0;
		
		for (int i = 0; i < 7; i++) {
			int num = sc.nextInt();
			if (num % 2 == 1) {
				sum += num;
				if (small > num) {
					small = num;
				}
			}
		}
		
		if (small == 101) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(small);
		}
	}
}
