
// default package

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FilmCategoryId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class FilmCategoryId implements java.io.Serializable {

	// Fields

	private Short filmId;
	private Short categoryId;

	// Constructors

	/** default constructor */
	public FilmCategoryId() {
	}

	/** full constructor */
	public FilmCategoryId(Short filmId, Short categoryId) {
		this.filmId = filmId;
		this.categoryId = categoryId;
	}

	// Property accessors

	@Column(name = "film_id", nullable = false)

	public Short getFilmId() {
		return this.filmId;
	}

	public void setFilmId(Short filmId) {
		this.filmId = filmId;
	}

	@Column(name = "category_id", nullable = false)

	public Short getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Short categoryId) {
		this.categoryId = categoryId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FilmCategoryId))
			return false;
		FilmCategoryId castOther = (FilmCategoryId) other;

		return ((this.getFilmId() == castOther.getFilmId()) || (this.getFilmId() != null
				&& castOther.getFilmId() != null && this.getFilmId().equals(castOther.getFilmId())))
				&& ((this.getCategoryId() == castOther.getCategoryId())
						|| (this.getCategoryId() != null && castOther.getCategoryId() != null
								&& this.getCategoryId().equals(castOther.getCategoryId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getFilmId() == null ? 0 : this.getFilmId().hashCode());
		result = 37 * result + (getCategoryId() == null ? 0 : this.getCategoryId().hashCode());
		return result;
	}

}