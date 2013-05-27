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

import com.virtusa.icd.service.builder.NoSuchMedicalRecordException;
import com.virtusa.icd.service.builder.model.MedicalRecord;
import com.virtusa.icd.service.builder.model.impl.MedicalRecordImpl;
import com.virtusa.icd.service.builder.model.impl.MedicalRecordModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the medical record service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalRecordPersistence
 * @see MedicalRecordUtil
 * @generated
 */
public class MedicalRecordPersistenceImpl extends BasePersistenceImpl<MedicalRecord>
	implements MedicalRecordPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MedicalRecordUtil} to access the medical record persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MedicalRecordImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MedicalRecordModelImpl.ENTITY_CACHE_ENABLED,
			MedicalRecordModelImpl.FINDER_CACHE_ENABLED,
			MedicalRecordImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MedicalRecordModelImpl.ENTITY_CACHE_ENABLED,
			MedicalRecordModelImpl.FINDER_CACHE_ENABLED,
			MedicalRecordImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MedicalRecordModelImpl.ENTITY_CACHE_ENABLED,
			MedicalRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the medical record in the entity cache if it is enabled.
	 *
	 * @param medicalRecord the medical record
	 */
	public void cacheResult(MedicalRecord medicalRecord) {
		EntityCacheUtil.putResult(MedicalRecordModelImpl.ENTITY_CACHE_ENABLED,
			MedicalRecordImpl.class, medicalRecord.getPrimaryKey(),
			medicalRecord);

		medicalRecord.resetOriginalValues();
	}

	/**
	 * Caches the medical records in the entity cache if it is enabled.
	 *
	 * @param medicalRecords the medical records
	 */
	public void cacheResult(List<MedicalRecord> medicalRecords) {
		for (MedicalRecord medicalRecord : medicalRecords) {
			if (EntityCacheUtil.getResult(
						MedicalRecordModelImpl.ENTITY_CACHE_ENABLED,
						MedicalRecordImpl.class, medicalRecord.getPrimaryKey()) == null) {
				cacheResult(medicalRecord);
			}
			else {
				medicalRecord.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all medical records.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MedicalRecordImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MedicalRecordImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the medical record.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MedicalRecord medicalRecord) {
		EntityCacheUtil.removeResult(MedicalRecordModelImpl.ENTITY_CACHE_ENABLED,
			MedicalRecordImpl.class, medicalRecord.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<MedicalRecord> medicalRecords) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MedicalRecord medicalRecord : medicalRecords) {
			EntityCacheUtil.removeResult(MedicalRecordModelImpl.ENTITY_CACHE_ENABLED,
				MedicalRecordImpl.class, medicalRecord.getPrimaryKey());
		}
	}

	/**
	 * Creates a new medical record with the primary key. Does not add the medical record to the database.
	 *
	 * @param mrId the primary key for the new medical record
	 * @return the new medical record
	 */
	public MedicalRecord create(long mrId) {
		MedicalRecord medicalRecord = new MedicalRecordImpl();

		medicalRecord.setNew(true);
		medicalRecord.setPrimaryKey(mrId);

		return medicalRecord;
	}

	/**
	 * Removes the medical record with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param mrId the primary key of the medical record
	 * @return the medical record that was removed
	 * @throws com.virtusa.icd.service.builder.NoSuchMedicalRecordException if a medical record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MedicalRecord remove(long mrId)
		throws NoSuchMedicalRecordException, SystemException {
		return remove(Long.valueOf(mrId));
	}

	/**
	 * Removes the medical record with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the medical record
	 * @return the medical record that was removed
	 * @throws com.virtusa.icd.service.builder.NoSuchMedicalRecordException if a medical record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MedicalRecord remove(Serializable primaryKey)
		throws NoSuchMedicalRecordException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MedicalRecord medicalRecord = (MedicalRecord)session.get(MedicalRecordImpl.class,
					primaryKey);

			if (medicalRecord == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMedicalRecordException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(medicalRecord);
		}
		catch (NoSuchMedicalRecordException nsee) {
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
	protected MedicalRecord removeImpl(MedicalRecord medicalRecord)
		throws SystemException {
		medicalRecord = toUnwrappedModel(medicalRecord);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, medicalRecord);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(medicalRecord);

		return medicalRecord;
	}

	@Override
	public MedicalRecord updateImpl(
		com.virtusa.icd.service.builder.model.MedicalRecord medicalRecord,
		boolean merge) throws SystemException {
		medicalRecord = toUnwrappedModel(medicalRecord);

		boolean isNew = medicalRecord.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, medicalRecord, merge);

			medicalRecord.setNew(false);
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

		EntityCacheUtil.putResult(MedicalRecordModelImpl.ENTITY_CACHE_ENABLED,
			MedicalRecordImpl.class, medicalRecord.getPrimaryKey(),
			medicalRecord);

		return medicalRecord;
	}

	protected MedicalRecord toUnwrappedModel(MedicalRecord medicalRecord) {
		if (medicalRecord instanceof MedicalRecordImpl) {
			return medicalRecord;
		}

		MedicalRecordImpl medicalRecordImpl = new MedicalRecordImpl();

		medicalRecordImpl.setNew(medicalRecord.isNew());
		medicalRecordImpl.setPrimaryKey(medicalRecord.getPrimaryKey());

		medicalRecordImpl.setMrId(medicalRecord.getMrId());
		medicalRecordImpl.setGroupId(medicalRecord.getGroupId());
		medicalRecordImpl.setCompanyId(medicalRecord.getCompanyId());
		medicalRecordImpl.setUserId(medicalRecord.getUserId());
		medicalRecordImpl.setUserName(medicalRecord.getUserName());
		medicalRecordImpl.setCreateDate(medicalRecord.getCreateDate());
		medicalRecordImpl.setModifiedDate(medicalRecord.getModifiedDate());
		medicalRecordImpl.setMrTestCaseName(medicalRecord.getMrTestCaseName());
		medicalRecordImpl.setMsDrg(medicalRecord.getMsDrg());
		medicalRecordImpl.setPatientType(medicalRecord.getPatientType());
		medicalRecordImpl.setPatientAge(medicalRecord.getPatientAge());
		medicalRecordImpl.setLos(medicalRecord.getLos());
		medicalRecordImpl.setAhrqCategoryCode(medicalRecord.getAhrqCategoryCode());
		medicalRecordImpl.setAhrqSubCategoryCode(medicalRecord.getAhrqSubCategoryCode());
		medicalRecordImpl.setMrTestCaseDescription(medicalRecord.getMrTestCaseDescription());
		medicalRecordImpl.setIcd9AdmittingDx(medicalRecord.getIcd9AdmittingDx());
		medicalRecordImpl.setIcd9PrincipalDx(medicalRecord.getIcd9PrincipalDx());
		medicalRecordImpl.setIcd9PrincipalProcedure(medicalRecord.getIcd9PrincipalProcedure());
		medicalRecordImpl.setOtherIcd9Dx1(medicalRecord.getOtherIcd9Dx1());
		medicalRecordImpl.setOtherIcd9Dx2(medicalRecord.getOtherIcd9Dx2());
		medicalRecordImpl.setOtherIcd9Dx3(medicalRecord.getOtherIcd9Dx3());
		medicalRecordImpl.setOtherIcd9Pcs1(medicalRecord.getOtherIcd9Pcs1());
		medicalRecordImpl.setOtherIcd9Pcs2(medicalRecord.getOtherIcd9Pcs2());
		medicalRecordImpl.setOtherIcd9Pcs3(medicalRecord.getOtherIcd9Pcs3());
		medicalRecordImpl.setIcd10AdmittingDx(medicalRecord.getIcd10AdmittingDx());
		medicalRecordImpl.setIcd10PrincipalDx(medicalRecord.getIcd10PrincipalDx());
		medicalRecordImpl.setIcd10PrincipalProcedure(medicalRecord.getIcd10PrincipalProcedure());
		medicalRecordImpl.setOtherIcd10Dx1(medicalRecord.getOtherIcd10Dx1());
		medicalRecordImpl.setOtherIcd10Dx2(medicalRecord.getOtherIcd10Dx2());
		medicalRecordImpl.setOtherIcd10Dx3(medicalRecord.getOtherIcd10Dx3());
		medicalRecordImpl.setOtherIcd10Pcs1(medicalRecord.getOtherIcd10Pcs1());
		medicalRecordImpl.setOtherIcd10Pcs2(medicalRecord.getOtherIcd10Pcs2());
		medicalRecordImpl.setOtherIcd10Pcs3(medicalRecord.getOtherIcd10Pcs3());
		medicalRecordImpl.setIsHistoryAndPsysical(medicalRecord.isIsHistoryAndPsysical());
		medicalRecordImpl.setIsDischargeNotes(medicalRecord.isIsDischargeNotes());
		medicalRecordImpl.setIsConsultations(medicalRecord.isIsConsultations());
		medicalRecordImpl.setIsOperatingNotes(medicalRecord.isIsOperatingNotes());
		medicalRecordImpl.setIsPhysicianNotes(medicalRecord.isIsPhysicianNotes());
		medicalRecordImpl.setIsRadiology(medicalRecord.isIsRadiology());
		medicalRecordImpl.setIsGiProcedures(medicalRecord.isIsGiProcedures());
		medicalRecordImpl.setIsEducationalNotes(medicalRecord.isIsEducationalNotes());
		medicalRecordImpl.setFile(medicalRecord.getFile());

		return medicalRecordImpl;
	}

	/**
	 * Returns the medical record with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the medical record
	 * @return the medical record
	 * @throws com.liferay.portal.NoSuchModelException if a medical record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MedicalRecord findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the medical record with the primary key or throws a {@link com.virtusa.icd.service.builder.NoSuchMedicalRecordException} if it could not be found.
	 *
	 * @param mrId the primary key of the medical record
	 * @return the medical record
	 * @throws com.virtusa.icd.service.builder.NoSuchMedicalRecordException if a medical record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MedicalRecord findByPrimaryKey(long mrId)
		throws NoSuchMedicalRecordException, SystemException {
		MedicalRecord medicalRecord = fetchByPrimaryKey(mrId);

		if (medicalRecord == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + mrId);
			}

			throw new NoSuchMedicalRecordException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				mrId);
		}

		return medicalRecord;
	}

	/**
	 * Returns the medical record with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the medical record
	 * @return the medical record, or <code>null</code> if a medical record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MedicalRecord fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the medical record with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param mrId the primary key of the medical record
	 * @return the medical record, or <code>null</code> if a medical record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public MedicalRecord fetchByPrimaryKey(long mrId) throws SystemException {
		MedicalRecord medicalRecord = (MedicalRecord)EntityCacheUtil.getResult(MedicalRecordModelImpl.ENTITY_CACHE_ENABLED,
				MedicalRecordImpl.class, mrId);

		if (medicalRecord == _nullMedicalRecord) {
			return null;
		}

		if (medicalRecord == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				medicalRecord = (MedicalRecord)session.get(MedicalRecordImpl.class,
						Long.valueOf(mrId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (medicalRecord != null) {
					cacheResult(medicalRecord);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(MedicalRecordModelImpl.ENTITY_CACHE_ENABLED,
						MedicalRecordImpl.class, mrId, _nullMedicalRecord);
				}

				closeSession(session);
			}
		}

		return medicalRecord;
	}

	/**
	 * Returns all the medical records.
	 *
	 * @return the medical records
	 * @throws SystemException if a system exception occurred
	 */
	public List<MedicalRecord> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical records.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical records
	 * @param end the upper bound of the range of medical records (not inclusive)
	 * @return the range of medical records
	 * @throws SystemException if a system exception occurred
	 */
	public List<MedicalRecord> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical records.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical records
	 * @param end the upper bound of the range of medical records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical records
	 * @throws SystemException if a system exception occurred
	 */
	public List<MedicalRecord> findAll(int start, int end,
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

		List<MedicalRecord> list = (List<MedicalRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MEDICALRECORD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MEDICALRECORD;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<MedicalRecord>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<MedicalRecord>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the medical records from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (MedicalRecord medicalRecord : findAll()) {
			remove(medicalRecord);
		}
	}

	/**
	 * Returns the number of medical records.
	 *
	 * @return the number of medical records
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MEDICALRECORD);

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
	 * Initializes the medical record persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.virtusa.icd.service.builder.model.MedicalRecord")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MedicalRecord>> listenersList = new ArrayList<ModelListener<MedicalRecord>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MedicalRecord>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MedicalRecordImpl.class.getName());
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
	private static final String _SQL_SELECT_MEDICALRECORD = "SELECT medicalRecord FROM MedicalRecord medicalRecord";
	private static final String _SQL_COUNT_MEDICALRECORD = "SELECT COUNT(medicalRecord) FROM MedicalRecord medicalRecord";
	private static final String _ORDER_BY_ENTITY_ALIAS = "medicalRecord.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MedicalRecord exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MedicalRecordPersistenceImpl.class);
	private static MedicalRecord _nullMedicalRecord = new MedicalRecordImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MedicalRecord> toCacheModel() {
				return _nullMedicalRecordCacheModel;
			}
		};

	private static CacheModel<MedicalRecord> _nullMedicalRecordCacheModel = new CacheModel<MedicalRecord>() {
			public MedicalRecord toEntityModel() {
				return _nullMedicalRecord;
			}
		};
}