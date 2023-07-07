package algo;

import java.util.Scanner;

public class Main_2530_인공지능시계 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		int second = sc.nextInt();
		
		s += second;
		if (s >= 60) {
			m += s / 60;
			s = s % 60;
		}
		if (m >= 60) {
			h += m / 60;
			m = m % 60;
		}
		h = h % 24;
		
		System.out.println(h + " " + m + " " + s);
	}
}
