package com.pms.dao;

import com.pms.domain.Members;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Members entities.
 * 
 */
public interface MembersDAO extends JpaDao<Members> {

	/**
	 * JPQL Query - findMembersByMemberIdContaining
	 *
	 */
	public Set<Members> findMembersByMemberIdContaining(String memberId) throws DataAccessException;

	/**
	 * JPQL Query - findMembersByMemberIdContaining
	 *
	 */
	public Set<Members> findMembersByMemberIdContaining(String memberId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllMemberss
	 *
	 */
	public Set<Members> findAllMemberss() throws DataAccessException;

	/**
	 * JPQL Query - findAllMemberss
	 *
	 */
	public Set<Members> findAllMemberss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMembersByPrimaryKey
	 *
	 */
	public Members findMembersByPrimaryKey(String memberId_1) throws DataAccessException;

	/**
	 * JPQL Query - findMembersByPrimaryKey
	 *
	 */
	public Members findMembersByPrimaryKey(String memberId_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMembersByMembershipType
	 *
	 */
	public Set<Members> findMembersByMembershipType(String membershipType) throws DataAccessException;

	/**
	 * JPQL Query - findMembersByMembershipType
	 *
	 */
	public Set<Members> findMembersByMembershipType(String membershipType, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMembersByMemberId
	 *
	 */
	public Members findMembersByMemberId(String memberId_2) throws DataAccessException;

	/**
	 * JPQL Query - findMembersByMemberId
	 *
	 */
	public Members findMembersByMemberId(String memberId_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findMembersByMembershipTypeContaining
	 *
	 */
	public Set<Members> findMembersByMembershipTypeContaining(String membershipType_1) throws DataAccessException;

	/**
	 * JPQL Query - findMembersByMembershipTypeContaining
	 *
	 */
	public Set<Members> findMembersByMembershipTypeContaining(String membershipType_1, int startResult, int maxRows) throws DataAccessException;

}