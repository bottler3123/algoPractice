package algo;

import java.util.Scanner;

public class Main_31822_재수강 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int T = sc.nextInt();
		
		int result = 0;
		for (int i = 0; i < T; i++) {
			String temp = sc.next();
			
			boolean check = true;
			for (int j = 0; j < 5; j++) {
				if (str.charAt(j) != temp.charAt(j)) {
					check = false;
					break;
				}
			}
			
			if (check) {
				result++;
			}
		}
		
		System.out.println(result);
	}
}
