package i_javaLang;

import java.util.Arrays;

public class StringTest02 {
	public static void main(String[] args) {
		// char charAt(int index) : 지정된 index번째 있는 문자를 리턴한다.
		String s1 = "Hello";
		char c1 = s1.charAt(0);
		System.out.println(c1);
		
		//Oracle에도 있는 것들
		//1. String concat() : 문자열을 뒤에 덧붙인다
		String s2 = s1.concat(" Oracle");
		System.out.println(s2);
		
		//2. boolean contains() : 지정된 문자열을 포함하고 있는지 확인
		System.out.println(s2.contains("Or"));
		
		//확장자 처리에 유용한 것
		//1. endsWith : 지정된 문자열로 끝나는지 확인
		System.out.println(s2.endsWith("cle"));
		
		//그외
		//1. lastIndexOf : 지정된 문자 또는 문자코드 문자열의 오른쪽 끝에서 부터 찾아서
		//                 해당 문자열이 있는 위치를 반환한다. 못찾으면 -1을 반환
		System.out.println(s2.lastIndexOf("O")); //Hello Oracle
		
		//2. replace() : 문자열 중의 문자를 새로운 문자로 변환
		String s3 = s2.replace("Oracle", "Java");
		System.out.println(s3);
		
		//3. split() : 문자열을 지정된 분리자로 나누어 문자열형 배열에 담는다.
		String s4 = "aaa,444,dded,232";
		String[] s5 = s4.split("a,");
		System.out.println(Arrays.toString(s5));
		
		//4. String subString() : 주어진 문자열을 시작부터 끝 위치 범위에 포함된 문자열을 얻는다
		// begin <= x < y
		String s7 = "박서경연대기.hwp";
		String s6 = s7.substring(s7.lastIndexOf(".")+1,s7.length());
		System.out.println("indexOf : "+s7.indexOf('h', 3));
		System.out.println(s6);
		
		//5. String trim() : 문자열의 양 끝의 공백을 제거한다.
		String s8 = "    i d  입 력   ";
		String s9 = s8.trim();
		System.out.println(s9);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
