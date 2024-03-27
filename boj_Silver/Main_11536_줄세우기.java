package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_11536_줄세우기 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] name = new String[N];
		for (int i = 0; i < N; i++) {
			name[i] = br.readLine();
		}
		
		int cnt = 0;
		for (int i = 1; i < N; i++) {
			if (name[i].compareTo(name[i-1]) > 0) {
				cnt++;
			} else {
				cnt--;
			}
		}
		
		if (cnt == N-1) {
			System.out.println("INCREASING");
		} else if (cnt == 1-N) {
			System.out.println("DECREASING");
		} else {
			System.out.println("NEITHER");
		}
	}
}
