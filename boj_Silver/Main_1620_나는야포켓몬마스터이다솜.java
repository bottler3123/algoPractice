package algo0408;

import java.io.*;
import java.util.*;

public class Main_1620_나는야포켓몬마스터이다솜 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> dic = new HashMap<>();
		
		for (int i = 1; i < N+1; i++) {
			String str = br.readLine();
			dic.put(String.valueOf(i), str);
			dic.put(str, String.valueOf(i));
		}
		
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			bw.write(dic.get(str) + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
