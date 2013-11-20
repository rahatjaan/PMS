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
		@NamedQuery(name = "findAllRooms", query = "select myRoom from Room myRoom"),
		@NamedQuery(name = "findRoomByFloorNumber", query = "select myRoom from Room myRoom where myRoom.floorNumber = ?1"),
		@NamedQuery(name = "findRoomByFloorNumberContaining", query = "select myRoom from Room myRoom where myRoom.floorNumber like ?1"),
		@NamedQuery(name = "findRoomByIsComposite", query = "select myRoom from Room myRoom where myRoom.isComposite = ?1"),
		@NamedQuery(name = "findRoomByIsCompositeContaining", query = "select myRoom from Room myRoom where myRoom.isComposite like ?1"),
		@NamedQuery(name = "findRoomByIsSmoking", query = "select myRoom from Room myRoom where myRoom.isSmoking = ?1"),
		@NamedQuery(name = "findRoomByIsSmokingContaining", query = "select myRoom from Room myRoom where myRoom.isSmoking like ?1"),
		@NamedQuery(name = "findRoomByPrimaryKey", query = "select myRoom from Room myRoom where myRoom.roomId = ?1"),
		@NamedQuery(name = "findRoomByRoomCategory", query = "select myRoom from Room myRoom where myRoom.roomCategory = ?1"),
		@NamedQuery(name = "findRoomByRoomCategoryContaining", query = "select myRoom from Room myRoom where myRoom.roomCategory like ?1"),
		@NamedQuery(name = "findRoomByRoomId", query = "select myRoom from Room myRoom where myRoom.roomId = ?1"),
		@NamedQuery(name = "findRoomByRoomIdContaining", query = "select myRoom from Room myRoom where myRoom.roomId like ?1") })
@Table(catalog = "stubpms", name = "room")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "PMS/com/pms/domain", name = "Room")
@XmlRootElement(namespace = "PMS/com/pms/domain")
public class Room implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "room_id", length = 10, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	String roomId;
	/**
	 */

	@Column(name = "room_category", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String roomCategory;
	/**
	 */

	@Column(name = "is_smoking", length = 1)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String isSmoking;
	/**
	 */

	@Column(name = "is_composite", length = 1)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String isComposite;
	/**
	 */

	@Column(name = "floor_number", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String floorNumber;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "room_type", referencedColumnName = "room_type_id") })
	@XmlTransient
	Roomtype roomtype;
	/**
	 */
	@OneToMany(mappedBy = "room", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.pms.domain.Reservation> reservations;

	/**
	 */
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	/**
	 */
	public String getRoomId() {
		return this.roomId;
	}

	/**
	 */
	public void setRoomCategory(String roomCategory) {
		this.roomCategory = roomCategory;
	}

	/**
	 */
	public String getRoomCategory() {
		return this.roomCategory;
	}

	/**
	 */
	public void setIsSmoking(String isSmoking) {
		this.isSmoking = isSmoking;
	}

	/**
	 */
	public String getIsSmoking() {
		return this.isSmoking;
	}

	/**
	 */
	public void setIsComposite(String isComposite) {
		this.isComposite = isComposite;
	}

	/**
	 */
	public String getIsComposite() {
		return this.isComposite;
	}

	/**
	 */
	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
	}

	/**
	 */
	public String getFloorNumber() {
		return this.floorNumber;
	}

	/**
	 */
	public void setRoomtype(Roomtype roomtype) {
		this.roomtype = roomtype;
	}

	/**
	 */
	@JsonIgnore
	public Roomtype getRoomtype() {
		return roomtype;
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
	public Room() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Room that) {
		setRoomId(that.getRoomId());
		setRoomCategory(that.getRoomCategory());
		setIsSmoking(that.getIsSmoking());
		setIsComposite(that.getIsComposite());
		setFloorNumber(that.getFloorNumber());
		setRoomtype(that.getRoomtype());
		setReservations(new java.util.LinkedHashSet<com.pms.domain.Reservation>(that.getReservations()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("roomId=[").append(roomId).append("] ");
		buffer.append("roomCategory=[").append(roomCategory).append("] ");
		buffer.append("isSmoking=[").append(isSmoking).append("] ");
		buffer.append("isComposite=[").append(isComposite).append("] ");
		buffer.append("floorNumber=[").append(floorNumber).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((roomId == null) ? 0 : roomId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Room))
			return false;
		Room equalCheck = (Room) obj;
		if ((roomId == null && equalCheck.roomId != null) || (roomId != null && equalCheck.roomId == null))
			return false;
		if (roomId != null && !roomId.equals(equalCheck.roomId))
			return false;
		return true;
	}
}
