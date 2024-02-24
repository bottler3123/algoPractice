package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_5671_호텔방번호 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (br.ready()) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int result = 0;
			for (int i = A; i <= B; i++) {
				boolean[] num = new boolean [10];
				boolean check = true;
				String room = String.valueOf(i);
				
				for (int j = 0; j < room.length(); j++) {
					if (num[room.charAt(j) - '0']) {
						check = false;
						break;
					} else {
						num[room.charAt(j) - '0'] = true;
					}
				}
				
				if (check) {
					result++;
				}
			}
			
			System.out.println(result);
			
		}
	}
}
