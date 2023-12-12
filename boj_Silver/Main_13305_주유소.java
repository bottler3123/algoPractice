package algo0408;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_13305_주유소 {
	// boj Silver3
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] load = new int[N];
		int[] city = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N-1; i++) {
			load[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			city[i] = Integer.parseInt(st.nextToken());
		}
		
		long cheep = Integer.MAX_VALUE;
		long result = 0;
		for (int i = 0; i < N; i++) {
			if (city[i] < cheep) {
				cheep = city[i];
			}
			result += cheep * load[i];
		}
		
		System.out.println(result);
	}
}
