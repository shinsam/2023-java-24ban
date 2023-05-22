package s0522;

public class Account {
	//멤버변수 3가지
	private String 	name;//예금주
	private int		no; //계좌번호
	private int 	balance ;	//잔액
	
	//생성자 3가지
	Account(){}
	Account(String name , int no){
		this.name = name;
		this.no = no;
	}
	Account(String name , int no, int balance){
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	//get 3가지
	String getName() {return name;}
	int getNo() 	 {return no;}
	int getBalance() {return balance;}
	
	//set 3가지
	void setName(String name) {
		this.name = name;
	}
	void setNo(int no) {
		this.no = no;
	}
	void setBalance(int balance) {
		this.balance = balance;
	}
	
	//printInfo()
	//"[계좌정보]예금주:이예섭 계좌번호:12345 현재잔고:3000000"
	void printInfo() {
		System.out.println("=====[계좌정보]======");
		System.out.println("예금주:" + name );
		System.out.println("계좌번호:" + no );
		System.out.println("현재잔고:" + balance );
	}
	
	void 입금(int money) {
		balance += money;
		//OOO님 OO원입금하여 현재잔액 OO원
		System.out.println(name + "님 " + money +"원 입금하여 현재잔액 " + balance +"원");
	}
	
	void 출금(int money) {
		//잔액이 부족하면??? 
		if( money < balance) {//정상출금
			balance -= money;
			//OOO님 OO원출금하여 현재잔액 OO원
			System.out.println(name + "님 " + money +"원 출금하여 현재잔액 " + balance +"원");
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
}








