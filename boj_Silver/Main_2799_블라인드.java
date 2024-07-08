package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2799_블라인드 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		char[][] map = new char [M*5+1][N*5+1];
		int[] result = new int [5];

		for (int i = 0; i < M*5+1; i++) {
			String str = br.readLine();
			for (int j = 0; j < N*5+1; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				int cnt = 0;
				for (int k = 1; k < 5; k++) {
					if (map[i*5+k][j*5+1] == '.') {
						result[cnt]++;
						break;
					}
					cnt++;
				}
				if (cnt == 4) {
					result[cnt]++;
				}
			}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.print(result[i] + " ");
		}
		
	}
}
