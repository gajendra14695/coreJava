package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestG {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(1,"gajendra"));
		al.add(new Employee(2,"rahul"));
		al.add(new Employee(3,"suhil"));
		al.add(new Employee(4,"sumit"));
		al.add(new Employee(5,"ranjeet"));
		
		Comparator<Employee> cmp =(e1,e2)->{
			return e1.name.compareTo(e2.name);
			
		};
		
		
		List<Employee> l=
				al.stream().sorted(cmp).collect(Collectors.toList());
		
		Iterator<Employee> it = l.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("id   of the employee "+e.id);
			System.out.println("name of the employee "+e.name);
		}
		
	}
}
