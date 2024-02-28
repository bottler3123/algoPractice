package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_9184_신나는함수실행 {
	// boj Silver2
	
	static int[][][] map = new int [21][21][21];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		map[0][0][0] = 1;
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if (a == -1 && b == -1 && c == -1) {
				return;
			}
			
			int result = w(a,b,c);
			System.out.println("w(" + a + ", " + b + ", " + c + ") = " + result);
		}
	}

	private static int w(int a, int b, int c) {
		
		if (a <= 0 || b <= 0 || c <= 0) {
			return map[0][0][0];
		}
		
		if (a > 20 || b > 20 || c > 20) {
			return w(20, 20, 20);
		}
		
		if (map[a][b][c] != 0) {
			return map[a][b][c];
		}

		if (a < b && b < c) {
			map[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
			return map[a][b][c];
		}
		
		
		return map[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}
}
