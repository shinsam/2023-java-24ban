package s0612;

public class EngHello extends Greeting{
	public String name = "Kim Hyun Kang";
	public void sayHello() {
		System.out.println(name + " Hello");
	}
	public void sayGreeting() { //부모 클래스 메소드 호출하기
		super.sayHello();
	}
	
	public static void main(String[] args) {
		EngHello eng = new EngHello();
		eng.sayHello();
		eng.sayGreeting();
		
	}
}
