package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Main_29808_너의수능점수가궁금해 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int S = Integer.parseInt(br.readLine());
		
		if (S % 4763 > 0) {
			System.out.println(0);
			return;
		}
		
		S /= 4763;
		TreeSet<int[]> pq = new TreeSet<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}
				return o1[0] - o2[0];
			}
		});
		
		for (int i = 0; i <= 200; i++) {
			for (int j = 0; j <= 200; j++) {
				if (i*508 + j*212 == S) {
					pq.add(new int[] {i,j});
				}
				if (i*108 + j*212 == S) {
					pq.add(new int[] {i,j});
				}
				if (i*508 + j*305 == S) {
					pq.add(new int[] {i,j});
				}
				if (i*108 + j*305 == S) {
					pq.add(new int[] {i,j});
				}
			}
		}
		
		int size = pq.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			int[] temp = pq.pollFirst();
			System.out.println(temp[0] + " " + temp[1]);
		}
	}
}
