package algo0408;

import java.util.Scanner;

public class Main_15963_CASIO {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		String M = sc.next();
		
		if (N.equals(M)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
