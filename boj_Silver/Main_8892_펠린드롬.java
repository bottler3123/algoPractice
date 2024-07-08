package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_8892_펠린드롬 {
	// boj Silver5
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			int n = Integer.parseInt(br.readLine());
			String[] arr = new String [n];
			
			for (int i = 0; i < n; i++) {
				arr[i] = br.readLine();
			}
			
			check(arr, n);
		}
		bw.flush();
		bw.close();
	}

	private static void check(String[] arr, int n) throws IOException {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				}
				String temp = arr[i] + arr[j];
				boolean check = true;
				
				for (int k = 0; k < temp.length() / 2; k++) {
					if (temp.charAt(k) != temp.charAt(temp.length() - k - 1)) {
						check = false;
					}
				}
				
				if (check) {
					bw.append(temp + "\n");
					return;
				}
			}
		}
		
		bw.append("0\n");
	}
}
