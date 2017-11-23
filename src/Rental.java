
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
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.GenericGenerator;

/**
 * Rental entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "rental", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = { "rental_date",
		"inventory_id", "customer_id" }))

public class Rental implements java.io.Serializable {

	// Fields

	private Integer rentalId;
	private Customer customer;
	private Staff staff;
	private Inventory inventory;
	private Timestamp rentalDate;
	private Timestamp returnDate;
	private Timestamp lastUpdate;
	private Set<Payment> payments = new HashSet<Payment>(0);
	private Set<PaymentP201702> paymentP201702s = new HashSet<PaymentP201702>(0);
	private Set<PaymentP201701> paymentP201701s = new HashSet<PaymentP201701>(0);
	private Set<PaymentP201704> paymentP201704s = new HashSet<PaymentP201704>(0);
	private Set<PaymentP201703> paymentP201703s = new HashSet<PaymentP201703>(0);
	private Set<PaymentP201706> paymentP201706s = new HashSet<PaymentP201706>(0);
	private Set<PaymentP201705> paymentP201705s = new HashSet<PaymentP201705>(0);

	// Constructors

	/** default constructor */
	public Rental() {
	}

	/** minimal constructor */
	public Rental(Customer customer, Staff staff, Inventory inventory, Timestamp rentalDate, Timestamp lastUpdate) {
		this.customer = customer;
		this.staff = staff;
		this.inventory = inventory;
		this.rentalDate = rentalDate;
		this.lastUpdate = lastUpdate;
	}

	/** full constructor */
	public Rental(Customer customer, Staff staff, Inventory inventory, Timestamp rentalDate, Timestamp returnDate,
			Timestamp lastUpdate, Set<Payment> payments, Set<PaymentP201702> paymentP201702s,
			Set<PaymentP201701> paymentP201701s, Set<PaymentP201704> paymentP201704s,
			Set<PaymentP201703> paymentP201703s, Set<PaymentP201706> paymentP201706s,
			Set<PaymentP201705> paymentP201705s) {
		this.customer = customer;
		this.staff = staff;
		this.inventory = inventory;
		this.rentalDate = rentalDate;
		this.returnDate = returnDate;
		this.lastUpdate = lastUpdate;
		this.payments = payments;
		this.paymentP201702s = paymentP201702s;
		this.paymentP201701s = paymentP201701s;
		this.paymentP201704s = paymentP201704s;
		this.paymentP201703s = paymentP201703s;
		this.paymentP201706s = paymentP201706s;
		this.paymentP201705s = paymentP201705s;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "rental_id", unique = true, nullable = false)

	public Integer getRentalId() {
		return this.rentalId;
	}

	public void setRentalId(Integer rentalId) {
		this.rentalId = rentalId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id", nullable = false)

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "staff_id", nullable = false)

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "inventory_id", nullable = false)

	public Inventory getInventory() {
		return this.inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	@Column(name = "rental_date", nullable = false, length = 29)

	public Timestamp getRentalDate() {
		return this.rentalDate;
	}

	public void setRentalDate(Timestamp rentalDate) {
		this.rentalDate = rentalDate;
	}

	@Column(name = "return_date", length = 29)

	public Timestamp getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(Timestamp returnDate) {
		this.returnDate = returnDate;
	}

	@Column(name = "last_update", nullable = false, length = 29)

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rental")

	public Set<Payment> getPayments() {
		return this.payments;
	}

	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rental")

	public Set<PaymentP201702> getPaymentP201702s() {
		return this.paymentP201702s;
	}

	public void setPaymentP201702s(Set<PaymentP201702> paymentP201702s) {
		this.paymentP201702s = paymentP201702s;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rental")

	public Set<PaymentP201701> getPaymentP201701s() {
		return this.paymentP201701s;
	}

	public void setPaymentP201701s(Set<PaymentP201701> paymentP201701s) {
		this.paymentP201701s = paymentP201701s;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rental")

	public Set<PaymentP201704> getPaymentP201704s() {
		return this.paymentP201704s;
	}

	public void setPaymentP201704s(Set<PaymentP201704> paymentP201704s) {
		this.paymentP201704s = paymentP201704s;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rental")

	public Set<PaymentP201703> getPaymentP201703s() {
		return this.paymentP201703s;
	}

	public void setPaymentP201703s(Set<PaymentP201703> paymentP201703s) {
		this.paymentP201703s = paymentP201703s;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rental")

	public Set<PaymentP201706> getPaymentP201706s() {
		return this.paymentP201706s;
	}

	public void setPaymentP201706s(Set<PaymentP201706> paymentP201706s) {
		this.paymentP201706s = paymentP201706s;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rental")

	public Set<PaymentP201705> getPaymentP201705s() {
		return this.paymentP201705s;
	}

	public void setPaymentP201705s(Set<PaymentP201705> paymentP201705s) {
		this.paymentP201705s = paymentP201705s;
	}

}