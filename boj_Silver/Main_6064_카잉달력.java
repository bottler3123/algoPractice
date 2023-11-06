package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_6064_카잉달력 {
	// boj Silver1
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int result = x;
			while (result <= M*N) {
				if ((result - y) % N == 0) {
					break;
				}
				result += M;
			}
			
			if (result > M*N) {
				System.out.println(-1);
			} else {
				System.out.println(result);
			}
		}
	}
}
