package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14493_과일노리 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] bot = new int [N][2];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			bot[i][0] = Integer.parseInt(st.nextToken());
			bot[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int time = 0;
		for (int i = 0; i < N; i++) {
			int num = time % (bot[i][0] + bot[i][1]);
//			System.out.println(time + " " + num);
			if (num < bot[i][1]) {
				time += bot[i][1] - num;
			}
			
			time++;
		}
		
		System.out.println(time);
	}
}
