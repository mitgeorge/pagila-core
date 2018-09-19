package web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

import database.DatabaseUtils;
import objects.Movie;
import services.PagilaLogger;

@WebServlet(urlPatterns = { "/search" })
public class SearchServlet extends HttpServlet {
	static String a="2";
	private static final long serialVersionUID = -1889760816201527519L;
	private static final Logger log = Logger.getLogger(SearchServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PagilaLogger.getInstance();
		String query = req.getParameter("query");
		String store_id = req.getParameter("store_id");
		log.info("The parameters received from the serarch servlet are, query: " + query + " and store id: " + store_id);
       if(store_id!=a)
    		   {
    	   log.info("Mike has logged in and is authorized to access  ");

       }
       else{
    	   log.info("Jon has logged in and is authorized to access ");       }
       
		ArrayList<Movie> returnresponse = DatabaseUtils.searchInventory(query, store_id);
		resp.getWriter().append(new Gson().toJson(returnresponse));
	}
}
