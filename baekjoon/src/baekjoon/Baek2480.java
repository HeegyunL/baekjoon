package baekjoon;

import java.util.Arrays;
import java.util.Random;

public class Baek2480 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] dice = { 1, 2, 3, 4, 5, 6 };
		int[] result = new int[3];
		for (int i = 0; i < result.length; i++) {
			result[i] = rd.nextInt(6);
			System.out.println("No.dice" + i + " = " + dice[result[i]]);
		}

		loop:
		for (int i = 0; i < result.length; i++) {
			for (int j = i + 1; j < result.length; j++) {
				if (dice[result[i]] == dice[result[j]]) {
					
					for (int k = j + 1; k < result.length; k++) {
						if (dice[result[k]] == dice[result[j]]) {
							System.out.println(10000+(dice[result[i]]*1000));break loop;
						}
					}
					System.out.println(1000+(dice[result[i]]*100));break loop;
				}
			}
			if(dice[result[0]] != dice[result[i]]) {
				Arrays.sort(result);
				System.out.println(dice[result[result.length-1]]*100); break loop;
			}
		}
	}
}