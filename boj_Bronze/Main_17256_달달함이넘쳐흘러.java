package algo0408;

import java.util.Scanner;

public class Main_17256_달달함이넘쳐흘러 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ax = sc.nextInt();
		int ay = sc.nextInt();
		int az = sc.nextInt();
		int cx = sc.nextInt();
		int cy = sc.nextInt();
		int cz = sc.nextInt();
		
		System.out.println((cx - az) + " " + (cy / ay) + " " + (cz - ax));
	}
}
