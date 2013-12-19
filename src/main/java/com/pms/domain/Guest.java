package com.pms.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllGuests", query = "select myGuest from Guest myGuest"),
		@NamedQuery(name = "findGuestByAddress1", query = "select myGuest from Guest myGuest where myGuest.address1 = ?1"),
		@NamedQuery(name = "findGuestByAddress1Containing", query = "select myGuest from Guest myGuest where myGuest.address1 like ?1"),
		@NamedQuery(name = "findGuestByAddress2", query = "select myGuest from Guest myGuest where myGuest.address2 = ?1"),
		@NamedQuery(name = "findGuestByAddress2Containing", query = "select myGuest from Guest myGuest where myGuest.address2 like ?1"),
		@NamedQuery(name = "findGuestByCountry", query = "select myGuest from Guest myGuest where myGuest.country = ?1"),
		@NamedQuery(name = "findGuestByCountryContaining", query = "select myGuest from Guest myGuest where myGuest.country like ?1"),
		@NamedQuery(name = "findGuestByEmail", query = "select myGuest from Guest myGuest where myGuest.email = ?1"),
		@NamedQuery(name = "findGuestByEmailContaining", query = "select myGuest from Guest myGuest where myGuest.email like ?1"),
		@NamedQuery(name = "findGuestByFirstName", query = "select myGuest from Guest myGuest where myGuest.firstName = ?1"),
		@NamedQuery(name = "findGuestBillInfo", query = "select myGuest from Reservation myReservation, Transactions myTransactions, Guest myGuest where myGuest.email = ?1 and myGuest.lastName = ?2 and myReservation.room.roomId = ?3"),
		@NamedQuery(name = "findGuestInfoByHhNumber", query = "select myGuest from Guest myGuest where myGuest.loyaltyNumber = ?1"),
		@NamedQuery(name = "findGuestByFirstNameContaining", query = "select myGuest from Guest myGuest where myGuest.firstName like ?1"),
		@NamedQuery(name = "findGuestByGuestId", query = "select myGuest from Guest myGuest where myGuest.guestId = ?1"),
		@NamedQuery(name = "findGuestByLastName", query = "select myGuest from Guest myGuest where myGuest.lastName = ?1"),
		@NamedQuery(name = "findGuestByLastNameContaining", query = "select myGuest from Guest myGuest where myGuest.lastName like ?1"),
		@NamedQuery(name = "findGuestByMobileNumber", query = "select myGuest from Guest myGuest where myGuest.mobileNumber = ?1"),
		@NamedQuery(name = "findGuestByMobileNumberContaining", query = "select myGuest from Guest myGuest where myGuest.mobileNumber like ?1"),
		@NamedQuery(name = "findGuestByNamePrefix", query = "select myGuest from Guest myGuest where myGuest.namePrefix = ?1"),
		@NamedQuery(name = "findGuestByNamePrefixContaining", query = "select myGuest from Guest myGuest where myGuest.namePrefix like ?1"),
		@NamedQuery(name = "findGuestByPrimaryKey", query = "select myGuest from Guest myGuest where myGuest.guestId = ?1") })
@Table(catalog = "stubpms", name = "guest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "PMS/com/pms/domain", name = "Guest")
@XmlRootElement(namespace = "PMS/com/pms/domain")
@XmlSeeAlso({Room.class})
public class Guest implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "guest_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@XmlElement
	Integer guestId;
	/**
	 */

	@Column(name = "name_prefix", length = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String namePrefix;
	/**
	 */

	@Column(name = "first_name", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String firstName;
	/**
	 */

	@Column(name = "last_name", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String lastName;
	/**
	 */

	@Column(name = "address1", length = 1000)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String address1;
	/**
	 */

	@Column(name = "address2", length = 1000)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String address2;
	/**
	 */

	@Column(name = "email", length = 300)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String email;
	/**
	 */

	@Column(name = "country", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String country;
	/**
	 */
	@Column(name = "loyalty_number", length = 200)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String loyaltyNumber;
	

	@Column(name = "mobile_number", length = 200)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String mobileNumber;

	@Column(name = "userPic")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	byte[] userPic;
	
	transient String error;
	
	
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public byte[] getUserPic() {
		return userPic;
	}

	public void setUserPic(byte[] userPic) {
		this.userPic = userPic;
	}

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "membership_number", referencedColumnName = "member_id") })
	@XmlTransient
	Members members;
	/**
	 */
	@OneToMany(mappedBy = "guest", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.pms.domain.Reservation> reservations;

	/**
	 */
	public void setGuestId(Integer guestId) {
		this.guestId = guestId;
	}

	/**
	 */
	public Integer getGuestId() {
		return this.guestId;
	}
	
	

	public String getLoyaltyNumber() {
		return loyaltyNumber;
	}

	public void setLoyaltyNumber(String loyaltyNumber) {
		this.loyaltyNumber = loyaltyNumber;
	}

	/**
	 */
	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}

	/**
	 */
	public String getNamePrefix() {
		return this.namePrefix;
	}

	/**
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 */
	public String getAddress1() {
		return this.address1;
	}

	/**
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 */
	public String getAddress2() {
		return this.address2;
	}

	/**
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 */
	public String getCountry() {
		return this.country;
	}

	/**
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 */
	public String getMobileNumber() {
		return this.mobileNumber;
	}

	/**
	 */
	public void setMembers(Members members) {
		this.members = members;
	}

	/**
	 */
	@JsonIgnore
	public Members getMembers() {
		return members;
	}

	/**
	 */
	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

	/**
	 */
	@JsonIgnore
	public Set<Reservation> getReservations() {
		if (reservations == null) {
			reservations = new java.util.LinkedHashSet<com.pms.domain.Reservation>();
		}
		return reservations;
	}

	/**
	 */
	public Guest() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Guest that) {
		setGuestId(that.getGuestId());
		setNamePrefix(that.getNamePrefix());
		setFirstName(that.getFirstName());
		setLastName(that.getLastName());
		setAddress1(that.getAddress1());
		setAddress2(that.getAddress2());
		setEmail(that.getEmail());
		setCountry(that.getCountry());
		setMobileNumber(that.getMobileNumber());
		setMembers(that.getMembers());
		setReservations(new java.util.LinkedHashSet<com.pms.domain.Reservation>(that.getReservations()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("guestId=[").append(guestId).append("] ");
		buffer.append("namePrefix=[").append(namePrefix).append("] ");
		buffer.append("firstName=[").append(firstName).append("] ");
		buffer.append("lastName=[").append(lastName).append("] ");
		buffer.append("address1=[").append(address1).append("] ");
		buffer.append("address2=[").append(address2).append("] ");
		buffer.append("email=[").append(email).append("] ");
		buffer.append("country=[").append(country).append("] ");
		buffer.append("mobileNumber=[").append(mobileNumber).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((guestId == null) ? 0 : guestId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Guest))
			return false;
		Guest equalCheck = (Guest) obj;
		if ((guestId == null && equalCheck.guestId != null) || (guestId != null && equalCheck.guestId == null))
			return false;
		if (guestId != null && !guestId.equals(equalCheck.guestId))
			return false;
		return true;
	}
}
