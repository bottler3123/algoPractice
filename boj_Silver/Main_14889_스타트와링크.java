package algo;

import java.util.*;
import java.io.*;

public class Main_14889_스타트와링크 {
	// boj Silver1
	
	static int result, N;
	static int[][] map;
	
	public static void main(String [] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N =  Integer.parseInt(br.readLine());
		map = new int [N][N];
		
		for (int i = 0; i < map.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < map.length; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
//				System.out.print(map[i][j] + " ");
			}
//			System.out.println();
		}
		
		result = Integer.MAX_VALUE;
		boolean check [] = new boolean [N];
		
		comb(0, 0, check);
		System.out.println(result/2);
	}
	
	private static void comb(int cnt, int num, boolean [] check) {
		if (cnt == N/2) {
			int start = 0;
			int link = 0;
			
			for (int i = 0; i < N; i++) {
//				System.out.print(check[i] + " ");
				for (int j = 0; j < N; j++) {
					if (check[i] && (check[i] == check[j])) {
						start += map[i][j];
						start += map[j][i];
					} else if(!check[i] && (check[i] == check[j])) {
						link += map[i][j];
						link += map[j][i];
					}
				}
			}
//			System.out.println();
			if (Math.abs(start - link) < result) {
				result = Math.abs(start-link);
			} 
		}
		
		for (int i = num; i < N; i++) {
			check[i] = true;
			cnt ++;
			comb(cnt, i+1, check);
			cnt --;
			check[i] = false;
		}
	}
}
