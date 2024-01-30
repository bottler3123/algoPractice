package algo;

import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.io.BufferedReader;

public class Main_1431_시리얼번호 {
	// boj Silver3
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				if (a.length() == b.length()) {
					int anum = 0;
					int bnum = 0;
					for (int i = 0; i < a.length(); i++) {
						if (a.charAt(i) - '0' >= 0 && a.charAt(i) - '0' < 10) {
							anum += a.charAt(i) - '0';
						}
						if (b.charAt(i) - '0' >= 0 && b.charAt(i) - '0' < 10) {
							bnum += b.charAt(i) - '0';
						}
					}
					
					if (anum == bnum) {
						return a.compareTo(b);
					} else {
						return anum - bnum;
					}
					
				} else {
					return a.length() - b.length();
				}
			}
		});
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			pq.add(str);
		}
		
		for (int i = 0; i < N; i++) {
			System.out.println(pq.poll());
		}
	}
}
