package algo0408;

import java.io.*;
import java.util.*;

public class Main_1476_날짜계산 {
	// boj Silver5
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int result = 1;
		int Ee = 1;
		int Ss = 1;
		int Mm = 1;

		while (true) {
			if (Ee == E && Ss ==S && Mm == M) {
				System.out.println(result);
				break;
			}
			
			result++;
			Ee++;
			Ss++;
			Mm++;
			
			if (Ee > 15) Ee = 1;
			if (Ss > 28) Ss = 1;
			if (Mm > 19) Mm = 1;
		}
	}

}
