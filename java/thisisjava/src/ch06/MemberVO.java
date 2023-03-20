package ch06;

public class MemberVO {
	// VO (Value Object) = DTO (Data Transfer Object)
	private int memberid;
	private String id;
	private String name;
	private String pwd;
	
	// alt + shift + s > r
	
	public int getMemberid() {
		return memberid;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	
	// VO / DTO
	// private -> 필드 + getter/ setter 
	
	
	
	
	
	
	
	
	
}
