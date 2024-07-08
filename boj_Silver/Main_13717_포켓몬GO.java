package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_13717_포켓몬GO {
	// boj Silver5
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String mon = "";
		int max = 0;
		int result = 0;
		
		for (int i = 0; i < N; i++) {
			String pokemon = br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int K = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int cnt = 0;
			while (M - K >= 0) {
				M = M - K + 2;
				cnt++;
			}
			
			if (cnt > max) {
				max = cnt;
				mon = pokemon;
			}
			
			result += cnt;
		}
		
		System.out.println(result);
		System.out.println(mon);
	}
}
