package s0410;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] num = new int[5];
		int max = 0, i = 0;
		
		System.out.println("정수5개를 입력하세요");
		
		while(i < 5) {
			System.out.print((i+1) + "번째 정수:" );
			
			num[i] = sc.nextInt();
			if(num[i] > max )
				max = num[i];
				
			i++;
		}
		
		System.out.println("최대값은 "+ max +  "입니다.");
	}

}
