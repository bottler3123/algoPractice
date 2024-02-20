package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2238_경매 {
	// boj Silver5
	
	public class player {
		String man;
		int price;
		
		public player(String man, int price) {
			this.man = man;
			this.price = price;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int U = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		String[] arr = new String [U+1];
		int[] num = new int [U+1];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String man = st.nextToken();
			int price = Integer.parseInt(st.nextToken());
			
			if (arr[price] == null) {
				arr[price] = man;
				num[price] = 1;
			} else {
				num[price]++;
			}
		}
		
		int min = Integer.MAX_VALUE;
		int result = 0;
		for (int i = 1; i < U+1; i++) {
//			System.out.println(arr[i]);
			if (num[i] != 0 && num[i] < min) {
				min = num[i];
				result = i;
			}
		}
		
		System.out.println(arr[result] + " " + result);
	}
}
