package s0327;

import java.util.Scanner;

public class 배열2 {

	public static void main(String[] args) {
//		5명 학생들의 성적을 입력 받아서 배열에 저장하고, 합계와 평균을 계산하여 출력하는 
//		프로그램을 작성해보자

		int score[] = new int[5]; //0,1,2,3,4
		int sum=0;
		double avg;
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		//합
		for(int i=0; i< score.length ; i++  ) {
			System.out.print("성적입력:");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		
		//평균
		avg = (double)sum / score.length ; 
		
		//출력
		
		System.out.printf("평균:%.2f\n" , avg);
		System.out.println("합계:" + sum);
		
	}

}
