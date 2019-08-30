package projectTest.main;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import projectTest.service.IService;
import projectTest.service.IServiceImpl;
import projectTest.vo.MemberVO;

/**
 * console에 출력을 하거나 입력받기 위한 클래스
 * @author SEM
 * @since 2019.02.21
 * @see
 */
public class ViewClass {
	private IService service = new IServiceImpl();
	private MemberVO memberInfo = null;
	
	/**
	 * 프로그램 시작 메서드
	 * @author 박서경
	 */
	public void startMethod() {
		System.out.println("고객님 환영합니다.");
		while(true){
			System.out.println("원하는 메뉴를 선택해주세요.");
			
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			
			Scanner sc = new Scanner(System.in);
			int select = 0;
			try{
				select = sc.nextInt();
			} catch (InputMismatchException e){
				e.printStackTrace();
				continue;
			}
			
			switch (select) {
			case 1:
				//로그인
				login();
				break;
			case 2:
				//회원가입
				break;
			default:
				System.out.println("1,2중에 골라주세요");
			}
		}
		
	}

	/**
	 * 로그인을 위한 메서드
	 * @author 박서경
	 */
	private void login() {
		//아이디
		String mem_id = getMemberID();
		//비밀번호
		String mem_pw = getMemberPW();
		
		// sql
		// MemberVO getMemberInfo(String mem_id, String mem_pw);
//		MemberVO result = service.getMemberInfo(mem_id, mem_pw);
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("mem_id", mem_id);
		params.put("mem_pw", mem_pw);
		
		MemberVO result = service.getMemberInfo(params);
		
		if(result == null){
			System.out.println("해당회원이 존재하지 않습니다.");
		} else {
			System.out.println(result.getMem_name()+"님 환영합니다.");
			memberInfo = result;
			//다음 목록을 보여주는 메서드로 이동
		}
		
	}

	/**
	 * 아이디를 입력받는 메서드
	 * @return
	 */
	private String getMemberID() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		String mem_id = sc.next();
		return mem_id;
	}
	/**
	 * 비밀번호를 입력받는 메서드
	 * @return
	 */
	private String getMemberPW() {
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호를 입력해주세요");
		String mem_pw = sc.next();
		return mem_pw;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
