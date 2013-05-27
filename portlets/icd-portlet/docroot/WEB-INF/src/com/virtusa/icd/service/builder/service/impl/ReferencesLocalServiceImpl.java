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

import com.virtusa.icd.service.builder.service.base.ReferencesLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.virtusa.icd.service.builder.model.References;
import java.util.List;
/**
 * The implementation of the references local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.virtusa.icd.service.builder.service.ReferencesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.virtusa.icd.service.builder.service.base.ReferencesLocalServiceBaseImpl
 * @see com.virtusa.icd.service.builder.service.ReferencesLocalServiceUtil
 */
public class ReferencesLocalServiceImpl extends ReferencesLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.virtusa.icd.service.builder.service.ReferencesLocalServiceUtil} to access the references local service.
	 */
	public List<References> getReferencesByName(String refName) throws SystemException{  
		  return this.referencesPersistence.findByreferencesName(refName);  
		 } 
	 
}