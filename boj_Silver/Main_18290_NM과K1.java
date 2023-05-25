package algo0408;

import java.util.*;
import java.io.*;

public class Main_18290_NM과K1 {
	// boj Silver1
	
	static int N,M,K;
	static int [][] map;
	static boolean [][] check;
	
	static int [] dx = {1,-1,0,0};
	static int [] dy = {0,0,1,-1};
	
	static int result;
	
	public static void main(String [] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		map = new int [N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
//		System.out.println(Arrays.deepToString(map));
		check = new boolean [N][M];
		result = Integer.MIN_VALUE;
		
		comb(0,0,0,0);
		System.out.println(result);
	}
	
	public static void comb(int cnt, int x, int y, int sum) {
//		System.out.println("횟수 : " + cnt + " " + Arrays.deepToString(check) + " " + sum);
		if (cnt == K) {
			if (sum > result) {
				result = sum;
			}
//			System.out.println("합 : " + result);
			return;
		}
		
		// 배열 탐색 시작 [x,y]부터 시작함
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				// 해당 위치의 숫자를 고른적이 없다면
				if (!check[i][j]) {
					// 해당 숫자 인접한 수를 고른것으로 처리
					if (adjoinchecking(i,j)) {
						// 해당 수를 고른 것으로 처리
						check[i][j] = true;
						// 고른 횟수에 +1을 재탐색 시작
//						System.out.println("넘어가기 전 횟수 : " + cnt + " " + Arrays.deepToString(check) + " " + sum);
						comb(cnt+1,i,j,sum+map[i][j]);
						check[i][j] = false;
					}
				}
			}
		}
	}
	
	public static boolean adjoinchecking(int i, int j) {
		boolean adjoincheck = true; 
		for (int adjoin = 0; adjoin < 4; adjoin++) {
			int adjoinx = i + dx[adjoin];
			int adjoiny = j + dy[adjoin];
			// 베열범위를 넘기지 않는지 체크
			if (adjoinx >= 0 && adjoinx < N && adjoiny >= 0 && adjoiny < M) {
				if (check[adjoinx][adjoiny]) {
					adjoincheck = false;
				}
			}
		}
		return adjoincheck;
	}

}
