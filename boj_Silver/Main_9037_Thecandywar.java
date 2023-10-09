package algo0408;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_9037_Thecandywar {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			int[] child = new int[N];
			int[] candy = new int[N];

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				child[i] = Integer.parseInt(st.nextToken());
				if (child[i] % 2 == 1) {
					child[i]++;
				}
			}
			
			int result = 0;
			boolean check = true;
			
			for (int i = 0; i < N; i++) {
				if (child[0] != child[i]) {
					check = false;
					break;
				}
			}
			
			if (!check) {
				while (true) {
					check = true;
					result++;
					
					for (int i = 0; i < N; i++) {
						if (i < N-1) {
							child[i] /= 2;
							candy[i+1] = child[i];
						} else {
							child[i] /= 2;
							candy[0] = child[i];
						}
					}
					
					for (int i = 0; i < N; i++) {
						child[i] += candy[i];
						if (child[i] % 2 == 1) {
							child[i]++;
						}
					}
					
					for (int i = 0; i < N; i++) {
						if (child[0] != child[i]) {
							check = false;
							break;
						}
					}
					
					if (check) {
						break;
					}
					
				}
			}
			
			System.out.println(result);
		}
	}
}
