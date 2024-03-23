package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_2304_창고다각형 {
	// boj Silver2
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] store = new int [1001];
		int start = 1000;
		int end = 1;
		int mid = 0;
		int big = 0;
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int row = Integer.parseInt(st.nextToken());
			int col = Integer.parseInt(st.nextToken());
			
			if (row < start) {
				start = row;
			}
			if (row > end) {
				end = row;
			}
			if (big < col) {
				big = col;
				mid = row;
			}
			
			store[row] = col;
		}
		
		int result = 0;
		Stack<Integer> stack = new Stack<>();
		for (int i = start; i <= mid; i++) {
			if (stack.isEmpty()) {
				stack.add(store[i]);
				result += store[i];
			} else if (stack.peek() > store[i]) {
				result += stack.peek();
			} else {
				stack.add(store[i]);
				result += store[i];
			}
		}
		
		stack.clear();
		for (int i = end; i > mid; i--) {
			if (stack.isEmpty()) {
				stack.add(store[i]);
				result += store[i];
			} else if (stack.peek() > store[i]) {
				result += stack.peek();
			} else {
				stack.add(store[i]);
				result += store[i];
			}
		}
		
		System.out.println(result);
	}
}
