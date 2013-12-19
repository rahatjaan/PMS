package com.pms.domain;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllReservations", query = "select myReservation from Reservation myReservation"),
		@NamedQuery(name = "findReservationByArrivalDate", query = "select myReservation from Reservation myReservation where myReservation.arrivalDate = ?1"),
		@NamedQuery(name = "findReservationByCardExpiryDate", query = "select myReservation from Reservation myReservation where myReservation.cardExpiryDate = ?1"),
		@NamedQuery(name = "findReservationByCardExpiryDateAfter", query = "select myReservation from Reservation myReservation where myReservation.cardExpiryDate > ?1"),
		@NamedQuery(name = "findReservationByCardExpiryDateBefore", query = "select myReservation from Reservation myReservation where myReservation.cardExpiryDate < ?1"),
		@NamedQuery(name = "findReservationByCardNumber", query = "select myReservation from Reservation myReservation where myReservation.cardNumber = ?1"),
		@NamedQuery(name = "findReservationByCardNumberContaining", query = "select myReservation from Reservation myReservation where myReservation.cardNumber like ?1"),
		@NamedQuery(name = "findReservationByCardType", query = "select myReservation from Reservation myReservation where myReservation.cardType = ?1"),
		@NamedQuery(name = "findReservationByCardTypeContaining", query = "select myReservation from Reservation myReservation where myReservation.cardType like ?1"),
		@NamedQuery(name = "findReservationByCurrencyCode", query = "select myReservation from Reservation myReservation where myReservation.currencyCode = ?1"),
		@NamedQuery(name = "findReservationByCurrencyCodeContaining", query = "select myReservation from Reservation myReservation where myReservation.currencyCode like ?1"),
		@NamedQuery(name = "findReservationByCvvNumber", query = "select myReservation from Reservation myReservation where myReservation.cvvNumber = ?1"),
		@NamedQuery(name = "findReservationByCvvNumberContaining", query = "select myReservation from Reservation myReservation where myReservation.cvvNumber like ?1"),
		@NamedQuery(name = "findReservationByDepartureDate", query = "select myReservation from Reservation myReservation where myReservation.departureDate = ?1"),
		@NamedQuery(name = "findReservationByFolioNumber", query = "select myReservation from Reservation myReservation where myReservation.folioNumber = ?1"),
		@NamedQuery(name = "findReservationByFolioNumberContaining", query = "select myReservation from Reservation myReservation where myReservation.folioNumber like ?1"),
		@NamedQuery(name = "findReservationByIsCheckedOut", query = "select myReservation from Reservation myReservation where myReservation.isCheckedOut = ?1"),
		@NamedQuery(name = "findReservationByIsCheckedOutContaining", query = "select myReservation from Reservation myReservation where myReservation.isCheckedOut like ?1"),
		@NamedQuery(name = "findReservationByNumberOfAdults", query = "select myReservation from Reservation myReservation where myReservation.numberOfAdults = ?1"),
		@NamedQuery(name = "findReservationByNumberOfChildren", query = "select myReservation from Reservation myReservation where myReservation.numberOfChildren = ?1"),
		@NamedQuery(name = "findReservationByNumberOfDays", query = "select myReservation from Reservation myReservation where myReservation.numberOfDays = ?1"),
		@NamedQuery(name = "findReservationByPrimaryKey", query = "select myReservation from Reservation myReservation where myReservation.reservationId = ?1"),
		@NamedQuery(name = "findReservationByReservationId", query = "select myReservation from Reservation myReservation where myReservation.reservationId = ?1") })
@Table(catalog = "stubpms", name = "reservation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "PMS/com/pms/domain", name = "Reservation")
@XmlRootElement(namespace = "PMS/com/pms/domain")
public class Reservation implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "reservation_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@XmlElement
	Integer reservationId;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "arrival_date", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar arrivalDate;
	/**
	 */

	@Column(name = "number_of_days")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer numberOfDays;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "departure_date", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar departureDate;
	/**
	 */

	@Column(name = "card_type", length = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String cardType;
	/**
	 */

	@Column(name = "card_number", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String cardNumber;
	/**
	 */
	
	@Column(name = "special_requests", length = 1000)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String specialRequests;

	@Column(name = "cvv_number", length = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String cvvNumber;
	/**
	 */

	@Column(name = "folio_number", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String folioNumber;
	/**
	 */

	@Column(name = "currency_code", length = 10)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String currencyCode;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "card_expiry_date")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar cardExpiryDate;
	/**
	 */

	@Column(name = "number_of_children")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer numberOfChildren;
	/**
	 */

	@Column(name = "number_of_adults")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer numberOfAdults;
	/**
	 */

	@Column(name = "is_checked_out", length = 1)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String isCheckedOut;
	
	@Column(name = "signature")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	byte[] signature;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "guest_id", referencedColumnName = "guest_id") })
	@XmlTransient
	Guest guest;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "room", referencedColumnName = "room_id") })
	@XmlTransient
	Room room;
	/**
	 */
	@OneToMany(mappedBy = "reservation", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.pms.domain.Transactions> transactionses;

	private transient String error;
	
	
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	/**
	 */
	public void setReservationId(Integer reservationId) {
		this.reservationId = reservationId;
	}

	/**
	 */
	public Integer getReservationId() {
		return this.reservationId;
	}
	
	

	public String getSpecialRequests() {
		return specialRequests;
	}

	public void setSpecialRequests(String specialRequests) {
		this.specialRequests = specialRequests;
	}

	/**
	 */
	public void setArrivalDate(Calendar arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	/**
	 */
	public Calendar getArrivalDate() {
		return this.arrivalDate;
	}

	/**
	 */
	public void setNumberOfDays(Integer numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	/**
	 */
	public Integer getNumberOfDays() {
		return this.numberOfDays;
	}

	/**
	 */
	public void setDepartureDate(Calendar departureDate) {
		this.departureDate = departureDate;
	}

	/**
	 */
	public Calendar getDepartureDate() {
		return this.departureDate;
	}

	/**
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	/**
	 */
	public String getCardType() {
		return this.cardType;
	}

	/**
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 */
	public String getCardNumber() {
		return this.cardNumber;
	}

	/**
	 */
	public void setCvvNumber(String cvvNumber) {
		this.cvvNumber = cvvNumber;
	}

	/**
	 */
	public String getCvvNumber() {
		return this.cvvNumber;
	}

	/**
	 */
	public void setFolioNumber(String folioNumber) {
		this.folioNumber = folioNumber;
	}

	/**
	 */
	public String getFolioNumber() {
		return this.folioNumber;
	}

	/**
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 */
	public String getCurrencyCode() {
		return this.currencyCode;
	}

	/**
	 */
	public void setCardExpiryDate(Calendar cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}

	/**
	 */
	public Calendar getCardExpiryDate() {
		return this.cardExpiryDate;
	}

	/**
	 */
	public void setNumberOfChildren(Integer numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	/**
	 */
	public Integer getNumberOfChildren() {
		return this.numberOfChildren;
	}

	/**
	 */
	public void setNumberOfAdults(Integer numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	/**
	 */
	public Integer getNumberOfAdults() {
		return this.numberOfAdults;
	}

	/**
	 */
	public void setIsCheckedOut(String isCheckedOut) {
		this.isCheckedOut = isCheckedOut;
	}

	/**
	 */
	public String getIsCheckedOut() {
		return this.isCheckedOut;
	}

	/**
	 */
	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	/**
	 */
	@JsonIgnore
	public Guest getGuest() {
		return guest;
	}

	/**
	 */
	public void setRoom(Room room) {
		this.room = room;
	}

	/**
	 */
	@JsonIgnore
	public Room getRoom() {
		return room;
	}

	/**
	 */
	public void setTransactionses(Set<Transactions> transactionses) {
		this.transactionses = transactionses;
	}

	/**
	 */
	@JsonIgnore
	public Set<Transactions> getTransactionses() {
		if (transactionses == null) {
			transactionses = new java.util.LinkedHashSet<com.pms.domain.Transactions>();
		}
		return transactionses;
	}

	/**
	 */
	public Reservation() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Reservation that) {
		setReservationId(that.getReservationId());
		setArrivalDate(that.getArrivalDate());
		setNumberOfDays(that.getNumberOfDays());
		setDepartureDate(that.getDepartureDate());
		setCardType(that.getCardType());
		setCardNumber(that.getCardNumber());
		setCvvNumber(that.getCvvNumber());
		setFolioNumber(that.getFolioNumber());
		setCurrencyCode(that.getCurrencyCode());
		setCardExpiryDate(that.getCardExpiryDate());
		setNumberOfChildren(that.getNumberOfChildren());
		setNumberOfAdults(that.getNumberOfAdults());
		setIsCheckedOut(that.getIsCheckedOut());
		setGuest(that.getGuest());
		setRoom(that.getRoom());
		setTransactionses(new java.util.LinkedHashSet<com.pms.domain.Transactions>(that.getTransactionses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("reservationId=[").append(reservationId).append("] ");
		buffer.append("arrivalDate=[").append(arrivalDate).append("] ");
		buffer.append("numberOfDays=[").append(numberOfDays).append("] ");
		buffer.append("departureDate=[").append(departureDate).append("] ");
		buffer.append("cardType=[").append(cardType).append("] ");
		buffer.append("cardNumber=[").append(cardNumber).append("] ");
		buffer.append("cvvNumber=[").append(cvvNumber).append("] ");
		buffer.append("folioNumber=[").append(folioNumber).append("] ");
		buffer.append("currencyCode=[").append(currencyCode).append("] ");
		buffer.append("cardExpiryDate=[").append(cardExpiryDate).append("] ");
		buffer.append("numberOfChildren=[").append(numberOfChildren).append("] ");
		buffer.append("numberOfAdults=[").append(numberOfAdults).append("] ");
		buffer.append("isCheckedOut=[").append(isCheckedOut).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((reservationId == null) ? 0 : reservationId.hashCode()));
		return result;
	}
	
	

	public byte[] getSignature() {
		return signature;
	}

	public void setSignature(byte[] signature) {
		this.signature = signature;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Reservation))
			return false;
		Reservation equalCheck = (Reservation) obj;
		if ((reservationId == null && equalCheck.reservationId != null) || (reservationId != null && equalCheck.reservationId == null))
			return false;
		if (reservationId != null && !reservationId.equals(equalCheck.reservationId))
			return false;
		return true;
	}
}
