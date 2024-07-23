package algo;

import java.util.Scanner;

public class Main_25628_햄버거만들기 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while (b * 2 > a) {
			b--;
		}
		
		System.out.println(b);
	}
}
