package baekjoon;

import java.util.Scanner;

public class Baek27866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String voca = sc.next();
		int num = voca.length();
		if(num >0 && num <1001) {
			
			int turn = sc.nextInt();
			String result = voca.substring(turn-1,turn);
			System.out.println(result);
		}
	}
}
