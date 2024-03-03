package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_18242_네모네모시력검사 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char[][] map = new char [N][M];
		
		int x = -1;
		int y = -1;
		int num = 0;
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j);
				if (map[i][j] == '#' && x == -1) {
					x = i;
					y = j;
				}
				if (map[i][j] == '#') {
					num++;
				}
			}
		}
		
		num = (num+1) / 4;
		String result = "";
		int[] dx = {1,0,-1,0};
		int[] dy = {0,1,0,-1};
		String[] dir = {"LEFT","DOWN","RIGHT","UP"};
		
		for (int i = 0; i < 3; i++) {
			int check = 0;
			while (true) {
				if (!result.equals("")) {
					break;
				}
				
				if (x >= N || x < 0 || y >= M || y < 0) {
					x -= dx[i];
					y -= dy[i];
					break;
				}
//				System.out.println(x + " " + y + " " + map[x][y] + " " + check);
				
				if (map[x][y] == '#') {
					x += dx[i];
					y += dy[i];
					check++;
				} else {
					if (map[x][y] == '.' && check < num) {
						result = dir[i];
					}
					x -= dx[i];
					y -= dy[i];
					break;
				}
			}
		}
		
		if (result.equals("")) {
			result = "UP";
		}
		System.out.println(result);
	}
}
