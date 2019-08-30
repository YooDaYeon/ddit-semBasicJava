package c_sentence;

public class Sentence_01 {
	public static void main(String[] args) {
		/*
		1. 조건문 (if, switch)
		  - 조건식과 문장을 포함하는 블럭{}으로 구성되어 있다.
		  - 조건식과 연산결과에 따라 프로그램의 실행흐름을 변경할 수 있다.
		  
		2. if문
		  - 구조
		    1) 기본구조
		      if(조건식){
		      	조건식이 true일때 수행될 문장
		      }
		      
		    2) 1단변신
		      if(조건식){
		      	조건식이 true일때 수행될 문장
		      } else {
		      	조건식이 false일때 수행될 문장
		      }
		      
		    3) 2단변신
		      if(조건식1){
		      	조건식1이 true일때 수행될 문장
		      } else if(조건식2){
		      	조건식1이 false이고 조건식2가 true 일때 수행될 문장
		      } else {
		      	조건식1과 조건식2가 false일때 수행될문장.
		      }
		      
		
		*/
		int a = -20;
		
//		if(a > 0){
//			System.out.println("양수");
//		}
//		
//		if(a < 0){
//			System.out.println("음수");
//		}
//		
//		if(a == 0){
//			System.out.println("0이다");
//		}
		
		if(a>0){
			System.out.println("양수");
		} else if(a<0){
			System.out.println("음수");
		} else {
			System.out.println("0이다");
		}
		
		
		boolean power = true;
		
		// power의 값이 true이면 "불켜졌습니다"를 출력해주세요
		
//		if(power){
//			System.out.println("불 켜졌습니다.");
//		}
//		
//		if(power == false){
//			System.out.println("불 꺼졌습니다.");
//		}
		
		if(power){
			System.out.println("불 켜졌습니다.");
		} else{
			System.out.println("불 꺼졌습니다.");
		}
		
		
		//1. 0(포함)~100(포함)의 정수값을 저장할수 있는 변수 score를 선언 및
		//   랜덤한 값으로 초기화 해주세요
		int score = (int)(Math.random()*101);
		System.out.println(score);
		//2. score의 점수가 90점 이상이면 "A"출력해주세요
		//   score의 점수가 80점 이상이면 "B"출력해주세요  
		//   score의 점수가 70점 이상이면 "C"출력해주세요  
		//   score의 점수가 60점 이상이면 "D"출력해주세요  
		//   score의 점수가 60점 미만이면 "나가"출력해주세요 
		
		score = 97;
		if (90 <= score){
			System.out.print("A");
			if(score>=95){
				System.out.println("+");
			} else{
				System.out.println("-");
			}
		} else if(80 <= score){
			System.out.println("B");
			if(score>=85){
				System.out.println("+");
			} else{
				System.out.println("-");
			}
		} else if(70 <= score){
			System.out.println("C");
			if(score>=75){
				System.out.println("+");
			} else{
				System.out.println("-");
			}
		} else if(60 <= score){
			System.out.println("D");
			if(score>=65){
				System.out.println("+");
			} else{
				System.out.println("-");
			}
		}  else{
				System.out.println("나가");
		}
		
		
		/*
		2. switch문
		  - 조건의 경우가 많을때는 if문 보다는 switch문을 사용하는 것이 더 알아보기 쉽다.
		  - 조건의 결과값으로 int형 범위의 정수값을 허용한다.
		  - 구조
		    switch(조건식){ //값
		    case 값1 : 
		    	조건식과 값1이 동일한 경우 수행
		    	break;
		    case 값2 : 
		    	조건식과 값2이 동일한 경우 수행	
		    	break;
		    default : 
		    	조건식과 일치하는 case가 없을때 수행
		    }
		
		*/
		
		//1. 1~5사이의 랜덤한 값을 저장하는 변수 random을 선언 및 초기화해 주세요
		int random = (int)(Math.random()*5+1);
		System.out.println(random);
		
		//2. random의 값이 5이면 "강남에 아파트 100평 당첨" 을 출력하세요
		//   random의 값이 4이면 "강남에 아파트 40평 당첨" 을 출력하세요
		//   random의 값이 3이면 "부가티 풀옵션 당첨" 을 출력하세요
		//   random의 값이 2이면 "샤넬백 당첨" 을 출력하세요
		//   random의 값이 1이면 "교보빌딩 10채 내놔" 을 출력하세요
		
		switch(random){
		case 5:
			System.out.println("강남에 아파트 100평 당첨");
			break;
		case 4:
			System.out.println("강남에 아파트 40평 당첨");
			break;
		case 3:
			System.out.println("부가티 풀옵션 당첨");
			break;
		case 2:
			System.out.println("샤넬백 당첨");
			break;
		default:
			System.out.println("교보빌딩 10채 내놔");
		}
		
		
		if (90 <= score){
			System.out.print("A");
		} else if(80 <= score){
			System.out.println("B");
		} else if(70 <= score){
			System.out.println("C");
		} else if(60 <= score){
			System.out.println("D");
		}  else{
			System.out.println("나가");
		}
		
		
		//3. 위 문장을 switch문으로 변경해 오세요
		//   단. case는 5개 default 1개로 구성하세요
		switch(score/10) {
		case 10 : case 9 : 
			System.out.println("A");
			break;
		case 8	: 
			System.out.println("B");
			break;
		case 7	: 
			System.out.println("C");
			break;
		case 6	: 
			System.out.println("D");
			break;
		default : 
			System.out.println("나가");
		}
		
		
		
		
		
		
		
	}		
}

