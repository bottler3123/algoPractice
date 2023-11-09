package algo0408;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main_14928_큰수BIG {
	// boj Bronze5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String N = br.readLine();
		long temp = 0;
        for (int i = 0; i < N.length(); i++) {
            temp = (temp * 10 + (N.charAt(i) - '0')) % 20000303;
        }
		
		bw.append(temp + "\n");
		bw.flush();
		bw.close();
		
	}
}
