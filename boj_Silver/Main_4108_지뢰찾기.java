package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_4108_지뢰찾기 {
	// boj Silver5
	
	static int[] dx = {-1,-1,0,1,1,1,0,-1};
	static int[] dy = {0,1,1,1,0,-1,-1,-1};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			if (R == 0 && C == 0) {
				break;
			}
			
			char[][] map = new char [R][C];
			for (int i = 0; i < R; i++) {
				String str = br.readLine();
				for (int j = 0; j < C; j++) {
					map[i][j] = str.charAt(j);
				}
			}
			
			for (int i = 0; i < R; i++) {
				
				for (int j = 0; j < C; j++) {
					
					if (map[i][j] == '*') {
						System.out.print("*");
					} else {
						int cnt = 0;
						
						for (int m = 0; m < 8; m++) {
							int x = i + dx[m];
							int y = j + dy[m];
							if (x >= 0 && x < R && y >= 0 && y < C && map[x][y] == '*') {
								cnt++;
							}
						}
						
						System.out.print(cnt);
					}
					
				}
				
				System.out.println();
			}
		}
	}
}
