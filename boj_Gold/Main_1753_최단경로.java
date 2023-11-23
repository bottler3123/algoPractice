package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_1753_최단경로 {
	// boj Gold4
	
	static int V,E,K;
	static int INF = 2000000;
	static List<Node>[] list;
	
	static class Node implements Comparable<Node>{
		int end;
		int rate;
		
		public Node(int end, int rate) {
			this.end = end;
			this.rate = rate;
		}
		
		@Override
		public int compareTo(Node o) {
			return this.rate - o.rate;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(br.readLine());
		
		list = new ArrayList[V + 1];
		for (int i = 1; i < V + 1; i++) {
			list[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int rate = Integer.parseInt(st.nextToken());
			
			list[start].add(new Node(end,rate));
		}
		
		int[] result = new int[V + 1];
		boolean[] check = new boolean[V + 1];
		
		Arrays.fill(result, INF);
		result[K] = 0;
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(K,0));
		Node cur = null;
		
		while (!pq.isEmpty()) {
			cur = pq.poll();
			if (check[cur.end]) {
				continue;
			}
			
			for (Node next : list[cur.end]) {
				if (!check[next.end] && result[next.end] > result[cur.end] + next.rate) {
					result[next.end] = result[cur.end] + next.rate;
					pq.add(new Node(next.end,result[next.end]));
				}
			}
			
			check[cur.end] = true;
		}
		
		for (int i = 1; i < V + 1; i++) {
			if (result[i] == INF) {
				System.out.println("INF");
			} else {
				System.out.println(result[i]);
			}
		}
//		int[] line = new int[V+1];
//		boolean[] check = new boolean[V+1];
//		PriorityQueue<node> pq = new PriorityQueue<>(new Comparator<node>() {
//			@Override
//			public int compare(node o1, node o2) {
//				return o1.rate - o2.rate;
//			}
//		});
//		
//		for (int i = 1; i < V+1; i++) {
//			line[i] = list
//		}
//		
//		// 다익스트라
//		pq.add(new int[] {K,line[K]});
//		while (!pq.isEmpty()) {
//			int[] num = pq.poll();
//			check[num[0]] = true;
//			pq.clear();
//			
//			for (String key : map.keySet()) {
//				int goal = key.charAt(0) + '0';
//				if (goal != num[0]) {
//					continue;
//				}
//				if (num[1] + map.get(key) < line[goal]) {
//					line[goal] = num[1] + map.get(key);
//				}
//				pq.add(new int[] {goal,line[goal]});
//			}
////			for (int i = 1; i < V+1; i++) {
////				if (map.containsKey(num[0]+"0"+i)) {
////					line[i] = num[1] + map.get(num[0]+"0"+i) < line[i] ? num[1] + map.get(num[0]+"0"+i) : line[i];
////				}
////				if (!check[i]) {
////					pq.add(new int[] {i,line[i]});					
////				}
////			}
//		}
//		
//		for (int i = 1; i < V+1; i++) {
//			if (line[i] == INF) {
//				bw.append("INF\n");
//			} else {				
//				bw.append(line[i]+"\n");
//			}
//		}
//		
//		bw.flush();
//		bw.close();
	}
}
