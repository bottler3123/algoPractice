package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main_1418_K세준수 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		List<Integer> list = new LinkedList<Integer>();
		int[] map = new int [N+1];
		for (int i = 2; i <= N; i++) {
			if (map[i] == 0) {
				map[i] = 1;
				for (int j = 2; j * i <= N; j++) {
					map[i*j] = -1;
				}
				
				if (i > K) {
					list.add(i);
				}
			}
		}
		
		int result = N;
		boolean[] check = new boolean [N+1];		
		for (int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			for (int j = 1; j * num <= N; j++) {
				if (!check[num*j]) {
					check[num*j] = true;
					result--;
				}
			}
		}
		
		System.out.println(result);
	}
}
