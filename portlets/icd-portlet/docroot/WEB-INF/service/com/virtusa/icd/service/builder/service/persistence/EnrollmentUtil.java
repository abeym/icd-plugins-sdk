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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.virtusa.icd.service.builder.model.Enrollment;

import java.util.List;

/**
 * The persistence utility for the enrollment service. This utility wraps {@link EnrollmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EnrollmentPersistence
 * @see EnrollmentPersistenceImpl
 * @generated
 */
public class EnrollmentUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Enrollment enrollment) {
		getPersistence().clearCache(enrollment);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Enrollment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Enrollment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Enrollment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Enrollment update(Enrollment enrollment, boolean merge)
		throws SystemException {
		return getPersistence().update(enrollment, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Enrollment update(Enrollment enrollment, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(enrollment, merge, serviceContext);
	}

	/**
	* Caches the enrollment in the entity cache if it is enabled.
	*
	* @param enrollment the enrollment
	*/
	public static void cacheResult(
		com.virtusa.icd.service.builder.model.Enrollment enrollment) {
		getPersistence().cacheResult(enrollment);
	}

	/**
	* Caches the enrollments in the entity cache if it is enabled.
	*
	* @param enrollments the enrollments
	*/
	public static void cacheResult(
		java.util.List<com.virtusa.icd.service.builder.model.Enrollment> enrollments) {
		getPersistence().cacheResult(enrollments);
	}

	/**
	* Creates a new enrollment with the primary key. Does not add the enrollment to the database.
	*
	* @param enrollmentId the primary key for the new enrollment
	* @return the new enrollment
	*/
	public static com.virtusa.icd.service.builder.model.Enrollment create(
		long enrollmentId) {
		return getPersistence().create(enrollmentId);
	}

	/**
	* Removes the enrollment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param enrollmentId the primary key of the enrollment
	* @return the enrollment that was removed
	* @throws com.virtusa.icd.service.builder.NoSuchEnrollmentException if a enrollment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.virtusa.icd.service.builder.model.Enrollment remove(
		long enrollmentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.virtusa.icd.service.builder.NoSuchEnrollmentException {
		return getPersistence().remove(enrollmentId);
	}

	public static com.virtusa.icd.service.builder.model.Enrollment updateImpl(
		com.virtusa.icd.service.builder.model.Enrollment enrollment,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(enrollment, merge);
	}

	/**
	* Returns the enrollment with the primary key or throws a {@link com.virtusa.icd.service.builder.NoSuchEnrollmentException} if it could not be found.
	*
	* @param enrollmentId the primary key of the enrollment
	* @return the enrollment
	* @throws com.virtusa.icd.service.builder.NoSuchEnrollmentException if a enrollment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.virtusa.icd.service.builder.model.Enrollment findByPrimaryKey(
		long enrollmentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.virtusa.icd.service.builder.NoSuchEnrollmentException {
		return getPersistence().findByPrimaryKey(enrollmentId);
	}

	/**
	* Returns the enrollment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param enrollmentId the primary key of the enrollment
	* @return the enrollment, or <code>null</code> if a enrollment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.virtusa.icd.service.builder.model.Enrollment fetchByPrimaryKey(
		long enrollmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(enrollmentId);
	}

	/**
	* Returns all the enrollments.
	*
	* @return the enrollments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.virtusa.icd.service.builder.model.Enrollment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.virtusa.icd.service.builder.model.Enrollment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.virtusa.icd.service.builder.model.Enrollment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the enrollments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of enrollments.
	*
	* @return the number of enrollments
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EnrollmentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EnrollmentPersistence)PortletBeanLocatorUtil.locate(com.virtusa.icd.service.builder.service.ClpSerializer.getServletContextName(),
					EnrollmentPersistence.class.getName());

			ReferenceRegistry.registerReference(EnrollmentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(EnrollmentPersistence persistence) {
	}

	private static EnrollmentPersistence _persistence;
}