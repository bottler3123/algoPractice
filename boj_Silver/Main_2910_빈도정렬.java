package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_2910_빈도정렬 {
	// boj Silver3
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		HashMap<Integer, Integer> map = new HashMap<>();
		HashMap<Integer, Integer> map_cnt = new HashMap<>();
		int cnt = 1;
		List<Integer> list = new LinkedList<Integer>();
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			list.add(num);
			
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
			
			if (!map_cnt.containsKey(num)) {
				map_cnt.put(num, cnt);
				cnt++;
			}
		}
		
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (map.get(o1) == map.get(o2)) {
					return map_cnt.get(o1) - map_cnt.get(o2);
				}
				
				return map.get(o2) - map.get(o1);
			}
		});
		
		for (int i = 0; i < N; i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
