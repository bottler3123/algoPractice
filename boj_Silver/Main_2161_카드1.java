package algo0408;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2161_카드1 {
	// boj Silver5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		while (true) {
			System.out.print(queue.poll());
			if (queue.isEmpty()) {
				break;
			} else {
				System.out.print(" ");
				queue.add(queue.poll());				
			}
		}
	}
}
