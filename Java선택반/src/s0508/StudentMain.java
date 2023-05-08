package s0508;

public class StudentMain {

	public static void main(String[] args) {
		Student kim = new Student();
		kim.SchoolName="서울로봇고";
		System.out.println(Student.SchoolName + "학생 객체수:" + Student.count );
		
		Student kang = new Student();
		System.out.println(Student.SchoolName + "학생 객체수:" + Student.count );
		
		Student bak = new Student();
		System.out.println(Student.SchoolName + "학생 객체수:" + bak.count );

		System.out.println(Student.PI);
	}

}
