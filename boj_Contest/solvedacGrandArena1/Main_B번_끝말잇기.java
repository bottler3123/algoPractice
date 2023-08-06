package solvedacGrandArena1;

import java.io.*;
import java.util.ArrayList;

public class Main_B번_끝말잇기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<String> [] dict  = new ArrayList[26];
		for (int i = 0; i < dict.length; i++) {
			dict[i] = new ArrayList<>();
		}
		
		int check = 0;
		char start = ' ';
		char end = ' ';
		
		for (int i = 0; i < N; i++) {
			String word = br.readLine();
//			System.out.println(word);
			if (word.equals("?")) {
				check = 1;
				continue;
			}
			
			if (check == 0) {
				start = word.charAt(word.length()-1);
			} else if (check == 1) {
				end = word.charAt(0);
				check = 2;
			}
			
			dict[word.charAt(0) - 97].add(word);
		}
		
		int M = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < M; i++) {
			String match_word =br.readLine();
			if (match_word.charAt(0) == start && match_word.charAt(match_word.length()-1) == end) {
				if (dict[start-97].contains(match_word)) {
					continue;
				} else {
					System.out.println(match_word);
					 break;
				}
			}
		}
		
	}
}
