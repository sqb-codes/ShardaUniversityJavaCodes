//Encapsulation - Wrapping of data into one single unit
//Data Abstraction - Make variables private and methods public

package ques_1;

public class Student {
	
	private int rollNo;
	private String name;
	private double phy;
	private double chem;
	private double math;
	
	public Student(int rollNo, String name, double phy, double chem, double math) {
		this.rollNo = rollNo;
		this.name = name;
		this.phy = phy;
		this.chem = chem;
		this.math = math;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPhy() {
		return phy;
	}
	public void setPhy(double phy) {
		this.phy = phy;
	}
	public double getChem() {
		return chem;
	}
	public void setChem(double chem) {
		this.chem = chem;
	}
	
	public double average() {
		double total = phy + chem + math;
		double avg = total/3;
		return avg;
	}
	
	
}
