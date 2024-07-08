package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_9626_크로스워드퍼즐 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int U = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		char[][] map = new char [20][20];
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i+U][j+R] = str.charAt(j);
			}
		}
		
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if (map[i][j] == 0) {
					if ((i%2 == 0 && j%2 == 0) || (i%2 == 1) && (j%2 == 1)) {
						map[i][j] = '#';				
					} else {
						map[i][j] = '.';
					}
				}
			}
		}
		
		for (int i = 0; i < M+U+D; i++) {
			for (int j = 0; j < N+R+L; j++) {
				System.out.print(map[i][j]);
			}
			System.out.print("\n");
		}
	}
}
