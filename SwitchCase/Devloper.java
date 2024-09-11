package SwitchCase;

public class Devloper extends Employee{
	private double na;


	public Devloper(String empName, int basicSal,  double na) {
		super(empName,basicSal);
		this.na = na;
	}
	
	

	/**
	 * @return the na
	 */
	public double getNa() {
		return na;
	}



	/**
	 * @param na the na to set
	 */
	public void setNa(double na) {
		this.na = na;
	}



	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return super.calculateSalary()+ na;
	}





	@Override
	public String toString() {
		return "----Devloper :---\nTotal Salary "+calculateSalary() + super.toString()+"\nNight Allowance"+na;
	}
}
