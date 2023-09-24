package algo0408;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_1158_요세푸스문제 {
	// boj Silver4
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 1; i < N+1; i++) {
			queue.add(i);
		}
		
		bw.append("<");
		while (!queue.isEmpty()) {
			for (int i = 0; i < K-1; i++) {
				queue.add(queue.poll());
			}
			bw.append(""+queue.poll());
			if (queue.isEmpty()) {
				bw.append(">");
			} else {
				bw.append(", ");
			}
		}
		
		bw.flush();
		bw.close();
	}
}
