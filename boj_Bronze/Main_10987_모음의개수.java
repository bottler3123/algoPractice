package algo;

import java.util.Scanner;

public class Main_10987_모음의개수 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			char aeiou = str.charAt(i);
			if (aeiou == 'a' || aeiou == 'e' || aeiou == 'i' || aeiou == 'o' || aeiou == 'u') {
				result++;
			}
		}
		
		System.out.println(result);
	}
}
