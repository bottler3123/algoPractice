package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main_3724_표 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			BigInteger[][] map = new BigInteger[N][M];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++) {
					map[i][j] = new BigInteger(st.nextToken());
				}
			}
			
			int result = 0;
			BigInteger sum = new BigInteger("1");
			for (int i = 0; i < M; i++) {
				BigInteger num = new BigInteger("1");
				for (int j = 0; j < N; j++) {
					num = num.multiply(map[j][i]);
				}
				
//				System.out.println(num);
				if (i == 0) {
					sum = num;
				}
				System.out.println(num.compareTo(sum));
				if (num.compareTo(sum) >= 0) {
					result = i;
					sum = num;
				}
			}
			
			System.out.println(result+1);
		}
	}
}
