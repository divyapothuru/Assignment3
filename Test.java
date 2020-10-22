package Salary;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter choice");
     int ch=sc.nextInt();
     if(ch==1)
     {
    	 Employee e;
    	 e=new Salariedemp(1000);
    	 System.out.println(e.getsalary());
    	 e=new Houremp(100,3);
    	 System.out.println(e.getsalary());
    	 e=new Commisionemp(20,50);
    	 System.out.println(e.getsalary());
     }
     else
     {
    	 Employee e1;
    	 e1=new Salariedemp(100);
    	 e1.setRate((4)*e1.getsalary());
    	 System.out.println(e1.getRate());
    	 e1=new Houremp(100,2);
    	 e1.setRate((3)*e1.getsalary());
    	 System.out.println(e1.getRate());
    	 e1=new Commisionemp(50,5);
    	 e1.setRate((2)*e1.getsalary());
    	 System.out.println(e1.getRate());
    	 
     }
	}

}
