package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2960_에라토스테네스의체 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] map = new int [N+1];
		int num = 0;
		int result = 0;
		
		for (int i = 2; i < N+1; i++) {
			if (map[i] == 0) {
				num++;
//				System.out.println(num + " " + i);
				if (num == K) {
					result = i;
					break;
				}
				
				for (int j = 2; j * i < N+1; j++) {
					if (map[i*j] == 0) {
						num ++;						
					}
//					System.out.println(num + " " + (i*j));
					if (num == K) {
						result = i * j;
						break;
					}
					
					map[i*j] = 1;
				}
				
			}
		}
		
		System.out.println(result);
	}
}
