package sampletest;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import com.sun.jmx.snmp.Timestamp;

public class Mobiles {
private Integer cost;
private String type;
private boolean availability;
List<Names> names = new ArrayList<>();
public Mobiles() {
	super();
	// TODO Auto-generated constructor stub
}
public Mobiles(Integer cost, String type, boolean availability, List<Names> names) {
	super();
	this.cost = cost;
	this.type = type;
	this.availability = availability;
	this.names = names;
}
public Integer getCost() {
	return cost;
}
public void setCost(Integer cost) {
	this.cost = cost;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public boolean isAvailability() {
	return availability;
}
public void setAvailability(boolean availability) {
	this.availability = availability;
}
public List<Names> getNames() {
	return names;
}
public void setNames(List<Names> names) {
	this.names = names;
}
{
	Names names2 =new Names();
	names2.setApple("apple 1 to 8");
	names2.setAppleX("appleX");
	names2.setMicrosoft("microsoft");
	names2.setRedmi("redmi");
	names2.setSamsung("samsung");
names.add(names2);

}
}
