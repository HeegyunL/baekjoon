package baekjoon;

import java.util.*;

public class Baek25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int all = sc.nextInt();
		int amount = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<amount; i++) {
			int  goods= sc.nextInt();
			int gAmount = sc.nextInt();
			
			sum += (goods * gAmount);
			
		}
		if(all == sum) {
			System.out.println("Yes");
		}else {System.out.println("No");}
	}
}