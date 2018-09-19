package sampletest;

import javax.persistence.OneToOne;

public class class1 {
 Integer id; 
 float salary;


public class1() {
	super();
	// TODO Auto-generated constructor stub
}
public class1(Integer id, float salary) {
	super();
	this.id = id;
	this.salary = salary;
}
public Integer getId() {
	return id;
}
@OneToOne
public void setId(Integer id) {
	this.id = id;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}


}



