package s0522;

public class Employee { //직원 클래스
	//멤버변수를 정의하시오
	private String 	name;
	private int 	no;
	private	int 	age;
	
	//생성자 
	Employee(){
		
	}
	Employee(String name, int no, int age){
		this.name = name;
		this.no = no;
		this.age = age;
	}
	
	//get_set
	String getName() {	return name; }
	int getNo() {return no;}
	int getAge() {return age;}
	
	void setName(String name) {
		this.name = name;
	}
	void setNo(int no) {
		this.no = no;
	}
	void setAge(int age) {
		this.age = age;
	}
	
	//정보 출력하는 메소드
	@Override
	public String toString() {
		return "이름:" + name + " 번호:" + no + " 나이:" + age;
	}
	

}






