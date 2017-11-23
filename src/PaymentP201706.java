
// default package

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
 * PaymentP201706 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "payment_p2017_06", schema = "public")

public class PaymentP201706 implements java.io.Serializable {

	// Fields

	private PaymentP201706Id id;
	private Customer customer;
	private Rental rental;
	private Staff staff;

	// Constructors

	/** default constructor */
	public PaymentP201706() {
	}

	/** full constructor */
	public PaymentP201706(PaymentP201706Id id, Customer customer, Rental rental, Staff staff) {
		this.id = id;
		this.customer = customer;
		this.rental = rental;
		this.staff = staff;
	}

	// Property accessors
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "paymentId", column = @Column(name = "payment_id", nullable = false)),
			@AttributeOverride(name = "customerId", column = @Column(name = "customer_id", nullable = false)),
			@AttributeOverride(name = "staffId", column = @Column(name = "staff_id", nullable = false)),
			@AttributeOverride(name = "rentalId", column = @Column(name = "rental_id", nullable = false)),
			@AttributeOverride(name = "amount", column = @Column(name = "amount", nullable = false, precision = 5)),
			@AttributeOverride(name = "paymentDate", column = @Column(name = "payment_date", nullable = false, length = 29)) })

	public PaymentP201706Id getId() {
		return this.id;
	}

	public void setId(PaymentP201706Id id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id", nullable = false, insertable = false, updatable = false)

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rental_id", nullable = false, insertable = false, updatable = false)

	public Rental getRental() {
		return this.rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "staff_id", nullable = false, insertable = false, updatable = false)

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

}