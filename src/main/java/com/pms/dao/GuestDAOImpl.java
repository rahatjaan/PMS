package com.pms.dao;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
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
 * DAO to manage Guest entities.
 * 
 */
@Repository("GuestDAO")
@Transactional
public class GuestDAOImpl extends AbstractJpaDao<Guest> implements GuestDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Guest.class }));

	/**
	 * EntityManager injected by Spring for persistence unit STUBPMS
	 *
	 */
	@PersistenceContext(unitName = "STUBPMS")
	private EntityManager entityManager;

	/**
	 * Instantiates a new GuestDAOImpl
	 *
	 */
	public GuestDAOImpl() {
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
	 * JPQL Query - findGuestByAddress2
	 *
	 */
	@Transactional
	public Set<Guest> findGuestByAddress2(String address2) throws DataAccessException {

		return findGuestByAddress2(address2, -1, -1);
	}

	/**
	 * JPQL Query - findGuestByAddress2
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Guest> findGuestByAddress2(String address2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestByAddress2", startResult, maxRows, address2);
		return new LinkedHashSet<Guest>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestByPrimaryKey
	 *
	 */
	@Transactional
	public Guest findGuestByPrimaryKey(Integer guestId) throws DataAccessException {

		return findGuestByPrimaryKey(guestId, -1, -1);
	}

	/**
	 * JPQL Query - findGuestByPrimaryKey
	 *
	 */

	@Transactional
	public Guest findGuestByPrimaryKey(Integer guestId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findGuestByPrimaryKey", startResult, maxRows, guestId);
			return (com.pms.domain.Guest) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findGuestByLastName
	 *
	 */
	@Transactional
	public Set<Guest> findGuestByLastName(String lastName) throws DataAccessException {

		return findGuestByLastName(lastName, -1, -1);
	}

	/**
	 * JPQL Query - findGuestByLastName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Guest> findGuestByLastName(String lastName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestByLastName", startResult, maxRows, lastName);
		return new LinkedHashSet<Guest>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestByEmail
	 *
	 */
	@Transactional
	public Set<Guest> findGuestByEmail(String email) throws DataAccessException {

		return findGuestByEmail(email, -1, -1);
	}

	/**
	 * JPQL Query - findGuestByEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Guest> findGuestByEmail(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestByEmail", startResult, maxRows, email);
		return new LinkedHashSet<Guest>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestByCountryContaining
	 *
	 */
	@Transactional
	public Set<Guest> findGuestByCountryContaining(String country) throws DataAccessException {

		return findGuestByCountryContaining(country, -1, -1);
	}

	/**
	 * JPQL Query - findGuestByCountryContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Guest> findGuestByCountryContaining(String country, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestByCountryContaining", startResult, maxRows, country);
		return new LinkedHashSet<Guest>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestByNamePrefixContaining
	 *
	 */
	@Transactional
	public Set<Guest> findGuestByNamePrefixContaining(String namePrefix) throws DataAccessException {

		return findGuestByNamePrefixContaining(namePrefix, -1, -1);
	}

	/**
	 * JPQL Query - findGuestByNamePrefixContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Guest> findGuestByNamePrefixContaining(String namePrefix, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestByNamePrefixContaining", startResult, maxRows, namePrefix);
		return new LinkedHashSet<Guest>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestByGuestId
	 *
	 */
	@Transactional
	public Guest findGuestByGuestId(Integer guestId) throws DataAccessException {

		return findGuestByGuestId(guestId, -1, -1);
	}

	/**
	 * JPQL Query - findGuestByGuestId
	 *
	 */

	@Transactional
	public Guest findGuestByGuestId(Integer guestId, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findGuestByGuestId", startResult, maxRows, guestId);
			return (com.pms.domain.Guest) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllGuests
	 *
	 */
	@Transactional
	public Set<Guest> findAllGuests() throws DataAccessException {

		return findAllGuests(-1, -1);
	}

	/**
	 * JPQL Query - findAllGuests
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Guest> findAllGuests(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllGuests", startResult, maxRows);
		return new LinkedHashSet<Guest>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestByLastNameContaining
	 *
	 */
	@Transactional
	public Set<Guest> findGuestByLastNameContaining(String lastName) throws DataAccessException {

		return findGuestByLastNameContaining(lastName, -1, -1);
	}

	/**
	 * JPQL Query - findGuestByLastNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Guest> findGuestByLastNameContaining(String lastName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestByLastNameContaining", startResult, maxRows, lastName);
		return new LinkedHashSet<Guest>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestByMobileNumberContaining
	 *
	 */
	@Transactional
	public Set<Guest> findGuestByMobileNumberContaining(String mobileNumber) throws DataAccessException {

		return findGuestByMobileNumberContaining(mobileNumber, -1, -1);
	}

	/**
	 * JPQL Query - findGuestByMobileNumberContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Guest> findGuestByMobileNumberContaining(String mobileNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestByMobileNumberContaining", startResult, maxRows, mobileNumber);
		return new LinkedHashSet<Guest>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestByAddress1Containing
	 *
	 */
	@Transactional
	public Set<Guest> findGuestByAddress1Containing(String address1) throws DataAccessException {

		return findGuestByAddress1Containing(address1, -1, -1);
	}

	/**
	 * JPQL Query - findGuestByAddress1Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Guest> findGuestByAddress1Containing(String address1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestByAddress1Containing", startResult, maxRows, address1);
		return new LinkedHashSet<Guest>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestByEmailContaining
	 *
	 */
	@Transactional
	public Set<Guest> findGuestByEmailContaining(String email) throws DataAccessException {

		return findGuestByEmailContaining(email, -1, -1);
	}

	/**
	 * JPQL Query - findGuestByEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Guest> findGuestByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestByEmailContaining", startResult, maxRows, email);
		return new LinkedHashSet<Guest>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestByFirstName
	 *
	 */
	@Transactional
	public Set<Guest> findGuestByFirstName(String firstName) throws DataAccessException {

		return findGuestByFirstName(firstName, -1, -1);
	}

	/**
	 * JPQL Query - findGuestByFirstName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Guest> findGuestByFirstName(String firstName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestByFirstName", startResult, maxRows, firstName);
		return new LinkedHashSet<Guest>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestByAddress1
	 *
	 */
	@Transactional
	public Set<Guest> findGuestByAddress1(String address1) throws DataAccessException {

		return findGuestByAddress1(address1, -1, -1);
	}

	/**
	 * JPQL Query - findGuestByAddress1
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Guest> findGuestByAddress1(String address1, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestByAddress1", startResult, maxRows, address1);
		return new LinkedHashSet<Guest>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestByCountry
	 *
	 */
	@Transactional
	public Set<Guest> findGuestByCountry(String country) throws DataAccessException {

		return findGuestByCountry(country, -1, -1);
	}

	/**
	 * JPQL Query - findGuestByCountry
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Guest> findGuestByCountry(String country, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestByCountry", startResult, maxRows, country);
		return new LinkedHashSet<Guest>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestByMobileNumber
	 *
	 */
	@Transactional
	public Set<Guest> findGuestByMobileNumber(String mobileNumber) throws DataAccessException {

		return findGuestByMobileNumber(mobileNumber, -1, -1);
	}

	/**
	 * JPQL Query - findGuestByMobileNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Guest> findGuestByMobileNumber(String mobileNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestByMobileNumber", startResult, maxRows, mobileNumber);
		return new LinkedHashSet<Guest>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestByFirstNameContaining
	 *
	 */
	@Transactional
	public Set<Guest> findGuestByFirstNameContaining(String firstName) throws DataAccessException {

		return findGuestByFirstNameContaining(firstName, -1, -1);
	}

	/**
	 * JPQL Query - findGuestByFirstNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Guest> findGuestByFirstNameContaining(String firstName, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestByFirstNameContaining", startResult, maxRows, firstName);
		return new LinkedHashSet<Guest>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestByAddress2Containing
	 *
	 */
	@Transactional
	public Set<Guest> findGuestByAddress2Containing(String address2) throws DataAccessException {

		return findGuestByAddress2Containing(address2, -1, -1);
	}

	/**
	 * JPQL Query - findGuestByAddress2Containing
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Guest> findGuestByAddress2Containing(String address2, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestByAddress2Containing", startResult, maxRows, address2);
		return new LinkedHashSet<Guest>(query.getResultList());
	}

	/**
	 * JPQL Query - findGuestByNamePrefix
	 *
	 */
	@Transactional
	public Set<Guest> findGuestByNamePrefix(String namePrefix) throws DataAccessException {

		return findGuestByNamePrefix(namePrefix, -1, -1);
	}

	/**
	 * JPQL Query - findGuestByNamePrefix
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Guest> findGuestByNamePrefix(String namePrefix, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGuestByNamePrefix", startResult, maxRows, namePrefix);
		return new LinkedHashSet<Guest>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Guest entity) {
		return true;
	}

	@Override
	public Object findGuestInfoByLastNameCreditCard(String lastName, String cc) {
		try{
			Query query = createNamedQuery("findGuestByLastName", -1, -1, lastName);
			if(null == query.getResultList()){
				return "ERROR";
			}
			List<Guest> li = query.getResultList();
			for(Guest gi: li){
				Collection c = gi.getReservations();
	    		Iterator iter = c.iterator();
	    		while(iter.hasNext()){
		    		Reservation first = (Reservation) iter.next();
		    		try{
		    		int length = first.getCardNumber().length();
		    		System.out.println(first.getCardNumber().substring(length-4));
		    		if(5 < length){
		    			System.out.println("CREDITCARD AND CARD: "+first.getCardNumber().substring(length-4)+","+cc);
						if(first.getCardNumber().substring(length-4).equalsIgnoreCase(cc)){
							System.out.println("CREDITCARD AND CARD MATCHED: "+first.getCardNumber()+","+cc);
							return first;
						}
		    		}
		    		}catch(Exception ex){
		    			
		    		}
	    		}
			}
			return "ERROR";
		}catch(NullPointerException e){
			return "ERROR";
		}catch(Exception e){
			return "ERROR";
		}
	}

	@Override
	public Object findGuestInfoByLastNameRoom(String lastName,
			Integer roomNumber) {
		int room = roomNumber;
		try{
			Query query = createNamedQuery("findGuestByLastName", -1, -1, lastName);
			if(null == query.getResultList()){
				return "ERROR";
			}
			List<Guest> li = query.getResultList();
			for(Guest gi: li){
				Collection c = gi.getReservations();
	    		Iterator iter = c.iterator();
	    		while(iter.hasNext()){
		    		Reservation first = (Reservation) iter.next();
						if(first.getRoom().getRoomId() == room){
							return first;
						}
	    		}
			}
			return "ERROR";
		}catch(NullPointerException e){
			return "ERROR";
		}catch(Exception e){
			return "ERROR";
		}
	}

	@Override
	public Object findGuestInfoByLoyaltyNumber(String loyaltyNumber) {
		try{
			Query query = createNamedQuery("findGuestInfoByHhNumber", -1, -1, loyaltyNumber);
			if(null != query.getSingleResult()){
				return (Guest) (query.getSingleResult());				
			}else{
				return "ERROR";
			}
		}catch(NullPointerException e){
			return "ERROR";
		}catch(Exception e){
			return "ERROR";
		}
	}
}
