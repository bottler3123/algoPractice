package algo0408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2566_최댓값 {
	// boj Bronze3
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int result_num = 0;
		int result_x = 1;
		int result_y = 1;
		for (int i = 1; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j < 10; j++) {
				int temp = Integer.parseInt(st.nextToken());
				if (temp > result_num) {
					result_num = temp;
					result_x = i;
					result_y = j;
				}
			}
		}
		
		System.out.println(result_num);
		System.out.println(result_x + " " + result_y);
	}
}
