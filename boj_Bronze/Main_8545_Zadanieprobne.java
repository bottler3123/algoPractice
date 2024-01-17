package algo;

import java.util.Scanner;

public class Main_8545_Zadanieprobne {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = sc.next();
		for (int i = result.length() - 1; i >= 0; i--) {
			System.out.print(result.charAt(i));
		}
	}
}
