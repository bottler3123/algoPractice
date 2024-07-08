package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_10384_팬그램 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			int[] arr = new int [26];
			
			for (int j = 0; j < str.length(); j++) {
				int num = str.charAt(j);
				
				if (num >= 97 && num <= 122) {
					arr[num - 97]++;
				}
				if (num >= 65 && num <= 90) {
					arr[num - 65]++;
				}
			}
			
			Arrays.sort(arr);
			int result = arr[0];
			
			System.out.print("Case " + (i+1) + ": ");
			if (result == 0) {
				System.out.print("Not a pangram");
			} else if (result == 1) {
				System.out.print("Pangram!");				
			} else if (result == 2) {
				System.out.print("Double pangram!!");				
			} else if (result == 3) {
				System.out.print("Triple pangram!!!");				
			}
			System.out.println();
		}
	}
}
