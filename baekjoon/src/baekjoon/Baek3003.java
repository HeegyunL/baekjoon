package baekjoon;

import java.util.Scanner;

public class Baek3003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				int[] a = {1,1,2,2,2,8};
				int[] b = new int[6];
				for(int i =0; i <6;i++) {
					b[i] = sc.nextInt();
				}
				
				for(int j =0; j<6;j++ ) {
					int result = a[j] - b[j];
					
					System.out.println(result);
				}
				
				
				
	}

}
