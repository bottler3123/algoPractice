package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1769_3의배수 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int cnt = 0;
		
		while (true) {
			if (str.length() == 1) {
				break;
			}
			int num = 0;
			
			for (int i = 0; i < str.length(); i++) {
				num += str.charAt(i) - '0';
			}
			
			cnt++;
			str = String.valueOf(num);			
		}
		
		System.out.println(cnt);
		if (str.equals("3") || str.equals("6") || str.equals("9")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
