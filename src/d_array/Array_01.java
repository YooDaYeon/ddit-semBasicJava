package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_01 {
	public static void main(String[] args) {
		/*
		1. 배열(Array)이란?
		  - 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		  - 3과목 점수
		    : int mathScore = 20;
		    : int korScore = 70;
		    : int engScore = 60;
		    
		2. 배열의 선언
		  - 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 알리는 대괄호[]를
		    붙이면 된다.
		    
		    ex) 변수타입[] 변수명;
		        변수타입 변수명[];
		        
		3. 배열의 생성
		  - 배열을 선언한 다음에는 배열을 생성해야 된다.
		  - 배열 생성을 위해서는 연산자 'new'와 함께 배열의 크기를 지정해 주어야 한다.
		    ex) int[] a = new int[5];
		        int[] a = new int[5]{0,10,20,30,40};
		
		*/
		int[] a = new int[5]; //5개의 방 => a.length : 5
		
		for(int i =0; i<a.length; i++){
			System.out.println(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = i*10;
		}
		
		for(int i =0; i<a.length; i++){
			System.out.println(a[i]);
		}
		
		int[] b;
		b= new int[]{0,10,20,30,40};
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		int[] c = {0,10,20,30,40};
		
		//1. 7개의 정수값을 저장할수 있는 변수 score를 선언 및 생성해주세요
		int[] score = new int[7];
		//2. score변수 각방의 값을 출력해주세요
		for(int i = 0 ; i < score.length ; i++){
			System.out.println(score[i]);
		}
		
		//3. score의 각방의 값을 0~100사이의 랜덤한 값을 저장해주세요
		for(int i = 0 ; i < score.length ; i++){
			score[i]=(int)(Math.random()*101);
		}
		
		System.out.println(Arrays.toString(score));
		
		//4. score 각방의 합계를 구하세요
//		int sum =0;
//		sum += 1;		
//		sum += 2;
//		sum += 3;
//		sum += 4;
//		sum += 5;
		
//		int sum= 0;
//		for(int i=1; i<6; i++){
//			sum += i;
//		} 
//		System.out.println("?"+sum);
		
		int sum = 0;
		for(int i=0; i<score.length; i++){
			sum+=score[i];
		}
		System.out.println(sum);
		
		//5. score 모든방의 평균을 구해주세요
		//   단. 소숫점 셋째자리에서 반올림하여 두번째 자리까지 표현해주세요
		float z = (int)(sum/(float)score.length*100 + 0.5)/100f;
		System.out.println(z);
		
		//6. score방의 값중 최대값을 구하세요
		int max = score[0];
		for(int i = 1; i < score.length; i++){
			if(max < score[i]){
				max = score[i];
			}
		}
		System.out.println(max);
		//7. score방의 값중 최소값을 구하세요
		int min = score[0];
		for(int i = 1; i < score.length; i++){
			if(min > score[i]){
				min = score[i];
			}
		}
		System.out.println(min);
		
		//1. 3과목의 정수값을 저장할수 있는 변수를 선언 및 생성해주세요 threeSub
		int[] threeSub = new int[3];
		//2. 3과목의 값을 사용자로 부터 입력받으세요
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("숫자를 입력해주세요");
//		threeSub[0] = sc.nextInt();
//		
//		System.out.println("숫자를 입력해주세요");
//		threeSub[1] = sc.nextInt();
//		
//		System.out.println("숫자를 입력해주세요");
//		threeSub[2] = sc.nextInt();
		
		for (int i = 0; i < threeSub.length; i++) {
			System.out.println("숫자를 입력해주세요");
			threeSub[i] = sc.nextInt();
		}
		//3. 3과목의 합계를 구해주세요
		int sum2 = 0;
//		sum2 += threeSub[0];
//		sum2 += threeSub[1];
//		sum2 += threeSub[2];
		for (int i = 0; i < threeSub.length; i++) {
			sum2 += threeSub[i];
		}
		System.out.println(sum2);
		//4. 3과목의 평균을 구해주세요
		float avg = (int)((float)sum2/threeSub.length*100+0.5)/100f;
		System.out.println(avg);
		
		//1. 정수 6개를 저장할수 있는 변수 lotto를 선언 및 생성해주세요
		
		//2. 1~45 사이의 랜덤한 정수값으로 lotto의 모든방에 입력해주세요
		//   단. 정수값은 중복되면 안된다.
		
		
		
		
		
		
	}
}
