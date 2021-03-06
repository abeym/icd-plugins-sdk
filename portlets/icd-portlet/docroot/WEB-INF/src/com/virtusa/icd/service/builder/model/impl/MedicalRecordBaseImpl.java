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

package com.virtusa.icd.service.builder.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.virtusa.icd.service.builder.model.MedicalRecord;
import com.virtusa.icd.service.builder.service.MedicalRecordLocalServiceUtil;

/**
 * The extended model base implementation for the MedicalRecord service. Represents a row in the &quot;ICD_MedicalRecord&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MedicalRecordImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalRecordImpl
 * @see com.virtusa.icd.service.builder.model.MedicalRecord
 * @generated
 */
public abstract class MedicalRecordBaseImpl extends MedicalRecordModelImpl
	implements MedicalRecord {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a medical record model instance should use the {@link MedicalRecord} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			MedicalRecordLocalServiceUtil.addMedicalRecord(this);
		}
		else {
			MedicalRecordLocalServiceUtil.updateMedicalRecord(this);
		}
	}
}