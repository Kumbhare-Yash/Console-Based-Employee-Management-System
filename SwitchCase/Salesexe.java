package SwitchCase;

public class Salesexe extends Employee {
	
    private double tra;
    
	public Salesexe( String empName, int basicSal, double tra) {
		super(empName,basicSal);
		this.tra = tra;
	}
	
	
	
	/**
	 * @return the tra
	 */
	public double getTra() {
		return tra;
	}



	/**
	 * @param tra the tra to set
	 */
	public void setTra(double tra) {
		this.tra = tra;
	}



	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return super.calculateSalary()+tra;
	}
    


	@Override
	public String toString() {
		return "----Salesexe :--- \nTotal Salary "+calculateSalary()+ super.toString()+"\nTravel Allowance "+tra;
	}
	

}
