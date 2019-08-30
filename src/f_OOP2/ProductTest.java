package f_OOP2;

import java.util.Vector;

public class ProductTest {
	public static void main(String[] args) {
		Tv t1 = new Tv("LG Curved", 800);
		CoffeeMachine cf = new CoffeeMachine("네스프레소", 80);
		BodyFriend bf = new BodyFriend("바디프렌드", 700);
		
		Buyer b = new Buyer("박서경", 10000);
		
		b.buy(t1);
		b.buy(t1);
		b.buy(t1);
		b.buy(cf);
		b.buy(bf);
		System.out.println();
		
		b.refund(t1);
		b.refund(cf);
		b.summary();
		
		System.out.println(b.item.size());
		
		Buyers bs = new Buyers();
		bs.listBuyer();
	}
}

class Product{
	String name;
	int price;
	int mileage;
	
	Product(String name, int price) {
		this.name = name;
		this.price = price;
		mileage = price/100;
	}
}

class Tv extends Product{
	Tv(String name, int price){
		super(name, price);
	}

	@Override
	public String toString() {
		return "Tv";
	}
}

class CoffeeMachine extends Product{
	CoffeeMachine(String name, int price){
		super(name, price);
	}

	@Override
	public String toString() {
		return "CoffeeMachine";
	}
}

class BodyFriend extends Product{
	BodyFriend(String name, int price){
		super(name, price);
	}
	
	@Override
	public String toString() {
		return "BodyFriend";
	}
}

class Buyer{
	String name;
	int money;
	int mileage;
	
	Vector<Product> item = new Vector<Product>(); //구매내역
	
	public Buyer(String name,int money) {
		this.name = name;
		this.money = money;
	}
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("나가");
			return;
		}
		
		money -= p.price;
		mileage += p.mileage;
		item.add(p);
		System.out.println("아이고 고객님~ "+ p +"를 구매해주셔서 감사합니다.");
	}
	
	// refund 반품
	void refund(Product p) {
		
		//1. 물건을 가지고 있는지 확인
		if(item.isEmpty()){ //인스턴스는 생성되었으나 아무것도 없는 상태 없으면 
			System.out.println("구매하신 물품이 존재하지 않습니다.");
			return;
		}
		//2. 물건을 반품
		if(item.remove(p)){ //물품이 삭제됬으면 true 물품이 없어서 삭제되지 않았다면 false
			//반품성공
			money += p.price;
			mileage -= p.mileage;
			System.out.println(p+"를 반품하였습니다.");
		} else {
			//구매물품중에 반품할 물품이 없음
			System.out.println("함마가져와라");
		}
		
//		for (int i = 0; i < item.size(); i++) {
//			if(p == item.get(i)){
//				item.remove(i);
//				money += p.price;
//				mileage -= p.mileage;
//				System.out.println(p+"를 반품하였습니다.");
//				return;
//			} else {
//				System.out.println("함마가져와라");
//			}
//		}
	}
	
	
	// summary 영수증
	/*
		
			영	수	증
			
	구매물품
		Tv            800만원
		CoffeeMachine 70만원
		BodyFriend    700만원
		총합          1570만원
		
	고객님의 남은돈은 8430만원이고 
	         마일리지는 157만점 입니다.
	이용해 주셔서 감사합니다.
	*/
	void summary(){
		int sum = 0;
		System.out.println("\t영수증");
		System.out.println("구매상품");
		for(int i=0; i<item.size(); i++){
			sum += item.get(i).price;
			System.out.println(item.get(i).name + "," + item.get(i).price);
		}
		System.out.println("총합 : " + sum);
		System.out.println("마일리지 : " + mileage);
	}
	
}

class Buyers{
	Vector<Buyer> buyer = new Vector<Buyer>();
	
	{
		Buyer b1 = new Buyer("이씨", 100);
		buyer.add(b1);
		
		Buyer b2 = new Buyer("김씨", 100);
		buyer.add(b2);
		
		Buyer b3 = new Buyer("박씨", 100);
		buyer.add(b3);
		
		Buyer b4 = new Buyer("이영씨",200);
		buyer.add(b4);
		
		
	}
	

	//사람추가
	boolean addBuyer(Buyer b){ // 사람, 이름/돈
		boolean result = buyer.add(b);
		return result;
	}
	
	//사람 삭제 //사람, 이름
	Buyer removeBuyer(String name) {
		Buyer b = null;
		for(int i = 0; i < buyer.size(); i++){
			if(name == buyer.get(i).name){
				b = buyer.remove(i);
			}
		}
		return b;
	}
	
	//돈 충전   //이름,돈
	void chargeMoney(String name, int money){
		for(int i = 0; i < buyer.size(); i++){
			if(name.equals(buyer.get(i).name)){
				buyer.get(i).money += money;
			}
		}
	}
	
	//사람목록을 출력
	//   이름    가진돈     마일리지
	void listBuyer(){
		System.out.println("이름\t가진돈\t마일리지");
		for(int i = 0; i < buyer.size(); i++){
			Buyer bName = buyer.get(i);
			System.out.println(bName.name+"\t"+bName.money+"\t"+bName.mileage);
		}
	}
}

























