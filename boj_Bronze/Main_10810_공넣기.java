package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10810_공넣기 {
	// boj Bronze3
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int [] barsket = new int [N+1];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			
			for (int j = start; j <= end ; j++) {
				barsket[j] = num;
			}
		}
		
		for (int i = 1; i < barsket.length; i++) {
			System.out.print(barsket[i] + " ");
		}
	}
}
