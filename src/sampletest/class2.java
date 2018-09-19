package sampletest;

import java.util.Iterator;

import javax.persistence.OneToOne;

public class class2 {
	Integer id;
	String name;
	  //Creating user defined class objects  
	class1 obj = new class1();

	public class2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public class2(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@OneToOne
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
