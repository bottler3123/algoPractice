package algo0408;

import java.util.Scanner;

public class Main_5622_다이얼 {
	// boj Bronze2
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
//		System.out.println(str);
		
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			result += dial(str.charAt(i));
		}
		System.out.println(result);
	}
	
	private static int dial (char num) {
		if (num == 'A' || num == 'B' || num == 'C') {
			return 3;
		} else if (num == 'D' || num == 'E' || num == 'F') {
			return 4;
		} else if (num == 'G' || num == 'H' || num == 'I') {
			return 5;
		} else if (num == 'J' || num == 'K' || num == 'L') {
			return 6;
		} else if (num == 'M' || num == 'N' || num == 'O') {
			return 7;
		} else if (num == 'P' || num == 'Q' || num == 'R' || num == 'S') {
			return 8;
		} else if (num == 'T' || num == 'U' || num == 'V') {
			return 9;
		} else if (num == 'W' || num == 'X' || num == 'Y' || num == 'Z') {
			return 10;
		} 
		return 0;
	}
}
