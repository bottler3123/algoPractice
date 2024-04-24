package algo;
import java.util.Scanner;

public class Main_29751_삼각형 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextInt();
		float b = sc.nextInt();
		
		float result = a * b / 2;
		System.out.println(String.format("%.1f", result));
	}
}
