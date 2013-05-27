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

import com.virtusa.icd.service.builder.model.MedicalRecord;

/**
 * The persistence interface for the medical record service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalRecordPersistenceImpl
 * @see MedicalRecordUtil
 * @generated
 */
public interface MedicalRecordPersistence extends BasePersistence<MedicalRecord> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedicalRecordUtil} to access the medical record persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the medical record in the entity cache if it is enabled.
	*
	* @param medicalRecord the medical record
	*/
	public void cacheResult(
		com.virtusa.icd.service.builder.model.MedicalRecord medicalRecord);

	/**
	* Caches the medical records in the entity cache if it is enabled.
	*
	* @param medicalRecords the medical records
	*/
	public void cacheResult(
		java.util.List<com.virtusa.icd.service.builder.model.MedicalRecord> medicalRecords);

	/**
	* Creates a new medical record with the primary key. Does not add the medical record to the database.
	*
	* @param mrId the primary key for the new medical record
	* @return the new medical record
	*/
	public com.virtusa.icd.service.builder.model.MedicalRecord create(long mrId);

	/**
	* Removes the medical record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param mrId the primary key of the medical record
	* @return the medical record that was removed
	* @throws com.virtusa.icd.service.builder.NoSuchMedicalRecordException if a medical record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.MedicalRecord remove(long mrId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.virtusa.icd.service.builder.NoSuchMedicalRecordException;

	public com.virtusa.icd.service.builder.model.MedicalRecord updateImpl(
		com.virtusa.icd.service.builder.model.MedicalRecord medicalRecord,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the medical record with the primary key or throws a {@link com.virtusa.icd.service.builder.NoSuchMedicalRecordException} if it could not be found.
	*
	* @param mrId the primary key of the medical record
	* @return the medical record
	* @throws com.virtusa.icd.service.builder.NoSuchMedicalRecordException if a medical record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.MedicalRecord findByPrimaryKey(
		long mrId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.virtusa.icd.service.builder.NoSuchMedicalRecordException;

	/**
	* Returns the medical record with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param mrId the primary key of the medical record
	* @return the medical record, or <code>null</code> if a medical record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.MedicalRecord fetchByPrimaryKey(
		long mrId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the medical records.
	*
	* @return the medical records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.virtusa.icd.service.builder.model.MedicalRecord> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the medical records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of medical records
	* @param end the upper bound of the range of medical records (not inclusive)
	* @return the range of medical records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.virtusa.icd.service.builder.model.MedicalRecord> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the medical records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of medical records
	* @param end the upper bound of the range of medical records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of medical records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.virtusa.icd.service.builder.model.MedicalRecord> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the medical records from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of medical records.
	*
	* @return the number of medical records
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}