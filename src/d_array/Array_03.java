package d_array;

public class Array_03 {
	public static void main(String[] args) {
		/*
		1. 다차원 배열
		  - 자바에서는 1차원 배열뿐만 아니라 2차원 이상의 다차원 배열도 허용한다.
		
		2. 2차원 배열
		  - 배열의 선언
		    int[][] a;
		    int a[][];
		    int[] a[];
		    
		  - 배열의 생성
		    int[][] a = new int[3][4];
		
		*/
//		int[][] a = new int[3][];
//		a[0] = new int[2];
//		a[1] = new int[4];
//		a[2] = new int[3];
//		/*
//		{
//			{0,0},
//			{0,0,0,0},
//			{0,0,0}
//		}
//		*/
//		int count = 0;
//		
//		for (int j = 0; j < a.length; j++) { //j 작은배열의 번호
//			for (int i = 0; i < a[j].length; i++) { // i 작은배열 방의 번호
//				count += 10;
//				a[j][i] = count;
//			}
//		}
//		
//		//각 자리의 점수를 출력해주세요
////		for (int i = 0; i < a[0].length; i++) {
////			System.out.println(a[0][i]);
////		}
////		
////		for (int i = 0; i < a[1].length; i++) {
////			System.out.println(a[1][i]);
////		}
////		
////		for (int i = 0; i < a[2].length; i++) {
////			System.out.println(a[2][i]);
////		}
//		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.println(a[i][j]);
//			}
//		}
//		System.out.println("\n\n\n\n\n");
//		//1. 6명의 7과목의 점수를 저장할수 있는 변수score를 선언 및 생성해주세요
//		
//		// 6명의 이름을 저장할수 있는 변수 name을 선언하고 주변친구 6명의
//		// 이름으로 초기화 하세요
//		
//		String[] name = {"가","나","다","라","마","바"};
//		int[][] score =new int[6][7];
//		//2. score각방의 점수를 0~100점사이의 랜덤한 점수로 변경해주세요
//		for(int i = 0;i<score.length;i++){
//			for(int j = 0;j<score[i].length;j++){
//				score[i][j] = (int)(Math.random()*101);
//			}
//		}
//		
//		
//		//3. 아래와 같이 출력해주세요
//		for(int i = 0; i<score.length; i++){ //i = 누구?
//			System.out.print(name[i]+"\t");
//			for(int j = 0; j<score[i].length; j++){ // j = 과목?
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		System.out.println("=============================== sort 후 ===================");
//		for(int i = 0; i<score.length; i++){ //i = 누구?
//			System.out.print(name[i]+"\t");
//			for(int j = 0; j<score[i].length; j++){ // j = 과목?
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		//1. 박영춘, 유다연, 유민하의 이름을 저장할수 있는 변수 name을 선언 및 생성해주세요
//		String[] name = {"박영춘","유다연","유민하"};
//		String[] name = new String[]{"박영춘","유다연","유민하"};
		String[] name = new String[3];
		name[0] = "박영춘";
		name[1] = "유다연";
		name[2] = "유민하";
		//2. 국어, 영어, 수학, JAVA 의 과목을 저장할수 있는 변수 sub를 선언 및 생성해주세요  
//		String[] sub = {"국어","영어","수학","JAVA"};
//		String[] sub = new String[]{"국어","영어","수학","JAVA"};
		String[] sub = new String[4];
		sub[0] = "국어";
		sub[1] = "영어";
		sub[2] = "수학";
		sub[3] = "JAVA";
		//3. 3명의 4과목을 저장할수 있는 변수 score를 선언 및 생성해주세요
		int[][] score = new int[name.length][sub.length];
		//4. score 각 방에 0~100점 사이의 랜덤한 값을 저장해 주세요
		for (int i = 0; i < name.length; i++) { // score.length
			for (int j = 0; j < sub.length; j++) { // score[i].length
				score[i][j] = (int)(Math.random()*101);
			}
		}
		//5. 각 사람의 합계를 저장할 수 있는 변수 nameSum을 선언 및 생성해주시고
		//   각 사람의 합계를 저장해주세요
		int[] nameSum = new int[name.length]; //score.length
		for (int i = 0; i < name.length; i++) { // score.length
			for (int j = 0; j < sub.length; j++) { // score[i].length
				nameSum[i] += score[i][j];
			}
		}
		
		//6. 각 사람의 평균를 저장할 수 있는 변수 nameAvg을 선언 및 생성해주시고
		//   각 사람의 평균를 저장해주세요
		//   단. 소숫점 셋째자리에서 반올림 하여 둘째 자리까지 표현해주세요
		float[] nameAvg = new float[name.length]; //score.length
		for (int i = 0; i < nameAvg.length; i++) { //name.length
			nameAvg[i] = (int)((float)nameSum[i]/score[i].length*100+0.5)/100f;
		}
		//7. 각 과목의 합계를 저장할 수 있는 변수 subSum을 선언 및 생성해주시고
		//   각 과목의 합계를 저장해주세요
		int[] subSum = new int[sub.length]; //score[0].length
		for (int i = 0; i < sub.length; i++) { // score[0].length
			for (int j = 0; j < name.length; j++) { // score.length
				subSum[i] += score[j][i];
			}
		}
		//8. 각 과목의 평균를 저장할 수 있는 변수 subAvg을 선언 및 생성해주시고
		//   각 과목의 평균를 저장해주세요
		//   단. 소숫점 셋째자리에서 반올림 하여 둘째 자리까지 표현해주세요
		float[] subAvg = new float[sub.length]; //score.length
		for (int i = 0; i < subAvg.length; i++) { //name.length
			subAvg[i] = (int)((float)subSum[i]/name.length*100+0.5)/100f;
		}
		
		//9. 석차
		int[] rank = new int[name.length];
		for (int i = 0; i < name.length; i++) {
			rank[i]++;
			for (int j = 0; j < name.length; j++) {
				if(nameSum[i] < nameSum[j]){
					rank[i]++;
				}
			}
		}
		
		
		// 출력문
		for (int i = 0; i < sub.length; i++) {
			System.out.print("\t"+sub[i]);
		}
		System.out.println("\t합계\t평균\t석차");
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(nameSum[i]+"\t"+nameAvg[i]+"\t"+rank[i]);
		}
		System.out.print("과목합계\t");
		for (int i = 0; i < subSum.length; i++) {
			System.out.print(subSum[i]+"\t");
		}
		System.out.println();
		System.out.print("과목평균\t");
		for (int i = 0; i < subAvg.length; i++) {
			System.out.print(subAvg[i]+"\t");
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
