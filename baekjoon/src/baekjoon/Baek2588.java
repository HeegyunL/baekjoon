package baekjoon;

import java.util.Scanner;

public class Baek2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				int b = sc.nextInt();
				String strB = String.valueOf(b);
				char[] bList = strB.toCharArray();
				
				for(int i=2; i>=0;i--) {
					int k = bList[i]-'0';
					int result = a * k;
					System.out.println(result);
				}
				System.out.println(a*b);
	
				
				
				
				
	}

}
