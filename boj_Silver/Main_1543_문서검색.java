package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1543_문서검색 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String word = br.readLine();
		
		str = str.replace(word, "A");
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A') {
				result++;
			}
		}
		
		System.out.println(result);
	}
}
