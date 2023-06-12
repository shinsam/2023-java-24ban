package s0612;
//부모
public class Car {
	String carname; 		 // 차 이름
	String color = "검정색" ;  // 차 색상 
	private int velocity; 			 // 속도
	
	void speedUp() {
		velocity +=5;
	}
	
	void speedDown() {
		velocity -=5;
	}
}
