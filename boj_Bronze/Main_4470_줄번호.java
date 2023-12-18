package algo;

import java.util.Scanner;

public class Main_4470_줄번호 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= N; i++) {
			String str = sc.nextLine();
			System.out.println(i + ". " + str);
		}
	}
}
