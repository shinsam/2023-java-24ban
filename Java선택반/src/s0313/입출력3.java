package s0313;

import java.util.Scanner;

public class 입출력3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		int sum;
		float avg;
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 수:");
		num1 = s.nextInt();
		System.out.print("두번째 수:");
		num2 = s.nextInt();
		System.out.print("세번째 수:");
		s.close();
		num3 = s.nextInt();
		sum = num1 + num2+num3;
		avg = sum / 3f; 
		System.out.println("합계:" + sum);
		System.out.println("평균:" + avg);
		s.close();
	}

}
