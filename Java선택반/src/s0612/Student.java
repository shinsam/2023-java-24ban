package s0612;

public class Student {
	String name;
	String hakbun;
	String phone;
	
	//생성자 2개 만들자
	//기본생성자
	Student(){}
	Student(String name , String hakbun){
		this.name = name;
		this.hakbun = hakbun;
	}
	
	//메소드 만들기
	//잔다. 떠든다. 먹는다. 때린다.
	void sleep() {
		System.out.println(name + " 잔다.");
	}
	void noise() {
		System.out.println(name + " 떠든다.");
	}
	void eat() {
		System.out.println(name + " 먹는다.");
	}
	void hit() {
		System.out.println(name + " 때린다.");
	}
	void study() {
		System.out.println(name + " 공부하다.");
	}
}






