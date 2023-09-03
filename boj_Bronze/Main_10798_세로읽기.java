package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10798_세로읽기 {
	// boj Bronze1
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word [][] = new String [5][15];
		for (int i = 0; i < 5; i++) {
			String temp = br.readLine();
			for (int j = 0; j < temp.length(); j++) {
				word[i][j] = String.valueOf(temp.charAt(j));
			}
		}
		
		String result = "";
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (word[j][i] != null) {
					result += word[j][i];
				}
			}
		}
		
		System.out.println(result);
	}
}
