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

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.virtusa.icd.service.builder.NoSuchEnrollmentException;
import com.virtusa.icd.service.builder.model.Enrollment;
import com.virtusa.icd.service.builder.model.impl.EnrollmentImpl;
import com.virtusa.icd.service.builder.model.impl.EnrollmentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the enrollment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EnrollmentPersistence
 * @see EnrollmentUtil
 * @generated
 */
public class EnrollmentPersistenceImpl extends BasePersistenceImpl<Enrollment>
	implements EnrollmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EnrollmentUtil} to access the enrollment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EnrollmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EnrollmentModelImpl.ENTITY_CACHE_ENABLED,
			EnrollmentModelImpl.FINDER_CACHE_ENABLED, EnrollmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EnrollmentModelImpl.ENTITY_CACHE_ENABLED,
			EnrollmentModelImpl.FINDER_CACHE_ENABLED, EnrollmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EnrollmentModelImpl.ENTITY_CACHE_ENABLED,
			EnrollmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the enrollment in the entity cache if it is enabled.
	 *
	 * @param enrollment the enrollment
	 */
	public void cacheResult(Enrollment enrollment) {
		EntityCacheUtil.putResult(EnrollmentModelImpl.ENTITY_CACHE_ENABLED,
			EnrollmentImpl.class, enrollment.getPrimaryKey(), enrollment);

		enrollment.resetOriginalValues();
	}

	/**
	 * Caches the enrollments in the entity cache if it is enabled.
	 *
	 * @param enrollments the enrollments
	 */
	public void cacheResult(List<Enrollment> enrollments) {
		for (Enrollment enrollment : enrollments) {
			if (EntityCacheUtil.getResult(
						EnrollmentModelImpl.ENTITY_CACHE_ENABLED,
						EnrollmentImpl.class, enrollment.getPrimaryKey()) == null) {
				cacheResult(enrollment);
			}
			else {
				enrollment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all enrollments.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EnrollmentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EnrollmentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the enrollment.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Enrollment enrollment) {
		EntityCacheUtil.removeResult(EnrollmentModelImpl.ENTITY_CACHE_ENABLED,
			EnrollmentImpl.class, enrollment.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Enrollment> enrollments) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Enrollment enrollment : enrollments) {
			EntityCacheUtil.removeResult(EnrollmentModelImpl.ENTITY_CACHE_ENABLED,
				EnrollmentImpl.class, enrollment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new enrollment with the primary key. Does not add the enrollment to the database.
	 *
	 * @param enrollmentId the primary key for the new enrollment
	 * @return the new enrollment
	 */
	public Enrollment create(long enrollmentId) {
		Enrollment enrollment = new EnrollmentImpl();

		enrollment.setNew(true);
		enrollment.setPrimaryKey(enrollmentId);

		return enrollment;
	}

	/**
	 * Removes the enrollment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param enrollmentId the primary key of the enrollment
	 * @return the enrollment that was removed
	 * @throws com.virtusa.icd.service.builder.NoSuchEnrollmentException if a enrollment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Enrollment remove(long enrollmentId)
		throws NoSuchEnrollmentException, SystemException {
		return remove(Long.valueOf(enrollmentId));
	}

	/**
	 * Removes the enrollment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the enrollment
	 * @return the enrollment that was removed
	 * @throws com.virtusa.icd.service.builder.NoSuchEnrollmentException if a enrollment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Enrollment remove(Serializable primaryKey)
		throws NoSuchEnrollmentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Enrollment enrollment = (Enrollment)session.get(EnrollmentImpl.class,
					primaryKey);

			if (enrollment == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEnrollmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(enrollment);
		}
		catch (NoSuchEnrollmentException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Enrollment removeImpl(Enrollment enrollment)
		throws SystemException {
		enrollment = toUnwrappedModel(enrollment);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, enrollment);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(enrollment);

		return enrollment;
	}

	@Override
	public Enrollment updateImpl(
		com.virtusa.icd.service.builder.model.Enrollment enrollment,
		boolean merge) throws SystemException {
		enrollment = toUnwrappedModel(enrollment);

		boolean isNew = enrollment.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, enrollment, merge);

			enrollment.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(EnrollmentModelImpl.ENTITY_CACHE_ENABLED,
			EnrollmentImpl.class, enrollment.getPrimaryKey(), enrollment);

		return enrollment;
	}

	protected Enrollment toUnwrappedModel(Enrollment enrollment) {
		if (enrollment instanceof EnrollmentImpl) {
			return enrollment;
		}

		EnrollmentImpl enrollmentImpl = new EnrollmentImpl();

		enrollmentImpl.setNew(enrollment.isNew());
		enrollmentImpl.setPrimaryKey(enrollment.getPrimaryKey());

		enrollmentImpl.setEnrollmentId(enrollment.getEnrollmentId());
		enrollmentImpl.setGroupId(enrollment.getGroupId());
		enrollmentImpl.setCompanyId(enrollment.getCompanyId());
		enrollmentImpl.setUserId(enrollment.getUserId());
		enrollmentImpl.setUserName(enrollment.getUserName());
		enrollmentImpl.setCreateDate(enrollment.getCreateDate());
		enrollmentImpl.setModifiedDate(enrollment.getModifiedDate());
		enrollmentImpl.setSelectedEntityType(enrollment.getSelectedEntityType());
		enrollmentImpl.setOrganizationNPINum(enrollment.getOrganizationNPINum());
		enrollmentImpl.setOrganizationName(enrollment.getOrganizationName());
		enrollmentImpl.setOrganizationAddress1(enrollment.getOrganizationAddress1());
		enrollmentImpl.setOrganizationAddress2(enrollment.getOrganizationAddress2());
		enrollmentImpl.setOrganizationCity(enrollment.getOrganizationCity());
		enrollmentImpl.setOrganizationPhone(enrollment.getOrganizationPhone());
		enrollmentImpl.setTop5HealthPlansByRev(enrollment.getTop5HealthPlansByRev());
		enrollmentImpl.setClearinghouses(enrollment.getClearinghouses());
		enrollmentImpl.setEhrBillingVendors(enrollment.getEhrBillingVendors());
		enrollmentImpl.setRevCycleVendors(enrollment.getRevCycleVendors());
		enrollmentImpl.setTop5DrgByRev(enrollment.getTop5DrgByRev());
		enrollmentImpl.setIcd9Drg1(enrollment.getIcd9Drg1());
		enrollmentImpl.setIcd9Drg2(enrollment.getIcd9Drg2());
		enrollmentImpl.setIcd9Drg3(enrollment.getIcd9Drg3());
		enrollmentImpl.setIcd9Drg4(enrollment.getIcd9Drg4());
		enrollmentImpl.setIcd9Drg5(enrollment.getIcd9Drg5());
		enrollmentImpl.setTop5Icd9ByRev(enrollment.getTop5Icd9ByRev());
		enrollmentImpl.setIcd9Dx1(enrollment.getIcd9Dx1());
		enrollmentImpl.setIcd9Dx2(enrollment.getIcd9Dx2());
		enrollmentImpl.setIcd9Dx3(enrollment.getIcd9Dx3());
		enrollmentImpl.setIcd9Dx4(enrollment.getIcd9Dx4());
		enrollmentImpl.setIcd9Dx5(enrollment.getIcd9Dx5());
		enrollmentImpl.setPrimaryTestingContact(enrollment.getPrimaryTestingContact());
		enrollmentImpl.setPrimaryTestingContactTitle(enrollment.getPrimaryTestingContactTitle());
		enrollmentImpl.setPrimaryTestingContactPhone(enrollment.getPrimaryTestingContactPhone());
		enrollmentImpl.setPrimaryTestingContactEmail(enrollment.getPrimaryTestingContactEmail());
		enrollmentImpl.setPrimaryCodingContact(enrollment.getPrimaryCodingContact());
		enrollmentImpl.setPrimaryCodingContactTitle(enrollment.getPrimaryCodingContactTitle());
		enrollmentImpl.setPrimaryCodingContactPhone(enrollment.getPrimaryCodingContactPhone());
		enrollmentImpl.setPrimaryCodingContactEmail(enrollment.getPrimaryCodingContactEmail());
		enrollmentImpl.setPrimaryBillingContact(enrollment.getPrimaryBillingContact());
		enrollmentImpl.setPrimaryBillingContactTitle(enrollment.getPrimaryBillingContactTitle());
		enrollmentImpl.setPrimaryBillingContactPhone(enrollment.getPrimaryBillingContactPhone());
		enrollmentImpl.setPrimaryBillingContactEmail(enrollment.getPrimaryBillingContactEmail());
		enrollmentImpl.setFile(enrollment.getFile());

		return enrollmentImpl;
	}

	/**
	 * Returns the enrollment with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the enrollment
	 * @return the enrollment
	 * @throws com.liferay.portal.NoSuchModelException if a enrollment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Enrollment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the enrollment with the primary key or throws a {@link com.virtusa.icd.service.builder.NoSuchEnrollmentException} if it could not be found.
	 *
	 * @param enrollmentId the primary key of the enrollment
	 * @return the enrollment
	 * @throws com.virtusa.icd.service.builder.NoSuchEnrollmentException if a enrollment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Enrollment findByPrimaryKey(long enrollmentId)
		throws NoSuchEnrollmentException, SystemException {
		Enrollment enrollment = fetchByPrimaryKey(enrollmentId);

		if (enrollment == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + enrollmentId);
			}

			throw new NoSuchEnrollmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				enrollmentId);
		}

		return enrollment;
	}

	/**
	 * Returns the enrollment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the enrollment
	 * @return the enrollment, or <code>null</code> if a enrollment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Enrollment fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the enrollment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param enrollmentId the primary key of the enrollment
	 * @return the enrollment, or <code>null</code> if a enrollment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Enrollment fetchByPrimaryKey(long enrollmentId)
		throws SystemException {
		Enrollment enrollment = (Enrollment)EntityCacheUtil.getResult(EnrollmentModelImpl.ENTITY_CACHE_ENABLED,
				EnrollmentImpl.class, enrollmentId);

		if (enrollment == _nullEnrollment) {
			return null;
		}

		if (enrollment == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				enrollment = (Enrollment)session.get(EnrollmentImpl.class,
						Long.valueOf(enrollmentId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (enrollment != null) {
					cacheResult(enrollment);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(EnrollmentModelImpl.ENTITY_CACHE_ENABLED,
						EnrollmentImpl.class, enrollmentId, _nullEnrollment);
				}

				closeSession(session);
			}
		}

		return enrollment;
	}

	/**
	 * Returns all the enrollments.
	 *
	 * @return the enrollments
	 * @throws SystemException if a system exception occurred
	 */
	public List<Enrollment> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Enrollment> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	public List<Enrollment> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Enrollment> list = (List<Enrollment>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ENROLLMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ENROLLMENT;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Enrollment>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Enrollment>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the enrollments from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Enrollment enrollment : findAll()) {
			remove(enrollment);
		}
	}

	/**
	 * Returns the number of enrollments.
	 *
	 * @return the number of enrollments
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ENROLLMENT);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the enrollment persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.virtusa.icd.service.builder.model.Enrollment")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Enrollment>> listenersList = new ArrayList<ModelListener<Enrollment>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Enrollment>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(EnrollmentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = EnrollmentPersistence.class)
	protected EnrollmentPersistence enrollmentPersistence;
	@BeanReference(type = MedicalRecordPersistence.class)
	protected MedicalRecordPersistence medicalRecordPersistence;
	@BeanReference(type = ReferencesPersistence.class)
	protected ReferencesPersistence referencesPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_ENROLLMENT = "SELECT enrollment FROM Enrollment enrollment";
	private static final String _SQL_COUNT_ENROLLMENT = "SELECT COUNT(enrollment) FROM Enrollment enrollment";
	private static final String _ORDER_BY_ENTITY_ALIAS = "enrollment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Enrollment exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EnrollmentPersistenceImpl.class);
	private static Enrollment _nullEnrollment = new EnrollmentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Enrollment> toCacheModel() {
				return _nullEnrollmentCacheModel;
			}
		};

	private static CacheModel<Enrollment> _nullEnrollmentCacheModel = new CacheModel<Enrollment>() {
			public Enrollment toEntityModel() {
				return _nullEnrollment;
			}
		};
}