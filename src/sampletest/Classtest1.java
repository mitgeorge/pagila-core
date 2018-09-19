package sampletest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity(name="emp")
public class Classtest1 {
Integer id;
Float sal;
public Classtest1() {
	super();
	// TODO Auto-generated constructor stub
}
public Classtest1(Float sal) {
	super();
	this.sal = sal;
}
@GenericGenerator(name = "generator", strategy = "increment")
@Id
@GeneratedValue(generator = "generator")
@Column(name = "id", unique = true, nullable = false)


public Integer getId() {
	return id;
}
@OneToOne
public void setId(Integer id) {
	this.id = id;
}
public Float getSal() {
	return sal;
}
public void setSal(Float sal) {
	this.sal = sal;
}

}
