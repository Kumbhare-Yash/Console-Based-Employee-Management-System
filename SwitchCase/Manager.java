package SwitchCase;

public class Manager extends Employee {
private double inc;

public Manager( String empName, int basicSal, double inc) {
	//super(empId, empName, basicSal);
	super(empName,basicSal);
	this.inc = inc;
}



/**
 * @return the inc
 */
public double getInc() {
	return inc;
}



/**
 * @param inc the inc to set
 */
public void setInc(double inc) {
	this.inc = inc;
}



public double calIncentive() {
	return inc;
}

@Override
public double calculateSalary() {
	// TODO Auto-generated method stub
	return super.calculateSalary()+inc;
}



@Override
public String toString() {
	return "----Manager :---\nTotal sal "+calculateSalary() + super.toString()+"\nIncentive "+inc;
}




}
