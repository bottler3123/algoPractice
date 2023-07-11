package algo0408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main_1247_부호 {
	// boj Bronze3
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 3; i++) {	
			int N = Integer.parseInt(br.readLine());
			
			BigInteger result = new BigInteger("0"); 
			BigInteger zero = new BigInteger("0");
			
			for (int j = 0; j < N; j++) {
				String str = br.readLine();
				BigInteger temp = new BigInteger(str);
				result = result.add(temp);
//				System.out.println(result);
			}
			
			if (result.compareTo(zero) == 0) {
				System.out.println(0);
			} else if (result.compareTo(zero) == -1) {
				System.out.println("-");
			} else if (result.compareTo(zero) == 1) {
				System.out.println("+");
			}
		}
	}
}
