package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_28279_덱2 {
	// boj Silver4
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		LinkedList<Integer> deque = new LinkedList<>();
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int order = Integer.parseInt(st.nextToken());
			
			switch (order) {
			case 1:
				int num = Integer.parseInt(st.nextToken());
				deque.addFirst(num);
				break;
			case 2:
				int num2 = Integer.parseInt(st.nextToken());
				deque.addLast(num2);
				break;
			case 3:
				if (deque.isEmpty()) {
					bw.append(-1 + "\n");
				} else {
					bw.append(deque.pollFirst() + "\n");
				}
				break;
			case 4:
				if (deque.isEmpty()) {
					bw.append(-1 + "\n");
				} else {
					bw.append(deque.pollLast() + "\n");
				}
				break;
			case 5:
				bw.append(deque.size() + "\n");
				break;
			case 6:
				if (deque.isEmpty()) {
					bw.append(1 + "\n");					
				} else {
					bw.append(0 + "\n");
				}
				break;
			case 7:
				if (deque.isEmpty()) {
					bw.append(-1 + "\n");
				} else {
					bw.append(deque.peekFirst() + "\n");
				}
				break;
			case 8:
				if (deque.isEmpty()) {
					bw.append(-1 + "\n");
				} else {
					bw.append(deque.peekLast() + "\n");
				}
				break;
			}
		}
		
		bw.flush();
		bw.close();
	}
}
