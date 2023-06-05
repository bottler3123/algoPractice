package algo0408;

import java.util.*;
import java.io.*;

public class Main_1002_터렛 {
	// boj Sliver3
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double x1 = Integer.parseInt(st.nextToken());
			double x2 = Integer.parseInt(st.nextToken());
			double r1 = Integer.parseInt(st.nextToken());
			double y1 = Integer.parseInt(st.nextToken());
			double y2 = Integer.parseInt(st.nextToken());
			double r2 = Integer.parseInt(st.nextToken());
			
			double distance = Math.sqrt( (x1-y1) * (x1-y1)  + (x2-y2) * (x2-y2));
//			System.out.println(distance);
			if (distance == 0 && r1 == r2) {
				System.out.println(-1);
			} else if (distance > r1 + r2) {
				System.out.println(0);
			} else if (distance < Math.abs(r1-r2)) {
				System.out.println(0);
			} else if (distance == r1 + r2) {
				System.out.println(1);
			} else if (distance == Math.abs(r1-r2)) {
				System.out.println(1);
			}else {
				System.out.println(2);
			}
		}
	}
}
