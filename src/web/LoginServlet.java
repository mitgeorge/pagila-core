package web;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import database.DatabaseUtils;
import objects.GenericResponse;
import objects.Staff;
import services.Services;

@WebServlet(urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 3499508651999382712L;

	@Override
public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GenericResponse genericResponse = new GenericResponse();
	
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String checkEmailValidQuery = "select * from staff where email = '" + email + "'";
		List<Map<String, Object>> runQuery = DatabaseUtils.runQuery(checkEmailValidQuery);
		if (runQuery.size() > 0) {
			// The email provided by the user is present in the staff table
			String checkEmailAndPasswordMatchQuery = "select * from staff where email = '" + email
					+ "' and \"password\" = '" + password + "'";
			System.out.println("final query "+checkEmailAndPasswordMatchQuery);
			List<Map<String, Object>> runQuery2 = DatabaseUtils.runQuery(checkEmailAndPasswordMatchQuery);
							
			if (runQuery2.size() > 0) {
				// Both email and password are valid
				genericResponse.setMessage("Success");
				genericResponse.setSuccess(true);
				Staff staff = new Services().getStaffByEmail(email);
				genericResponse.setBody(staff);
			} else {
				// The email provided was correct but the password didn't
				// match the entry in the staff table for that email
				genericResponse.setMessage("Correct email but wrong password");
			}

		} else {
			// The email provided was not present in the staff table
			genericResponse.setMessage("Invalid Email");
		}
		resp.setContentType("application/json");
		resp.getWriter().append(new Gson().toJson(genericResponse));
	}

	
}
