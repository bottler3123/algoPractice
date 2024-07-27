package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_30970_선택의기로 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<int[]> quality = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}
				return o2[0]-o1[0];
			}
		});
		
		PriorityQueue<int[]> price = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return o2[0] - o1[0];
				}
				return o1[1]-o2[1];
			}
		});
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			quality.add(new int[] {A,B});
			price.add(new int[] {A,B});
		}
		
		for (int i = 0; i < 2; i++) {
			int[] temp = quality.poll();
			System.out.print(temp[0] + " " + temp[1] + " ");
		}
		System.out.println();
		for (int i = 0; i < 2; i++) {
			int[] temp = price.poll();
			System.out.print(temp[0] + " " + temp[1] + " ");
		}
	}
}
