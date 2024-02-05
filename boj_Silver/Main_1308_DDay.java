package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1308_DDay {
	// boj Silver5
	
	static int mon[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int y1 = Integer.parseInt(st.nextToken());
		int m1 = Integer.parseInt(st.nextToken());
		int d1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int y2 = Integer.parseInt(st.nextToken());
		int m2 = Integer.parseInt(st.nextToken());
		int d2 = Integer.parseInt(st.nextToken());
		
		boolean check = ggCheck(y1,m1,d1,y2,m2,d2);
		
		if (check) {
			System.out.println("gg");
		} else {
			int date1 = 0;
			int date2 = 0;
			
			for (int i = 0; i < y1; i++) {
				date1 += 365 + leap(i);
			}
			
			for (int i = 0; i < m1 - 1; i++) {
				if (i == 1) {
					date1 += leap(y1);
				}
				date1 += mon[i];
			}
			
			date1 += d1;
			
			for (int i = 0; i < y2; i++) {
				date2 += 365 + leap(i);
			}
			
			for (int i = 0; i < m2 - 1; i++) {
				if (i == 1) {
					date2 += leap(y2);
				}
				date2 += mon[i];
			}
			
			date2 += d2;
			
			System.out.println("D-" + (date2 - date1));
		}
	}

	private static int leap(int i) {
		if (i % 4 != 0) return 0;
		if (i % 100 != 0) return 1;
		if (i % 400 == 0) return 1;
		return 0;
	}

	private static boolean ggCheck(int y1, int m1, int d1, int y2, int m2, int d2) {
		if (y2 - y1 > 1000) {
			return true;			
		} else if (y2 - y1 == 1000) {
			if (m2 - m1 > 0) {
				return true;
			} else if (m2 - m1 == 0) {
				if (d2 - d1 >= 0) {
					return true;
				}
			}
			return false;
		} else {
			return false;
		}
	}
}
