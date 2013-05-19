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

import com.liferay.portal.service.persistence.BasePersistence;

import com.virtusa.icd.service.builder.model.Enrollment;

/**
 * The persistence interface for the enrollment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EnrollmentPersistenceImpl
 * @see EnrollmentUtil
 * @generated
 */
public interface EnrollmentPersistence extends BasePersistence<Enrollment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EnrollmentUtil} to access the enrollment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the enrollment in the entity cache if it is enabled.
	*
	* @param enrollment the enrollment
	*/
	public void cacheResult(
		com.virtusa.icd.service.builder.model.Enrollment enrollment);

	/**
	* Caches the enrollments in the entity cache if it is enabled.
	*
	* @param enrollments the enrollments
	*/
	public void cacheResult(
		java.util.List<com.virtusa.icd.service.builder.model.Enrollment> enrollments);

	/**
	* Creates a new enrollment with the primary key. Does not add the enrollment to the database.
	*
	* @param enrollmentId the primary key for the new enrollment
	* @return the new enrollment
	*/
	public com.virtusa.icd.service.builder.model.Enrollment create(
		long enrollmentId);

	/**
	* Removes the enrollment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param enrollmentId the primary key of the enrollment
	* @return the enrollment that was removed
	* @throws com.virtusa.icd.service.builder.NoSuchEnrollmentException if a enrollment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.Enrollment remove(
		long enrollmentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.virtusa.icd.service.builder.NoSuchEnrollmentException;

	public com.virtusa.icd.service.builder.model.Enrollment updateImpl(
		com.virtusa.icd.service.builder.model.Enrollment enrollment,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the enrollment with the primary key or throws a {@link com.virtusa.icd.service.builder.NoSuchEnrollmentException} if it could not be found.
	*
	* @param enrollmentId the primary key of the enrollment
	* @return the enrollment
	* @throws com.virtusa.icd.service.builder.NoSuchEnrollmentException if a enrollment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.Enrollment findByPrimaryKey(
		long enrollmentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.virtusa.icd.service.builder.NoSuchEnrollmentException;

	/**
	* Returns the enrollment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param enrollmentId the primary key of the enrollment
	* @return the enrollment, or <code>null</code> if a enrollment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.virtusa.icd.service.builder.model.Enrollment fetchByPrimaryKey(
		long enrollmentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the enrollments.
	*
	* @return the enrollments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.virtusa.icd.service.builder.model.Enrollment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the enrollments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of enrollments
	* @param end the upper bound of the range of enrollments (not inclusive)
	* @return the range of enrollments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.virtusa.icd.service.builder.model.Enrollment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the enrollments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of enrollments
	* @param end the upper bound of the range of enrollments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of enrollments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.virtusa.icd.service.builder.model.Enrollment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the enrollments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of enrollments.
	*
	* @return the number of enrollments
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}