package algo0408;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1475_방번호 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		int[] arr = new int [10];
		for (int i = 0; i < N.length(); i++) {
			int num = N.charAt(i) - '0';
			arr[num]++;
		}
		
		int result = 0;
		for (int i = 0; i < 10; i++) {
			int check = arr[i];
			if (i == 6 || i == 9) {
				int sixnine = arr[6] + arr[9];
				check = sixnine / 2;
				check = sixnine % 2 > 0 ? check + 1 : check;
			}
			
			if (result < check) {
				result = check;
			}
		}
		
		System.out.println(result);
	}
}
