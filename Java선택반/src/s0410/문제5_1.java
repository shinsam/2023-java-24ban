package s0410;

import java.util.Scanner;

public class 문제5_1 {

	public static void main(String[] args) {
		// while
		System.out.print("숫자입력:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// 7 : +1 -2 +3 -4 +5 -6 +7
		int sum = 0;
		
		int i=1;
		while(i<=num) {
			if (i % 2 != 0) { // 홀수
				sum += i;
				System.out.print("+" + i);

			} else {// 짝수
				sum -= i;
				System.out.print("-" + i);
			}	
			i++;
		}
		System.out.print("=" + sum);
	}

}
