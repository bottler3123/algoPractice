package solvedacGrandArena1;

import java.io.*;

public class Main_A번_양말짝맞추기 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num [] = new int [10];
		int result = 0;
		for (int i = 0; i < 5; i++) {
			int temp = Integer.parseInt(br.readLine());
			num[temp] ++;
			if (num[temp] > 1) {
				num[temp] = 0;
			}
		}
		
		for (int i = 1; i < 10; i++) {
			if (num[i] == 1) {
				result = i;
			}
		}
		
		System.out.println(result);
	}
}
