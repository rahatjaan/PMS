package com.pms.dao;

import com.pms.domain.Guest;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Guest entities.
 * 
 */
public interface GuestDAO extends JpaDao<Guest> {

	/**
	 * JPQL Query - findGuestByMobileNumber
	 *
	 */
	public Set<Guest> findGuestByMobileNumber(String mobileNumber) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByMobileNumber
	 *
	 */
	public Set<Guest> findGuestByMobileNumber(String mobileNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByCountry
	 *
	 */
	public Set<Guest> findGuestByCountry(String country) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByCountry
	 *
	 */
	public Set<Guest> findGuestByCountry(String country, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByAddress2
	 *
	 */
	public Set<Guest> findGuestByAddress2(String address2) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByAddress2
	 *
	 */
	public Set<Guest> findGuestByAddress2(String address2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByAddress1Containing
	 *
	 */
	public Set<Guest> findGuestByAddress1Containing(String address1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByAddress1Containing
	 *
	 */
	public Set<Guest> findGuestByAddress1Containing(String address1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByAddress1
	 *
	 */
	public Set<Guest> findGuestByAddress1(String address1_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByAddress1
	 *
	 */
	public Set<Guest> findGuestByAddress1(String address1_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByNamePrefixContaining
	 *
	 */
	public Set<Guest> findGuestByNamePrefixContaining(String namePrefix) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByNamePrefixContaining
	 *
	 */
	public Set<Guest> findGuestByNamePrefixContaining(String namePrefix, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByGuestId
	 *
	 */
	public Guest findGuestByGuestId(String guestId) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByGuestId
	 *
	 */
	public Guest findGuestByGuestId(String guestId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByEmail
	 *
	 */
	public Set<Guest> findGuestByEmail(String email) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByEmail
	 *
	 */
	public Set<Guest> findGuestByEmail(String email, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByCountryContaining
	 *
	 */
	public Set<Guest> findGuestByCountryContaining(String country_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByCountryContaining
	 *
	 */
	public Set<Guest> findGuestByCountryContaining(String country_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByFirstNameContaining
	 *
	 */
	public Set<Guest> findGuestByFirstNameContaining(String firstName) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByFirstNameContaining
	 *
	 */
	public Set<Guest> findGuestByFirstNameContaining(String firstName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByAddress2Containing
	 *
	 */
	public Set<Guest> findGuestByAddress2Containing(String address2_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByAddress2Containing
	 *
	 */
	public Set<Guest> findGuestByAddress2Containing(String address2_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByMobileNumberContaining
	 *
	 */
	public Set<Guest> findGuestByMobileNumberContaining(String mobileNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByMobileNumberContaining
	 *
	 */
	public Set<Guest> findGuestByMobileNumberContaining(String mobileNumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByPrimaryKey
	 *
	 */
	public Guest findGuestByPrimaryKey(String guestId_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByPrimaryKey
	 *
	 */
	public Guest findGuestByPrimaryKey(String guestId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByGuestIdContaining
	 *
	 */
	public Set<Guest> findGuestByGuestIdContaining(String guestId_2) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByGuestIdContaining
	 *
	 */
	public Set<Guest> findGuestByGuestIdContaining(String guestId_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByLastNameContaining
	 *
	 */
	public Set<Guest> findGuestByLastNameContaining(String lastName) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByLastNameContaining
	 *
	 */
	public Set<Guest> findGuestByLastNameContaining(String lastName, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByNamePrefix
	 *
	 */
	public Set<Guest> findGuestByNamePrefix(String namePrefix_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByNamePrefix
	 *
	 */
	public Set<Guest> findGuestByNamePrefix(String namePrefix_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByEmailContaining
	 *
	 */
	public Set<Guest> findGuestByEmailContaining(String email_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByEmailContaining
	 *
	 */
	public Set<Guest> findGuestByEmailContaining(String email_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllGuests
	 *
	 */
	public Set<Guest> findAllGuests() throws DataAccessException;

	/**
	 * JPQL Query - findAllGuests
	 *
	 */
	public Set<Guest> findAllGuests(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByFirstName
	 *
	 */
	public Set<Guest> findGuestByFirstName(String firstName_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByFirstName
	 *
	 */
	public Set<Guest> findGuestByFirstName(String firstName_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByLastName
	 *
	 */
	public Set<Guest> findGuestByLastName(String lastName_1) throws DataAccessException;

	/**
	 * JPQL Query - findGuestByLastName
	 *
	 */
	public Set<Guest> findGuestByLastName(String lastName_1, int startResult, int maxRows) throws DataAccessException;

}