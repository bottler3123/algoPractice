package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2578_빙고 {
	// boj Silver4
	
	static int[][] map;
	static boolean[][] check;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		map = new int [5][5];
		check = new boolean [5][5];
		int cnt = 0;
		int result = 0;
		
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				int num = Integer.parseInt(st.nextToken());
				map_check(num);
				cnt++;
				if (bingo()) {
					result = cnt;
					break;
				}
			}
			
			if (result != 0) {
				break;
			}
		}
		
		System.out.println(result);
	}

	private static boolean bingo() {
		int bingo_cnt = 0;
		
		int crossR = 0;
		int crossL = 0;
		for (int i = 0; i < 5; i++) {
			int horizen = 0;
			int vertical = 0;
			for (int j = 0; j < 5; j++) {
				if (check[i][j]) {
					horizen++;
				}
				if (check[j][i]) {
					vertical++;
				}
				if (i == j && check[i][j]) {
					crossR++;
				}
				if (i + j == 4 && check[i][j]) {
					crossL++;
				}
			}
			
			if (horizen == 5) {
				bingo_cnt++;
			}
			if (vertical == 5) {
				bingo_cnt++;
			}
		}
		
		if (crossL == 5) {
			bingo_cnt++;
		}
		if (crossR == 5) {
			bingo_cnt++;
		}
		
		if (bingo_cnt >= 3) {
			return true;
		}
		return false;
	}

	private static void map_check(int num) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (map[i][j] == num) {
					check[i][j] = true;
					return;
				}
			}
		}
	}
}
