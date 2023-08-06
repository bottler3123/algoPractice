package solvedacGrandArena1;

import java.io.*;

public class Main_B번_끝말잇기_case2 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String dict [] = new String [N];
		
		int num = 0;
		char start = ' ';
		char end = ' ';
		
		for (int i = 0; i < N; i++) {
			String word = br.readLine();
			if (word.equals("?")) {
				num = i;
			}
			dict[i] = word;
		}
		
		if (num - 1 >= 0) {
			start = dict[num-1].charAt(dict[num-1].length()-1);
		}
		if (num + 1 < N) {
			end = dict[num+1].charAt(0);
		}
		
		int M = Integer.parseInt(br.readLine());
		for (int i = 0; i < M; i++) {
			String match_word = br.readLine();
			boolean check = true;
			if (start == ' ' || match_word.charAt(0) == start) {
				if (end == ' ' || match_word.charAt(match_word.length()-1) == end) {
					for (int j = 0; j < N; j++) {
						if (dict[j].equals(match_word)) {
							check = false;
							break;
						}
					}
					if (check) {
						System.out.println(match_word);
					}
				}
			}
		}
	}
}
