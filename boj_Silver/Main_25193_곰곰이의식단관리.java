package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_25193_곰곰이의식단관리 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		
		int chicken = 0;
		int food = 0;
		
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'C') {
				chicken ++;
			} else {
				food ++;
			}
		}
		
		int result = 0;
		if (food == 0) {
			result = chicken;
		} else {
			result = chicken / (food+1);
			if (chicken % (food+1) != 0) {
				result++;
			}
		}
		
		System.out.println(result);
	}
}
