package Salary;

public class Commisionemp extends Employee implements Incsalary{
private int percent;
private int weeksale;
public Commisionemp(int percent, int weeksale) {
	super();
	this.percent = percent;
	this.weeksale = weeksale;
}
@Override
public double getsalary() {
	// TODO Auto-generated method stub
	return (percent*weeksale)/100;
}
@Override
public int incsal() {
	// TODO Auto-generated method stub
	return 3;
}
@Override
public double getPayment() {
	// TODO Auto-generated method stub
	return (percent*weeksale)/100;
}

}
