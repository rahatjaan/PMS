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
		@NamedQuery(name = "findAllRoomtypes", query = "select myRoomtype from Roomtype myRoomtype"),
		@NamedQuery(name = "findRoomtypeByIsReserved", query = "select myRoomtype from Roomtype myRoomtype where myRoomtype.isReserved = ?1"),
		@NamedQuery(name = "findRoomtypeByIsReservedContaining", query = "select myRoomtype from Roomtype myRoomtype where myRoomtype.isReserved like ?1"),
		@NamedQuery(name = "findRoomtypeByPrimaryKey", query = "select myRoomtype from Roomtype myRoomtype where myRoomtype.roomTypeId = ?1"),
		@NamedQuery(name = "findRoomtypeByRoomDescription", query = "select myRoomtype from Roomtype myRoomtype where myRoomtype.roomDescription = ?1"),
		@NamedQuery(name = "findRoomtypeByRoomDescriptionContaining", query = "select myRoomtype from Roomtype myRoomtype where myRoomtype.roomDescription like ?1"),
		@NamedQuery(name = "findRoomtypeByRoomLocation", query = "select myRoomtype from Roomtype myRoomtype where myRoomtype.roomLocation = ?1"),
		@NamedQuery(name = "findRoomtypeByRoomLocationContaining", query = "select myRoomtype from Roomtype myRoomtype where myRoomtype.roomLocation like ?1"),
		@NamedQuery(name = "findRoomtypeByRoomTypeCode", query = "select myRoomtype from Roomtype myRoomtype where myRoomtype.roomTypeCode = ?1"),
		@NamedQuery(name = "findRoomtypeByRoomTypeCodeContaining", query = "select myRoomtype from Roomtype myRoomtype where myRoomtype.roomTypeCode like ?1"),
		@NamedQuery(name = "findRoomtypeByRoomTypeDescription", query = "select myRoomtype from Roomtype myRoomtype where myRoomtype.roomTypeDescription = ?1"),
		@NamedQuery(name = "findRoomtypeByRoomTypeDescriptionContaining", query = "select myRoomtype from Roomtype myRoomtype where myRoomtype.roomTypeDescription like ?1"),
		@NamedQuery(name = "findRoomtypeByRoomTypeField", query = "select myRoomtype from Roomtype myRoomtype where myRoomtype.roomTypeField = ?1"),
		@NamedQuery(name = "findRoomtypeByRoomTypeFieldContaining", query = "select myRoomtype from Roomtype myRoomtype where myRoomtype.roomTypeField like ?1"),
		@NamedQuery(name = "findRoomtypeByRoomTypeId", query = "select myRoomtype from Roomtype myRoomtype where myRoomtype.roomTypeId = ?1"),
		@NamedQuery(name = "findRoomtypeByRoomTypeIdContaining", query = "select myRoomtype from Roomtype myRoomtype where myRoomtype.roomTypeId like ?1") })
@Table(catalog = "stubpms", name = "roomtype")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "PMS/com/pms/domain", name = "Roomtype")
@XmlRootElement(namespace = "PMS/com/pms/domain")
public class Roomtype implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "room_type_id", length = 10)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	String roomTypeId;
	/**
	 */

	@Column(name = "room_type", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String roomTypeField;
	/**
	 */

	@Column(name = "room_type_code", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String roomTypeCode;
	/**
	 */

	@Column(name = "room_type_description", length = 1000)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String roomTypeDescription;
	/**
	 */

	@Column(name = "room_location", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String roomLocation;
	/**
	 */

	@Column(name = "room_description", length = 1000)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String roomDescription;
	/**
	 */

	@Column(name = "is_reserved", length = 1)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String isReserved;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "room_view", referencedColumnName = "room_view_id") })
	@XmlTransient
	Roomview roomview;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "bed_type", referencedColumnName = "bed_id") })
	@XmlTransient
	Bed bed;
	/**
	 */
	@OneToMany(mappedBy = "roomtype", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.pms.domain.Room> rooms;

	/**
	 */
	public void setRoomTypeId(String roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	/**
	 */
	public String getRoomTypeId() {
		return this.roomTypeId;
	}

	/**
	 */
	public void setRoomTypeField(String roomTypeField) {
		this.roomTypeField = roomTypeField;
	}

	/**
	 */
	public String getRoomTypeField() {
		return this.roomTypeField;
	}

	/**
	 */
	public void setRoomTypeCode(String roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
	}

	/**
	 */
	public String getRoomTypeCode() {
		return this.roomTypeCode;
	}

	/**
	 */
	public void setRoomTypeDescription(String roomTypeDescription) {
		this.roomTypeDescription = roomTypeDescription;
	}

	/**
	 */
	public String getRoomTypeDescription() {
		return this.roomTypeDescription;
	}

	/**
	 */
	public void setRoomLocation(String roomLocation) {
		this.roomLocation = roomLocation;
	}

	/**
	 */
	public String getRoomLocation() {
		return this.roomLocation;
	}

	/**
	 */
	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}

	/**
	 */
	public String getRoomDescription() {
		return this.roomDescription;
	}

	/**
	 */
	public void setIsReserved(String isReserved) {
		this.isReserved = isReserved;
	}

	/**
	 */
	public String getIsReserved() {
		return this.isReserved;
	}

	/**
	 */
	public void setRoomview(Roomview roomview) {
		this.roomview = roomview;
	}

	/**
	 */
	@JsonIgnore
	public Roomview getRoomview() {
		return roomview;
	}

	/**
	 */
	public void setBed(Bed bed) {
		this.bed = bed;
	}

	/**
	 */
	@JsonIgnore
	public Bed getBed() {
		return bed;
	}

	/**
	 */
	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}

	/**
	 */
	@JsonIgnore
	public Set<Room> getRooms() {
		if (rooms == null) {
			rooms = new java.util.LinkedHashSet<com.pms.domain.Room>();
		}
		return rooms;
	}

	/**
	 */
	public Roomtype() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Roomtype that) {
		setRoomTypeId(that.getRoomTypeId());
		setRoomTypeField(that.getRoomTypeField());
		setRoomTypeCode(that.getRoomTypeCode());
		setRoomTypeDescription(that.getRoomTypeDescription());
		setRoomLocation(that.getRoomLocation());
		setRoomDescription(that.getRoomDescription());
		setIsReserved(that.getIsReserved());
		setRoomview(that.getRoomview());
		setBed(that.getBed());
		setRooms(new java.util.LinkedHashSet<com.pms.domain.Room>(that.getRooms()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("roomTypeId=[").append(roomTypeId).append("] ");
		buffer.append("roomTypeField=[").append(roomTypeField).append("] ");
		buffer.append("roomTypeCode=[").append(roomTypeCode).append("] ");
		buffer.append("roomTypeDescription=[").append(roomTypeDescription).append("] ");
		buffer.append("roomLocation=[").append(roomLocation).append("] ");
		buffer.append("roomDescription=[").append(roomDescription).append("] ");
		buffer.append("isReserved=[").append(isReserved).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((roomTypeId == null) ? 0 : roomTypeId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Roomtype))
			return false;
		Roomtype equalCheck = (Roomtype) obj;
		if ((roomTypeId == null && equalCheck.roomTypeId != null) || (roomTypeId != null && equalCheck.roomTypeId == null))
			return false;
		if (roomTypeId != null && !roomTypeId.equals(equalCheck.roomTypeId))
			return false;
		return true;
	}
}
