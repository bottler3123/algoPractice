package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2828_사과담기게임 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int j = Integer.parseInt(br.readLine());
		
		int start = 1;
		int end = start + M - 1;
		int result = 0;
		
		for (int i = 0; i < j; i++) {
			int apple = Integer.parseInt(br.readLine());
			
			if (apple >= start && apple <= end) {
				continue;
			}
			
			if (apple > end) {
				int num = apple - end;
				end += num;
				start += num;
				result += num;
			}
			
			if (apple < start) {
				int num = start - apple;
				end -= num;
				start -= num;
				result += num;
			}
		}
		
		System.out.println(result);
	}
}
