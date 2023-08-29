package algo0408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main_11279_최대힙 {
	// boj Silver2
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());

            if (x == 0){
                if (pq.isEmpty())
                    System.out.println(0);
                else System.out.println(pq.poll());
            }
            else {
                pq.add(x);
            }
        }
    }
}
//	static int [] heep;
//	static int end;
//	
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int N = Integer.parseInt(br.readLine());
//		heep = new int [N+1];
//		end = 1;
//		
//		for (int i = 0; i < N; i++) {
//			int order = Integer.parseInt(br.readLine());
//			if (order == 0) {
//				del();
//			} else {
//				add(order);
//			}
//		}
//	}
//	
//	private static void add(int order) {
//		heep[end] = order;
//		int num = end;
//		end++;
//		
//		while (true) {
//			if (num/2 > 0 && heep[num/2] < heep[num]) {
//				int temp = heep[num/2];
//				heep[num/2] = heep[num];
//				heep[num] = temp;
//				num /= 2;
//			} else {
//				break;
//			}
//		}
//	}
//
//	private static void del() {
//		System.out.println(heep[1]);
//		heep[1] = heep[end];
//		heep[end] = 0;
//		end --;
//		
//		int num = 1;
//		while (true) {
//			if (num*2 > end) {
//				break;
//			} else {
//				
//			}
//		}
//	}
//}
