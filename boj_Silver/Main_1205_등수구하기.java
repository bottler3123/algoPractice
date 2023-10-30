package algo0408;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1205_등수구하기 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int score = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		int result = 1;
		if (N > 0) {
			result = -1;
			st = new StringTokenizer(br.readLine());
			int stack = -1;
			int index = -1;
			
			for (int i = 1; result == -1 && i < N + 1; i++) {
				int temp = Integer.parseInt(st.nextToken());
				if (temp < score) {
					result = stack == score ? index : i;
				}
				if (stack != temp) {
					stack = temp;
					index = i;
				}
			}
			
			if (result == -1 && N+1 <= P) {
				result = score == stack ? index : N + 1;
			}
			
			result = result <= P ? result : -1;
		}
		
		System.out.println(result);
	}
}
