package ques_4;

//Base class 
class Shape {     
	public void calculateArea() {         
		System.out.println("Area calculation for a generic shape");     
	} 
}

class Circle extends Shape {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public void calculateArea() {
		double are = Math.PI * radius * radius;
	}
}

class Rectangle extends Shape {
	
}

public class PolymorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
