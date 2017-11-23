
// default package

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Film entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "film", schema = "public")

public class Film implements java.io.Serializable {

	// Fields

	private Integer filmId;
	private Language languageByOriginalLanguageId;
	private Language languageByLanguageId;
	private String title;
	private String description;
	private String releaseYear;
	private Short rentalDuration;
	private Double rentalRate;
	private Short length;
	private Double replacementCost;
	private String rating;
	private Timestamp lastUpdate;
	private String specialFeatures;
	private String fulltext;
	private Set<Inventory> inventories = new HashSet<Inventory>(0);
	private Set<FilmCategory> filmCategories = new HashSet<FilmCategory>(0);
	private Set<FilmActor> filmActors = new HashSet<FilmActor>(0);

	// Constructors

	/** default constructor */
	public Film() {
	}

	/** minimal constructor */
	public Film(Language languageByLanguageId, String title, Short rentalDuration, Double rentalRate,
			Double replacementCost, Timestamp lastUpdate, String fulltext) {
		this.languageByLanguageId = languageByLanguageId;
		this.title = title;
		this.rentalDuration = rentalDuration;
		this.rentalRate = rentalRate;
		this.replacementCost = replacementCost;
		this.lastUpdate = lastUpdate;
		this.fulltext = fulltext;
	}

	/** full constructor */
	public Film(Language languageByOriginalLanguageId, Language languageByLanguageId, String title, String description,
			String releaseYear, Short rentalDuration, Double rentalRate, Short length, Double replacementCost,
			String rating, Timestamp lastUpdate, String specialFeatures, String fulltext, Set<Inventory> inventories,
			Set<FilmCategory> filmCategories, Set<FilmActor> filmActors) {
		this.languageByOriginalLanguageId = languageByOriginalLanguageId;
		this.languageByLanguageId = languageByLanguageId;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.rentalDuration = rentalDuration;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.rating = rating;
		this.lastUpdate = lastUpdate;
		this.specialFeatures = specialFeatures;
		this.fulltext = fulltext;
		this.inventories = inventories;
		this.filmCategories = filmCategories;
		this.filmActors = filmActors;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "film_id", unique = true, nullable = false)

	public Integer getFilmId() {
		return this.filmId;
	}

	public void setFilmId(Integer filmId) {
		this.filmId = filmId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "original_language_id")

	public Language getLanguageByOriginalLanguageId() {
		return this.languageByOriginalLanguageId;
	}

	public void setLanguageByOriginalLanguageId(Language languageByOriginalLanguageId) {
		this.languageByOriginalLanguageId = languageByOriginalLanguageId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "language_id", nullable = false)

	public Language getLanguageByLanguageId() {
		return this.languageByLanguageId;
	}

	public void setLanguageByLanguageId(Language languageByLanguageId) {
		this.languageByLanguageId = languageByLanguageId;
	}

	@Column(name = "title", nullable = false)

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "description")

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "release_year")

	public String getReleaseYear() {
		return this.releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Column(name = "rental_duration", nullable = false)

	public Short getRentalDuration() {
		return this.rentalDuration;
	}

	public void setRentalDuration(Short rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	@Column(name = "rental_rate", nullable = false, precision = 4)

	public Double getRentalRate() {
		return this.rentalRate;
	}

	public void setRentalRate(Double rentalRate) {
		this.rentalRate = rentalRate;
	}

	@Column(name = "length")

	public Short getLength() {
		return this.length;
	}

	public void setLength(Short length) {
		this.length = length;
	}

	@Column(name = "replacement_cost", nullable = false, precision = 5)

	public Double getReplacementCost() {
		return this.replacementCost;
	}

	public void setReplacementCost(Double replacementCost) {
		this.replacementCost = replacementCost;
	}

	@Column(name = "rating")

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Column(name = "last_update", nullable = false, length = 29)

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "special_features")

	public String getSpecialFeatures() {
		return this.specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

	@Column(name = "fulltext", nullable = false)

	public String getFulltext() {
		return this.fulltext;
	}

	public void setFulltext(String fulltext) {
		this.fulltext = fulltext;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "film")

	public Set<Inventory> getInventories() {
		return this.inventories;
	}

	public void setInventories(Set<Inventory> inventories) {
		this.inventories = inventories;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "film")

	public Set<FilmCategory> getFilmCategories() {
		return this.filmCategories;
	}

	public void setFilmCategories(Set<FilmCategory> filmCategories) {
		this.filmCategories = filmCategories;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "film")

	public Set<FilmActor> getFilmActors() {
		return this.filmActors;
	}

	public void setFilmActors(Set<FilmActor> filmActors) {
		this.filmActors = filmActors;
	}

}