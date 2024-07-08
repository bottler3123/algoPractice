package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2993_세부분 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String str = br.readLine();
		String result = null;
		int n = str.length();
		
		for (int i = 1; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				String temp = "";
				sb = new StringBuffer(str.substring(0, i)).reverse();
				temp += sb.toString();
				sb = new StringBuffer(str.substring(i, j)).reverse();
				temp += sb.toString();
				sb = new StringBuffer(str.substring(j, n)).reverse();
				temp += sb.toString();

				if (result == null) {
					result = temp;
				} else {
					if (result.compareTo(temp) > 0) {
						result = temp;
					}
				}
			}
		}
		
		System.out.println(result);
	}
}
