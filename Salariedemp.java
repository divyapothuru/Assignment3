package Salary;

public class Salariedemp extends Employee implements Incsalary{
 private double weeksalary;

public Salariedemp(double weeksalary) {
	super();
	this.weeksalary = weeksalary;
}

@Override
public double getsalary() {
	// TODO Auto-generated method stub
	return weeksalary;
}

@Override
public double getPayment() {
	// TODO Auto-generated method stub
	System.out.println(this.toString());
	return weeksalary;
}

@Override
public int incsal() {
	// TODO Auto-generated method stub
	return 3;
}

}
