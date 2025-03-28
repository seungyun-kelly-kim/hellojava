package ch04.sec08.practice;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String ans = "n";

		while (ans.equals("n")) {
			int n = (int) (Math.random() * 100 + 1);
			System.out.println("=================");
			System.out.println("[숫자 맞추기 게임 시작]");
			System.out.println("=================");
			int input = -1;

			while (input != n) {
				System.out.print(">> ");
				input = scanner.nextInt();
				
				if (input > n) {
					System.out.println("더 낮게");
				} else if (input < n) {
					System.out.println("더 높게");
				} else if (input == n) {
					System.out.println("맞았습니다.");
					System.out.println("게임을 종료하시겠습니까? (y/n)");
					String buffer = scanner.nextLine();
					ans = scanner.nextLine();
					if (ans.equals("y")) {
						System.out.println("=================");
						System.out.println("[숫자 맞추기 게임 종료]");
						System.out.println("=================");
						break; //왜 모든 while문을 다 빠져나가지? y 해서 그런가?
					} else {
						continue;
					}
				}
			}
		}
	}
	}