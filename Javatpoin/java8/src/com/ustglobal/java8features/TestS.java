package com.ustglobal.java8features;

import java.util.ArrayList;

public class TestS {

	public static void main(String[] args) {


		ArrayList<Student> al= new ArrayList<Student>();
		al.add(new Student (3,"gajju",45.36));
		al.add(new Student (4,"rahul",67.46));
		al.add(new Student (5,"ravi",35.65));
		al.add(new Student (6,"mala",39.86));
		al.add(new Student (7,"ranjeet",945.6));
		Helper hp = new Helper();
		Pass ps =new  Pass();
		//hp.display(al);
		//hp.displayFailedStudent(al);
		ps.topper(al);




	}
}
