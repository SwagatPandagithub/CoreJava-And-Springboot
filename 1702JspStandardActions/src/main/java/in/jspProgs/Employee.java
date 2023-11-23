package in.jspProgs;

public class Employee {	
	
	private String id;
	private String name;
	private String address;
	private int age;
	
	
	static {
		System.out.println("Initialisation of the Calculator class object..");
	}

	
	public Employee() {
		System.out.println("Instantiation of the calculator object");
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	public int square(int x) {
		return (x*x);
	}
}
