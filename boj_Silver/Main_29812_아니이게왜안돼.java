package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_29812_아니이게왜안돼 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int D = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int del = (D + M) / D;
		
		int energy = 0;
		int hyu = 0;
		
		int H = 0;
		int Y = 0;
		int U = 0;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if (S.charAt(i) == 'H') {
				H++;
				if (cnt <= del) {
					energy += cnt * D;
				} else {
					energy += D + M;
				}
				cnt = 0;
				continue;
			}
			
			if (S.charAt(i) == 'Y') {
				Y++;
				if (cnt <= del) {
					energy += cnt * D;
				} else {
					energy += D + M;
				}
				cnt = 0;
				continue;
			}
			
			if (S.charAt(i) == 'U') {
				U++;
				if (cnt <= del) {
					energy += cnt * D;
				} else {
					energy += D + M;
				}
				cnt = 0;
				continue;
			}
			
			cnt++;
		}
		
		if (cnt <= del) {
			energy += cnt * D;
		} else {
			energy += D + M;
		}
		if (energy == 0) {
			System.out.println("Nalmeok");
		} else {
			System.out.println(energy);			
		}
		
		int result = Math.min(Math.min(H, Y), U);
		if (result == 0) {
			System.out.println("I love HanYang University");
		} else {
			System.out.println(result);
		}
	}
}
