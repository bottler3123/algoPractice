package practice;

import java.util.Scanner;
import java.util.Stack;

public class Main_1094_막대기 {
	// boj Silver5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); // 만들어야하는 막대 길이

		int cnt = 1; // 막대의 수
		int sum = 0; // 막대 길이의 합

		Stack<Integer> stack = new Stack<>(); //
		stack.add(64); // 64길이의 막대 추가

		while (!stack.isEmpty()) {

			if (sum == X || X == 64) { // 막대길이의 합이 X면 탈출, 막대길이가 64일 경우 쪼갤 필요가 없으므로 예외
				cnt = stack.size(); // 막대길이의 합이 X면 스택길이 = 막대수
				break;
			}

			int temp = stack.pop();
			int half = temp / 2; // 막대를 반으로 쪼갬
			sum += half; // 쪼갠 것 중 하나를 길이 합에 더함

			if (sum >= X) { // 막대길이의 합이 X보다 크거나 같으면
				sum -= half; // 쪼갠 막대 하나를 버림
				stack.add(half); // 남은 막대 하나 스택에 넣음
			} else {
				stack.add(half); // 쪼갠 막대 둘 다 스택에 넣음
				stack.add(half);
			}

			if (sum + half == X) { // 남은 막대 길이와 쪼갠 막대의 합이 X면 막대 수 반환
				cnt = stack.size();
				break;
			}

//				System.out.println("막대모음 : " + stack);
//				System.out.println("막대길이 합: " + sum);

		}

//			System.out.println("막대길이 합: " + sum);
		System.out.println(cnt);
	}

}
