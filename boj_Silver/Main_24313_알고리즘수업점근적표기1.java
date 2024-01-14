package algo;

import java.util.Scanner;

public class Main_24313_알고리즘수업점근적표기1 {
	// boj Silver5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a0 = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();
		
		boolean check = a1 * n + a0 <= c * n ? true : false;
		if (check && a1 <= c ) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
