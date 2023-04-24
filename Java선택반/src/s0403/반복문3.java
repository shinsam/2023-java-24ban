package s0403;

import java.util.Scanner;

public class 반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("N:");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i=1;
		
		while(true) {

			if(i%3==0) {
				i++;
				continue;
			}
			System.out.println(i+"\t");
			if(i==N)
				break;
			i++;
			
		}

	}

}
