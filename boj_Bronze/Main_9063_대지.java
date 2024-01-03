package algo0408;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_9063_대지 {
	// boj Bronze3
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int smallx = 10001;
		int bigx = -10001;
		int smally = 10001;
		int bigy = -10001;
		
		if (N == 1) {
			System.out.println(0);
		} else {
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				if (x < smallx) {
					smallx = x;
				}
				
				if (x > bigx) {
					bigx = x;
				}
				
				if (y < smally) {
					smally = y;
				}
				
				if (y > bigy) {
					bigy = y;
				}
			}
			
			System.out.println((bigx - smallx) * (bigy - smally));
		}
		
	}
}
