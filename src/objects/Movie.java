package objects;

import java.math.BigDecimal;

public class Movie {
	private Integer film_id;
	private String title;
	private String description;
	private int year;
	private BigDecimal rentalrate;
	private Long inventory_id;

	public Movie(Integer film_id, String title, String description, int year, BigDecimal rentalrate,
			Long inventory_id) {
		super();
		this.title = title;
		this.description = description;
		this.year = year;
		this.rentalrate = rentalrate;
		this.inventory_id = inventory_id;
		this.film_id = film_id;
	}

	public Integer getFilm_id() {
		return film_id;
	}

	public void setFilm_id(Integer film_id) {
		this.film_id = film_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public BigDecimal getRentalrate() {
		return rentalrate;
	}

	public void setRentalrate(BigDecimal rentalrate) {
		this.rentalrate = rentalrate;
	}

	public Long getInventory_id() {
		return inventory_id;
	}

	public void setInventory_id(Long inventory_id) {
		this.inventory_id = inventory_id;
	}

}
