package com.pms.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
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
		@NamedQuery(name = "findAllBeds", query = "select myBed from Bed myBed"),
		@NamedQuery(name = "findBedByBedId", query = "select myBed from Bed myBed where myBed.bedId = ?1"),
		@NamedQuery(name = "findBedByBedTypeCode", query = "select myBed from Bed myBed where myBed.bedTypeCode = ?1"),
		@NamedQuery(name = "findBedByBedTypeCodeContaining", query = "select myBed from Bed myBed where myBed.bedTypeCode like ?1"),
		@NamedQuery(name = "findBedByBedTypeDescription", query = "select myBed from Bed myBed where myBed.bedTypeDescription = ?1"),
		@NamedQuery(name = "findBedByBedTypeDescriptionContaining", query = "select myBed from Bed myBed where myBed.bedTypeDescription like ?1"),
		@NamedQuery(name = "findBedByPrimaryKey", query = "select myBed from Bed myBed where myBed.bedId = ?1") })
@Table(catalog = "stubpms", name = "bed")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "PMSSTUB/com/pms/domain", name = "Bed")
@XmlRootElement(namespace = "PMSSTUB/com/pms/domain")
public class Bed implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "bed_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@XmlElement
	Integer bedId;
	/**
	 */

	@Column(name = "bed_type_code", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String bedTypeCode;
	/**
	 */

	@Column(name = "bed_type_description", length = 1000)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String bedTypeDescription;

	/**
	 */
	@OneToMany(mappedBy = "bed", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.pms.domain.Roomtype> roomtypes;

	/**
	 */
	public void setBedId(Integer bedId) {
		this.bedId = bedId;
	}

	/**
	 */
	public Integer getBedId() {
		return this.bedId;
	}

	/**
	 */
	public void setBedTypeCode(String bedTypeCode) {
		this.bedTypeCode = bedTypeCode;
	}

	/**
	 */
	public String getBedTypeCode() {
		return this.bedTypeCode;
	}

	/**
	 */
	public void setBedTypeDescription(String bedTypeDescription) {
		this.bedTypeDescription = bedTypeDescription;
	}

	/**
	 */
	public String getBedTypeDescription() {
		return this.bedTypeDescription;
	}

	/**
	 */
	public void setRoomtypes(Set<Roomtype> roomtypes) {
		this.roomtypes = roomtypes;
	}

	/**
	 */
	@JsonIgnore
	public Set<Roomtype> getRoomtypes() {
		if (roomtypes == null) {
			roomtypes = new java.util.LinkedHashSet<com.pms.domain.Roomtype>();
		}
		return roomtypes;
	}

	/**
	 */
	public Bed() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Bed that) {
		setBedId(that.getBedId());
		setBedTypeCode(that.getBedTypeCode());
		setBedTypeDescription(that.getBedTypeDescription());
		setRoomtypes(new java.util.LinkedHashSet<com.pms.domain.Roomtype>(that.getRoomtypes()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("bedId=[").append(bedId).append("] ");
		buffer.append("bedTypeCode=[").append(bedTypeCode).append("] ");
		buffer.append("bedTypeDescription=[").append(bedTypeDescription).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((bedId == null) ? 0 : bedId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Bed))
			return false;
		Bed equalCheck = (Bed) obj;
		if ((bedId == null && equalCheck.bedId != null) || (bedId != null && equalCheck.bedId == null))
			return false;
		if (bedId != null && !bedId.equals(equalCheck.bedId))
			return false;
		return true;
	}
}
