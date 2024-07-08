package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_4383_점프는즐거워 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String str = br.readLine();
			if (str == null || str.equals("")) {
				break;
			}
			StringTokenizer st = new StringTokenizer(str);
			int size = Integer.parseInt(st.nextToken());
			
			if (size <= 1) {
				System.out.println("Jolly");
				continue;
			}
			
			int num = Integer.parseInt(st.nextToken());
			boolean[] check = new boolean [size];
			for (int i = 1; i < size; i++) {
				int temp = Integer.parseInt(st.nextToken());
				int abs = Math.abs(num - temp);
				num = temp;
				
				if (abs >= 1 && abs < size) {
					check[abs] = true;					
				}
			}
			
			String result = "Jolly";
			for (int i = 1; i < size; i++) {
//				System.out.println(check[i] + " " + i);
				if (!check[i]) {
					result = "Not jolly";
					break;
				}
			}
			System.out.println(result);
			
		}
	}
}
