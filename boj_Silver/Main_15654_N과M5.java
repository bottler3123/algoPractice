package algo0408;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_15654_N과M5 {
	// boj Silver3
	
	static int N, M;
	static BufferedWriter bw;
	static int[] arr;
	
	public static void main(String [] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int [N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		boolean [] check = new boolean [N];
		perm(0,"",check);
		bw.flush();
		bw.close();
	}
	
	private static void perm(int cnt, String str, boolean [] check) throws IOException {
		if (cnt == M) {
			bw.write(str+"\n");
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if (check[i]) continue;
			check[i] = true;
			perm(cnt+1,str+arr[i]+" ",check);
			check[i] = false;
		}
	}
}
