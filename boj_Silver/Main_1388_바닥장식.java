package algo0408;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1388_바닥장식 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char[][] map = new char [N][M];
		
		int horizon = 0;
		int vertical = 0;
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j);
				if (map[i][j] == '-') {
					if (j == 0 || map[i][j-1] == '|') {
						horizon++;
					}
				}
			}
		}
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (map[j][i] == '|') {
					if (j == 0 || map[j-1][i] == '-') {
						vertical++;
					}
				}
			}
		}
		
		System.out.println(horizon + vertical);
	}
}
