package e_OOP;

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car();
		Car c1 = new Car("white","auto",2);
		System.out.println(c1.color);
		Car c2 = new Car("red","auto");
	}
}

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){ //기본생성자
		color = "white";
		gearType = "stick";
		door = 4;
	}
	
	Car(String color, String gearType, int door){ //매개변수가 있는 생성자
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(String color, String gearType){ //매개변수가 있는 생성자
		this(); //Car()
		this.color = color;
		this.gearType = gearType;
	}
}







