
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Country entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "country", schema = "public")

public class Country implements java.io.Serializable {

	// Fields

	private Integer countryId;
	private String country;
	private Timestamp lastUpdate;
	private Set<City> cities = new HashSet<City>(0);

	// Constructors

	/** default constructor */
	public Country() {
	}

	/** minimal constructor */
	public Country(String country, Timestamp lastUpdate) {
		this.country = country;
		this.lastUpdate = lastUpdate;
	}

	/** full constructor */
	public Country(String country, Timestamp lastUpdate, Set<City> cities) {
		this.country = country;
		this.lastUpdate = lastUpdate;
		this.cities = cities;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "country_id", unique = true, nullable = false)

	public Integer getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	@Column(name = "country", nullable = false, length = 50)

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "last_update", nullable = false, length = 29)

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "country")

	public Set<City> getCities() {
		return this.cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}

}