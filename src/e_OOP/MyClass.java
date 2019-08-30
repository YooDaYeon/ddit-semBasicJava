package e_OOP;

public class MyClass {
	//명사적 의미
	// 토너, 로션, 립밤, 썬크림, 틴트, 아이쉐도우,메이크업베이스,파운데이션,마스카라
	String[] coverMenu = new String[]{"토너", "로션", "립밤", "썬크림", "틴트"};
	// 아이라이너
	String drawMenu = "아이라이너";
	// 뷰러
	String pickMenu = "뷰러";
	
	//동사적의미
	void coverCo(String cover){
		System.out.println(cover +"를 바른다.");
	}
	
	void drawCo(String draw){
		System.out.println(draw +"를 그린다.");
	}
	
	
	
	
	
	
	
	
}
