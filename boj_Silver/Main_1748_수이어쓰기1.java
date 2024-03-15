package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1748_수이어쓰기1 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int result = 0;
		int num = String.valueOf(N).length();
		
		result = (int) (((N - Math.pow(10, num - 1)) + 1) * num);
		for (int i = 0; i < num - 1; i++) {
			result += (9 * Math.pow(10, i)) * (i + 1);
		}
		
		System.out.println(result);
	}
}
