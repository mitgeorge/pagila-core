package sampletest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Objecttoxmlproducts {
public static void main(String[] args) {
	
	Products products = new Products();
	products.setName("Electronics");
	products.setRange(50000-1000000);
	products.setQuality("best quality");
	
	List<Catagories > catagories = new ArrayList<>();
	for (int i = 0; i <20; i++) {
		Catagories catagories2 = new Catagories();
		catagories2.setCostRange(500000);
		catagories2.setDiscount(85);
		catagories2.setType("octacore processor");
		catagories.add(catagories2);
	}
	products.setCatagories(catagories);
	
		
	
try {

		File file = new File("D:\\file2.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Products.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		jaxbMarshaller.marshal(products, file);
		jaxbMarshaller.marshal(products, System.out);

	      } catch (JAXBException e) {
		e.printStackTrace();
	      }

	}
}

