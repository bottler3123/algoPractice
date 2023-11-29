package algo0408;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main_1544_사이클단어 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<String>[] arr = new ArrayList[N];
		
		int result = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = new ArrayList<>();
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				arr[i].add(str.substring(j) + str.substring(0,j));
			}
			
			boolean check = true;
			for (int j = 0; check && j <= i-1; j++) {
				for (int k = 0; check && k < arr[j].size(); k++) {
					if (str.equals(arr[j].get(k))) {
						check = false;
					}
				}
			}
			
			if (check) {
				result++;
			}
		}
		
		System.out.println(result);
	}
}
