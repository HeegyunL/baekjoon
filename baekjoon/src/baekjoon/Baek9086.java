package baekjoon;

import java.util.Scanner;

public class Baek9086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=sc.nextInt();
	
		
			for(int i = 0;i<count;i++) {
				String voca = sc.next();
				int num = voca.length();
				if(num >0 && num <1001) {
				String first = voca.substring(0,1);
				String second = voca.substring(num -1, num);
				System.out.println(first+second);
			}
			
		}
	}
}
