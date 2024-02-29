package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main_24039_2021은무엇이특별할까 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int [10001];
		List<Integer> list = new LinkedList<Integer>();
		
		for (int i = 2; i < 10001; i++) {
			if (arr[i] == 0) {
				list.add(i);
				arr[i] = 1;
				for (int j = 2; j * i < 10001; j++) {
					arr[i * j] = -1;
				}
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i) + " " + list.get(i+1));
			if (list.get(i) * list.get(i+1) > N) {
				System.out.println(list.get(i) * list.get(i+1));
				break;
			}
		}
	}
}
