package sampletest;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Xmltoobjectsproducts {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {

				File file = new File("D:\\file2.xml");
				JAXBContext jaxbContext = JAXBContext.newInstance(Products.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				Products products = (Products) jaxbUnmarshaller.unmarshal(file);
				System.out.println(products.getCatagories().toString());

			  } catch (JAXBException e) {
				e.printStackTrace();
			  }

	}

}


