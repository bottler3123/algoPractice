package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main_1972_놀라운문자열 {
	// boj Silver3
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String str = br.readLine();
			
			if (str.equals("*")) {
				break;
			}
			
			int cnt = str.length();
			boolean check = false;
			for (int i = 0; i <= cnt - 2; i++) {
				HashSet<String> set = new HashSet<>();
				for (int j = 0; j < cnt-i-1; j++) {
					String Dssang = String.valueOf(str.charAt(j)) + String.valueOf(str.charAt(j+i+1));
					set.add(Dssang);
//					System.out.print(Dssang + " ");
				}
				
				if (set.size() != cnt - i - 1) {
					check = true;
					break;
				}
//				System.out.println();
			}
			
			if (check) {
				System.out.println(str + " is NOT surprising.");
			} else {
				System.out.println(str + " is surprising.");				
			}
		}
	}
}
