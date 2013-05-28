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

package com.virtusa.icd.service.builder.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import com.virtusa.icd.service.builder.model.References;
import com.virtusa.icd.service.builder.service.EnrollmentLocalService;
import com.virtusa.icd.service.builder.service.EnrollmentService;
import com.virtusa.icd.service.builder.service.MedicalRecordLocalService;
import com.virtusa.icd.service.builder.service.MedicalRecordService;
import com.virtusa.icd.service.builder.service.ReferencesLocalService;
import com.virtusa.icd.service.builder.service.ReferencesService;
import com.virtusa.icd.service.builder.service.persistence.EnrollmentPersistence;
import com.virtusa.icd.service.builder.service.persistence.MedicalRecordPersistence;
import com.virtusa.icd.service.builder.service.persistence.ReferencesPersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the references remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.virtusa.icd.service.builder.service.impl.ReferencesServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.virtusa.icd.service.builder.service.impl.ReferencesServiceImpl
 * @see com.virtusa.icd.service.builder.service.ReferencesServiceUtil
 * @generated
 */
public abstract class ReferencesServiceBaseImpl extends BaseServiceImpl
	implements ReferencesService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.virtusa.icd.service.builder.service.ReferencesServiceUtil} to access the references remote service.
	 */

	/**
	 * Returns the enrollment local service.
	 *
	 * @return the enrollment local service
	 */
	public EnrollmentLocalService getEnrollmentLocalService() {
		return enrollmentLocalService;
	}

	/**
	 * Sets the enrollment local service.
	 *
	 * @param enrollmentLocalService the enrollment local service
	 */
	public void setEnrollmentLocalService(
		EnrollmentLocalService enrollmentLocalService) {
		this.enrollmentLocalService = enrollmentLocalService;
	}

	/**
	 * Returns the enrollment remote service.
	 *
	 * @return the enrollment remote service
	 */
	public EnrollmentService getEnrollmentService() {
		return enrollmentService;
	}

	/**
	 * Sets the enrollment remote service.
	 *
	 * @param enrollmentService the enrollment remote service
	 */
	public void setEnrollmentService(EnrollmentService enrollmentService) {
		this.enrollmentService = enrollmentService;
	}

	/**
	 * Returns the enrollment persistence.
	 *
	 * @return the enrollment persistence
	 */
	public EnrollmentPersistence getEnrollmentPersistence() {
		return enrollmentPersistence;
	}

	/**
	 * Sets the enrollment persistence.
	 *
	 * @param enrollmentPersistence the enrollment persistence
	 */
	public void setEnrollmentPersistence(
		EnrollmentPersistence enrollmentPersistence) {
		this.enrollmentPersistence = enrollmentPersistence;
	}

	/**
	 * Returns the medical record local service.
	 *
	 * @return the medical record local service
	 */
	public MedicalRecordLocalService getMedicalRecordLocalService() {
		return medicalRecordLocalService;
	}

	/**
	 * Sets the medical record local service.
	 *
	 * @param medicalRecordLocalService the medical record local service
	 */
	public void setMedicalRecordLocalService(
		MedicalRecordLocalService medicalRecordLocalService) {
		this.medicalRecordLocalService = medicalRecordLocalService;
	}

	/**
	 * Returns the medical record remote service.
	 *
	 * @return the medical record remote service
	 */
	public MedicalRecordService getMedicalRecordService() {
		return medicalRecordService;
	}

	/**
	 * Sets the medical record remote service.
	 *
	 * @param medicalRecordService the medical record remote service
	 */
	public void setMedicalRecordService(
		MedicalRecordService medicalRecordService) {
		this.medicalRecordService = medicalRecordService;
	}

	/**
	 * Returns the medical record persistence.
	 *
	 * @return the medical record persistence
	 */
	public MedicalRecordPersistence getMedicalRecordPersistence() {
		return medicalRecordPersistence;
	}

	/**
	 * Sets the medical record persistence.
	 *
	 * @param medicalRecordPersistence the medical record persistence
	 */
	public void setMedicalRecordPersistence(
		MedicalRecordPersistence medicalRecordPersistence) {
		this.medicalRecordPersistence = medicalRecordPersistence;
	}

	/**
	 * Returns the references local service.
	 *
	 * @return the references local service
	 */
	public ReferencesLocalService getReferencesLocalService() {
		return referencesLocalService;
	}

	/**
	 * Sets the references local service.
	 *
	 * @param referencesLocalService the references local service
	 */
	public void setReferencesLocalService(
		ReferencesLocalService referencesLocalService) {
		this.referencesLocalService = referencesLocalService;
	}

	/**
	 * Returns the references remote service.
	 *
	 * @return the references remote service
	 */
	public ReferencesService getReferencesService() {
		return referencesService;
	}

	/**
	 * Sets the references remote service.
	 *
	 * @param referencesService the references remote service
	 */
	public void setReferencesService(ReferencesService referencesService) {
		this.referencesService = referencesService;
	}

	/**
	 * Returns the references persistence.
	 *
	 * @return the references persistence
	 */
	public ReferencesPersistence getReferencesPersistence() {
		return referencesPersistence;
	}

	/**
	 * Sets the references persistence.
	 *
	 * @param referencesPersistence the references persistence
	 */
	public void setReferencesPersistence(
		ReferencesPersistence referencesPersistence) {
		this.referencesPersistence = referencesPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
	}

	protected Class<?> getModelClass() {
		return References.class;
	}

	protected String getModelClassName() {
		return References.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = referencesPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = EnrollmentLocalService.class)
	protected EnrollmentLocalService enrollmentLocalService;
	@BeanReference(type = EnrollmentService.class)
	protected EnrollmentService enrollmentService;
	@BeanReference(type = EnrollmentPersistence.class)
	protected EnrollmentPersistence enrollmentPersistence;
	@BeanReference(type = MedicalRecordLocalService.class)
	protected MedicalRecordLocalService medicalRecordLocalService;
	@BeanReference(type = MedicalRecordService.class)
	protected MedicalRecordService medicalRecordService;
	@BeanReference(type = MedicalRecordPersistence.class)
	protected MedicalRecordPersistence medicalRecordPersistence;
	@BeanReference(type = ReferencesLocalService.class)
	protected ReferencesLocalService referencesLocalService;
	@BeanReference(type = ReferencesService.class)
	protected ReferencesService referencesService;
	@BeanReference(type = ReferencesPersistence.class)
	protected ReferencesPersistence referencesPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ReferencesServiceClpInvoker _clpInvoker = new ReferencesServiceClpInvoker();
}