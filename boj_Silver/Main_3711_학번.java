package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main_3711_학번 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int [n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			
			int result = 1;
			while (true) {
				Set<Integer> set = new HashSet<>();
				
				for (int i = 0; i < n; i++) {
					set.add(arr[i] % result);
					if (set.size() == i) {
						break;
					}
				}
				
				if (set.size() == n) {
					System.out.println(result);
					break;
				} else {
					result++;
				}
			}
		}
	}
}
