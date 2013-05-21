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

package com.virtusa.icd.service.builder.service.impl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.virtusa.icd.service.builder.model.Enrollment;
import com.virtusa.icd.service.builder.service.base.EnrollmentLocalServiceBaseImpl;

/**
 * The implementation of the enrollment local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.virtusa.icd.service.builder.service.EnrollmentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.virtusa.icd.service.builder.service.base.EnrollmentLocalServiceBaseImpl
 * @see com.virtusa.icd.service.builder.service.EnrollmentLocalServiceUtil
 */
public class EnrollmentLocalServiceImpl extends EnrollmentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.virtusa.icd.service.builder.service.EnrollmentLocalServiceUtil} to access the enrollment local service.
	 */
	
	public Enrollment addEnrollment(String selectedEntityType, String organizationNPINum, String organizationName) throws SystemException
	{
		long enrollmentId = CounterLocalServiceUtil.increment(Enrollment.class.getName());
		Enrollment enrollment = enrollmentPersistence.create(enrollmentId);
		enrollment.setOrganizationNPINum(organizationNPINum);
		enrollment.setOrganizationName(organizationName);
		return enrollmentPersistence.update(enrollment);
		
	}
}