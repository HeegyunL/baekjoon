package baekjoon;


import java.util.*;

public class Baek2480_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
//		a 중심으로 한쌍이 같은 경우
		if( a==b || a==c) {
			if(b==c) {
				System.out.println(10000+(a*1000));
			}else {
			System.out.println(1000+(a*100));
			}
		}else if(b==c){System.out.println(1000+(b*100));
		}else {
			if(a>b && a>c) {
				System.out.println(a*100);
			}else if(b>c){
				System.out.println(b*100);
				
			}else {System.out.println(c*100);}
			
		}
	}
}