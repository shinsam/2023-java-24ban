package s0327;

import java.util.Scanner;

public class 연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 a를 입력받아서 짝수, 홀수 여부를 출력하시오
		// ex)숫자입력: 2
		// 2는 짝수입니다.
		
		//입력
		Scanner 입력기 = new Scanner(System.in);
		int a;
		System.out.print("숫자입력:");
		a = 입력기.nextInt();
		//판단
		if(a%2==0)
			System.out.println(a +"는 짝수입니다.");
		else
			System.out.println(a +"는 홀수입니다.");
		//출력
		
		
	}

}
