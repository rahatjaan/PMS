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
public class ResRoom {

	/**
	 */
	Integer roomId;
	/**
	 */
	String roomCategory;
	/**
	 */
	String isSmoking;
	/**
	 */
	String isComposite;
	/**
	 */
	BigDecimal roomRate;
	
	Integer occupancy;

	
	String floorNumber;
	
	
    private String image1;
	
	
    private String image2;
	
	
    private String image3;
	
	
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
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public Integer getOccupancy() {
		return occupancy;
	}

	public void setOccupancy(Integer occupancy) {
		this.occupancy = occupancy;
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
	public BigDecimal getRoomRate() {
		return roomRate;
	}

	public void setRoomRate(BigDecimal roomRate) {
		this.roomRate = roomRate;
	}

	/**
	 */
	/**
	 */
	public ResRoom() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
}
