package algo;

import java.util.Scanner;

public class Main_5717_상근이의친구들 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a == 0 && b == 0) {
				break;
			} else {
				System.out.println(a+b);
			}
		}
	}
}
