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

import com.virtusa.icd.service.builder.model.References;
import com.virtusa.icd.service.builder.service.ReferencesLocalServiceUtil;

/**
 * The extended model base implementation for the References service. Represents a row in the &quot;ICD_References&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ReferencesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ReferencesImpl
 * @see com.virtusa.icd.service.builder.model.References
 * @generated
 */
public abstract class ReferencesBaseImpl extends ReferencesModelImpl
	implements References {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a references model instance should use the {@link References} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			ReferencesLocalServiceUtil.addReferences(this);
		}
		else {
			ReferencesLocalServiceUtil.updateReferences(this);
		}
	}
}