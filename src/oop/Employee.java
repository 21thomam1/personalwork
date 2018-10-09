package oop;

public class Employee {
	private double wage;
	private int experience;
	
	public Employee(){
		wage = -999.99;
		experience = -999;
	}
	
	public double getWage(){
		return wage;
	}
	
	public void setWage(double xWage){
		wage = xWage;
	}
	
	public int getExperience(){
		return experience;
	}
	
	public void setExperience(int xExperience){
		experience = xExperience;
	}

}
