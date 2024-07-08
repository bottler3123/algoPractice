package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_3230_금메달은메달동메달은누가 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine()) - 1;
			list.add(num, i);
		}
		
		LinkedList<Integer> finallist = new LinkedList<>();
		for (int i = M; i > 0; i--) {
			int temp = list.get(i-1);
			int num = Integer.parseInt(br.readLine()) - 1;
			finallist.add(num,temp);
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(finallist.get(i) + 1);
		}
	}
}
