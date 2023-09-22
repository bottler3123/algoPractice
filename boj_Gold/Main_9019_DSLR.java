package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_9019_DSLR {
	// boj Gold4
	
	static int B;
	static String[] dslr = {"D","S","L","R"};
	static boolean[] check;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			check = new boolean[10001];
			check[A] = true;
			Register register = new Register(A,"");
			bfs(register);
		}
		
		bw.flush();
		bw.close();
	}
	
	public static class Register {
		int A;
		String str;
		
		public Register(int A, String str) {
			this.A = A;
			this.str = str;
		}
	}
	
	private static void bfs(Register register) throws IOException {
		Queue<Register> queue = new LinkedList<Register>();
		queue.add(register);
		
		while (!queue.isEmpty()) {
			int size = queue.size();
			
			for (int i = 0; i < size; i++) {
				Register temp = queue.poll();	
				
				if (temp.A == B) {
					bw.append(temp.str + "\n");
					return;
				}
				
				for (int j = 0; j < 4; j++) {
					int move_num = DSLR(temp.A,j);
					if (!check[move_num]) {
						check[move_num] = true;
						queue.add(new Register(move_num, temp.str + dslr[j]));						
					}
				}
			}
		}
	}

	private static int DSLR(int before, int num) {
		int after = before;
		
		// D연산
		if (num == 0) {
			after *= 2;
			if (after >= 10000) {
				after %= 10000;
			}
		}
		
		// S연산
		if (num == 1) {
			after -= 1;
			if (after < 0) {
				after = 9999;
			}
		}
		
		// L연산
		if (num == 2) {
			int reg_L = (after % 1000 * 10) + (after / 1000);
			after = reg_L;
		}
		
		// R연산
		if (num == 3) {
			int reg_R = (after / 10) + (after % 10 * 1000);
			after = reg_R;
		}
		
		return after;
	}
	
}
