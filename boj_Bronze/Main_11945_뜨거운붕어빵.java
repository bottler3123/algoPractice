package algo0408;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_11945_뜨거운붕어빵 {
	// boj Bronze4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			String temp = "";
			for (int j = M-1; j >= 0; j--) {
				temp += str.charAt(j);
			}
			bw.append(temp + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
