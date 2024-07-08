package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_23253_자료구조는정말최고야 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String result = "Yes";
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int cnt = 200001;
			for (int j = 0; j < num; j++) {
				int temp = Integer.parseInt(st.nextToken());
				if (cnt > temp) {
					cnt = temp;
				} else {
					result = "No";
					break;
				}
			}
			
			if (result.equals("No")) {
				break;
			}
		}
		
		System.out.println(result);
	}
}
