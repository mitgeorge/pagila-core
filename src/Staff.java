
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
 * Staff entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "staff", schema = "public")

public class Staff implements java.io.Serializable {

	// Fields

	private Integer staffId;
	private Store store;
	private Address address;
	private String firstName;
	private String lastName;
	private String email;
	private Boolean active;
	private String username;
	private String password;
	private Timestamp lastUpdate;
	private String picture;
	private Set<PaymentP201706> paymentP201706s = new HashSet<PaymentP201706>(0);
	private Set<Payment> payments = new HashSet<Payment>(0);
	private Set<PaymentP201704> paymentP201704s = new HashSet<PaymentP201704>(0);
	private Set<PaymentP201701> paymentP201701s = new HashSet<PaymentP201701>(0);
	private Set<PaymentP201705> paymentP201705s = new HashSet<PaymentP201705>(0);
	private Set<PaymentP201702> paymentP201702s = new HashSet<PaymentP201702>(0);
	private Set<PaymentP201703> paymentP201703s = new HashSet<PaymentP201703>(0);
	private Set<Rental> rentals = new HashSet<Rental>(0);

	// Constructors

	/** default constructor */
	public Staff() {
	}

	/** minimal constructor */
	public Staff(Store store, Address address, String firstName, String lastName, Boolean active, String username,
			Timestamp lastUpdate) {
		this.store = store;
		this.address = address;
		this.firstName = firstName;
		this.lastName = lastName;
		this.active = active;
		this.username = username;
		this.lastUpdate = lastUpdate;
	}

	/** full constructor */
	public Staff(Store store, Address address, String firstName, String lastName, String email, Boolean active,
			String username, String password, Timestamp lastUpdate, String picture, Set<PaymentP201706> paymentP201706s,
			Set<Payment> payments, Set<PaymentP201704> paymentP201704s, Set<PaymentP201701> paymentP201701s,
			Set<PaymentP201705> paymentP201705s, Set<PaymentP201702> paymentP201702s,
			Set<PaymentP201703> paymentP201703s, Set<Rental> rentals) {
		this.store = store;
		this.address = address;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.active = active;
		this.username = username;
		this.password = password;
		this.lastUpdate = lastUpdate;
		this.picture = picture;
		this.paymentP201706s = paymentP201706s;
		this.payments = payments;
		this.paymentP201704s = paymentP201704s;
		this.paymentP201701s = paymentP201701s;
		this.paymentP201705s = paymentP201705s;
		this.paymentP201702s = paymentP201702s;
		this.paymentP201703s = paymentP201703s;
		this.rentals = rentals;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "staff_id", unique = true, nullable = false)

	public Integer getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "store_id", nullable = false)

	public Store getStore() {
		return this.store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id", nullable = false)

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Column(name = "first_name", nullable = false, length = 45)

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", nullable = false, length = 45)

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "email", length = 50)

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "active", nullable = false)

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Column(name = "username", nullable = false, length = 16)

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", length = 40)

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "last_update", nullable = false, length = 29)

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "picture")

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "staff")

	public Set<PaymentP201706> getPaymentP201706s() {
		return this.paymentP201706s;
	}

	public void setPaymentP201706s(Set<PaymentP201706> paymentP201706s) {
		this.paymentP201706s = paymentP201706s;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "staff")

	public Set<Payment> getPayments() {
		return this.payments;
	}

	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "staff")

	public Set<PaymentP201704> getPaymentP201704s() {
		return this.paymentP201704s;
	}

	public void setPaymentP201704s(Set<PaymentP201704> paymentP201704s) {
		this.paymentP201704s = paymentP201704s;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "staff")

	public Set<PaymentP201701> getPaymentP201701s() {
		return this.paymentP201701s;
	}

	public void setPaymentP201701s(Set<PaymentP201701> paymentP201701s) {
		this.paymentP201701s = paymentP201701s;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "staff")

	public Set<PaymentP201705> getPaymentP201705s() {
		return this.paymentP201705s;
	}

	public void setPaymentP201705s(Set<PaymentP201705> paymentP201705s) {
		this.paymentP201705s = paymentP201705s;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "staff")

	public Set<PaymentP201702> getPaymentP201702s() {
		return this.paymentP201702s;
	}

	public void setPaymentP201702s(Set<PaymentP201702> paymentP201702s) {
		this.paymentP201702s = paymentP201702s;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "staff")

	public Set<PaymentP201703> getPaymentP201703s() {
		return this.paymentP201703s;
	}

	public void setPaymentP201703s(Set<PaymentP201703> paymentP201703s) {
		this.paymentP201703s = paymentP201703s;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "staff")

	public Set<Rental> getRentals() {
		return this.rentals;
	}

	public void setRentals(Set<Rental> rentals) {
		this.rentals = rentals;
	}

}