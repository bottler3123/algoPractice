	package algo;
	
	import java.io.*;
	import java.util.*;
	
	public class Main_5430_AC {
		// boj Gold5
		
		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int T = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < T; i++) {
				String P = br.readLine();
				int n = Integer.parseInt(br.readLine());
				ArrayDeque<Integer> deque = new ArrayDeque<>();
				
				StringTokenizer st = new StringTokenizer(br.readLine(),"[],");
				for (int j = 0; j < n; j++) {				
					deque.add(Integer.parseInt(st.nextToken()));
				}
				
				boolean direction = true;
				boolean state = true;
				for (int j = 0; j < P.length(); j++) {
					if (P.charAt(j) == 'D') {
						if (deque.isEmpty()) {
							state = false;
							break;
						} else if (direction) {
							deque.pollFirst();
						} else {
							deque.pollLast();
						}
					} else {
						direction = !direction;
					}
				}
				
				if (state) {
					bw.write("[");
					int size = deque.size();
					if (direction) {
						for (int j = 0; j < size; j++) {
							bw.write(deque.pollFirst().toString());
							if (j < size - 1) {
								bw.write(",");
							}
						}
					} else {
						for (int j = 0; j < size; j++) {
							bw.write(deque.pollLast().toString());
							if (j < size - 1) {
								bw.write(",");
							}
						}
					}
					bw.write("]\n");
					
				} else {
					bw.write("error\n");
				}
			}
			
			bw.flush();
			bw.close();
		}
	
	}
