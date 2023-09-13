package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main_9375_패션왕신해빈 {
	// boj Silver3
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			int n = Integer.parseInt(br.readLine());
			HashMap<String, Integer> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String temp = st.nextToken();
				String item = st.nextToken();
				if (map.containsKey(item)) {
					map.put(item, map.get(item)+1);
				} else {
					map.put(item, 1);
				}
			}
			
			int result = 1;
			for (String item : map.keySet()) {
				result *= map.get(item) + 1;
			}
			System.out.println(result - 1);
		}
		
	}
}
