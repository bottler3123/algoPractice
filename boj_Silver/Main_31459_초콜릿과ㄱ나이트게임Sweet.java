package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_31459_초콜릿과ㄱ나이트게임Sweet {
	// boj Silver3
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			boolean[][] map = new boolean [Y][X];
			int result = 0;
			
			for (int i = 0; i < Y; i++) {
				for (int j = 0; j < X; j++) {
					if (!map[i][j]) {
						if (i+y < Y && j+x < X) {
							if (!map[i+y][j+x]) {
								map[i+y][j+x] = true;
								result++;
							}
						} else {
							map[i][j] = true;
							result++;
						}
					}
				}
			}
			
			System.out.println(result);
		}
	}
}
