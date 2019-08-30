package e_OOP;

public class MyMathTest {
	public static void main(String[] args) {
		MyMath.add1();
		
		int result = MyMath.add2();
		System.out.println(result);
		
		int result2 = MyMath.add3(2);
		System.out.println(result2);
		
		MyMath x = new MyMath();
		int q = x.add4(1, 2);
		System.out.println(q);
		
		long result3 = x.multiply(3000, 3000, 3000);
		System.out.println(result3);
		
		float result4 = x.distance(1, 2, 3, 4);
		System.out.println(result4);
	}
}

class MyMath{
	
	static int one = 100;
	static int two = 200;
	
	// 매개변수 없고 반환값도 없다.
	// 클래스변수 one과 two의 값의 합계를 출력
	static void add1(){
		int result = one + two;
		System.out.println(result);
	}
	
	//매개변수 없고
	// 클래스변수 one과 two의 값의 합계를 반환하는 메서드 add2
	static int add2(){
		int result = one + two;
		return result;
	}
	
	//매개변수가 int형 하나
	// one과 two와 매개변수값의 합계를 반환하는 메서드 add3
	static int add3(int c){
		int result = one + two +c;
		return result;
	}
	
	//매개변수는 int형 두개
	// 매개변수 두개의 합을 반환하는 인스턴스 메서드 add4
	int add4(int a,int b){
		int result = a + b;
		return result;
	}
	
	// 매개변수는 int형 3개
	// 매개변수의 곱을 반화하는 인스턴스 메서드 multiply
	// 단. overflow를 고려하여 만들어주세요
	long multiply(int a, int b, int c){
		long result = (long)a*b*c;
		return result;
	}
	
	// 매개변수는 int형 4개 (x1,y1,x2,y2)
	// 두점사이의 거리를 소숫점 셋째자리에서 반올림하여
	// 두번째 자리까지 반환하는 메서드를 만들어주세요
	// 단 루트 Math.sqrt()
	float distance(int x1, int y1, int x2, int y2){
		double result = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		float result2 = (int)(result*100+0.5)/100f;
		return result2;
	}
}









