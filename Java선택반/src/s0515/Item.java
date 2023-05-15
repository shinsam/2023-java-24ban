package s0515;

public class Item {
	//상품을 관리하는 클래스
	//상품 이름, 가격
	
	String 	name;
	int		price;
	
	//생성자
	Item(){}
	
	Item(String str){
		name = "제품명:" + str;//초기화
		
	}
	
	Item(String name , int price){
		this.name = "제품명:" + name;//초기화
		this.price = price*1000;
	}
	
	//메소드
	void printItemInfo(){
		System.out.println(name );
		System.out.println("출고가:" + price);
		System.out.println("---------------");
	}
	
	
}







