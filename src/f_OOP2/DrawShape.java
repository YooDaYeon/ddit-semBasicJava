package f_OOP2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;


public class DrawShape extends Frame{
	public static void main(String[] args) {
		String str = "다연이잘해라콱마";
		DrawShape ds = new DrawShape(str);
		//ds.paint(new Graphics());
	}
	
	@Override
	public void paint(Graphics g) {
		//1. Circle객체를 만들어 주세요
		//   단 매개변수가 두개인 생성자를 이용해주세요
		Point p1 = new Point(100,100);
		Circle ci = new Circle(p1,100);
			
		//2. g.drawOval()를 이용하여 원을 그려주세요
		g.drawOval(ci.center.x, ci.center.y, ci.r*2, ci.r*2);
		
		
		//3. Triangle객체를 만들어주세요
		//   단. 매개변수가 하나인 생성자를 이용해주세요
		//   점의 좌표는 100,100  200,200  100,200
		Point p2 = new Point(100,100);
		Point p3 = new Point(200,200);
		Point p4 = new Point(100,200);
		Point[] pa = new Point[3]; 
		
		pa[0] = p2;
		pa[1] = p3;
		pa[2] = p4;
				
		Triangle tri = new Triangle(pa);
		Triangle tri2 = new Triangle(p2,p3,p4);
		
		//4. g.drawLine()3개를 이용하여 삼각형을 그려주세요
		g.drawLine(tri.p[0].x, tri.p[0].y, tri.p[1].x, tri.p[1].y);
		g.drawLine(tri.p[0].x, tri.p[0].y, tri.p[2].x, tri.p[2].y);
		g.drawLine(tri.p[1].x, tri.p[1].y, tri.p[2].x, tri.p[2].y);
		//5. JVM그려오세요 (A4로 안되니 2장이상 붙여서 하셔야 합니다.)
		
	}
	
	
	public DrawShape() {
		super("알거없자나");
		setSize(500, 500);
		setVisible(true);
		setBackground(Color.MAGENTA);
	}
	
	public DrawShape(String title){
		super(title);
		setSize(500, 500);
		setVisible(true);
		setBackground(Color.MAGENTA);
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
}

/**
 * 점을 관리하기 위한 클래스
 * @author SEM
 */
class Point{
	int x; // 점의 x좌표
	int y; // 점의 y좌표
	
	Point(){
		this(0,0);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Circle{
	//1. 점 하나를 저장할수 있는 변수를 선언해주세요 center
	Point center;
	//2. 정수값 반지름을 저장할수 있는 변수를 선언해주세요 r
	int r;
	//3. 매개변수가 두개인 생성자를 만들어주세요
	//   넘어온 인자값으로 center와 r을 초기화해주세요
	Circle(Point center, int r){
		this.center =center;
		this.r = r;
	}
	//4. 기본생성자를 만들어주세요
	//   단. 매개변수가 두개인 생성자를 이용하여
	//       점은 100,100 반지름은 200으로 만들어주세요
	Circle(	){
		this(new Point(100,100),200);
	}
	
}

class Triangle{
	//1. 점 3개를 저장할수 있는 변수를 선언해주세요 p
	Point[] p; 
	//2. 매개변수가 하나인 생성자를 만들어주세요
	//   넘어온 인자값으로 p를 초기화해주세요
	Triangle(Point[] p){
		this.p=p;
	}
	//3. 매개변수가 세개인 생성자를 만들어주세요
	//   넘어온 인자값으로 p를 초기화해주세요
	Triangle(Point center1,Point center2, Point center3){
		p=new Point[3];
		p[0]=center1;
		p[1]=center2;
		p[2]=center3;
		
	}
	
}








