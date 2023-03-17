package baekjoon;

import java.util.*;
public class Baek2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1; i<10;i++) {
			int result=a*i;
			System.out.println(a + " * " + i+" = "+ result);
		}
	}

}
