package e_OOP;

public class PrintCall {
	public static void main(String[] args) {
		CallTest c = new CallTest();
		
		int x = c.add();
		System.out.println(x);
		
		int x1 = c.add(10);
		System.out.println(x1);
		
		long x2 = c.add(10L);
		System.out.println(x2);
		
		int x3 = c.add(5, 6);
		System.out.println(x3);
		
		long result0 = c.add(8,9);
		System.out.println(result0);
		
		long result = c.add(1,10L);
		System.out.println(result);
		
	}
}

class CallTest{
	
	int a1 = 3;
	int b1 = 5;
	
	long a2 = 6L;
	long b2 = 8L;
	
	//1. a1과 b1의 합을 반환하는 메서드를 만들어주세요 add
	int add(){
		int result = a1 + b1;
		return result;
	}
	//2. int형 매개변수 하나를 받아서 b1과의 합계를 반환하는 메서드를 만들어주세요 add
	int add(int x){
		int result = b1 + x;
		return result;
	}
	//3. long형 매개변수 하나와 a2의 합계를 반환하는 메서드를 만들어주세요 add
	long add(long x1){
		long result = x1 + a2;
		return result;
	}
	
	//4. int형 매개변수 두개를 받아서 a1,b1 그리고 매개변수 두개의 합계를 반환하는 메서드를
	//   만들어주세요 add
	int add(int x2, int x3){
		int result = a1 + b1 + x2 + x3;
		return result;
	}
	//5. int형 매개변수 두개를 받아서 a2,b2 그리고 매개변수 두개의 합계를 반환하는 메서드를
	//   만들어주세요 add
//	long add(int x4, int x5){
//		long result = a2 + b2 + x4 + x5;
//		return result;
//	}
	//6. long형 매개변수 두개를 받아서 매개변수의 합을 반환하는 메서드를 만들어주세요 add
	long add(long a2, long b2){
		long result0 = a2 + b2;
		return result0;
	}
	//7. int형 매개변수 하나와 long매개변수 하나를 받아서 그 합을 반환하는 메서드를
	//   만들어주세요 add
	long add(int x, long y){
		long result = x + y;
		return result;
	}
	
	
	
	
	
	
	
}



