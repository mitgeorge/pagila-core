package services;

import java.util.List;
import java.util.Map;

import database.DatabaseUtils;
import objects.Staff;

public class Services {

	public Staff getStaffByEmail(String email) {
		String selectStaffByEmailQuery = "SELECT * FROM staff where email = '" + email + "';";

		List<Map<String, Object>> staffs = DatabaseUtils.runQuery(selectStaffByEmailQuery);
		if (staffs != null && staffs.size() > 0) {
			Map<String, Object> staffMap = staffs.get(0);
			Staff staff = Staff.getStaffFromDBMap(staffMap);
			return staff;
		}
		return null;
	}

}
