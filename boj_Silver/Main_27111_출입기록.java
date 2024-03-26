package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main_27111_출입기록 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int result = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if (b == 0) {
				if (!map.containsKey(a) || map.get(a) == 0) {
					result++;
				}
				map.put(a, b);
			} else {
				if (map.containsKey(a) && map.get(a) == 1) {
					result++;
				}
				map.put(a, b);
			}
		}
		
		for (int i : map.keySet()) {
			if (map.get(i) == 1) {
				result++;
			}
		}
		
		System.out.println(result);
	}
}
