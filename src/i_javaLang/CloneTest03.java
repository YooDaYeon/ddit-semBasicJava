package i_javaLang;

public class CloneTest03 {
	public static void main(String[] args) {
		Circle c = new Circle();
//		Circle c2 = (Circle)c.shallowCopy();
		Circle c2 = (Circle)c.deepCopy();
		System.out.println(c);
		System.out.println(c2);
		c.r = 20;
		c.p.x = 3;
		c.p.y = 5;
		System.out.println(c);
		System.out.println(c2);
		
		
	}
}

class Circle implements Cloneable{
	//1. 점 p, 반지름 r
	Point p;
	int r;
	//2. 매개변수가 두개인생성자
	Circle(Point p, int r){
		this.p = p;
		this.r = r;
	}
	
	//3. 기본생성자
	//  단 매개변수가 두개인 생성자를 이용하여 100,100 200
	Circle(){
		this(new Point(100,100), 200);
	}

	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}

	protected Object shallowCopy() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}
	
	protected Object deepCopy() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		((Circle)o).p = new Point(p.x, p.y);
		
		return o;
	}
	
	
}











