package algo;

import java.io.*;
import java.util.*;

public class Main_2667_단지번호붙이기 {
	// boj Silver1
	
	static int N;
	static int [][] map;
	static boolean [][] check;
	static int rx [] = new int [] {0,-1,0,1}; // 좌상우하
	static int ry [] = new int [] {-1,0,1,0};
	static List<Integer> result = new ArrayList<Integer>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int [N][N];
		check = new boolean [N][N];
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = str.charAt(j) - '0';
				if (map[i][j] == 1) {
					check[i][j] = true;
				}
//				System.out.print(map[i][j]);
			}
//			System.out.println();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (check[i][j]) {
					bfs(i,j);
				}
			}
		}
		
		Collections.sort(result);
		System.out.println(result.size());
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
	
	static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<int[]>(); 
		queue.add(new int [] {x,y});
		int cnt = 1;
		check[x][y] = false;
		
		while (!queue.isEmpty()) {
			int round = queue.size();
			
			for (int i = 0; i < round; i++) {
				int locate [] = queue.poll();
				for (int j = 0; j < 4; j++) {
					int move_x = locate[0] + rx[j];
					int move_y = locate[1] + ry[j];
					if (move_x >= 0 && move_x < N && move_y >= 0 && move_y < N && check[move_x][move_y]) {
						queue.add(new int [] {move_x,move_y});
						check[move_x][move_y] = false;
						cnt ++;
					}
				}
			}
		}
		
		result.add(cnt);
	}
}
