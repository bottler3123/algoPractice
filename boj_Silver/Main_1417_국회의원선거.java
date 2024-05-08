package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main_1417_국회의원선거 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int dasom = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		for (int i = 0; i < N-1; i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}
		
		int result = 0;
		if (N != 1) {
			while (true) {
				int num = pq.poll();
				if (dasom <= num) {
					dasom++;
					result++;
					num--;
				} else {
					break;
				}
				pq.add(num);
			}
		}
		
		System.out.println(result);
	}
}
