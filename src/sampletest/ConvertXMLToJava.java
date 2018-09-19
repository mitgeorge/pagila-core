package sampletest;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ConvertXMLToJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {

				File file = new File("C:\\Users\\ADMIN\\Desktop\\xmlfiles\\1.xml");
				JAXBContext jaxbContext = JAXBContext.newInstance(Assesment.class);

				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				Assesment customer = (Assesment) jaxbUnmarshaller.unmarshal(file);
				System.out.println(customer.getQuestions().size());

			  } catch (JAXBException e) {
				e.printStackTrace();
			  }

	}

}
