package algo0408;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_11723_집합 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = Integer.parseInt(br.readLine());
		
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			int num = 0;
			switch (str) {
			case "add":
				num = Integer.parseInt(st.nextToken());
				set.add(num);
				break;
			case "remove":
				num = Integer.parseInt(st.nextToken());
				set.remove(num);
				break;
			case "check":
				num = Integer.parseInt(st.nextToken());
				if (set.contains(num)) {
					bw.append(1 + "\n");
				} else {
					bw.append(0 + "\n");
				}
				break;
			case "toggle":
				num = Integer.parseInt(st.nextToken());
				if (set.contains(num)) {
					set.remove(num);
				} else {
					set.add(num);
				}
				break;
			case "all":
				for (int j = 1; j < 21; j++) {
					set.add(j);
				}
				break;
			case "empty":
				set.clear();
				break;
			default:
				break;
			}
		}
		
		bw.flush();
		bw.close();
	}
}
