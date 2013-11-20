package com.pms.dao;

import com.pms.domain.Reservation;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Reservation entities.
 * 
 */
public interface ReservationDAO extends JpaDao<Reservation> {

	/**
	 * JPQL Query - findReservationByReservationIdContaining
	 *
	 */
	public Set<Reservation> findReservationByReservationIdContaining(String reservationId) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByReservationIdContaining
	 *
	 */
	public Set<Reservation> findReservationByReservationIdContaining(String reservationId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCurrencyCode
	 *
	 */
	public Set<Reservation> findReservationByCurrencyCode(String currencyCode) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCurrencyCode
	 *
	 */
	public Set<Reservation> findReservationByCurrencyCode(String currencyCode, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByNumberOfAdults
	 *
	 */
	public Set<Reservation> findReservationByNumberOfAdults(Integer numberOfAdults) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByNumberOfAdults
	 *
	 */
	public Set<Reservation> findReservationByNumberOfAdults(Integer numberOfAdults, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCvvNumber
	 *
	 */
	public Set<Reservation> findReservationByCvvNumber(String cvvNumber) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCvvNumber
	 *
	 */
	public Set<Reservation> findReservationByCvvNumber(String cvvNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCardTypeContaining
	 *
	 */
	public Set<Reservation> findReservationByCardTypeContaining(String cardType) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCardTypeContaining
	 *
	 */
	public Set<Reservation> findReservationByCardTypeContaining(String cardType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCvvNumberContaining
	 *
	 */
	public Set<Reservation> findReservationByCvvNumberContaining(String cvvNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCvvNumberContaining
	 *
	 */
	public Set<Reservation> findReservationByCvvNumberContaining(String cvvNumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByIsCheckedOutContaining
	 *
	 */
	public Set<Reservation> findReservationByIsCheckedOutContaining(String isCheckedOut) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByIsCheckedOutContaining
	 *
	 */
	public Set<Reservation> findReservationByIsCheckedOutContaining(String isCheckedOut, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByReservationId
	 *
	 */
	public Reservation findReservationByReservationId(String reservationId_1) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByReservationId
	 *
	 */
	public Reservation findReservationByReservationId(String reservationId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllReservations
	 *
	 */
	public Set<Reservation> findAllReservations() throws DataAccessException;

	/**
	 * JPQL Query - findAllReservations
	 *
	 */
	public Set<Reservation> findAllReservations(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByDepartureDate
	 *
	 */
	public Set<Reservation> findReservationByDepartureDate(java.util.Calendar departureDate) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByDepartureDate
	 *
	 */
	public Set<Reservation> findReservationByDepartureDate(Calendar departureDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByNumberOfDays
	 *
	 */
	public Set<Reservation> findReservationByNumberOfDays(Integer numberOfDays) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByNumberOfDays
	 *
	 */
	public Set<Reservation> findReservationByNumberOfDays(Integer numberOfDays, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCardExpiryDateAfter
	 *
	 */
	public Set<Reservation> findReservationByCardExpiryDateAfter(java.util.Calendar cardExpiryDate) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCardExpiryDateAfter
	 *
	 */
	public Set<Reservation> findReservationByCardExpiryDateAfter(Calendar cardExpiryDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByPrimaryKey
	 *
	 */
	public Reservation findReservationByPrimaryKey(String reservationId_2) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByPrimaryKey
	 *
	 */
	public Reservation findReservationByPrimaryKey(String reservationId_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByNumberOfChildren
	 *
	 */
	public Set<Reservation> findReservationByNumberOfChildren(Integer numberOfChildren) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByNumberOfChildren
	 *
	 */
	public Set<Reservation> findReservationByNumberOfChildren(Integer numberOfChildren, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCardNumber
	 *
	 */
	public Set<Reservation> findReservationByCardNumber(String cardNumber) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCardNumber
	 *
	 */
	public Set<Reservation> findReservationByCardNumber(String cardNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCurrencyCodeContaining
	 *
	 */
	public Set<Reservation> findReservationByCurrencyCodeContaining(String currencyCode_1) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCurrencyCodeContaining
	 *
	 */
	public Set<Reservation> findReservationByCurrencyCodeContaining(String currencyCode_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCardExpiryDate
	 *
	 */
	public Set<Reservation> findReservationByCardExpiryDate(java.util.Calendar cardExpiryDate_1) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCardExpiryDate
	 *
	 */
	public Set<Reservation> findReservationByCardExpiryDate(Calendar cardExpiryDate_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByIsCheckedOut
	 *
	 */
	public Set<Reservation> findReservationByIsCheckedOut(String isCheckedOut_1) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByIsCheckedOut
	 *
	 */
	public Set<Reservation> findReservationByIsCheckedOut(String isCheckedOut_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCardExpiryDateBefore
	 *
	 */
	public Set<Reservation> findReservationByCardExpiryDateBefore(java.util.Calendar cardExpiryDate_2) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCardExpiryDateBefore
	 *
	 */
	public Set<Reservation> findReservationByCardExpiryDateBefore(Calendar cardExpiryDate_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCardNumberContaining
	 *
	 */
	public Set<Reservation> findReservationByCardNumberContaining(String cardNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCardNumberContaining
	 *
	 */
	public Set<Reservation> findReservationByCardNumberContaining(String cardNumber_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByArrivalDate
	 *
	 */
	public Set<Reservation> findReservationByArrivalDate(java.util.Calendar arrivalDate) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByArrivalDate
	 *
	 */
	public Set<Reservation> findReservationByArrivalDate(Calendar arrivalDate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByFolioNumberContaining
	 *
	 */
	public Set<Reservation> findReservationByFolioNumberContaining(String folioNumber) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByFolioNumberContaining
	 *
	 */
	public Set<Reservation> findReservationByFolioNumberContaining(String folioNumber, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCardType
	 *
	 */
	public Set<Reservation> findReservationByCardType(String cardType_1) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByCardType
	 *
	 */
	public Set<Reservation> findReservationByCardType(String cardType_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByFolioNumber
	 *
	 */
	public Set<Reservation> findReservationByFolioNumber(String folioNumber_1) throws DataAccessException;

	/**
	 * JPQL Query - findReservationByFolioNumber
	 *
	 */
	public Set<Reservation> findReservationByFolioNumber(String folioNumber_1, int startResult, int maxRows) throws DataAccessException;

}