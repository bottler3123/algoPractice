package algo0408;

import java.util.Scanner;
import java.util.Stack;

public class Main_11005_진법변환2 {
	// boj Bronze1
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B = sc.nextInt();
		
		Stack<Integer> stack = new Stack<>();
		while (true) {
			stack.add(N % B);
			N /= B;
			if (N < B) {
				if (N != 0) {
					stack.add(N);					
				}
				break;
			}
		}
		
		int size = stack.size();
		for (int i = 0; i < size; i++) {
			int num = stack.pop();
			if (num > 9) {
				System.out.print((char) (num + 'A' - 10));
			} else {
				System.out.print(num);
			}
		}
	}
}
