package i_javaLang;

import static java.lang.Math.*;

public class MyMathTest {
	public static void main(String[] args) {
		// 그 동안 반올림, 올림 하느라 고생하셨습니다.
		// Math클래스의 메서드를 이용하여 편하게 해봅시다.
		
		double d = 25.143636;
		
		//반올림
		System.out.println(round(d));
		
		//올림
		System.out.println(ceil(d));
		
		//버림
		System.out.println(floor(d));
		
		//제곱
		System.out.println(pow(3,4));
		
		//루트
		System.out.println(sqrt(3));
		
		//1. 포인트2 객체 두개를 만드세요
		Point2 pt1 = new Point2(1,1);
		Point2 pt2 = new Point2(2,2);
		
		//2. Point2클래스에 getDistance메서드를 만든 후
		//   인자값으로 넘겨준 Point2와의 거리를 반환해주세요
		System.out.println(pt1.getDistance(pt2));
		
		
	}
}

class Point2{
	int x;
	int y;
	
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	float getDistance(Point2 pt1){
		double result = sqrt(pow(pt1.x-x,2) + pow(pt1.y-y,2));
		float result2 = (int)(result*100+0.5)/100f; 
		return result2;
	}
	
}





