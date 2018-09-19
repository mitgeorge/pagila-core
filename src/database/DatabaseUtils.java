package database;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.hibernate.cfg.CreateKeySecondPass;

import com.sun.org.apache.xpath.internal.operations.Equals;

import objects.Movie;
import services.PagilaLogger;
import web.SearchServlet;

public class DatabaseUtils {
	private static final Logger log = Logger.getLogger(DatabaseUtils.class);
	
	public static ArrayList<Movie> searchInventory(String query, String store_id) {
		PagilaLogger.getInstance();
	
	    if (query != null){
	    	log.warn("search has  been started "+store_id +"");
	    }
	   
		log.info("The database requested by the search : " + query + " ");
	       
		ArrayList<Movie> movies = new ArrayList<>();
		List<Map<String, Object>> runQuery = runQuery(
				"SELECT COUNT (inventory.inventory_id),inventory.film_id,film.title,film.description,film.language_id,film.rental_rate,	film.release_year	FROM inventory LEFT JOIN film ON inventory.film_id = film.film_id WHERE	inventory.film_id IN (SELECT DISTINCT inventory.film_id FROM inventory) AND store_id = "
						+ store_id + " AND title LIKE '%" + query + "%' OR LOWER (title) LIKE '%" + query
						+ "%' GROUP BY inventory.film_id, film.film_id ");
		
		if (runQuery != null)
			for (Map<String, Object> map : runQuery) {
				movies.add(new Movie((Integer) map.get("film_id"), (String) map.get("title"),
						(String) map.get("description"), (Integer) map.get("release_year"),
						(BigDecimal) map.get(" rental_rate"), (Long) map.get("count")));
			}

		return movies;

	}

	public static List<Map<String, Object>> runQuery(String query) {
		try {

			Class.forName("org.postgresql.Driver");

			String jdbcUrl = "jdbc:postgresql://localhost:5432/pagila";
			String username = "postgres";
			String password = "root";

			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;

			try {
				// Step 1 - Load driver
				// Class.forName("org.postgresql.Driver"); // Class.forName() is
				// not
				// needed since JDBC 4.0

				// Step 2 - Open connection
				conn = DriverManager.getConnection(jdbcUrl, username, password);

				// Step 3 - Execute statement
				stmt = conn.createStatement();

				rs = stmt.executeQuery(query);

				ResultSetMetaData md = rs.getMetaData();
				int columns = md.getColumnCount();
				List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
				while (rs.next()) {
					Map<String, Object> row = new HashMap<String, Object>(columns);
					for (int i = 1; i <= columns; ++i) {
						row.put(md.getColumnName(i), rs.getObject(i));
					}
					rows.add(row);
				}
				return rows;

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {

					// Step 5 Close connection
					if (stmt != null) {
						stmt.close();
					}
					if (rs != null) {
						rs.close();
					}
					if (conn != null) {
						conn.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (ClassNotFoundException e) {

			System.out.println("Where is your PostgreSQL JDBC Driver? " + "Include in your library path!");
			e.printStackTrace();
		}
		return null;
	}
}
