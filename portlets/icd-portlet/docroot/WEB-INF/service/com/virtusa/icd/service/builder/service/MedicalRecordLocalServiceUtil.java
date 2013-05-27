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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the medical record local service. This utility wraps {@link com.virtusa.icd.service.builder.service.impl.MedicalRecordLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalRecordLocalService
 * @see com.virtusa.icd.service.builder.service.base.MedicalRecordLocalServiceBaseImpl
 * @see com.virtusa.icd.service.builder.service.impl.MedicalRecordLocalServiceImpl
 * @generated
 */
public class MedicalRecordLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.virtusa.icd.service.builder.service.impl.MedicalRecordLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the medical record to the database. Also notifies the appropriate model listeners.
	*
	* @param medicalRecord the medical record
	* @return the medical record that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.virtusa.icd.service.builder.model.MedicalRecord addMedicalRecord(
		com.virtusa.icd.service.builder.model.MedicalRecord medicalRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMedicalRecord(medicalRecord);
	}

	/**
	* Creates a new medical record with the primary key. Does not add the medical record to the database.
	*
	* @param mrId the primary key for the new medical record
	* @return the new medical record
	*/
	public static com.virtusa.icd.service.builder.model.MedicalRecord createMedicalRecord(
		long mrId) {
		return getService().createMedicalRecord(mrId);
	}

	/**
	* Deletes the medical record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param mrId the primary key of the medical record
	* @return the medical record that was removed
	* @throws PortalException if a medical record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.virtusa.icd.service.builder.model.MedicalRecord deleteMedicalRecord(
		long mrId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMedicalRecord(mrId);
	}

	/**
	* Deletes the medical record from the database. Also notifies the appropriate model listeners.
	*
	* @param medicalRecord the medical record
	* @return the medical record that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.virtusa.icd.service.builder.model.MedicalRecord deleteMedicalRecord(
		com.virtusa.icd.service.builder.model.MedicalRecord medicalRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMedicalRecord(medicalRecord);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.virtusa.icd.service.builder.model.MedicalRecord fetchMedicalRecord(
		long mrId) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMedicalRecord(mrId);
	}

	/**
	* Returns the medical record with the primary key.
	*
	* @param mrId the primary key of the medical record
	* @return the medical record
	* @throws PortalException if a medical record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.virtusa.icd.service.builder.model.MedicalRecord getMedicalRecord(
		long mrId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMedicalRecord(mrId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.virtusa.icd.service.builder.model.MedicalRecord> getMedicalRecords(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMedicalRecords(start, end);
	}

	/**
	* Returns the number of medical records.
	*
	* @return the number of medical records
	* @throws SystemException if a system exception occurred
	*/
	public static int getMedicalRecordsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMedicalRecordsCount();
	}

	/**
	* Updates the medical record in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param medicalRecord the medical record
	* @return the medical record that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.virtusa.icd.service.builder.model.MedicalRecord updateMedicalRecord(
		com.virtusa.icd.service.builder.model.MedicalRecord medicalRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMedicalRecord(medicalRecord);
	}

	/**
	* Updates the medical record in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param medicalRecord the medical record
	* @param merge whether to merge the medical record with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the medical record that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.virtusa.icd.service.builder.model.MedicalRecord updateMedicalRecord(
		com.virtusa.icd.service.builder.model.MedicalRecord medicalRecord,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMedicalRecord(medicalRecord, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static MedicalRecordLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MedicalRecordLocalService.class.getName());

			if (invokableLocalService instanceof MedicalRecordLocalService) {
				_service = (MedicalRecordLocalService)invokableLocalService;
			}
			else {
				_service = new MedicalRecordLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(MedicalRecordLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(MedicalRecordLocalService service) {
	}

	private static MedicalRecordLocalService _service;
}