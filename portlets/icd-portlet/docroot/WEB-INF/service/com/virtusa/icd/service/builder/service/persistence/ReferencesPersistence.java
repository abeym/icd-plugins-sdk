/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.virtusa.icd.service.builder.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.virtusa.icd.service.builder.model.References;

/**
 * The persistence interface for the references service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ReferencesPersistenceImpl
 * @see ReferencesUtil
 * @generated
 */
public interface ReferencesPersistence extends BasePersistence<References> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ReferencesUtil} to access the references persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the references in the entity cache if it is enabled.
	*
	* @param references the references
	*/
	public void cacheResult(
		com.virtusa.icd.service.builder.model.References references);

	/**
	* Caches the referenceses in the entity cache if it is enabled.
	*
	* @param referenceses the referenceses
	*/
	public void cacheResult(
		java.util.List<com.virtusa.icd.service.builder.model.References> referenceses);

	/**
	* Creates a new references with the primary key. Does not add the references to the database.
	*
	* @param referencesId the primary key for the new references
	* @return the new references
	*/
	public com.virtusa.icd.service.builder.model.References create(
		long referencesId);

	/**
	* Removes the references with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param referencesId the primary key of the references
	* @return the references that was removed
	* @throws com.virtusa.icd.service.builder.NoSuchReferencesException if a references with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.References remove(
		long referencesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.virtusa.icd.service.builder.NoSuchReferencesException;

	public com.virtusa.icd.service.builder.model.References updateImpl(
		com.virtusa.icd.service.builder.model.References references,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the references with the primary key or throws a {@link com.virtusa.icd.service.builder.NoSuchReferencesException} if it could not be found.
	*
	* @param referencesId the primary key of the references
	* @return the references
	* @throws com.virtusa.icd.service.builder.NoSuchReferencesException if a references with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.References findByPrimaryKey(
		long referencesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.virtusa.icd.service.builder.NoSuchReferencesException;

	/**
	* Returns the references with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param referencesId the primary key of the references
	* @return the references, or <code>null</code> if a references with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.References fetchByPrimaryKey(
		long referencesId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the referenceses where referencesName = &#63;.
	*
	* @param referencesName the references name
	* @return the matching referenceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.virtusa.icd.service.builder.model.References> findByreferencesName(
		java.lang.String referencesName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the referenceses where referencesName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param referencesName the references name
	* @param start the lower bound of the range of referenceses
	* @param end the upper bound of the range of referenceses (not inclusive)
	* @return the range of matching referenceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.virtusa.icd.service.builder.model.References> findByreferencesName(
		java.lang.String referencesName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the referenceses where referencesName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param referencesName the references name
	* @param start the lower bound of the range of referenceses
	* @param end the upper bound of the range of referenceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching referenceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.virtusa.icd.service.builder.model.References> findByreferencesName(
		java.lang.String referencesName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first references in the ordered set where referencesName = &#63;.
	*
	* @param referencesName the references name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching references
	* @throws com.virtusa.icd.service.builder.NoSuchReferencesException if a matching references could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.References findByreferencesName_First(
		java.lang.String referencesName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.virtusa.icd.service.builder.NoSuchReferencesException;

	/**
	* Returns the first references in the ordered set where referencesName = &#63;.
	*
	* @param referencesName the references name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching references, or <code>null</code> if a matching references could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.References fetchByreferencesName_First(
		java.lang.String referencesName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last references in the ordered set where referencesName = &#63;.
	*
	* @param referencesName the references name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching references
	* @throws com.virtusa.icd.service.builder.NoSuchReferencesException if a matching references could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.References findByreferencesName_Last(
		java.lang.String referencesName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.virtusa.icd.service.builder.NoSuchReferencesException;

	/**
	* Returns the last references in the ordered set where referencesName = &#63;.
	*
	* @param referencesName the references name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching references, or <code>null</code> if a matching references could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.References fetchByreferencesName_Last(
		java.lang.String referencesName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the referenceses before and after the current references in the ordered set where referencesName = &#63;.
	*
	* @param referencesId the primary key of the current references
	* @param referencesName the references name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next references
	* @throws com.virtusa.icd.service.builder.NoSuchReferencesException if a references with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.References[] findByreferencesName_PrevAndNext(
		long referencesId, java.lang.String referencesName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.virtusa.icd.service.builder.NoSuchReferencesException;

	/**
	* Returns all the referenceses.
	*
	* @return the referenceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.virtusa.icd.service.builder.model.References> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the referenceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of referenceses
	* @param end the upper bound of the range of referenceses (not inclusive)
	* @return the range of referenceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.virtusa.icd.service.builder.model.References> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the referenceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of referenceses
	* @param end the upper bound of the range of referenceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of referenceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.virtusa.icd.service.builder.model.References> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the referenceses where referencesName = &#63; from the database.
	*
	* @param referencesName the references name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByreferencesName(java.lang.String referencesName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the referenceses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of referenceses where referencesName = &#63;.
	*
	* @param referencesName the references name
	* @return the number of matching referenceses
	* @throws SystemException if a system exception occurred
	*/
	public int countByreferencesName(java.lang.String referencesName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of referenceses.
	*
	* @return the number of referenceses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}