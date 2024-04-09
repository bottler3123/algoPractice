package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3060_욕심쟁이돼지 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			int food = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= 6; i++) {
				food += Integer.parseInt(st.nextToken());
			}
						
			int result = 1;
			while (food <= N) {
				result++;
				food *= 4;
			}
			
			System.out.println(result);
		}
	}
}
