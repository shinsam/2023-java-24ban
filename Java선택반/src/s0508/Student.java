package s0508;

public class Student {
	private String name="이름없음";
	private int grade;
	private float score;
	
	static int count = 0;
	static String SchoolName = "로봇고";
	static final float PI = 3.141592f;
	
	Student(){ //생성자
		count++ ; //생성할때마다 학생수를 증가시키려는 목적
	}

	//이름을 저장
	void setName(String n) {
		name = n;
	}
	
	//이름을 리턴
	String getName(){
		return name ; 
	}
	
	//학년을 저장
	void setGrade( int g) {
		grade = g;
	}
	
	//학년을 리턴
	int getGrade() {
		return grade;
	}
	
	//성적 저장
	void setScore(float s) {
		score = s ; 
	}
	
	//성적 리턴
	float getScore() {
		return score;
	}
	
	void printAll() {//모든 정보 출력
		System.out.println( getName() + getGrade() + ":" + getScore());
	}
	
}








