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
 * This class is a wrapper for {@link MedicalRecordService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       MedicalRecordService
 * @generated
 */
public class MedicalRecordServiceWrapper implements MedicalRecordService,
	ServiceWrapper<MedicalRecordService> {
	public MedicalRecordServiceWrapper(
		MedicalRecordService medicalRecordService) {
		_medicalRecordService = medicalRecordService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _medicalRecordService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_medicalRecordService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _medicalRecordService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public MedicalRecordService getWrappedMedicalRecordService() {
		return _medicalRecordService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedMedicalRecordService(
		MedicalRecordService medicalRecordService) {
		_medicalRecordService = medicalRecordService;
	}

	public MedicalRecordService getWrappedService() {
		return _medicalRecordService;
	}

	public void setWrappedService(MedicalRecordService medicalRecordService) {
		_medicalRecordService = medicalRecordService;
	}

	private MedicalRecordService _medicalRecordService;
}