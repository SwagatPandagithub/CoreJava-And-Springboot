package in.beanDto;

public class Employee {
	//Transferable object means it should implement the Serialisable interface
	
	private int eno;
	private String ename;
	private int bSal;	
	private float gSal;	
	private float netSal;	
	
	static {
		System.out.println("Employee class is getting loaded");
	}
	
	public Employee() {
		System.out.println("Employee.Employee()");
		System.out.println("Employee() :: Zero Parameter Constructor");
	}

	public int getEno() {
		System.out.println("Employee.getEno()");
		return eno;
	}

	public void setEno(int eno) {
		System.out.println("Employee.setEno()");
		this.eno = eno;
	}

	public String getEname() {
		System.out.println("Employee.getEname()");
		return ename;
	}

	public void setEname(String ename) {
		System.out.println("Employee.setEname()");
		this.ename = ename;
	}

	public int getbSal() {
		System.out.println("Employee.getbSal()");
		return bSal;
	}

	public void setbSal(int bSal) {System.out.println("Employee.setbSal()");
		this.bSal = bSal;
	}

	public float getgSal() {System.out.println("Employee.getgSal()");
		return gSal;
	}

	public void setgSal(float gSal) {System.out.println("Employee.setgSal()");
		this.gSal = gSal;
	}

	public float getNetSal() {System.out.println("Employee.getNetSal()");
		return netSal;
	}

	public void setNetSal(float netSal) {System.out.println("Employee.setNetSal()");
		this.netSal = netSal;
	}

	@Override
	public String toString() {
		System.out.println("Employee.toString()");
		return "Employee [eno=" + eno + ", ename=" + ename + ", bSal=" + bSal + ", gSal=" + gSal + ", netSal=" + netSal
				+ "]";
	}
	
	
	

}
