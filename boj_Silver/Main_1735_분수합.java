package algo0408;

import java.util.Scanner;

public class Main_1735_분수합 {
	// boj Silver3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a_up = sc.nextInt();
		int a_down = sc.nextInt();
		int b_up = sc.nextInt();
		int b_down = sc.nextInt();
		int up = a_up * b_down + b_up * a_down;
		int down = a_down * b_down;
		
//		System.out.println(up + " " + down);
		
		int temp = 0;
		if (up >= down) {
			temp = GCD(up, down);
		} else {
			temp = GCD(down,up);
		}
//		System.out.println(temp);
		up /= temp;
		down /= temp;
		
		System.out.println(up + " " + down);
	}
	
	private static int GCD(int a, int b) {
		if (a%b == 0) {
			return b;
		} else {
			return GCD(b, a%b);
		}
	}
}
