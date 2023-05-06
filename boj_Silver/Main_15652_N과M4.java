package algo0408;

import java.util.*;
import java.io.*;

public class Main_15652_N과M4 {
	// boj Silver3
	
	static int N, M;
	static BufferedWriter bw;
	
	public static void main(String [] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		perm(0,1,"");
		bw.flush();
		bw.close();
	}
	
	private static void perm(int cnt, int num, String str) throws IOException {
		if (cnt == M) {
			bw.write(str+"\n");
			return;
		}
		
		for (int i = num; i <= N; i++) {
			perm(cnt+1,i,str+i+" ");
		}
	}
}
