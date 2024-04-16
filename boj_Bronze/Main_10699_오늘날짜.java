package algo;

import java.time.LocalDate;
import java.time.ZoneId;

public class Main_10699_오늘날짜 {
	// boj Bronze5
	
	public static void main(String[] args) {
		LocalDate today = LocalDate.now(ZoneId.of("Asia/Seoul"));
		System.out.println(today);
	}
}
