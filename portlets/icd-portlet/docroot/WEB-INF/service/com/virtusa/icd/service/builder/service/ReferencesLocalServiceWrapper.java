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
 * This class is a wrapper for {@link ReferencesLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       ReferencesLocalService
 * @generated
 */
public class ReferencesLocalServiceWrapper implements ReferencesLocalService,
	ServiceWrapper<ReferencesLocalService> {
	public ReferencesLocalServiceWrapper(
		ReferencesLocalService referencesLocalService) {
		_referencesLocalService = referencesLocalService;
	}

	/**
	* Adds the references to the database. Also notifies the appropriate model listeners.
	*
	* @param references the references
	* @return the references that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.References addReferences(
		com.virtusa.icd.service.builder.model.References references)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _referencesLocalService.addReferences(references);
	}

	/**
	* Creates a new references with the primary key. Does not add the references to the database.
	*
	* @param referencesId the primary key for the new references
	* @return the new references
	*/
	public com.virtusa.icd.service.builder.model.References createReferences(
		long referencesId) {
		return _referencesLocalService.createReferences(referencesId);
	}

	/**
	* Deletes the references with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param referencesId the primary key of the references
	* @return the references that was removed
	* @throws PortalException if a references with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.References deleteReferences(
		long referencesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _referencesLocalService.deleteReferences(referencesId);
	}

	/**
	* Deletes the references from the database. Also notifies the appropriate model listeners.
	*
	* @param references the references
	* @return the references that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.References deleteReferences(
		com.virtusa.icd.service.builder.model.References references)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _referencesLocalService.deleteReferences(references);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _referencesLocalService.dynamicQuery();
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
		return _referencesLocalService.dynamicQuery(dynamicQuery);
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
		return _referencesLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _referencesLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _referencesLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.virtusa.icd.service.builder.model.References fetchReferences(
		long referencesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _referencesLocalService.fetchReferences(referencesId);
	}

	/**
	* Returns the references with the primary key.
	*
	* @param referencesId the primary key of the references
	* @return the references
	* @throws PortalException if a references with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.References getReferences(
		long referencesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _referencesLocalService.getReferences(referencesId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _referencesLocalService.getPersistedModel(primaryKeyObj);
	}

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
	public java.util.List<com.virtusa.icd.service.builder.model.References> getReferenceses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _referencesLocalService.getReferenceses(start, end);
	}

	/**
	* Returns the number of referenceses.
	*
	* @return the number of referenceses
	* @throws SystemException if a system exception occurred
	*/
	public int getReferencesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _referencesLocalService.getReferencesesCount();
	}

	/**
	* Updates the references in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param references the references
	* @return the references that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.References updateReferences(
		com.virtusa.icd.service.builder.model.References references)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _referencesLocalService.updateReferences(references);
	}

	/**
	* Updates the references in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param references the references
	* @param merge whether to merge the references with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the references that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.References updateReferences(
		com.virtusa.icd.service.builder.model.References references,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _referencesLocalService.updateReferences(references, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _referencesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_referencesLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _referencesLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public java.util.List<com.virtusa.icd.service.builder.model.References> getReferencesByName(
		java.lang.String refName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _referencesLocalService.getReferencesByName(refName);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public ReferencesLocalService getWrappedReferencesLocalService() {
		return _referencesLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedReferencesLocalService(
		ReferencesLocalService referencesLocalService) {
		_referencesLocalService = referencesLocalService;
	}

	public ReferencesLocalService getWrappedService() {
		return _referencesLocalService;
	}

	public void setWrappedService(ReferencesLocalService referencesLocalService) {
		_referencesLocalService = referencesLocalService;
	}

	private ReferencesLocalService _referencesLocalService;
}