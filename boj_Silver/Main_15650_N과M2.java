package algo0408;

import java.util.*;

public class Main_15650_N과M2 {
	// boj Silver3
	static int N,M;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		comb(1,0,"");		
	}
	
	private static void comb(int start, int num, String str) {
		if (num == M) {
			System.out.println(str);
			return;
		}
		
		for (int i = start; i <= N; i++) {
			comb(i+1,num+1,str+i+" ");
		}
	}

}
