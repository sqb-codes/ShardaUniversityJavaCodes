package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ques_1.Student;
import ques_7.Calculator;

class CalculatorTest {
	
	@Test
	void testStudentMarks() {
		Student obj = new Student(101, "Ram", 70, 75, 80);
		assertEquals(75.0, obj.average());
	}

	@Test
	void testAdd() {
		Calculator calc = new Calculator();
		assertEquals(10, calc.add(5, 5));
	}
	
	@Test
	void testSub() {
		Calculator calc = new Calculator();
		assertEquals(4, calc.sub(5, 2));
	}
	
	@Test
	void testMul() {
		Calculator calc = new Calculator();
		assertEquals(30, calc.mul(5, 5));
	}

}
