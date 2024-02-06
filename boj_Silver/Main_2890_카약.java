package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_2890_카약 {
	// boj Silver5
	
	static int R,C;
	static char[][] map;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new char [R][C];
		
		for (int i = 0; i < R; i++) {
			String str = br.readLine();
			for (int j = 0; j < C; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		int[][] team = new int [10][3];
		for (int i = 0; i < R; i++) {
			int distance = 0;
			for (int j = C-2; j > 0; j--) {
				if (map[i][j] == '.') {
					distance++;
				} else {
					int num = map[i][j] - '0';
					team[num][0] = distance;
					team[num][2] = num;
					break;
				}
			}
		}
		
		Arrays.sort(team, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		
		team[1][1] = 1;
		for (int i = 2; i < 10; i++) {
			if (team[i][0] == team[i-1][0]) {
				team[i][1] = team[i-1][1];				
			} else {
				team[i][1] = team[i-1][1] + 1;
			}
		}
		
		Arrays.sort(team, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2] - o2[2];
			}
		});
		
		for (int i = 1; i < 10; i++) {
			System.out.println(team[i][1]);
		}
	}
}
