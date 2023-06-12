package s0612;

public class Leader extends Student{
	//- 학급회장인지 판정하는 멤버 변수(lead) 정의

	boolean lead; 
	
	
	
	Leader(boolean lead) {
		this.lead = lead;
	}
	Leader(String name , String hakbun, boolean lead){
		super(name, hakbun);
		this.lead = lead;
	}


	//메소드 :
	//- 학급회장인지를 판정하여 출력하는 메소드 (isLeader()) 정의
	void isLeader(){
		if(lead==true)
			System.out.println(name + "학급회장");
		else
			System.out.println(name + "학급회장 아니다.");
	}
}
//- 객체 생성 시 학급회장 매개 변수(lead)를 전달하는 생성자 정의
