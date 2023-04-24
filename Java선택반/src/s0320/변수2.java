package s0320;

public class 변수2 {

	public static void main(String[] args) {
		int a = 128;
		byte b = (byte)a;
		System.out.println(b);
		
		String s1 = "java";
		String s2 = "java";
		if(s1==s2) {//주소가 같니?
			System.out.println(s1+"같은주소");//정답
		}else {
			System.out.println(s1+"다른주소");
		}
		
		String s3 = new String("abc");
		String s4 = new String("abc");
		if(s3==s4)//주소가 같니?
			System.out.println(s3+"같은주소");	
		else
			System.out.println(s3+"다른주소");//정답
		

	}

}
