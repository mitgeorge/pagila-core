package sampletest;

import java.util.ArrayList;
import java.util.List;

public class Catagories {
	private String type;
	private Integer CostRange;
	private Integer discount;
	private List<Mobiles>  mobiles = new ArrayList<>();
	public Catagories() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Catagories(String type, Integer costRange, Integer discount, List<Mobiles> mobiles) {
		super();
		this.type = type;
		CostRange = costRange;
		this.discount = discount;
		this.mobiles = mobiles;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getCostRange() {
		return CostRange;
	}
	public void setCostRange(Integer costRange) {
		CostRange = costRange;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	public List<Mobiles> getMobiles() {
		return mobiles;
	}
	public void setMobiles(List<Mobiles> mobiles) {
		this.mobiles = mobiles;
	}
	
		{
			for (int j=1;j<=4;j++){
		    	Mobiles mobiles2 = new Mobiles();
		    	mobiles2.setType("android");
		    	mobiles2.setCost(50000);
		    		if(j==2 ){
		    			mobiles2.setAvailability(false);
		    		}
		    		else{
		    			mobiles2.setAvailability(true);
		    		}
		    		mobiles.add(mobiles2);
		    	}
	
		}
}
