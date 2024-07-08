package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main_15312_이름궁합 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String B = br.readLine();
		
		int[] cnt = { 3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1 };
		Queue<Integer> queue = new ArrayDeque<>();
		
		for (int i = 0; i < A.length(); i++) {
			queue.add(cnt[A.charAt(i) - 'A']);
			queue.add(cnt[B.charAt(i) - 'A']);
		}
		
		while (queue.size() > 2) {
			int size = queue.size();
			
			int temp = queue.poll();
			for (int i = 1; i < size; i++) {
				int num = queue.poll();
				if (temp + num >= 10) {
					queue.add(temp + num - 10);
				} else {
					queue.add(temp + num);
				}
				temp = num;
			}
		}
		
		System.out.print(queue.poll());
		System.out.print(queue.poll());
	}
}
