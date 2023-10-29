package algo0408;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_2083_럭비클럽 {
	// boj Bronze4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int high = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			
			if (name.equals("#")) {
				break;
			}
			
			if (high > 17 || weight >= 80) {
				bw.append(name + " Senior\n");
			} else {
				bw.append(name + " Junior\n");				
			}
		}
		bw.flush();
		bw.close();
	}
}
