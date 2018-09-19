package sampletest;


	

import java.io.*;
import java.sql.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;

public class Testload
{
public static void main(String[] args) { 
try {
Class.forName("org.postgresql.Driver");
Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pagila", "postgres", "root");
Statement st=con.createStatement();
DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
Document doc = docBuilder.parse (new File("D:\\file2.xml"));
doc.getDocumentElement().normalize();
System.out.println ("Root element of the doc is " + doc.getDocumentElement().getNodeName());
NodeList listOfPersons = doc.getElementsByTagName("name");
for(int s=0; s<listOfPersons.getLength(); s++){
Node firstPersonNode = listOfPersons.item(s);
if(firstPersonNode.getNodeType() == Node.ELEMENT_NODE){
Element firstPersonElement = (Element)firstPersonNode;
NodeList nameList = firstPersonElement.getElementsByTagName("qualty");
Element nameElement =(Element)nameList.item(0);

NodeList textFNList = nameElement.getChildNodes();
String name=((Node)textFNList.item(0)).getNodeValue().trim();

NodeList rangeList = firstPersonElement.getElementsByTagName("range");
Element rangeElement =(Element)rangeList.item(0);

NodeList textLNList = rangeElement.getChildNodes();
String range= ((Node)textLNList.item(0)).getNodeValue().trim();

int i=st.executeUpdate("insert into products(name,range) values('"+name+"','"+range+"')");
}
}
System.out.println("Data is successfully inserted!");
}catch (Exception err) {
System.out.println(" " + err.getMessage ());
}
}

}