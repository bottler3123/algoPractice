package algo;

import java.util.Scanner;

public class Main_15873_공백없는AplusB {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		
		int result = 0;
		for (int i = 0; i < num.length(); i++) {
			int n = num.charAt(i) - '0';
			
			result += n;
			if (n == 0) {
				result += 9;
			}
		}
		
		System.out.println(result);
	}
}
