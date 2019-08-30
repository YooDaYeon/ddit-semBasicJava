package projectTest.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import projectTest.vo.MemberVO;

public class DBClass {
	
	private List<MemberVO> memberList = new ArrayList<MemberVO>();
	
	{ //멤버 3명 먼저 등록
		MemberVO mv1 = new MemberVO();
		mv1.setMem_id("a001");
		mv1.setMem_pw("asdfasdf");
		mv1.setMem_name("김은대");
		mv1.setMem_bir("19700505");
		mv1.setMem_regNo("1586895");
		
		memberList.add(mv1);
		
		MemberVO mv2 = new MemberVO();
		mv2.setMem_id("b001");
		mv2.setMem_pw("1004");
		mv2.setMem_name("이쁜이");
		mv2.setMem_bir("19700505");
		mv2.setMem_regNo("1586895");
		
		memberList.add(mv2);
		
		MemberVO mv3 = new MemberVO();
		mv3.setMem_id("c001");
		mv3.setMem_pw("7777");
		mv3.setMem_name("신용환");
		mv3.setMem_bir("19700505");
		mv3.setMem_regNo("1586895");
		
		memberList.add(mv3);
		
	}

	public MemberVO getMemberInfo(String mem_id, String mem_pw) {
		MemberVO mv = null;
		for (int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).getMem_id().equals(mem_id) && memberList.get(i).getMem_pw().equals(mem_pw)){
				mv = memberList.get(i);
				break;
			}
		}
		return mv;
	}

	public MemberVO getMemberInfo(Map<String, String> params) {
		String mem_id = params.get("mem_id");
		String mem_pw = params.get("mem_pw");
		
		MemberVO mv = null;
		for (int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).getMem_id().equals(mem_id) && memberList.get(i).getMem_pw().equals(mem_pw)){
				mv = memberList.get(i);
				break;
			}
		}
		return mv;
	}
	
	
	
}
