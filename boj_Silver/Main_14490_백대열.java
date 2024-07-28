package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_14490_백대열 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] temp = str.split(":");
		int[] num = {Integer.parseInt(temp[0]), Integer.parseInt(temp[1])};
		
		int cnt = 2;
		while (cnt <= num[0]) {
			if (num[0] % cnt == 0 && num[1] % cnt == 0) {
				num[0] = num[0] / cnt;
				num[1] = num[1] / cnt;
				cnt = 2;
			}
			cnt++;
		}
		
		System.out.print(num[0] + ":" + num[1]);
	}
}
