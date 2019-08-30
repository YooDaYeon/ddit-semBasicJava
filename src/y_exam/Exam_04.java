package y_exam;

import sun.print.resources.serviceui;

public class Exam_04 {
	public static void main(String[] args) {
		/*
		[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 
		      프로그램을 작성하시오.
		
		*/
//		for(int i = 1; i < 7; i++){
//			for(int j = 1; j < 7; j++){
//				if(i + j == 6){
//					System.out.println(i + "," + j);
//				}
//			}
//		}
		
		/*
		방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 
		각각의 범위는 0<=x<=10, 0<=y<=10 이다.
		*/
//		for(int x = 0; x < 11; x++){
//			for(int y = 0; y < 11; y++){
//				if(2 * x + 4 * y == 10){
//					System.out.println(x + " , " + y);	
//				}
//			}
//		}
		
		/*
		2*1=2  
		2*2=4  
		2*3=6  
		3*1=3
		3*2=6
		3*3=9
		4*1=4 
		4*2=8 
		4*3=12
		5*1=5  
		5*2=10  
		5*3=15
		6*1=6 
		6*2=12  
		6*3=18
		7*1=7
		7*2=14
		7*3=21
		8*1=8
		8*2=16
		8*3=24
		9*1=9
		9*2=18
		9*3=27
		*/
		
		for(int i=2; i<10; i++){
			for(int j=1; j<4;j++){
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
