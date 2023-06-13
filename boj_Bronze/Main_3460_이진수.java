package algo;

import java.util.Scanner;

public class Main_3460_이진수 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			String binaryNum = Integer.toBinaryString(N);
			for (int j = binaryNum.length(); j > 0; j--) {
				if (binaryNum.charAt(j-1) == '1') {	
				System.out.print((binaryNum.length() - j) + " ");
				}
			}
		}
	}

}
