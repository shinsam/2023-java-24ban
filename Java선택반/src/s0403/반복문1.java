package s0403;

import java.util.Scanner;

public class 반복문1 {

	public static void main(String[] args) {
		// 예제26
		// 어떤수 N을 입력받아 1~N까지의 계산을 한다.
		// 단, 짝수는 - , 홀수는 +
		
		int N;
		int sum = 0;
		//입력
		System.out.println("N입력:");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		//반복문
		for(int i = 1 ; i <=N ; i++)
			if( i%2 == 0 ){//짝
				sum = sum - i;   
				System.out.print("-"+i);
			}else{//홀
				sum = sum + i;
				System.out.print("+"+i);
			}
		//출력 :+1-2+3-4+5-6=-3
		System.out.println("=" + sum);
	}

}





