package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main_1895_필터 {
	// boj Silver4
	
	static int R,C,T,result;
	static int[][] map;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new int [R][C];
		
		for (int i = 0; i < R; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < C; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < R-2; i++) {
			for (int j = 0; j < C-2; j++) {
				check(i, j);
			}
		}
		
		System.out.println(result);
	}

	private static void check(int x, int y) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = x; i <= x+2; i++) {
			for (int j = y; j <= y+2; j++) {
				list.add(map[i][j]);
			}
		}
		Collections.sort(list);
		
		if (T <= list.get(4)) {
			result++;
		}
	}
}
