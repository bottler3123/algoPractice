package algo0408;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main_11286_절댓값힙 {
	// boj Silver1
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (Math.abs(o1) == Math.abs(o2)) {
					return o1 - o2;					
				} else {
					return Math.abs(o1) - Math.abs(o2);
				}
			}
			
		});
		
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) {
				if (pq.isEmpty()) {
					bw.append("0\n");
				} else {
					bw.append(pq.poll() + "\n");
				}
			} else {
				pq.add(x);
			}
		}
		
		bw.flush();
		bw.close();
	}
	
}
