package com.ustglobal.java8features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {

	void display(ArrayList<Student> al) {
		Iterator<Student > it = al.iterator();
		while(it.hasNext()) {
			Student i = it.next();
			System.out.println("Id is "+i.id);
			System.out.println("name is "+i.name);
			System.out.println("percentage is "+i.percentage);
			System.out.println("=======================================");
		}
	}

	void displayFailedStudent(ArrayList<Student> al) {
		List<Student > l =
				al.stream().filter(student ->student.percentage >40).collect(Collectors.toList());
		Iterator<Student > it = l.iterator();
		while(it.hasNext()) {
			Student i = it.next();
			System.out.println("Id is "+i.id);
			System.out.println("name is "+i.name);
			System.out.println("percentage is "+i.percentage);
			System.out.println("=======================================");
		}

	}

	public void topper(ArrayList<Student> al) {
		// TODO Auto-generated method stub

	}
}
