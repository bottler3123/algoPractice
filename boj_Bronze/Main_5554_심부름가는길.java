package algo;

import java.util.Scanner;

public class Main_5554_심부름가는길 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int min = (a + b + c + d) / 60;
		int sec = (a + b + c + d) % 60;
		
		System.out.println(min);
		System.out.println(sec);
	}
}
