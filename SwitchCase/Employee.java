package SwitchCase;

public class Employee {
	private int empId;
	private String empName;
	private int basicSal;
	private double hra;
	private double da;
	static int COUNT = 1;
	
	
	public Employee(String empName, int basicSal) {
		super();
		this.empId = COUNT++;
		this.empName = empName;
		this.basicSal = basicSal;
		this.hra = (15*basicSal)/100;
		this.da = (30*basicSal)/100;
	}
	
	public double calculateSalary() {
		return basicSal+hra+da;
	}
	

	
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	/**
	 * @return the basicSal
	 */
	public int getBasicSal() {
		return basicSal;
	}
	
	/**
	 * @param basicSal the basicSal to set
	 */
	public void setBasicSal(int basicSal) {
		this.basicSal = basicSal;
	}
	
	/**
	 * @return the hra
	 */
	public double getHra() {
		return hra;
	}
	
	/**
	 * @param hra the hra to set
	 */
	public void setHra(double hra) {
		this.hra = hra;
	}
	
	/**
	 * @return the da
	 */
	public double getDa() {
		return da;
	}
	
	/**
	 * @param da the da to set
	 */
	public void setDa(double da) {
		this.da = da;
	}
	
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "\nEmployee Id=" + empId + "\nEmployee Name=" + empName + "\nEmployee basicSal=" + basicSal + "\nhra=" + hra + "\nda="
				+ da;
	}





}
