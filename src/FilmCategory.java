
// default package

import java.sql.Timestamp;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * FilmCategory entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "film_category", schema = "public")

public class FilmCategory implements java.io.Serializable {

	// Fields

	private FilmCategoryId id;
	private Film film;
	private Category category;
	private Timestamp lastUpdate;

	// Constructors

	/** default constructor */
	public FilmCategory() {
	}

	/** full constructor */
	public FilmCategory(FilmCategoryId id, Film film, Category category, Timestamp lastUpdate) {
		this.id = id;
		this.film = film;
		this.category = category;
		this.lastUpdate = lastUpdate;
	}

	// Property accessors
	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "filmId", column = @Column(name = "film_id", nullable = false)),
			@AttributeOverride(name = "categoryId", column = @Column(name = "category_id", nullable = false)) })

	public FilmCategoryId getId() {
		return this.id;
	}

	public void setId(FilmCategoryId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "film_id", nullable = false, insertable = false, updatable = false)

	public Film getFilm() {
		return this.film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", nullable = false, insertable = false, updatable = false)

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Column(name = "last_update", nullable = false, length = 29)

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}