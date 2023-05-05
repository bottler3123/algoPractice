package algo0408;

import java.math.BigInteger;
import java.util.*;

public class Main_1271_엄청난부자2 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		
		System.out.println(n.divide(m));
		System.out.println(n.remainder(m));
	}
}
