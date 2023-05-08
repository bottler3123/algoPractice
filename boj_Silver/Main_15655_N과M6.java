package algo0408;

import java.io.*;
import java.util.*;

public class Main_15655_N과M6 {
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
			perm(0,0,"",check);
			bw.flush();
			bw.close();
		}
		
		private static void perm(int cnt,int num, String str, boolean [] check) throws IOException {
			if (cnt == M) {
				bw.write(str+"\n");
				return;
			}
			
			for (int i = num; i < N; i++) {
				if (check[i]) continue;
				check[i] = true;
				perm(cnt+1,i+1,str+arr[i]+" ",check);
				check[i] = false;
			}
		}
}
