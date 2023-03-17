package baekjoon;

import java.util.*;
public class Baek2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int o = sc.nextInt();
		
		if(o<=1000&&h<25 && m<60) {
			int oh = h+(o/60);
			int om = m+o%60;
			
			if(om>59) {
				om = om-60;
				oh = oh+1;
			}
			if(oh>23) {
				oh = oh-24;
			}
			System.out.println(oh + " " + om);
			
		}else {System.out.println("다시 입력하시오");}
		
	}
}












