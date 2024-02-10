package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1246_온라인판매 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] price = new int [M];
		
		for (int i = 0; i < M; i++) {
			price[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(price);
		
		int cnt = price[M-1];
		int result = price[M-1];
		int sum = price[M-1];
		int num = 2;
		for (int i = M-2; i >= 0; i--) {
			if (N < num) {
				break;
			}
			sum = price[i] * num;
			
			if (result < sum) {
				result = sum;
				cnt = price[i];
			}
			
			num++;
		}
		
		System.out.println(cnt + " " + result);
	}
}
