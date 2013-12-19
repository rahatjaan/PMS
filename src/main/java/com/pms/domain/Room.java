package com.pms.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

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
		@NamedQuery(name = "findRoomByRoomId", query = "select myRoom from Room myRoom where myRoom.roomId = ?1") })
@Table(catalog = "stubpms", name = "room")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "PMS/com/pms/domain", name = "Room")
@XmlRootElement(namespace = "PMS/com/pms/domain")
public class Room implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "room_id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@XmlElement
	Integer roomId;
	/**
	 */

	@Column(name = "room_category", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String roomCategory;
	/**
	 */
	
	@Column(name = "room_occupancy")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer occupancy;
	
	
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
	
	@Column(name = "room_rate", scale = 2, precision = 5)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal roomRate;

	@Column(name = "floor_number", length = 50)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String floorNumber;
	
	@Column(name="image1")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
    @Lob
    private String image1;
	
	@Column(name="image2")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
    @Lob
    private String image2;
	
	@Column(name="image3")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
    @Lob
    private String image3;
	
	@Column(name="image4")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
    @Lob
    private String image4;/*
	
	private List<MultipartFile> files;

	public List<MultipartFile> getFiles() {
		return files;
	}

	public void setFiles(List<MultipartFile> files) {
		this.files = files;
	}
*/
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
	
	transient String error;
	
	public Integer getOccupancy() {
		return occupancy;
	}

	public void setOccupancy(Integer occupancy) {
		this.occupancy = occupancy;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	/**
	 */
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	/**
	 */
	public Integer getRoomId() {
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
	
	

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

	public String getImage4() {
		return image4;
	}

	public void setImage4(String image4) {
		this.image4 = image4;
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

	public BigDecimal getRoomRate() {
		return roomRate;
	}

	public void setRoomRate(BigDecimal roomRate) {
		this.roomRate = roomRate;
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
