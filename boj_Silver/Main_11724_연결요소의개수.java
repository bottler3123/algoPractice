package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_11724_연결요소의개수 {
	// boj Silver2
	static int N,M;
	static int[][] map;
	static boolean[] check;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int [N+1][N+1];
		check = new boolean[N+1];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			map[start][end] = map[end][start] = 1;
		}
		
		int result = 0;
		for (int i = 1; i < N+1; i++) {
			if (!check[i]) {
				check[i] = true;
				bfs(i);
				result++;
			}
		}
		
		System.out.println(result);
	}

	private static void bfs(int num) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(num);

		while (!queue.isEmpty()) {
			int size = queue.size();
			
			for (int i = 0; i < size; i++) {
				int start = queue.poll();
				for (int j = 1; j < N+1; j++) {
					if (map[start][j] == 1 && !check[j]) {
						queue.add(j);
						check[j] = true;
					}
				}
			}
		}
	}
}
