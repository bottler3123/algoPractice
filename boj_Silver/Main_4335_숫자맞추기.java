package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_4335_숫자맞추기 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int [11];
		boolean check = true;
		
		while (true) {
			int num = Integer.parseInt(br.readLine());
			
			if (num == 0) {
				break;
			}
			
			String str = br.readLine();
			if (str.equals("too high")) {
				if (arr[num] < 0) {
					check = false;
				}
				arr[num] = 1;
			} else if (str.equals("too low")) {
				if (arr[num] > 0) {
					check = false;
				}
				arr[num] = -1;
			} else {
				for (int i = 1; i < num; i++) {
					if (arr[i] > 0) {
						check = false;
					}
				}
				for (int i = num+1; i < 11; i++) {
					if (arr[i] < 0 ) {
						check = false;
					}
				}
				if (arr[num] != 0) {
					check = false;
				}
				
				if (check) {
					System.out.println("Stan may be honest");
				} else {
					System.out.println("Stan is dishonest");
				}
				arr = new int [11];
				check = true;
			}
		}
	}
}
