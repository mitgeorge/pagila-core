
// default package

import java.sql.Timestamp;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "customer", schema = "public")

public class Customer implements java.io.Serializable {

	// Fields

	private Integer customerId;
	private Store store;
	private Address address;
	private String firstName;
	private String lastName;
	private String email;
	private Boolean activebool;
	private Date createDate;
	private Timestamp lastUpdate;
	private Integer active;
	private Set<PaymentP201704> paymentP201704s = new HashSet<PaymentP201704>(0);
	private Set<Rental> rentals = new HashSet<Rental>(0);
	private Set<PaymentP201702> paymentP201702s = new HashSet<PaymentP201702>(0);
	private Set<PaymentP201703> paymentP201703s = new HashSet<PaymentP201703>(0);
	private Set<PaymentP201706> paymentP201706s = new HashSet<PaymentP201706>(0);
	private Set<PaymentP201705> paymentP201705s = new HashSet<PaymentP201705>(0);
	private Set<PaymentP201701> paymentP201701s = new HashSet<PaymentP201701>(0);
	private Set<Payment> payments = new HashSet<Payment>(0);

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(Store store, Address address, String firstName, String lastName, Boolean activebool,
			Date createDate) {
		this.store = store;
		this.address = address;
		this.firstName = firstName;
		this.lastName = lastName;
		this.activebool = activebool;
		this.createDate = createDate;
	}

	/** full constructor */
	public Customer(Store store, Address address, String firstName, String lastName, String email, Boolean activebool,
			Date createDate, Timestamp lastUpdate, Integer active, Set<PaymentP201704> paymentP201704s,
			Set<Rental> rentals, Set<PaymentP201702> paymentP201702s, Set<PaymentP201703> paymentP201703s,
			Set<PaymentP201706> paymentP201706s, Set<PaymentP201705> paymentP201705s,
			Set<PaymentP201701> paymentP201701s, Set<Payment> payments) {
		this.store = store;
		this.address = address;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.activebool = activebool;
		this.createDate = createDate;
		this.lastUpdate = lastUpdate;
		this.active = active;
		this.paymentP201704s = paymentP201704s;
		this.rentals = rentals;
		this.paymentP201702s = paymentP201702s;
		this.paymentP201703s = paymentP201703s;
		this.paymentP201706s = paymentP201706s;
		this.paymentP201705s = paymentP201705s;
		this.paymentP201701s = paymentP201701s;
		this.payments = payments;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "customer_id", unique = true, nullable = false)

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
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

	@Column(name = "activebool", nullable = false)

	public Boolean getActivebool() {
		return this.activebool;
	}

	public void setActivebool(Boolean activebool) {
		this.activebool = activebool;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "create_date", nullable = false, length = 13)

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "last_update", length = 29)

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "active")

	public Integer getActive() {
		return this.active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")

	public Set<PaymentP201704> getPaymentP201704s() {
		return this.paymentP201704s;
	}

	public void setPaymentP201704s(Set<PaymentP201704> paymentP201704s) {
		this.paymentP201704s = paymentP201704s;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")

	public Set<Rental> getRentals() {
		return this.rentals;
	}

	public void setRentals(Set<Rental> rentals) {
		this.rentals = rentals;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")

	public Set<PaymentP201702> getPaymentP201702s() {
		return this.paymentP201702s;
	}

	public void setPaymentP201702s(Set<PaymentP201702> paymentP201702s) {
		this.paymentP201702s = paymentP201702s;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")

	public Set<PaymentP201703> getPaymentP201703s() {
		return this.paymentP201703s;
	}

	public void setPaymentP201703s(Set<PaymentP201703> paymentP201703s) {
		this.paymentP201703s = paymentP201703s;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")

	public Set<PaymentP201706> getPaymentP201706s() {
		return this.paymentP201706s;
	}

	public void setPaymentP201706s(Set<PaymentP201706> paymentP201706s) {
		this.paymentP201706s = paymentP201706s;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")

	public Set<PaymentP201705> getPaymentP201705s() {
		return this.paymentP201705s;
	}

	public void setPaymentP201705s(Set<PaymentP201705> paymentP201705s) {
		this.paymentP201705s = paymentP201705s;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")

	public Set<PaymentP201701> getPaymentP201701s() {
		return this.paymentP201701s;
	}

	public void setPaymentP201701s(Set<PaymentP201701> paymentP201701s) {
		this.paymentP201701s = paymentP201701s;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")

	public Set<Payment> getPayments() {
		return this.payments;
	}

	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}

}