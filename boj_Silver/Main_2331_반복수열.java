package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_2331_반복수열 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(A);
		int cnt = 0;
		int result = 0;
		
		while (true) {
			int num = list.get(cnt);
			
			int next = 0;
			while (num != 0) {
				next += (int) Math.pow(num % 10, (double) P);
				num /= 10;
			}
			
			if (list.contains(next)) {
				result = list.indexOf(next);
				break;
			} else {
				list.add(next);
				cnt++;
			}
		}
		
		System.out.println(result);
	}
}
