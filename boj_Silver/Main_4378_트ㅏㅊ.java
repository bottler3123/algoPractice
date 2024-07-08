package algo;

import java.io.InputStreamReader;

import java.io.BufferedReader;

public class Main_4378_트ㅏㅊ {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./ ";

		String str = "";
		while ((str = br.readLine()) != null) {
			
			String result = "";
			for (int i = 0; i < str.length(); i++) {
				char temp = str.charAt(i);
				if (temp == ' ') {
					result += ' ';
				} else {				
					result += word.charAt(word.indexOf(temp) - 1);
				}
			}
			
			System.out.println(result);
		}
		
	}
}
