package Model;


public class Employee implements Comparable <Employee>{
	private int empId;
	private String empName;
	private String empRole;
	
	public Employee() {
		super();
	}
	
	public Employee(int empId) {
		super();
		this.empId = empId;
	}
	
	public Employee(int empId, String empName, String empRole) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empRole = empRole;
	}
	
	@Override
	public boolean equals(Object obj) {
		return ((Employee)obj).empId == this.empId;
	}


	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.empId - o.empId;
	}
	
}
