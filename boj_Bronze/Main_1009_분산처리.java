package algo0408;

import java.util.Scanner;

public class Main_1009_분산처리 {
	// boj Bronze2
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int rest = 1;
			for (int i = 0; i < b; i++) {
				rest = rest * a % 10; 
			}
			if (rest == 0) {
				System.out.println(10);
			} else {
				System.out.println(rest);
			}
		}
	}
}
