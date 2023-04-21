package algo;

import java.io.*;

public class Main_17425_약수의합 {
	// boj Gold4
	
	public static void main (String [] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		long [] arr = new long [1000001];
		
		for (int i = 1; i < 1000001; i++) {
			for (int j = 1; i * j < 1000001; j++) {
				arr[i*j] += i;
			}
		}
		
		for (int i = 1; i < 1000001; i++) {	
			arr[i] = arr[i-1] + arr[i];
		}
		
		for (int i = 0; i < T; i++) {
			int N  = Integer.parseInt(br.readLine());
			bw.write(arr[N]+"\n");			
		}
	
		bw.flush();
		bw.close();
	}
}
