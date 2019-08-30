package c_sentence;

import java.util.Scanner;


public class Sentence_02 {
	public static void main(String[] args) {
		/*
		1. 반복문( for, while, do-while)
		  - 어떤 작업을 반복적으로 수행되도록 할때사용된다.
		  - 반복문은 주어진 조건이 만족하는 동안 주어진 문장을 반복적으로 수행함으로
		    조건식을 포함한다.
		  - for문은 반복횟수를 알고있을때 활용, while문은 반복 횟수를 모를 때 사용
		  
		2. for문
		  - 기본구조
		    for( 초기화; 조건식; 증감식){
		    	조건식이 만족될때 수행될 문장
		    }
		
		*/
		
		
		// 0 -> 10  증가량 1씩
		for( int i = 0; i < 11 ; i++){
			System.out.println(i);
		}
		
		// 1~ 10까지의 합계를 구하세요
		int sum = 0;
		
		for(int i = 1; i < 11; i++){
			sum += i;
		}
		
		System.out.println(sum);
		
		// 34(미포함) ~ 95(포함)까지의 홀수일때의 합계를 구하세요
		//  35 ~ 96
		int sum2 = 0;
		for(int i = 35 ; i<96 ; i++){
			if(i%2 == 1){
				sum2 += i;
			}
		}
		System.out.println(sum2);
		
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 4
//		System.out.println(2+" * "+1+" = "+2*1);
//		System.out.println(2+" * "+2+" = "+2*2);
//		System.out.println(2+" * "+3+" = "+2*3);
//		System.out.println(2+" * "+4+" = "+2*4);
//		System.out.println(2+" * "+5+" = "+2*5);
//		System.out.println(2+" * "+6+" = "+2*6);
//		System.out.println(2+" * "+7+" = "+2*7);
//		System.out.println(2+" * "+8+" = "+2*8);
//		System.out.println(2+" * "+9+" = "+2*9);
//	
//		for (int i = 1; i < 10; i++ ){
//			System.out.println(2+ "*" + i + "=" +2*i);
//		}
//		
//		for (int i = 1; i < 10; i++){
//			System.out.println(3 + " * " + i + "=" + 3 * i);
//		}
//		
//		for (int i = 1; i < 10; i++){
//			System.out.println(4 + " * " + i + "=" + 4 * i);
//		}
//		
//		for (int i = 1; i < 10; i++){
//			System.out.println(5 + " * " + i + "=" + 5 * i);
//		}
//		
//		for (int i = 1; i < 10; i++){
//			System.out.println(6 + " * " + i + "=" + 6 * i);
//		}
//		
//		for (int i = 1; i < 10; i++){
//			System.out.println(7 + " * " + i + "=" + 7 * i);
//		}
//		
//		for (int i = 1; i < 10; i++){
//			System.out.println(8 + " * " + i + "=" + 8 * i);
//		}
//		
//		for (int i = 1; i < 10; i++){
//			System.out.println(9 + " * " + i + "=" + 9 * i);
//		}
		// 홀수단 이면서 짝수곱일때 구구단 출력
		for(int dan=2; dan<10; dan++){
			for(int gob=1; gob<10; gob++){
				if(dan%2 == 1 && gob%2==0){
					System.out.println(dan+"*"+gob+"="+gob*dan);
				}
			}
		}
		
		
		/*
		3. while문
		  - 조건식과 수행되어야할 블럭{}만으로 구성되어 있다.
		    카운터로 사용할 변수의 증감식을 함께 사용하여 for문과 같이 구성할 수 있다.
		  - 구조
		     while(조건식){
		     	조건식이 true일때 수행될 문장
		     }
		*/
		
//		for (int i = 0; i < 11; i++) {
//			System.out.println(i);
//		}
		
		int num = 0;
		while(num < 11){
			System.out.println(num);
			num++;
		}
		
		//1~10
		int sum3 = 0;
		for (int i = 1; i < 11; i++) {
			sum3 += i;
		}
		System.out.println(sum3);
		
		
		
		int sum4 = 0;	// 합
		int num4 = 1;	// 1~10을 담을 변수
		while(num4 < 11){
			if(num4%2==1){
				sum4 += num4;
			}
			num4++;
		}
		System.out.println(sum4);
		
		// 1~?합이 100보다 커지는 ?값은 무엇일까요??
//		int number = 0; //순차적으로 증가하는 변수
//		int sum5 = 0; //합계를 저장할 변수
//		while(sum5 <= 100){
//			number++;
//			sum5 += number;
//		}
//		System.out.println(number);
		int number = 1; //순차적으로 증가하는 변수
		int sum5 = 0; //합계를 저장할 변수
		while(true){
			sum5 += number;
			if(sum5 > 100){
				break;
			}
			number++;
		}
		System.out.println(number);
		
		
		/*
		4. do-while
		  - while문의 변형으로 기본구조는 while문과 유사하나 
		    {}을 먼저 수행하고 조건식을 판단한다.
		  - 기본구조
		    do{
		    	수행될 문장
		    }while(조건식);
		
		*/
		
		Scanner sc = new Scanner(System.in); //콘솔창에서 입력받을수 있는 환경구성
//		int result = sc.nextInt();
//		System.out.println(result);
		
		
		
//		System.out.println("문자를 입력해주세요");
//		String str = sc.next();
//		System.out.println(str);
		
		// 문장을 입력 받아서 입력받은 문장을 출력
		// 단. 입력받은 문장이 "x"이면 종료
//		String str = "";
//		do{
//			System.out.println("문자를 입력해주세요");
//			str = sc.next(); // 콘솔창에 문자열을 받을준비
//			System.out.println(str);
//		}while(!str.equals("x"));
		
		
		for (int i = 0; i < 11; i++) {
			if(i%2==1){
				System.out.println(i);
			}
		}
		
		for (int i = 0; i < 11; i++) {
			if(i%2==0){
				continue;
			}
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
