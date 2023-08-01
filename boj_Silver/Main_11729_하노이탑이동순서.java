package algo0408;

import java.io.*;

public class Main_11729_하노이탑이동순서 {
	// boj Silver1
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int result = 1;
		for (int i = 1; i < N; i++) {
			result = result * 2 + 1;
		}
		
		bw.write(String.valueOf(result)+"\n");
		hanoi(N, 1, 2, 3);
		bw.flush();
		bw.close();
	}
	
	private static void hanoi(int N, int start, int mid, int end) throws IOException {
		if (N == 1) {
			bw.write(start + " " + end + "\n");
			return;
		}
		
		hanoi(N-1, start, end, mid);
		hanoi(1, start, mid, end);
		hanoi(N-1, mid, start, end);
	}
}
