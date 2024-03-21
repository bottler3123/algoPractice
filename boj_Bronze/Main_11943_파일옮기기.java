package algo;

import java.util.Scanner;

public class Main_11943_파일옮기기 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A1 = sc.nextInt();
		int A2 = sc.nextInt();
		int B1 = sc.nextInt();
		int B2 = sc.nextInt();
		
		int result = A1 + B2 < A2 + B1 ? A1 + B2 : A2 + B1;
		System.out.println(result);
	}
}
