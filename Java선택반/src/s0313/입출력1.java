package s0313;

import java.lang.*;
import java.util.Scanner;


public class 입출력1 {

	public static void main(String[] args) {
		System.out.println("20600 홍길동");
		System.out.println("3과 4를 결합:" + 3+ 4);
		System.out.println("나는 \"안녕\"하고 말했다.");
		
		Scanner s = new Scanner(System.in);
		System.out.print("나이입력:");
		int age = s.nextInt();
		System.out.println("내 나이는 " + age +"세");
		 		
	}
}
