package d_array;

public class Array_02 {
	public static void main(String[] args) {
		/*
		1. 정렬
		  - 어떤 데이터를 빠르고 쉽게 찾기 위해 일정한 순서대로 데이터들을 가지런하게
		    나열하는 작업이다.
		  - 버블정렬, 선택정렬, 삽입정렬    
		
		2. 버블정렬(bubble sort)
		  - 인접한 데이터 간에 교환이 계속적으로 일어나면서 정렬이 이루어 진다.
		  - 한 회전에 끝날때 가장 큰값이 가장 뒤에 확정된다.
		  
		3. 선택정렬(select sort)
		  - 정렬의 대상에서 최소값을 찾아서 맨앞의 내용과 교체하는 방식이다.
		  - 한 회전에 끝날때 가장 작은값이 앞에 확정된다.
		
		
		*/
		
		int[] arr = new int[]{5,2,3,1,4};
		
		for (int k = 0; k < arr.length-1; k++) { //k 회전
			System.out.println(k+1+"회전");
			for(int i = 0; i < arr.length-1-k; i++){
				if(arr[i] > arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
		}
		
		
		int[] arr2 = {5,2,3,1,4};
		for(int j =0; j <arr2.length-1;j++){
			int min = arr2[j];
			int minBang = j;
			for (int i = j+1; i < arr2.length; i++) {
				if(min > arr2[i]){
					min = arr2[i];
					minBang = i;
				}
			}
			int temp2 = arr2[j];
			arr2[j] = arr2[minBang];
			arr2[minBang] = temp2;
			
			for (int i = 0; i < arr2.length; i++) {
				System.out.print(arr2[i]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
				
				
		

		
		
		
	}
}
