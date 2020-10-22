package Salary;

public class Houremp extends Employee implements Incsalary{
private int noofhours;
private int hourrate;
public Houremp(int noofhours, int hourrate) {
	super();
	this.noofhours = noofhours;
	this.hourrate = hourrate;
}
@Override
public double getsalary() {
	// TODO Auto-generated method stub
	System.out.println("hourly emp salry");
	return noofhours*hourrate;
}
@Override
public double getPayment() {
	// TODO Auto-generated method stub
	return noofhours*hourrate;
}
@Override
public int incsal() {
	// TODO Auto-generated method stub
	return 3;
}

}
