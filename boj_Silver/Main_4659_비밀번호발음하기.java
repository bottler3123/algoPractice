package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_4659_비밀번호발음하기 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Character[] arr = {'a','e','i','o','u'};
		List<Character> vowel = new ArrayList<Character>(Arrays.asList(arr));
		
		while (true) {
			String str = br.readLine();
			
			if (str.equals("end")) {
				break;
			}
			
			boolean vowelcheck = false;
			boolean check = true;
			char word = str.charAt(0);
			int cnt = 1;
			if (vowel.contains(word)) {
				vowelcheck = true;
			}
			
			for (int i = 1; i < str.length(); i++) {
				char temp = str.charAt(i);
				if (vowel.contains(temp)) {
					vowelcheck = true;
				}
				
				if (temp != 'e' && temp != 'o' && temp == word) {
					check = false;
					break;
				}
				
				if (vowel.contains(temp) == vowel.contains(word)) {
					cnt++;
				} else {
					cnt = 1;
				}
				
				if (cnt > 2) {
					check = false;
					break;
				}
				
				word = temp;
			}
			
			if (vowelcheck && check) {
				System.out.println("<" + str + "> is acceptable.");
			} else {				
				System.out.println("<" + str + "> is not acceptable.");
			}
			
		}
	}
}
