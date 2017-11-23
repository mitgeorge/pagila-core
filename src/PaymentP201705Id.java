
// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PaymentP201705Id entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class PaymentP201705Id implements java.io.Serializable {

	// Fields

	private Integer paymentId;
	private Short customerId;
	private Short staffId;
	private Integer rentalId;
	private Double amount;
	private Timestamp paymentDate;

	// Constructors

	/** default constructor */
	public PaymentP201705Id() {
	}

	/** full constructor */
	public PaymentP201705Id(Integer paymentId, Short customerId, Short staffId, Integer rentalId, Double amount,
			Timestamp paymentDate) {
		this.paymentId = paymentId;
		this.customerId = customerId;
		this.staffId = staffId;
		this.rentalId = rentalId;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}

	// Property accessors

	@Column(name = "payment_id", nullable = false)

	public Integer getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	@Column(name = "customer_id", nullable = false)

	public Short getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Short customerId) {
		this.customerId = customerId;
	}

	@Column(name = "staff_id", nullable = false)

	public Short getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Short staffId) {
		this.staffId = staffId;
	}

	@Column(name = "rental_id", nullable = false)

	public Integer getRentalId() {
		return this.rentalId;
	}

	public void setRentalId(Integer rentalId) {
		this.rentalId = rentalId;
	}

	@Column(name = "amount", nullable = false, precision = 5)

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Column(name = "payment_date", nullable = false, length = 29)

	public Timestamp getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Timestamp paymentDate) {
		this.paymentDate = paymentDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PaymentP201705Id))
			return false;
		PaymentP201705Id castOther = (PaymentP201705Id) other;

		return ((this.getPaymentId() == castOther.getPaymentId()) || (this.getPaymentId() != null
				&& castOther.getPaymentId() != null && this.getPaymentId().equals(castOther.getPaymentId())))
				&& ((this.getCustomerId() == castOther.getCustomerId()) || (this.getCustomerId() != null
						&& castOther.getCustomerId() != null && this.getCustomerId().equals(castOther.getCustomerId())))
				&& ((this.getStaffId() == castOther.getStaffId()) || (this.getStaffId() != null
						&& castOther.getStaffId() != null && this.getStaffId().equals(castOther.getStaffId())))
				&& ((this.getRentalId() == castOther.getRentalId()) || (this.getRentalId() != null
						&& castOther.getRentalId() != null && this.getRentalId().equals(castOther.getRentalId())))
				&& ((this.getAmount() == castOther.getAmount()) || (this.getAmount() != null
						&& castOther.getAmount() != null && this.getAmount().equals(castOther.getAmount())))
				&& ((this.getPaymentDate() == castOther.getPaymentDate())
						|| (this.getPaymentDate() != null && castOther.getPaymentDate() != null
								&& this.getPaymentDate().equals(castOther.getPaymentDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPaymentId() == null ? 0 : this.getPaymentId().hashCode());
		result = 37 * result + (getCustomerId() == null ? 0 : this.getCustomerId().hashCode());
		result = 37 * result + (getStaffId() == null ? 0 : this.getStaffId().hashCode());
		result = 37 * result + (getRentalId() == null ? 0 : this.getRentalId().hashCode());
		result = 37 * result + (getAmount() == null ? 0 : this.getAmount().hashCode());
		result = 37 * result + (getPaymentDate() == null ? 0 : this.getPaymentDate().hashCode());
		return result;
	}

}