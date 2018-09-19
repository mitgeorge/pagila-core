package objects;

import java.sql.Timestamp;
import java.util.Map;

import org.apache.log4j.Logger;

import services.PagilaLogger;
import web.SearchServlet;

public class Staff {
	
	private static final Logger log = Logger.getLogger(Staff.class);

	private Integer staff_id;
	private String first_name;
	private String last_name;
	private Integer address_id;
	private String email;
	private Integer store_id;
	private Boolean active;
	private String username;
	private String password;
	private Timestamp last_update;
	private byte[] picture;

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(int staff_id, String first_name, String last_name, int address_id, String email, int store_id,
			boolean active, String username, String password, Timestamp last_update, byte[] picture) {
		super();
		this.staff_id = staff_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address_id = address_id;
		this.email = email;
		this.store_id = store_id;
		this.active = active;
		this.username = username;
		this.password = password;
		this.last_update = last_update;
		this.picture = picture;
	}

	public int getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStore_id() {
		return store_id;
	}

	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getLast_update() {
		return last_update;
	}

	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public static Staff getStaffFromDBMap(Map<String, Object> staffMap) {
		Integer staff_id = (Integer) staffMap.get("staff_id");
		String first_name = (String) staffMap.get("first_name");
		String last_name = (String) staffMap.get("last_name");
		Integer address_id = (Integer) staffMap.get("address_id");
		String email = (String) staffMap.get("email");
		Integer store_id = (Integer) staffMap.get("store_id");
		Boolean active = (Boolean) staffMap.get("active");
		String username = (String) staffMap.get("username");
		String password = (String) staffMap.get("password");
		Timestamp last_update = (Timestamp) staffMap.get("last_update");
		byte[] picture =  staffMap.get("picture").toString().getBytes();
		Staff staff = new Staff(staff_id, first_name, last_name, address_id, email, store_id, active, username,
				password, last_update, picture);
		return staff;
	}


}