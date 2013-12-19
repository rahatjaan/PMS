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
		@NamedQuery(name = "findAllRoomviews", query = "select myRoomview from Roomview myRoomview"),
		@NamedQuery(name = "findRoomviewByPrimaryKey", query = "select myRoomview from Roomview myRoomview where myRoomview.roomViewId = ?1"),
		@NamedQuery(name = "findRoomviewByRoomViewCode", query = "select myRoomview from Roomview myRoomview where myRoomview.roomViewCode = ?1"),
		@NamedQuery(name = "findRoomviewByRoomViewCodeContaining", query = "select myRoomview from Roomview myRoomview where myRoomview.roomViewCode like ?1"),
		@NamedQuery(name = "findRoomviewByRoomViewDescription", query = "select myRoomview from Roomview myRoomview where myRoomview.roomViewDescription = ?1"),
		@NamedQuery(name = "findRoomviewByRoomViewDescriptionContaining", query = "select myRoomview from Roomview myRoomview where myRoomview.roomViewDescription like ?1"),
		@NamedQuery(name = "findRoomviewByRoomViewId", query = "select myRoomview from Roomview myRoomview where myRoomview.roomViewId = ?1") })
@Table(catalog = "stubpms", name = "roomview")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "PMS/com/pms/domain", name = "Roomview")
@XmlRootElement(namespace = "PMS/com/pms/domain")
public class Roomview implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "room_view_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@XmlElement
	Integer roomViewId;
	/**
	 */

	@Column(name = "room_view_code", length = 20)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String roomViewCode;
	/**
	 */

	@Column(name = "room_view_description", length = 1000)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String roomViewDescription;

	/**
	 */
	@OneToMany(mappedBy = "roomview", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.pms.domain.Roomtype> roomtypes;

	/**
	 */
	public void setRoomViewId(Integer roomViewId) {
		this.roomViewId = roomViewId;
	}

	/**
	 */
	public Integer getRoomViewId() {
		return this.roomViewId;
	}

	/**
	 */
	public void setRoomViewCode(String roomViewCode) {
		this.roomViewCode = roomViewCode;
	}

	/**
	 */
	public String getRoomViewCode() {
		return this.roomViewCode;
	}

	/**
	 */
	public void setRoomViewDescription(String roomViewDescription) {
		this.roomViewDescription = roomViewDescription;
	}

	/**
	 */
	public String getRoomViewDescription() {
		return this.roomViewDescription;
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
	public Roomview() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Roomview that) {
		setRoomViewId(that.getRoomViewId());
		setRoomViewCode(that.getRoomViewCode());
		setRoomViewDescription(that.getRoomViewDescription());
		setRoomtypes(new java.util.LinkedHashSet<com.pms.domain.Roomtype>(that.getRoomtypes()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("roomViewId=[").append(roomViewId).append("] ");
		buffer.append("roomViewCode=[").append(roomViewCode).append("] ");
		buffer.append("roomViewDescription=[").append(roomViewDescription).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((roomViewId == null) ? 0 : roomViewId.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Roomview))
			return false;
		Roomview equalCheck = (Roomview) obj;
		if ((roomViewId == null && equalCheck.roomViewId != null) || (roomViewId != null && equalCheck.roomViewId == null))
			return false;
		if (roomViewId != null && !roomViewId.equals(equalCheck.roomViewId))
			return false;
		return true;
	}
}
