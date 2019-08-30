package projectTest.vo;
/**
 * 사람 한명의 정보를 다룰수있는 클래스
 * @author SEM
 *
 */
public class MemberVO {
	private String mem_id; //사람의 아이디
	private String mem_pw; //사람의 비번
	private String mem_name; //사람의 이름
	private String mem_bir; //사람의 생년월일
	private String mem_regNo; //사람의 주민번호 뒷자리
	
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pw() {
		return mem_pw;
	}
	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_bir() {
		return mem_bir;
	}
	public void setMem_bir(String mem_bir) {
		this.mem_bir = mem_bir;
	}
	public String getMem_regNo() {
		return mem_regNo;
	}
	public void setMem_regNo(String mem_regNo) {
		this.mem_regNo = mem_regNo;
	}
	
}
