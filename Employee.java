package Salary;

abstract class Employee implements Payable {
private double rate;
public Employee()
{
	
}
public abstract double getsalary();
public double getRate() {
	return rate;
}
public void setRate(double rate) {
	this.rate = rate;
}

}
