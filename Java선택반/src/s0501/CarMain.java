package s0501;

import s0417.Student;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		Car yourCar = new Car("진수", "파랑" , 100);
		Car yourCar2 = new Car("현강", "파랑" , 100);
		
		myCar.owner = "예섭";
		myCar.km = 0;
		myCar.speed = 0;
		myCar.color = "핑크";
		myCar.printCarInfo();
		myCar.run();
		myCar.run();
		myCar.run();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.stop();
		
		
		yourCar.printCarInfo();
		yourCar.speedUp();
		
		Student s = new Student();
		 
	}

}
