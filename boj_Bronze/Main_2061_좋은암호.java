package algo0408;

import java.math.BigInteger;
import java.util.*;

public class Main_2061_좋은암호 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger K = new BigInteger(sc.next());
		BigInteger L = new BigInteger(sc.next());
		int N = 0;
		
		for(int i = 2; i < L.intValue(); i++) {
			if((K.remainder(BigInteger.valueOf(i))).compareTo(BigInteger.ZERO) == 0) {
				N = i;
				break;
			}
		}
		String S = (N > 0)? ("BAD " + N) : "GOOD";
		
		System.out.println(S);
	}
}
