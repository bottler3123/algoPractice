package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_1940_주몽 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int result = 0;
		while (list.size() > 0) {
			int num = list.get(0);
			list.remove(0);
			if (list.contains(M - num)) {
				result++;
				list.remove(list.indexOf(M - num));
			}
		}
		
		System.out.println(result);
	}
}
