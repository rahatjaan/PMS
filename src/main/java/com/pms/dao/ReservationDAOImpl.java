package com.pms.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pms.domain.Guest;
import com.pms.domain.Reservation;

/**
 * DAO to manage Reservation entities.
 * 
 */
@Repository("ReservationDAO")
@Transactional
public class ReservationDAOImpl extends AbstractJpaDao<Reservation> implements
		ReservationDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Reservation.class }));

	/**
	 * EntityManager injected by Spring for persistence unit STUBPMS
	 *
	 */
	@PersistenceContext(unitName = "STUBPMS")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ReservationDAOImpl
	 *
	 */
	public ReservationDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findReservationByCardType
	 *
	 */
	@Transactional
	public Set<Reservation> findReservationByCardType(String cardType) throws DataAccessException {

		return findReservationByCardType(cardType, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByCardType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findReservationByCardType(String cardType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReservationByCardType", startResult, maxRows, cardType);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * JPQL Query - findReservationByCardNumber
	 *
	 */
	@Transactional
	public Set<Reservation> findReservationByCardNumber(String cardNumber) throws DataAccessException {

		return findReservationByCardNumber(cardNumber, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByCardNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findReservationByCardNumber(String cardNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReservationByCardNumber", startResult, maxRows, cardNumber);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * JPQL Query - findReservationByReservationId
	 *
	 */
	@Transactional
	public Reservation findReservationByReservationId(Integer reservationId) throws DataAccessException {

		return findReservationByReservationId(reservationId, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByReservationId
	 *
	 */

	@Transactional
	public Reservation findReservationByReservationId(Integer reservationId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findReservationByReservationId", startResult, maxRows, reservationId);
			return (com.pms.domain.Reservation) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findReservationByIsCheckedOut
	 *
	 */
	@Transactional
	public Set<Reservation> findReservationByIsCheckedOut(String isCheckedOut) throws DataAccessException {

		return findReservationByIsCheckedOut(isCheckedOut, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByIsCheckedOut
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findReservationByIsCheckedOut(String isCheckedOut, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReservationByIsCheckedOut", startResult, maxRows, isCheckedOut);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * JPQL Query - findReservationByNumberOfAdults
	 *
	 */
	@Transactional
	public Set<Reservation> findReservationByNumberOfAdults(Integer numberOfAdults) throws DataAccessException {

		return findReservationByNumberOfAdults(numberOfAdults, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByNumberOfAdults
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findReservationByNumberOfAdults(Integer numberOfAdults, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReservationByNumberOfAdults", startResult, maxRows, numberOfAdults);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * JPQL Query - findReservationByPrimaryKey
	 *
	 */
	@Transactional
	public Reservation findReservationByPrimaryKey(Integer reservationId) throws DataAccessException {

		return findReservationByPrimaryKey(reservationId, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByPrimaryKey
	 *
	 */

	@Transactional
	public Reservation findReservationByPrimaryKey(Integer reservationId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findReservationByPrimaryKey", startResult, maxRows, reservationId);
			return (com.pms.domain.Reservation) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllReservations
	 *
	 */
	@Transactional
	public Set<Reservation> findAllReservations() throws DataAccessException {

		return findAllReservations(-1, -1);
	}

	/**
	 * JPQL Query - findAllReservations
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findAllReservations(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllReservations", startResult, maxRows);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * JPQL Query - findReservationByCardExpiryDateAfter
	 *
	 */
	@Transactional
	public Set<Reservation> findReservationByCardExpiryDateAfter(java.util.Calendar cardExpiryDate) throws DataAccessException {

		return findReservationByCardExpiryDateAfter(cardExpiryDate, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByCardExpiryDateAfter
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findReservationByCardExpiryDateAfter(java.util.Calendar cardExpiryDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReservationByCardExpiryDateAfter", startResult, maxRows, cardExpiryDate);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * JPQL Query - findReservationByCvvNumberContaining
	 *
	 */
	@Transactional
	public Set<Reservation> findReservationByCvvNumberContaining(String cvvNumber) throws DataAccessException {

		return findReservationByCvvNumberContaining(cvvNumber, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByCvvNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findReservationByCvvNumberContaining(String cvvNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReservationByCvvNumberContaining", startResult, maxRows, cvvNumber);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * JPQL Query - findReservationByCurrencyCodeContaining
	 *
	 */
	@Transactional
	public Set<Reservation> findReservationByCurrencyCodeContaining(String currencyCode) throws DataAccessException {

		return findReservationByCurrencyCodeContaining(currencyCode, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByCurrencyCodeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findReservationByCurrencyCodeContaining(String currencyCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReservationByCurrencyCodeContaining", startResult, maxRows, currencyCode);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * JPQL Query - findReservationByCardExpiryDate
	 *
	 */
	@Transactional
	public Set<Reservation> findReservationByCardExpiryDate(java.util.Calendar cardExpiryDate) throws DataAccessException {

		return findReservationByCardExpiryDate(cardExpiryDate, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByCardExpiryDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findReservationByCardExpiryDate(java.util.Calendar cardExpiryDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReservationByCardExpiryDate", startResult, maxRows, cardExpiryDate);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * JPQL Query - findReservationByCvvNumber
	 *
	 */
	@Transactional
	public Set<Reservation> findReservationByCvvNumber(String cvvNumber) throws DataAccessException {

		return findReservationByCvvNumber(cvvNumber, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByCvvNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findReservationByCvvNumber(String cvvNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReservationByCvvNumber", startResult, maxRows, cvvNumber);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * JPQL Query - findReservationByCardTypeContaining
	 *
	 */
	@Transactional
	public Set<Reservation> findReservationByCardTypeContaining(String cardType) throws DataAccessException {

		return findReservationByCardTypeContaining(cardType, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByCardTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findReservationByCardTypeContaining(String cardType, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReservationByCardTypeContaining", startResult, maxRows, cardType);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * JPQL Query - findReservationByFolioNumberContaining
	 *
	 */
	@Transactional
	public Set<Reservation> findReservationByFolioNumberContaining(String folioNumber) throws DataAccessException {

		return findReservationByFolioNumberContaining(folioNumber, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByFolioNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findReservationByFolioNumberContaining(String folioNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReservationByFolioNumberContaining", startResult, maxRows, folioNumber);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * JPQL Query - findReservationByFolioNumber
	 *
	 */
	@Transactional
	public Set<Reservation> findReservationByFolioNumber(String folioNumber) throws DataAccessException {

		return findReservationByFolioNumber(folioNumber, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByFolioNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findReservationByFolioNumber(String folioNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReservationByFolioNumber", startResult, maxRows, folioNumber);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * JPQL Query - findReservationByIsCheckedOutContaining
	 *
	 */
	@Transactional
	public Set<Reservation> findReservationByIsCheckedOutContaining(String isCheckedOut) throws DataAccessException {

		return findReservationByIsCheckedOutContaining(isCheckedOut, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByIsCheckedOutContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findReservationByIsCheckedOutContaining(String isCheckedOut, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReservationByIsCheckedOutContaining", startResult, maxRows, isCheckedOut);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * JPQL Query - findReservationByCardExpiryDateBefore
	 *
	 */
	@Transactional
	public Set<Reservation> findReservationByCardExpiryDateBefore(java.util.Calendar cardExpiryDate) throws DataAccessException {

		return findReservationByCardExpiryDateBefore(cardExpiryDate, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByCardExpiryDateBefore
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findReservationByCardExpiryDateBefore(java.util.Calendar cardExpiryDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReservationByCardExpiryDateBefore", startResult, maxRows, cardExpiryDate);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * JPQL Query - findReservationByCardNumberContaining
	 *
	 */
	@Transactional
	public Set<Reservation> findReservationByCardNumberContaining(String cardNumber) throws DataAccessException {

		return findReservationByCardNumberContaining(cardNumber, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByCardNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findReservationByCardNumberContaining(String cardNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReservationByCardNumberContaining", startResult, maxRows, cardNumber);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * JPQL Query - findReservationByCurrencyCode
	 *
	 */
	@Transactional
	public Set<Reservation> findReservationByCurrencyCode(String currencyCode) throws DataAccessException {

		return findReservationByCurrencyCode(currencyCode, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByCurrencyCode
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findReservationByCurrencyCode(String currencyCode, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReservationByCurrencyCode", startResult, maxRows, currencyCode);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * JPQL Query - findReservationByDepartureDate
	 *
	 */
	@Transactional
	public Set<Reservation> findReservationByDepartureDate(java.util.Calendar departureDate) throws DataAccessException {

		return findReservationByDepartureDate(departureDate, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByDepartureDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findReservationByDepartureDate(java.util.Calendar departureDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReservationByDepartureDate", startResult, maxRows, departureDate);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * JPQL Query - findReservationByNumberOfDays
	 *
	 */
	@Transactional
	public Set<Reservation> findReservationByNumberOfDays(Integer numberOfDays) throws DataAccessException {

		return findReservationByNumberOfDays(numberOfDays, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByNumberOfDays
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findReservationByNumberOfDays(Integer numberOfDays, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReservationByNumberOfDays", startResult, maxRows, numberOfDays);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * JPQL Query - findReservationByArrivalDate
	 *
	 */
	@Transactional
	public Set<Reservation> findReservationByArrivalDate(java.util.Calendar arrivalDate) throws DataAccessException {

		return findReservationByArrivalDate(arrivalDate, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByArrivalDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findReservationByArrivalDate(java.util.Calendar arrivalDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReservationByArrivalDate", startResult, maxRows, arrivalDate);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * JPQL Query - findReservationByNumberOfChildren
	 *
	 */
	@Transactional
	public Set<Reservation> findReservationByNumberOfChildren(Integer numberOfChildren) throws DataAccessException {

		return findReservationByNumberOfChildren(numberOfChildren, -1, -1);
	}

	/**
	 * JPQL Query - findReservationByNumberOfChildren
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Reservation> findReservationByNumberOfChildren(Integer numberOfChildren, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findReservationByNumberOfChildren", startResult, maxRows, numberOfChildren);
		return new LinkedHashSet<Reservation>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Reservation entity) {
		return true;
	}

	@Override
	public Guest findGuestBillInfo(String email, String lastName,
			String roomNumber) {
		Query query = null;
		System.out.println("NAME: "+lastName+"ROOM: "+roomNumber+"EMAIL: "+email);
		try{
			query = createNamedQuery("findGuestBillInfoOrderByTransactionDate", -1, -1, lastName, Integer.parseInt(roomNumber));
			List<Guest> ob = query.getResultList();
			int i = 0;
			System.out.println("LIST SIZE BILL INFO IS: "+ob.size());
			while(ob.size() > i){
				Guest o = ob.get(i);
				Set<Reservation> se = o.getReservations();
				System.out.println("GUEST INFO LIST SIZE BILL INFO IS: "+se.size());
				for (Reservation s : se) {
					System.out.println("Lastname: "+o.getLastName()+"   Email: "+o.getEmail()+"   Room: "+s.getRoom().getRoomId());
					System.out.println("NAME: "+lastName+"ROOM: "+roomNumber+"EMAIL: "+email);
				    if((email==null || email.isEmpty() || o.getEmail().equalsIgnoreCase(email)) ){
				    	Set<Reservation> sss = new HashSet<Reservation>();
				    	sss.add(s);
				    	o.setReservations(sss);
				    	return o;
				    }
				}		
				i++;
			}
			return null;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
