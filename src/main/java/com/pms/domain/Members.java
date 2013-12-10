package com.pms.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

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
		@NamedQuery(name = "findAllMemberss", query = "select myMembers from Members myMembers"),
		@NamedQuery(name = "findMembersByMemberId", query = "select myMembers from Members myMembers where myMembers.memberId = ?1"),
		@NamedQuery(name = "findMembersByMemberIdContaining", query = "select myMembers from Members myMembers where myMembers.memberId like ?1"),
		@NamedQuery(name = "findMembersByMembershipType", query = "select myMembers from Members myMembers where myMembers.membershipType = ?1"),
		@NamedQuery(name = "findMembersByMembershipTypeContaining", query = "select myMembers from Members myMembers where myMembers.membershipType like ?1"),
		@NamedQuery(name = "findMembersByPrimaryKey", query = "select myMembers from Members myMembers where myMembers.memberId = ?1") })
@Table(catalog = "stubpms", name = "members")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "PMS/com/pms/domain", name = "Members")
@XmlRootElement(namespace = "PMS/com/pms/domain")
public class Members implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "member_id", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	String memberId;
	/**
	 */

	@Column(name = "membership_type", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String membershipType;

	/**
	 */
	@OneToMany(mappedBy = "members", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.pms.domain.Guest> guests;

	/**
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	/**
	 */
	public String getMemberId() {
		return this.memberId;
	}

	/**
	 */
	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}

	/**
	 */
	public String getMembershipType() {
		return this.membershipType;
	}

	/**
	 */
	public void setGuests(Set<Guest> guests) {
		this.guests = guests;
	}

	/**
	 */
	@JsonIgnore
	public Set<Guest> getGuests() {
		if (guests == null) {
			guests = new java.util.LinkedHashSet<com.pms.domain.Guest>();
		}
		return guests;
	}

	/**
	 */
	public Members() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Members that) {
		setMemberId(that.getMemberId());
		setMembershipType(that.getMembershipType());
		setGuests(new java.util.LinkedHashSet<com.pms.domain.Guest>(that.getGuests()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("memberId=[").append(memberId).append("] ");
		buffer.append("membershipType=[").append(membershipType).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((memberId == null) ? 0 : memberId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Members))
			return false;
		Members equalCheck = (Members) obj;
		if ((memberId == null && equalCheck.memberId != null) || (memberId != null && equalCheck.memberId == null))
			return false;
		if (memberId != null && !memberId.equals(equalCheck.memberId))
			return false;
		return true;
	}
}
