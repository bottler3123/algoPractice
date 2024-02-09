package algo;

import java.util.Scanner;

public class Main_5532_방학숙제 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int day = A / C;
		int day2 = B / D;
		if (A % C != 0) {
			day++;
		}
		
		if (B % D != 0) {
			day2++;
		}
		
		int result = day > day2 ? L - day : L - day2;
		System.out.println(result);
	}
}
