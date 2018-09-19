package sampletest;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import com.sun.jmx.snmp.Timestamp;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Products {
private String name;
private Integer range;
private String quality;
List<Catagories>  catagories = new ArrayList<>();
public Products() {
	super();
	// TODO Auto-generated constructor stub
}
public Products(String name, Integer range, String quality, List<Catagories> catagories) {
	super();
	this.name = name;
	this.range = range;
	this.quality = quality;
	this.catagories = catagories;
}
public String getName() {
	return name;
}
@XmlAttribute
public void setName(String name) {
	this.name = name;
}
public Integer getRange() {
	return range;
}
@XmlElement
public void setRange(Integer range) {
	this.range = range;
}
public String getQuality() {
	return quality;
}
@XmlElement
public void setQuality(String quality) {
	this.quality = quality;
}
public List<Catagories> getCatagories() {
	return catagories;
}
@XmlElement
public void setCatagories(List<Catagories> catagories) {
	this.catagories = catagories;
}	

}
