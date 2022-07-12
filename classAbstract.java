package day8;

abstract class Shape2 { // parent class
	abstract void drawShape(); // creating abstract method
}

class Circle2 extends Shape2 { // child class of shape class
	@Override
	void drawShape() {  
		System.out.println("It is shape of a Circle");
	}
}

class Square2 extends Shape2 { // child class of shape class
	@Override
	void drawShape() {
		System.out.println("It is shape of a Square");
	}
}

class Triangle2 extends Shape2 { // child class of shape class
	@Override
	void drawShape() {
		System.out.println("It is shape of a Triangle");
	}
}

public class classAbstract {
	public static void main(String[] args) { // main method
		//Creating objects using dynamic memory dispatching
		Shape2 c = new Circle2();
		Shape2 s = new Square2();
		Shape2 t = new Triangle2();
		 
		//calling the methods
		c.drawShape();
		s.drawShape();
		t.drawShape();
	}
}