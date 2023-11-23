package ques_5;

//we cannot create object of abstract class
abstract class Player {
	
	// abstract methods
	// - they are defined inside only abstract classes
	// - they don't have body
	// - they are supposed to be implemented in child class
	abstract void kick();
	abstract void punch();
	
	// concrete methods
	void walk() {
		// logic for walk
	}
	void jump() {
		// logic for jump
	}
	void run() {
		// logic for run
	}
}

class Eddy extends Player {

	@Override
	void kick() {
		// logic for kick
	}
	@Override
	void punch() {
		// logic for kick
	}
	
}

class King extends Player {
	@Override
	void kick() {
		// logic for kick
	}
	@Override
	void punch() {
		// logic for kick
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eddy eddy = new Eddy();
		King king = new King();
	}

}
