package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1491_나선 {
	// boj Silver4
	
	static int[] dx = {0,-1,0,1};
	static int[] dy = {1,0,-1,0};
	
	static int N,M,X,Y;
	static boolean[][] map;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new boolean [M][N];
		
		X = M-1;
		Y = 0;
		map[X][Y] = true;
		
		while (true) {
			boolean stop = true;
			
			for (int i = 0; i < 4; i++) {
				int nextx = X + dx[i];
				int nexty = Y + dy[i];
				if (check(nextx, nexty)) {
					stop = false;
					while (X < M && X >= 0 && Y < N && Y >= 0 && !map[X][Y]) {
						map[X][Y] = true;
//						System.out.println(Y + " " + (M - 1 - X));
						X += dx[i];
						Y += dy[i];
					}
					X -= dx[i];
					Y -= dy[i];
				}
			}
			
			if (stop) {
				break;
			}
		}
		
		System.out.println(Y + " " + (M - 1 - X));

//		for (int i = 0; i < M; i++) {
//			for (int j = 0; j <N; j++) {
//				System.out.print(map[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

	private static boolean check(int nextx, int nexty) {
		if (nextx < M && nextx >= 0 && nexty < N && nexty >= 0 && !map[nextx][nexty]) {
			X = nextx;
			Y = nexty;
			return true;
		}
		return false;
	}
}
