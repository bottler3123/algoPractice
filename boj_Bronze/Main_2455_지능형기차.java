package algo0408;

import java.util.*;

public class Main_2455_지능형기차 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			int out_people = sc.nextInt();
			int in_people = sc.nextInt();
			sum -= out_people;
			if (sum > result) result = sum;
			sum += in_people;
			if (sum > result) result = sum;
		}
		System.out.println(result);
	}
}
