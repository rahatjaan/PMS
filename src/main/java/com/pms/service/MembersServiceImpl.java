package com.pms.service;

import com.pms.dao.GuestDAO;
import com.pms.dao.MembersDAO;

import com.pms.domain.Guest;
import com.pms.domain.Members;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Members entities
 * 
 */

@Service("MembersService")
@Transactional
public class MembersServiceImpl implements MembersService {

	/**
	 * DAO injected by Spring that manages Guest entities
	 * 
	 */
	@Autowired
	private GuestDAO guestDAO;

	/**
	 * DAO injected by Spring that manages Members entities
	 * 
	 */
	@Autowired
	private MembersDAO membersDAO;

	/**
	 * Instantiates a new MembersServiceImpl.
	 *
	 */
	public MembersServiceImpl() {
	}

	/**
	 * Save an existing Guest entity
	 * 
	 */
	@Transactional
	public Members saveMembersGuests(String memberId, Guest related_guests) {
		Members members = membersDAO.findMembersByPrimaryKey(memberId, -1, -1);
		Guest existingguests = guestDAO.findGuestByPrimaryKey(related_guests.getGuestId());

		// copy into the existing record to preserve existing relationships
		if (existingguests != null) {
			existingguests.setGuestId(related_guests.getGuestId());
			existingguests.setNamePrefix(related_guests.getNamePrefix());
			existingguests.setFirstName(related_guests.getFirstName());
			existingguests.setLastName(related_guests.getLastName());
			existingguests.setAddress1(related_guests.getAddress1());
			existingguests.setAddress2(related_guests.getAddress2());
			existingguests.setEmail(related_guests.getEmail());
			existingguests.setCountry(related_guests.getCountry());
			existingguests.setMobileNumber(related_guests.getMobileNumber());
			related_guests = existingguests;
		} else {
			related_guests = guestDAO.store(related_guests);
			guestDAO.flush();
		}

		related_guests.setMembers(members);
		members.getGuests().add(related_guests);
		related_guests = guestDAO.store(related_guests);
		guestDAO.flush();

		members = membersDAO.store(members);
		membersDAO.flush();

		return members;
	}

	/**
	 * Return all Members entity
	 * 
	 */
	@Transactional
	public List<Members> findAllMemberss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Members>(membersDAO.findAllMemberss(startResult, maxRows));
	}

	/**
	 * Load an existing Members entity
	 * 
	 */
	@Transactional
	public Set<Members> loadMemberss() {
		return membersDAO.findAllMemberss();
	}

	/**
	 */
	@Transactional
	public Members findMembersByPrimaryKey(String memberId) {
		return membersDAO.findMembersByPrimaryKey(memberId);
	}

	/**
	 * Save an existing Members entity
	 * 
	 */
	@Transactional
	public void saveMembers(Members members) {
		Members existingMembers = membersDAO.findMembersByPrimaryKey(members.getMemberId());

		if (existingMembers != null) {
			if (existingMembers != members) {
				existingMembers.setMemberId(members.getMemberId());
				existingMembers.setMembershipType(members.getMembershipType());
			}
			members = membersDAO.store(existingMembers);
		} else {
			members = membersDAO.store(members);
		}
		membersDAO.flush();
	}

	/**
	 * Delete an existing Members entity
	 * 
	 */
	@Transactional
	public void deleteMembers(Members members) {
		membersDAO.remove(members);
		membersDAO.flush();
	}

	/**
	 * Delete an existing Guest entity
	 * 
	 */
	@Transactional
	public Members deleteMembersGuests(String members_memberId, Integer related_guests_guestId) {
		Guest related_guests = guestDAO.findGuestByPrimaryKey(related_guests_guestId, -1, -1);

		Members members = membersDAO.findMembersByPrimaryKey(members_memberId, -1, -1);

		related_guests.setMembers(null);
		members.getGuests().remove(related_guests);

		guestDAO.remove(related_guests);
		guestDAO.flush();

		return members;
	}

	/**
	 * Return a count of all Members entity
	 * 
	 */
	@Transactional
	public Integer countMemberss() {
		return ((Long) membersDAO.createQuerySingleResult("select count(o) from Members o").getSingleResult()).intValue();
	}
}
