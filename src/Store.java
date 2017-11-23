
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
 * Store entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "store", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = "manager_staff_id"))

public class Store implements java.io.Serializable {

	// Fields

	private Integer storeId;
	private Address address;
	private Short managerStaffId;
	private Timestamp lastUpdate;
	private Set<Inventory> inventories = new HashSet<Inventory>(0);
	private Set<Customer> customers = new HashSet<Customer>(0);
	private Set<Staff> staffs = new HashSet<Staff>(0);

	// Constructors

	/** default constructor */
	public Store() {
	}

	/** minimal constructor */
	public Store(Address address, Short managerStaffId, Timestamp lastUpdate) {
		this.address = address;
		this.managerStaffId = managerStaffId;
		this.lastUpdate = lastUpdate;
	}

	/** full constructor */
	public Store(Address address, Short managerStaffId, Timestamp lastUpdate, Set<Inventory> inventories,
			Set<Customer> customers, Set<Staff> staffs) {
		this.address = address;
		this.managerStaffId = managerStaffId;
		this.lastUpdate = lastUpdate;
		this.inventories = inventories;
		this.customers = customers;
		this.staffs = staffs;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "store_id", unique = true, nullable = false)

	public Integer getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id", nullable = false)

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Column(name = "manager_staff_id", unique = true, nullable = false)

	public Short getManagerStaffId() {
		return this.managerStaffId;
	}

	public void setManagerStaffId(Short managerStaffId) {
		this.managerStaffId = managerStaffId;
	}

	@Column(name = "last_update", nullable = false, length = 29)

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "store")

	public Set<Inventory> getInventories() {
		return this.inventories;
	}

	public void setInventories(Set<Inventory> inventories) {
		this.inventories = inventories;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "store")

	public Set<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "store")

	public Set<Staff> getStaffs() {
		return this.staffs;
	}

	public void setStaffs(Set<Staff> staffs) {
		this.staffs = staffs;
	}

}