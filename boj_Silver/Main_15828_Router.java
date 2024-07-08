package algo;

import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.io.BufferedReader;

public class Main_15828_Router {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new ArrayDeque<Integer>();
		
		int cnt = Integer.parseInt(br.readLine());
		int num = Integer.parseInt(br.readLine());
		while (num != -1) {
			if (num == 0) {
				queue.poll();
			} else {
				if (queue.size() < cnt) {
					queue.add(num);
				}
			}
			num = Integer.parseInt(br.readLine());
		}
		
		if (queue.isEmpty()) {
			System.out.println("empty");
		} else {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				System.out.print(queue.poll() + " ");
			}			
		}
	}
}
