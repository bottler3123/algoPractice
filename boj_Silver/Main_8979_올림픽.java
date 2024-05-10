package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_8979_올림픽 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o2[1] == o1[1]) {
					if (o2[2] == o1[2]) {
						return o2[3] - o1[3];
					}
					return o2[2] - o1[2];
				}
				return o2[1] - o1[1];
			}
		});
		
		for (int i = 0; i < N; i++) {
			int[] arr = new int [4];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 4; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			pq.add(arr);
		}
		
		int result = 1;
		int[] team = pq.poll();
		int cnt = 1;
		for (int i = 1; i < N; i++) {
			if (team[0] == K) {
				break;
			}
			
			int[] temp = pq.poll();
//			System.out.println(Arrays.toString(temp));
//			System.out.println(Arrays.toString(team));
			if (temp[1] == team[1] && temp[2] == team[2] && temp[3] == team[3]) {
				cnt++;
			} else {
				result += cnt;
				cnt = 1;
			}
			team = temp;
		}
		
		System.out.println(result);
	}
}
