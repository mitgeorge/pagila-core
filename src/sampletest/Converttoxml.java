package sampletest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class Converttoxml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	  Assesment assesment = new Assesment();
	  
	  assesment.setRole(100);
	  assesment.setName("Problem on trains(aptitude questions )");
	  assesment.setDescription("difficulty level : easy question");
      assesment.setExamdate("31/5/3000");
  List<Questions> questions = new ArrayList<>();

 
      for(int i=1; i<=10; i++){
    	  
    	  Questions questions2 =  new  Questions();
    	 questions2.setQuestionid(i);
    	 questions2.setQuestiondescription( " A train running at the speed of 60 km/hr crosses a pole in 9 seconds. What is the length of the train? ");
    	 questions.add( questions2);
    	
    	 
    	
    	
      }
    
      assesment.setQuestions(questions);
      
      
	  try {

		File file = new File("D:\\file1.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Assesment.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		jaxbMarshaller.marshal(assesment, file);
		jaxbMarshaller.marshal(assesment, System.out);

	      } catch (JAXBException e) {
		e.printStackTrace();
	      }

	}
}
