package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_4158_CD {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			if (N == 0 && M == 0) {
				break;
			}
			
			Set<Integer> set = new HashSet<>();
			int result = 0;
			
			for (int i = 0; i < N; i++) {
				set.add(Integer.parseInt(br.readLine()));
			}
			
			int num = set.size();
			for (int i = 0; i < M; i++) {
				set.add(Integer.parseInt(br.readLine()));
				if (set.size() == num) {
					result++;
				} else {
					num++;
				}
			}
			
			System.out.println(result);
		}
	}
}
