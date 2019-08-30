package projectTest.service;

import java.util.Map;

import projectTest.vo.MemberVO;

public interface IService {
	/**
	 * 아이디와 비번이 일치하는 회원의 정보를 가져오는 메서드
	 * @param mem_id 사람아이디
	 * @param mem_pw 사람 비밀번호
	 * @return MemberVO 아이디와 비번이 일치하는 한명의 정보
	 */
	MemberVO getMemberInfo(String mem_id, String mem_pw);

	MemberVO getMemberInfo(Map<String, String> params);
}
