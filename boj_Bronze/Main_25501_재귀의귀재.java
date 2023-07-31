package algo0408;

import java.io.*;
import java.util.*;

public class Main_25501_재귀의귀재 {
	// boj Bronze2
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String S = br.readLine();
			palindrome(S, 0, S.length()-1,0);
		}
	}
	
	private static int palindrome(String S, int l, int r, int sum) {
		sum++;
		if (l >= r) {
			System.out.println(1 + " " + sum);
			return 1;
		} else if (S.charAt(l) != S.charAt(r)) {
			System.out.println(0 + " " + sum);
			return 0;
		} else {
			return palindrome(S, l+1, r-1,sum);
		}
	}
}
