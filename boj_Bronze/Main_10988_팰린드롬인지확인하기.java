package algo0408;

import java.util.Scanner;

public class Main_10988_팰린드롬인지확인하기 {
	// boj Bronze2
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int result = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				result = 0;
				break;
			}
		}
		
		System.out.println(result);
	}
}
