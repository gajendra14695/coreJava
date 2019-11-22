package com.ustglobal.objectclass;

public class Employee {
int id;
String name;
double salary;
public Employee(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
@Override
public boolean equals(Object obj) {
	if(this==obj) {
		return true;
	}
	Employee d=(Employee)obj;
	if(this.id==d.id)
	{
		if(this.name.equals(d.name)) 
		{
			if(this.salary==d.salary)
			{
				return true;
			}

			else {
				return false;
			}
		}


		else {
			return false;
		}
	}

	else {
		return false;

	}


}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}


