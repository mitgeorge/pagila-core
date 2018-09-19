package sampletest;


	import java.util.ArrayList;
import java.util.List;
	 
	import javax.xml.bind.annotation.XmlAccessType;
	import javax.xml.bind.annotation.XmlAccessorType;
	import javax.xml.bind.annotation.XmlElement;
	import javax.xml.bind.annotation.XmlRootElement;

import sampletest.Assesment;
	 
	@XmlRootElement(name = "Assesment")
	@XmlAccessorType (XmlAccessType.FIELD)
	public class Questions
	{
	int questionid;
	String questiondescription;
	private List<Option>  option = new ArrayList<>();
	
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Questions(int questionid, String questiondescription, List<Option> option) {
		super();
		this.questionid = questionid;
		this.questiondescription = questiondescription;
		this.option = option;
	}
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public String getQuestiondescription() {
		return questiondescription;
	}
	public void setQuestiondescription(String questiondescription) {
		this.questiondescription = questiondescription;
	}
	public List<Option> getOption() {
		return option;
	}
	public void setOption(List<Option> option) {
		this.option = option;
	}
	{
	for (int j=1;j<=4;j++){
    	Option option2 = new Option();
    		option2.setId(j);
    		option2.setText("options");
    		if(j==2){
    		option2.setIs_correct(true);
    		}
    		else{
    			option2.setIs_correct(false);
    		}
    		option.add(option2);
    	}
	
	}}

