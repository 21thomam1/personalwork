package oop;

public class Worker {

	private int work;
	private double pay;
	
	public Worker()
	{
		work = 1;
		pay = 1.00;
	}
	
	public void setWork(int newWork)
	{
		work = newWork;
	}
	
	public void setPay(double newPay)
	{
		pay = newPay;
	}
	
	public double getWork()
	{
		return work;
	}
	
	public double getPay()
	{
		return pay;
	}
	
	public double payCheck()
	{
		return work * pay;
	}
	
	public double raise(double raise)
	{
		return pay + raise;
	}
	
}
