package sampletest;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import com.sun.jmx.snmp.Timestamp;
@XmlRootElement
public class Assesment {
	String name;
	String description;
	String  examdate;
	int role;
	List<Questions> questions = new ArrayList<>();
	public Assesment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Assesment(String name, String description, String examdate, int role, List<Questions> questions) {
		super();
		this.name = name;
		this.description = description;
		this.examdate = examdate;
		this.role = role;
		this.questions = questions;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getExamdate() {
		return examdate;
	}
	public void setExamdate(String examdate) {
		this.examdate = examdate;
	}
	@XmlAttribute
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public List<Questions> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}
	
	
	}


