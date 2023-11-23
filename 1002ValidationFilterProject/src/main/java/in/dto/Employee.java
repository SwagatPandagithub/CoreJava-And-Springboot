package in.dto;

public class Employee {
	
	private String eid;
	private String ename;
	private String eage;
	private String email;
	private String mobile;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEage() {
		return eage;
	}
	public void setEage(String eage) {
		this.eage = eage;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Employee(String eid, String ename, String eage, String email, String mobile) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.email = email;
		this.mobile = mobile;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", email=" + email + ", mobile="
				+ mobile + "]";
	}
	
	

}
