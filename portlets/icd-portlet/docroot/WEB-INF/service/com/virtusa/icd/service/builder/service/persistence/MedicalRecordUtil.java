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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.virtusa.icd.service.builder.model.MedicalRecord;

import java.util.List;

/**
 * The persistence utility for the medical record service. This utility wraps {@link MedicalRecordPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalRecordPersistence
 * @see MedicalRecordPersistenceImpl
 * @generated
 */
public class MedicalRecordUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(MedicalRecord medicalRecord) {
		getPersistence().clearCache(medicalRecord);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MedicalRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MedicalRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MedicalRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static MedicalRecord update(MedicalRecord medicalRecord,
		boolean merge) throws SystemException {
		return getPersistence().update(medicalRecord, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static MedicalRecord update(MedicalRecord medicalRecord,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(medicalRecord, merge, serviceContext);
	}

	/**
	* Caches the medical record in the entity cache if it is enabled.
	*
	* @param medicalRecord the medical record
	*/
	public static void cacheResult(
		com.virtusa.icd.service.builder.model.MedicalRecord medicalRecord) {
		getPersistence().cacheResult(medicalRecord);
	}

	/**
	* Caches the medical records in the entity cache if it is enabled.
	*
	* @param medicalRecords the medical records
	*/
	public static void cacheResult(
		java.util.List<com.virtusa.icd.service.builder.model.MedicalRecord> medicalRecords) {
		getPersistence().cacheResult(medicalRecords);
	}

	/**
	* Creates a new medical record with the primary key. Does not add the medical record to the database.
	*
	* @param mrId the primary key for the new medical record
	* @return the new medical record
	*/
	public static com.virtusa.icd.service.builder.model.MedicalRecord create(
		long mrId) {
		return getPersistence().create(mrId);
	}

	/**
	* Removes the medical record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param mrId the primary key of the medical record
	* @return the medical record that was removed
	* @throws com.virtusa.icd.service.builder.NoSuchMedicalRecordException if a medical record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.virtusa.icd.service.builder.model.MedicalRecord remove(
		long mrId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.virtusa.icd.service.builder.NoSuchMedicalRecordException {
		return getPersistence().remove(mrId);
	}

	public static com.virtusa.icd.service.builder.model.MedicalRecord updateImpl(
		com.virtusa.icd.service.builder.model.MedicalRecord medicalRecord,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(medicalRecord, merge);
	}

	/**
	* Returns the medical record with the primary key or throws a {@link com.virtusa.icd.service.builder.NoSuchMedicalRecordException} if it could not be found.
	*
	* @param mrId the primary key of the medical record
	* @return the medical record
	* @throws com.virtusa.icd.service.builder.NoSuchMedicalRecordException if a medical record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.virtusa.icd.service.builder.model.MedicalRecord findByPrimaryKey(
		long mrId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.virtusa.icd.service.builder.NoSuchMedicalRecordException {
		return getPersistence().findByPrimaryKey(mrId);
	}

	/**
	* Returns the medical record with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param mrId the primary key of the medical record
	* @return the medical record, or <code>null</code> if a medical record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.virtusa.icd.service.builder.model.MedicalRecord fetchByPrimaryKey(
		long mrId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(mrId);
	}

	/**
	* Returns all the medical records.
	*
	* @return the medical records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.virtusa.icd.service.builder.model.MedicalRecord> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.virtusa.icd.service.builder.model.MedicalRecord> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.virtusa.icd.service.builder.model.MedicalRecord> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the medical records from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of medical records.
	*
	* @return the number of medical records
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MedicalRecordPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MedicalRecordPersistence)PortletBeanLocatorUtil.locate(com.virtusa.icd.service.builder.service.ClpSerializer.getServletContextName(),
					MedicalRecordPersistence.class.getName());

			ReferenceRegistry.registerReference(MedicalRecordUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(MedicalRecordPersistence persistence) {
	}

	private static MedicalRecordPersistence _persistence;
}