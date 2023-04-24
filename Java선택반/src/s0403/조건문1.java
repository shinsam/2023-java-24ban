package s0403;

public class 조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10;
		
		if( a != 0 )
			System.out.println(a+"는 0이 아니다.");
		else
			System.out.println(a+"는 0이다.");
		
		//char op = '/';
		String op="/" ;
		
		switch (op) {
			case "+":
				System.out.println(a+"+"+b +"=" + (a+b));
				break;
			case "-":
				System.out.println(a+"-"+b +"=" + (a-b));
				break;
			case "*":
				System.out.println(a+"*"+b +"=" + (a*b));
				break;
			case "/":
				System.out.println(a+"/"+b +"=" + (a/b));
				break;
			default:
				break;
		}	
		
		
		
	}

}
