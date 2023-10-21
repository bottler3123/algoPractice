package algo0408;

import java.util.Scanner;

public class Main_10156_과자 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		if (K*N-M > 0) {
			System.out.println(K*N-M);			
		} else {
			System.out.println(0);
		}
	}
}
