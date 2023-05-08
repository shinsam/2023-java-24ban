package s0508;

public class Student {
	String name;
	int grade;
	static int count = 0;
	static String SchoolName = "로봇고";
	static final float PI = 3.141592f;
	
	Student(){ //생성자
		count++ ; //생성할때마다 학생수를 증가시키려는 목적
	}

}
