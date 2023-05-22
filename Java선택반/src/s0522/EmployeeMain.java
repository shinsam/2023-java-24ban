package s0522;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//직원으로 등록하고 자기이름, 학번, 나이를 출력하세요
		
		Employee e1 = new Employee();
		e1.setName("김로봇");
		e1.setNo(12345);
		e1.setAge(25);
		System.out.println(e1.toString());
		
		Employee e2 = new Employee("김현강",23450 , 17 );
		System.out.println(e2.toString());		
	}

}
