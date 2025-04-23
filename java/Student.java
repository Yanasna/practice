package dy0415;

public class Student {
	private String name;
	private String hb;
	private String dept;
	private String gwa;
	
	Student(){}

	public Student(String name, String hb, String dept, String gwa) {
		super();
		this.name = name;
		this.hb = hb;
		this.dept = dept;
		this.gwa = gwa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHb() {
		return hb;
	}

	public void setHb(String hb) {
		this.hb = hb;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getGwa() {
		return gwa;
	}

	public void setGwa(String gwa) {
		this.gwa = gwa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", hb=" + hb + ", dept=" + dept + ", gwa=" + gwa + "]";
	}
	
	
}
