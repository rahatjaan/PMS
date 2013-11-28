package com.pms.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.Set;

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
		@NamedQuery(name = "findAllTransactionss", query = "select myTransactions from Transactions myTransactions"),
		@NamedQuery(name = "findTransactionsByCharges", query = "select myTransactions from Transactions myTransactions where myTransactions.charges = ?1"),
		@NamedQuery(name = "findTransactionsByDescription", query = "select myTransactions from Transactions myTransactions where myTransactions.description = ?1"),
		@NamedQuery(name = "findTransactionsByDescriptionContaining", query = "select myTransactions from Transactions myTransactions where myTransactions.description like ?1"),
		@NamedQuery(name = "findTransactionsByPrimaryKey", query = "select myTransactions from Transactions myTransactions where myTransactions.transactionId = ?1"),
		@NamedQuery(name = "findTransactionsByReferenceNumber", query = "select myTransactions from Transactions myTransactions where myTransactions.referenceNumber = ?1"),
		@NamedQuery(name = "findTransactionsByReferenceNumberContaining", query = "select myTransactions from Transactions myTransactions where myTransactions.referenceNumber like ?1"),
		@NamedQuery(name = "findTransactionsByTransactionDate", query = "select myTransactions from Transactions myTransactions where myTransactions.transactionDate = ?1"),
		@NamedQuery(name = "findTransactionsByTransactionId", query = "select myTransactions from Transactions myTransactions where myTransactions.transactionId = ?1") })
@Table(catalog = "stubpms", name = "transactions")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "PMSSTUB/com/pms/domain", name = "Transactions")
public class Transactions implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "transaction_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@XmlElement
	Integer transactionId;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "transaction_date", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar transactionDate;
	/**
	 */

	@Column(name = "reference_number", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String referenceNumber;
	/**
	 */

	@Column(name = "charges")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer charges;
	/**
	 */

	@Column(name = "description", length = 1000)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String description;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "reservation_id", referencedColumnName = "reservation_id") })
	@XmlTransient
	Reservation reservation;

	/**
	 */
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 */
	public Integer getTransactionId() {
		return this.transactionId;
	}

	/**
	 */
	public void setTransactionDate(Calendar transactionDate) {
		this.transactionDate = transactionDate;
	}

	/**
	 */
	public Calendar getTransactionDate() {
		return this.transactionDate;
	}

	/**
	 */
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	/**
	 */
	public String getReferenceNumber() {
		return this.referenceNumber;
	}

	/**
	 */
	public void setCharges(Integer charges) {
		this.charges = charges;
	}

	/**
	 */
	public Integer getCharges() {
		return this.charges;
	}

	/**
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 */
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	/**
	 */
	@JsonIgnore
	public Reservation getReservation() {
		return reservation;
	}

	/**
	 */
	public Transactions() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Transactions that) {
		setTransactionId(that.getTransactionId());
		setTransactionDate(that.getTransactionDate());
		setReferenceNumber(that.getReferenceNumber());
		setCharges(that.getCharges());
		setDescription(that.getDescription());
		setReservation(that.getReservation());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("transactionId=[").append(transactionId).append("] ");
		buffer.append("transactionDate=[").append(transactionDate).append("] ");
		buffer.append("referenceNumber=[").append(referenceNumber).append("] ");
		buffer.append("charges=[").append(charges).append("] ");
		buffer.append("description=[").append(description).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((transactionId == null) ? 0 : transactionId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Transactions))
			return false;
		Transactions equalCheck = (Transactions) obj;
		if ((transactionId == null && equalCheck.transactionId != null) || (transactionId != null && equalCheck.transactionId == null))
			return false;
		if (transactionId != null && !transactionId.equals(equalCheck.transactionId))
			return false;
		return true;
	}
}
