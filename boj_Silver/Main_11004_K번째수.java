package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main_11004_K번째수 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		List<Long> list = new ArrayList<Long>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			list.add(Long.parseLong(st.nextToken()));
		}
		
		Collections.sort(list);
		System.out.println(list.get(K-1));
	}
}
