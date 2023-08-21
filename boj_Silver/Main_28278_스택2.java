package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_28278_스택2 {
	// boj Silver4
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int order = Integer.parseInt(st.nextToken());
			
			switch (order) {
			case 1:
				int num = Integer.parseInt(st.nextToken());
				stack.add(num);
				break;
			case 2:
				if (stack.isEmpty()) {
					bw.append(-1 + "\n");
				} else {
					bw.append(stack.pop() + "\n");
				}
				break;
			case 3:
				bw.append(stack.size() + "\n");
				break;
			case 4:
				if (stack.isEmpty()) {
					bw.append(1 + "\n");
				} else {
					bw.append(0 + "\n");
				}
				break;
			case 5:
				if (stack.isEmpty()) {
					bw.append(-1 + "\n");
				} else {
					bw.append(stack.peek() + "\n");
				}
				break;
			}
		}
		
		bw.flush();
		bw.close();
	}
}
