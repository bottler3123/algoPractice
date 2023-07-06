package algo;

import java.util.Scanner;

public class Main_1264_모음의개수 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.nextLine();
			if (str.equals("#")) {
				break;
			}
			int cnt = 0;
			for (int i = 0; i < str.length(); i++) {
				char vowel = str.charAt(i);
				if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
					cnt++;
				}
				if (vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U') {
					cnt++;
				}
			}
			
			System.out.println(cnt);
		}
	}
}
