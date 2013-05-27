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

package com.virtusa.icd.service.builder.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link MedicalRecordLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       MedicalRecordLocalService
 * @generated
 */
public class MedicalRecordLocalServiceWrapper
	implements MedicalRecordLocalService,
		ServiceWrapper<MedicalRecordLocalService> {
	public MedicalRecordLocalServiceWrapper(
		MedicalRecordLocalService medicalRecordLocalService) {
		_medicalRecordLocalService = medicalRecordLocalService;
	}

	/**
	* Adds the medical record to the database. Also notifies the appropriate model listeners.
	*
	* @param medicalRecord the medical record
	* @return the medical record that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.MedicalRecord addMedicalRecord(
		com.virtusa.icd.service.builder.model.MedicalRecord medicalRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _medicalRecordLocalService.addMedicalRecord(medicalRecord);
	}

	/**
	* Creates a new medical record with the primary key. Does not add the medical record to the database.
	*
	* @param mrId the primary key for the new medical record
	* @return the new medical record
	*/
	public com.virtusa.icd.service.builder.model.MedicalRecord createMedicalRecord(
		long mrId) {
		return _medicalRecordLocalService.createMedicalRecord(mrId);
	}

	/**
	* Deletes the medical record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param mrId the primary key of the medical record
	* @return the medical record that was removed
	* @throws PortalException if a medical record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.MedicalRecord deleteMedicalRecord(
		long mrId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _medicalRecordLocalService.deleteMedicalRecord(mrId);
	}

	/**
	* Deletes the medical record from the database. Also notifies the appropriate model listeners.
	*
	* @param medicalRecord the medical record
	* @return the medical record that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.MedicalRecord deleteMedicalRecord(
		com.virtusa.icd.service.builder.model.MedicalRecord medicalRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _medicalRecordLocalService.deleteMedicalRecord(medicalRecord);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medicalRecordLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _medicalRecordLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _medicalRecordLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _medicalRecordLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _medicalRecordLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.virtusa.icd.service.builder.model.MedicalRecord fetchMedicalRecord(
		long mrId) throws com.liferay.portal.kernel.exception.SystemException {
		return _medicalRecordLocalService.fetchMedicalRecord(mrId);
	}

	/**
	* Returns the medical record with the primary key.
	*
	* @param mrId the primary key of the medical record
	* @return the medical record
	* @throws PortalException if a medical record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.MedicalRecord getMedicalRecord(
		long mrId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _medicalRecordLocalService.getMedicalRecord(mrId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _medicalRecordLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.virtusa.icd.service.builder.model.MedicalRecord> getMedicalRecords(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _medicalRecordLocalService.getMedicalRecords(start, end);
	}

	/**
	* Returns the number of medical records.
	*
	* @return the number of medical records
	* @throws SystemException if a system exception occurred
	*/
	public int getMedicalRecordsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _medicalRecordLocalService.getMedicalRecordsCount();
	}

	/**
	* Updates the medical record in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param medicalRecord the medical record
	* @return the medical record that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.MedicalRecord updateMedicalRecord(
		com.virtusa.icd.service.builder.model.MedicalRecord medicalRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _medicalRecordLocalService.updateMedicalRecord(medicalRecord);
	}

	/**
	* Updates the medical record in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param medicalRecord the medical record
	* @param merge whether to merge the medical record with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the medical record that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.MedicalRecord updateMedicalRecord(
		com.virtusa.icd.service.builder.model.MedicalRecord medicalRecord,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _medicalRecordLocalService.updateMedicalRecord(medicalRecord,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _medicalRecordLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_medicalRecordLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _medicalRecordLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public MedicalRecordLocalService getWrappedMedicalRecordLocalService() {
		return _medicalRecordLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedMedicalRecordLocalService(
		MedicalRecordLocalService medicalRecordLocalService) {
		_medicalRecordLocalService = medicalRecordLocalService;
	}

	public MedicalRecordLocalService getWrappedService() {
		return _medicalRecordLocalService;
	}

	public void setWrappedService(
		MedicalRecordLocalService medicalRecordLocalService) {
		_medicalRecordLocalService = medicalRecordLocalService;
	}

	private MedicalRecordLocalService _medicalRecordLocalService;
}