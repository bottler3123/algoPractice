package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main_2635_수이어가기 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int result = 0;
		List<Integer> result_list = new ArrayList<>();
		
		for (int i = 1; i <= N; i++) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(N);
			list.add(i);
			int cnt = 2;
			
			int before = i;
			int after = N - i;
			while (after >= 0) {
				list.add(after);
				cnt++;
				int temp = after;
				after = before - after;
				before = temp;
			}
			
			if (cnt > result) {
				result = cnt;
				result_list = new ArrayList<>(list);
			}
		}
		
		System.out.println(result);
		for (int i = 0; i < result_list.size(); i++) {
			System.out.print(result_list.get(i) + " ");
		}
	}
}
