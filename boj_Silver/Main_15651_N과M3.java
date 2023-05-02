package algo0408;

import java.util.*;
import java.io.*;

public class Main_15651_N과M3 {
	// boj Silver3
	static int N,M;
	static BufferedWriter bw;
	
	public static void main(String [] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		repe(0,"");
		bw.flush();
		bw.close();
	}
	
	private static void repe(int num, String str) throws IOException {
		if (num == M) {
			bw.write(str+"\n");
			return;
		}
		
		for (int i = 1; i <= N; i++) {
			repe(num+1,str+i+" ");
		}
	}
}
