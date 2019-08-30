package e_OOP;

public class DoubleDiceTest {
	public static void main(String[] args) {
		//throwDice호출 총 이동거리를 반환
		DoubleDice dd = new DoubleDice();
		int result = dd.throwDice();
		System.out.println(result);
	}
}


class DoubleDice{
	// 메서드명 : throwDice
	//인스턴스 메서드
	int throwDice(){
		int one = (int)(Math.random()*6+1);
		int two = (int)(Math.random()*6+1);
		System.out.println(one +" , "+two);
		int result = one + two;
		if(one == two){
			result += throwDice();
		}
		return result;
	}
}