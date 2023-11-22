package ques_1;

public class StudentCaller {

	public static void main(String[] args) {
		Student obj = new Student(101, "Ram", 70, 90, 88);
//		System.out.println(obj.name);
//		System.out.println(obj.chem);
//		System.out.println(obj.phy);
//		System.out.println(obj.name);

		
		System.out.println(obj.getName());
//		System.out.println(obj.getPhy());
		System.out.println(obj.average());

	}

}
