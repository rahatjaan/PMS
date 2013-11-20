package com.pms.service;

import com.pms.domain.Guest;
import com.pms.domain.Members;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Members entities
 * 
 */
public interface MembersService {

	/**
	 * Save an existing Members entity
	 * 
	 */
	public void saveMembers(Members members);

	/**
	 * Delete an existing Guest entity
	 * 
	 */
	public Members deleteMembersGuests(String members_memberId, String related_guests_guestId);

	/**
	 */
	public Members findMembersByPrimaryKey(String memberId);

	/**
	 * Load an existing Members entity
	 * 
	 */
	public Set<Members> loadMemberss();

	/**
	 * Delete an existing Members entity
	 * 
	 */
	public void deleteMembers(Members members_1);

	/**
	 * Save an existing Guest entity
	 * 
	 */
	public Members saveMembersGuests(String memberId_1, Guest related_guests);

	/**
	 * Return all Members entity
	 * 
	 */
	public List<Members> findAllMemberss(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all Members entity
	 * 
	 */
	public Integer countMemberss();
}