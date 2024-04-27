package algo;

import java.util.Scanner;

public class Main_20499_Darius님한타안함 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] arr = str.split("/");
		
		int K = Integer.parseInt(arr[0]);
		int D = Integer.parseInt(arr[1]);
		int A = Integer.parseInt(arr[2]);
		
		if (K+A < D || D == 0) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}
	}
}
