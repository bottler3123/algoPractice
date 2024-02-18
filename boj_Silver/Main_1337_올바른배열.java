package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main_1337_올바른배열 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new LinkedList<Integer>();
		
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		int result = 4;

		for (int i = 0; i < n; i++) {
			int num = list.get(i);
			int cnt = 4;
			for (int j = 1; j <= 4; j++) {
				if (list.contains(num + j)) {
					cnt --;
				}
			}
			
//			System.out.println(num + " " + cnt);
			if (cnt < result) {
				result = cnt;
			}
		}
		
		System.out.println(result);
	}
}
